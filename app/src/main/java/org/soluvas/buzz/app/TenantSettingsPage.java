package org.soluvas.buzz.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.core.util.string.JavaScriptUtils;
import org.apache.wicket.extensions.ajax.markup.html.IndicatingAjaxButton;
import org.apache.wicket.extensions.ajax.markup.html.IndicatingAjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.util.ListModel;
import org.apache.wicket.request.flow.RedirectToUrlException;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.FacebookConsumer;
import org.soluvas.buzz.core.SocialLink;
import org.soluvas.buzz.core.TwitterConsumer;
import org.soluvas.web.bootstrap.widget.FacebookPageSelect2;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

import com.google.common.collect.ImmutableList;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Account;

public class TenantSettingsPage extends TenantPage {
	private static final Logger log = LoggerFactory
		.getLogger(TenantSettingsPage.class);

	@SpringBean
	private BuzzApp buzzApp;
	@SpringBean
	private BuzzAccount buzzAccount;
	
	/**
	 * Current Twitter request Token.
	 */
	private RequestToken twitterRequestToken;

	public TenantSettingsPage(PageParameters parameters) {
		super(parameters);
		add(new TextField("twitterKey", new PropertyModel<>(buzzApp, "twitterConsumer.consumerKey")));
		add(new TextField("twitterSecret", new PropertyModel<>(buzzApp, "twitterConsumer.consumerSecret")));
		add(new TextField("twitterDomain", new PropertyModel<>(buzzApp, "twitterConsumer.customDomain")));
		add(new TextField("facebookAppId", new PropertyModel<>(buzzApp, "facebookConsumer.appId")));
		add(new TextField("facebookAppSecret", new PropertyModel<>(buzzApp, "facebookConsumer.appSecret")));
		add(new TextField("facebookScope", new PropertyModel<>(buzzApp, "facebookConsumer.defaultScope")));
		add(new TextField("facebookDomain", new PropertyModel<>(buzzApp, "facebookConsumer.customDomain")));
		
		add(new ListView<SocialLink>("socialLinks", new PropertyModel<List<SocialLink>>(buzzAccount, "socialLinks")) {
			@Override
			protected void populateItem(ListItem<SocialLink> item) {
				item.add(new Label("provider", new PropertyModel<>(item.getModel(), "class.simpleName")));
				item.add(new Label("description", item.getModel()));
			}
		}.setRenderBodyOnly(true));
		
		final WebMarkupContainer addButtons = new WebMarkupContainer("addButtons");
		addButtons.setOutputMarkupId(true);
		
		FacebookConsumer facebookConsumer = buzzApp.getFacebookConsumer();
		final String facebookRedirectUri;
		final String facebookUserAuthorizeUri;
		final String facebookPageAuthorizeUri;
		if (facebookConsumer != null) {
			try {
				facebookRedirectUri = "http://" + facebookConsumer.getCustomDomain() + "/fb_recipient";
				final URIBuilder fbLoginUriBuilder = new URIBuilder("https://www.facebook.com/dialog/oauth");
				fbLoginUriBuilder.addParameter("client_id", facebookConsumer.getAppId());
				fbLoginUriBuilder.addParameter("redirect_uri", facebookRedirectUri);
				fbLoginUriBuilder.setParameter("scope", facebookConsumer.getDefaultScope());
				facebookUserAuthorizeUri = fbLoginUriBuilder.toString();
				final String pageScope = facebookConsumer.getDefaultScope() + ",manage_pages"; // need this
				fbLoginUriBuilder.setParameter("scope", pageScope);
				facebookPageAuthorizeUri = fbLoginUriBuilder.toString();
			} catch (final Exception ex) {
				throw new RuntimeException("Error when building Facebook Authorization URI for " + facebookConsumer.getAppId(), ex);
			}
		} else {
			facebookRedirectUri = "#";
			facebookUserAuthorizeUri = "#";
			facebookPageAuthorizeUri = "#";
		}
		
		addButtons.add(new ExternalLink("facebookAdd", facebookUserAuthorizeUri));
		final IModel<String> facebookUserVerifierModel = new Model<>("");
		final Form<String> facebookUserManualForm = new Form<>("facebookManualForm", facebookUserVerifierModel);
		facebookUserManualForm.setVisible(false);
		addButtons.add(facebookUserManualForm);
		facebookUserManualForm.add(new TextField<>("verifier", facebookUserVerifierModel).setRequired(true));
		facebookUserManualForm.add(new IndicatingAjaxButton("submit") {
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				FacebookConsumer facebookConsumer = buzzApp.getFacebookConsumer();
				String verifierUp = facebookUserVerifierModel.getObject();
				Matcher matcher = Pattern.compile(".*code=([^#]+).*").matcher(verifierUp);
				String verifier = matcher.matches() ? matcher.group(1) : verifierUp;
				FacebookAccessToken token = fetchAccessToken(facebookConsumer.getAppId(), facebookConsumer.getAppSecret(), facebookRedirectUri, verifier);
				log.info("Facebook access: token={} expiry={}", 
						token.getToken(), token.getExpiryTime());
				info(String.format("Facebook access: token=%s expiry=%s", 
						token.getToken(), token.getExpiryTime()));
			}
		});
		addButtons.add(new IndicatingAjaxLink<Void>("facebookAddManual") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				target.appendJavaScript("window.open('" + JavaScriptUtils.escapeQuotes(facebookUserAuthorizeUri) + "', '_blank');");
				facebookUserVerifierModel.setObject("");
				facebookUserManualForm.setVisible(true);
				target.add(addButtons);
			}
		});
		
		final Model<String> facebookPageUserTokenModel = new Model<String>();
		
		final IModel<List<Account>> accountsModel = new ListModel<>(ImmutableList.<Account>of());
		addButtons.add(new ExternalLink("facebookPageAdd", facebookPageAuthorizeUri));
		final IModel<String> facebookPageVerifierModel = new Model<>("");
		final Form<String> facebookPageManualForm = new Form<String>("facebookPageManualForm", facebookPageVerifierModel);
		facebookPageManualForm.setVisible(false);
		addButtons.add(facebookPageManualForm);
		facebookPageManualForm.add(new TextField<>("verifier", facebookPageVerifierModel).setRequired(true));
		facebookPageManualForm.add(new IndicatingAjaxButton("submit") {
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				FacebookConsumer facebookConsumer = buzzApp.getFacebookConsumer();
				String verifierUp = facebookPageVerifierModel.getObject();
				Matcher matcher = Pattern.compile(".*code=([^#]+).*").matcher(verifierUp);
				String verifier = matcher.matches() ? matcher.group(1) : verifierUp;
				FacebookAccessToken token = fetchAccessToken(facebookConsumer.getAppId(), facebookConsumer.getAppSecret(), facebookRedirectUri, verifier);
				log.info("Facebook access: token={} expiry={}", 
						token.getToken(), token.getExpiryTime());
				info(String.format("Facebook access: token=%s expiry=%s", 
						token.getToken(), token.getExpiryTime()));
				facebookPageUserTokenModel.setObject(token.getToken());
				
				DefaultFacebookClient client = new DefaultFacebookClient(token.getToken());
				List<Account> accounts = getAccounts(client);
				info("You are managing " + accounts.size() + " Facebook pages.");
				accountsModel.setObject(accounts);
				target.add(addButtons);
			}
		});
		addButtons.add(new IndicatingAjaxLink<Void>("facebookPageAddManual") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				target.appendJavaScript("window.open('" + JavaScriptUtils.escapeQuotes(facebookPageAuthorizeUri) + "', '_blank');");
				facebookPageVerifierModel.setObject("");
				facebookPageManualForm.setVisible(true);
				target.add(addButtons);
			}
		});

		final Form<String> facebookPageTokenForm = new Form<>("facebookPageTokenForm", facebookPageUserTokenModel);
		facebookPageTokenForm.add(new TextField("userToken", facebookPageUserTokenModel));
		facebookPageTokenForm.add(new IndicatingAjaxButton("submit") {
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				DefaultFacebookClient client = new DefaultFacebookClient(facebookPageUserTokenModel.getObject());
				List<Account> accounts = getAccounts(client);
				info("You are managing " + accounts.size() + " Facebook pages.");
				accountsModel.setObject(accounts);
				target.add(addButtons);
			};
		});
		addButtons.add(facebookPageTokenForm);

		final Model<Account> facebookPageModel = new Model<Account>();
		final Form<Account> facebookPageChoiceForm = new Form<Account>("facebookPageChoiceForm", facebookPageModel);
		facebookPageChoiceForm.add(new FacebookPageSelect2("choice", facebookPageModel, accountsModel));
		facebookPageChoiceForm.add(new IndicatingAjaxButton("submit") {
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				Account page = facebookPageModel.getObject();
				if (page != null) {
					log.info("You selected {} ­· #{} token {}",
							page.getName(), page.getId(), page.getAccessToken());
					info(String.format("You selected %s ­· #%s token %s",
							page.getName(), page.getId(), page.getAccessToken()));
				} else {
					warn("No managed page selected.");
				}
			};
		});
		addButtons.add(facebookPageChoiceForm);
		
		addButtons.add(new IndicatingAjaxLink<Void>("twitterAdd") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				final Twitter twitter = new TwitterFactory().getInstance();
				final TwitterConsumer twitterConsumer = buzzApp.getTwitterConsumer();
				twitter.setOAuthConsumer(twitterConsumer.getConsumerKey(), twitterConsumer.getConsumerSecret());
				final String redirectUri = "http://" + twitterConsumer.getCustomDomain() + "/twitter_recipient/";
				try {
					final RequestToken requestToken = twitter.getOAuthRequestToken(redirectUri);
					log.debug("Twitter request token={} secret={} authorization={}", 
							requestToken.getToken(), requestToken.getTokenSecret(), requestToken.getAuthorizationURL());
					throw new RedirectToUrlException(requestToken.getAuthorizationURL());
				} catch (TwitterException e) {
					throw new RuntimeException("Cannot get Twitter request token, redirectUri=" + redirectUri, e); 
				}
			}
		});
		
		final IModel<String> twitterVerifierModel = new Model<>("");
		final Form<String> twitterManualForm = new Form<String>("twitterManualForm", twitterVerifierModel);
		twitterManualForm.setVisible(false);
		addButtons.add(twitterManualForm);
		twitterManualForm.add(new TextField<>("verifier", twitterVerifierModel).setRequired(true));
		twitterManualForm.add(new IndicatingAjaxButton("submit") {
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				String verifierUp = twitterVerifierModel.getObject();
				Matcher matcher = Pattern.compile(".*oauth_verifier=(.+)").matcher(verifierUp);
				String verifier = matcher.matches() ? matcher.group(1) : verifierUp;
				final Twitter twitter = new TwitterFactory().getInstance();
				final TwitterConsumer twitterConsumer = buzzApp.getTwitterConsumer();
				twitter.setOAuthConsumer(twitterConsumer.getConsumerKey(), twitterConsumer.getConsumerSecret());
				try {
					final AccessToken token = twitter.getOAuthAccessToken(twitterRequestToken, verifier);
					log.info("Twitter access for ID={} screenName={} token={} secret={}", 
							token.getUserId(), token.getScreenName(), token.getToken(), token.getTokenSecret());
					info(String.format("Twitter access for ID=%s screenName=%s token=%s secret=%s", 
							token.getUserId(), token.getScreenName(), token.getToken(), token.getTokenSecret()));
				} catch (TwitterException e) {
					throw new RuntimeException(String.format("Cannot get Twitter access token, request token=%s secret=%s verifier=%s", 
							twitterRequestToken.getToken(), twitterRequestToken.getTokenSecret(), verifier), e);
				}
			}
		});
		// Manual, just paste the URI:
		// http://soluvas.buzz.soluvas.com/twitter_recipient/?oauth_token=*&oauth_verifier=*
		addButtons.add(new IndicatingAjaxLink<Void>("twitterAddManual") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				final Twitter twitter = new TwitterFactory().getInstance();
				final TwitterConsumer twitterConsumer = buzzApp.getTwitterConsumer();
				twitter.setOAuthConsumer(twitterConsumer.getConsumerKey(), twitterConsumer.getConsumerSecret());
				final String redirectUri = "http://" + twitterConsumer.getCustomDomain() + "/twitter_recipient/";
				try {
					twitterRequestToken = twitter.getOAuthRequestToken(redirectUri);
					log.debug("Twitter request token={} secret={} authorization={}", 
							twitterRequestToken.getToken(), twitterRequestToken.getTokenSecret(), twitterRequestToken.getAuthorizationURL());
//					throw new RedirectToUrlException(requestToken.getAuthorizationURL());
					target.appendJavaScript("window.open('" + JavaScriptUtils.escapeQuotes(twitterRequestToken.getAuthorizationURL()) + "', '_blank');");
					twitterVerifierModel.setObject("");
					twitterManualForm.setVisible(true);
					target.add(addButtons);
				} catch (TwitterException e) {
					throw new RuntimeException("Cannot get Twitter request token, redirectUri=" + redirectUri, e); 
				}
			}
		});
		add(addButtons);
	}
	
	public static class FacebookAccessToken {
		private final String token;
		private final DateTime expiryTime;
		
		public FacebookAccessToken(String token, DateTime expiryTime) {
			super();
			this.token = token;
			this.expiryTime = expiryTime;
		}
		
		public String getToken() {
			return token;
		}
		
		/**
		 * This is only an estimate.
		 * @return
		 */
		public DateTime getExpiryTime() {
			return expiryTime;
		}
		
	}
	
	public FacebookAccessToken fetchAccessToken(String appId, String appSecret, String redirectUri, String code) {
		final String realAppId = appId;
		final String realAppSecret = appSecret;
		log.debug("Getting Facebook access token for app {} verifier={} redirectUri={}",
				realAppId, StringUtils.abbreviateMiddle(code, "…", 20), redirectUri);
		final String accessTokenUriStr;
		try {
			final URIBuilder accessTokenUri = new URIBuilder("https://graph.facebook.com/oauth/access_token");
			accessTokenUri.addParameter("client_id", realAppId);
			accessTokenUri.addParameter("client_secret", realAppSecret);
			accessTokenUri.addParameter("redirect_uri", redirectUri);
			accessTokenUri.addParameter("code", code);
			accessTokenUriStr = accessTokenUri.build().toString();
		} catch (final Exception ex) {
			throw new RuntimeException("Error when building Facebook access token URI for appId " + 
				realAppId + " and redirectUri " + redirectUri, ex);
		}
		final HttpGet accessTokenUriRequest = new HttpGet(accessTokenUriStr);
		final DefaultHttpClient client = new DefaultHttpClient();
		try {
			final DateTime requestTime = new DateTime();
			final HttpResponse responseAccessTokenReq = client.execute(accessTokenUriRequest);
			try {
				if (responseAccessTokenReq.getStatusLine().getStatusCode() != 200)
					throw new IOException(String.format(
							"GET %s throws HTTP Error %d: %s", accessTokenUriRequest, responseAccessTokenReq
							.getStatusLine().getStatusCode(), responseAccessTokenReq
							.getStatusLine().getReasonPhrase()));
				final Scanner scanner = new Scanner(responseAccessTokenReq.getEntity().getContent());
				final List<NameValuePair> data = new ArrayList<>();
				URLEncodedUtils.parse(data, scanner, "UTF-8");
				
				// access_token={access-token}&expires={seconds-til-expiration}
				final String accessToken = data.get(0).getValue();
				final int expirySeconds = Integer.valueOf(data.get(1).getValue());
				final DateTime expiryTime = requestTime.plusSeconds(expirySeconds);
				return new FacebookAccessToken(accessToken, expiryTime);
			} catch (Exception e) {
				throw new RuntimeException("Cannot get access token for appId " + realAppId + 
						" and redirectUri " + redirectUri + ": " + e, e);
			} finally {
				HttpClientUtils.closeQuietly(responseAccessTokenReq);
			}
		} catch (IllegalStateException | IOException e) {
			throw new RuntimeException("Cannot get access token for appId " + realAppId + 
					" and redirectUri " + redirectUri + ": " + e, e);
		} finally {
			HttpClientUtils.closeQuietly(client);
		}
	}
	
	/**
	 * Example:
	 * accessToken=CAAA…OHASB category=Product/service id=140100115934 metadata=null name=Soluvas type=null
	 * 
	 * @param client
	 * @return
	 */
	public List<Account> getAccounts(FacebookClient client) {
		log.debug("Getting managed Facebook pages");
		Connection<Account> accounts = client.fetchConnection("me/accounts", Account.class);
		log.info("Got {} managed Facebook pages: {}", accounts.getData().size(), accounts.getData());
		return accounts.getData();
	}
	
}
