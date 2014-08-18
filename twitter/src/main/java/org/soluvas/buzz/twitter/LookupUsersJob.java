package org.soluvas.buzz.twitter;

import java.io.Closeable;
import java.io.IOException;
import java.util.Set;

import org.joda.time.DateTime;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.jpa.TwitterUser;
import org.soluvas.commons.OnDemandXmiLoader;
import org.soluvas.commons.tenant.CommandRequestAttributes;
import org.soluvas.json.JsonUtils;
import org.soluvas.schedule.TenantJob;

import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

/**
 * Using specified {@link #setCampaignId(String)}, fetches the Twitter {@link User} specified by {@link #setScreenNames(Set)}
 * and saves it into {@link TwitterUser}.
 * @author ceefour
 */
public class LookupUsersJob extends TenantJob {
	
	String campaignId;
	Set<String> screenNames;
	
	/**
	 * @param campaignId the campaignId to set
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	
	/**
	 * @param screenNames the screenNames to set, as JSON array
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public void setScreenNames(String screenNames) throws JsonParseException, JsonMappingException, IOException {
		this.screenNames = JsonUtils.mapper.readValue(screenNames, Set.class);
	}
	
	/* (non-Javadoc)
	 * @see org.soluvas.schedule.TenantJob#doExecute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void doExecute(JobExecutionContext context)
			throws JobExecutionException {
		Preconditions.checkNotNull(campaignId, "campaignId is required");
		Preconditions.checkNotNull(screenNames, "screenNames is required");
		TwitterUserRepository twitterUserRepo = getBean(TwitterUserRepository.class);
		
		try (Closeable cl = CommandRequestAttributes.withTenant(tenantId)) {
			final BuzzApp buzzApp = new OnDemandXmiLoader<BuzzApp>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerTest.class, "/config/" + tenantId + ".BuzzApp.xmi" ).get();
			final BuzzAccount campaign = new OnDemandXmiLoader<BuzzAccount>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerTest.class, "/config/" + campaignId + ".BuzzAccount.xmi" ).get();
			final ConfigurationBuilder configBuilder = new ConfigurationBuilder();
			configBuilder.setOAuthConsumerKey(buzzApp.getTwitterConsumer().getConsumerKey());
			configBuilder.setOAuthConsumerSecret(buzzApp.getTwitterConsumer().getConsumerSecret());
			configBuilder.setDebugEnabled(true);
			configBuilder.setGZIPEnabled(true);
			configBuilder.setOAuthAccessToken(campaign.getTwitterUser().getToken());
			configBuilder.setOAuthAccessTokenSecret(campaign.getTwitterUser().getTokenSecret());
			final Configuration config = configBuilder.build();
			final TwitterFactory twitterFactory = new TwitterFactory(config);
			final Twitter twitter = twitterFactory.getInstance();
			try {
				final ResponseList<User> responses = twitter.lookupUsers(screenNames.toArray(new String[] {}));
				log.info("Got {} responses", responses.size());
				for (User user : responses) {
					TwitterUser twitterUser = twitterUserRepo.findOne(user.getId());
					if (twitterUser != null) {
						twitterUser.setRevId(twitterUser.getRevId() + 1);
					} else {
						twitterUser = new TwitterUser();
						twitterUser.setRevId(1);
					}
					twitterUser.setFetchTime(new DateTime(/*FIXME: timezone*/));
					twitterUser.copyFrom(user);
					twitterUserRepo.save(twitterUser);
				}
			} catch (TwitterException e) {
				throw new JobExecutionException("Cannot lookup " + screenNames, e);
			}
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	}

}
