package org.soluvas.buzz.app;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.core.util.string.JavaScriptUtils;
import org.apache.wicket.extensions.ajax.markup.html.IndicatingAjaxButton;
import org.apache.wicket.extensions.ajax.markup.html.IndicatingAjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.flow.RedirectToUrlException;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.SocialLink;
import org.soluvas.buzz.core.TwitterConsumer;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

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
		addButtons.add(new ExternalLink("facebookAdd", "/"));
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
		final Form<String> twitterManualForm = new StatelessForm<String>("twitterManualForm", twitterVerifierModel);
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
	
}
