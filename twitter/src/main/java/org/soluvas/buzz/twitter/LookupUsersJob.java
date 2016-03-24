package org.soluvas.buzz.twitter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.soluvas.buzz.core.jpa.TwitterUser;
import org.soluvas.commons.tenant.CommandRequestAttributes;
import org.soluvas.json.JsonUtils;
import org.soluvas.schedule.TenantJob;
import twitter4j.User;

import java.io.Closeable;
import java.io.IOException;
import java.util.Set;

/**
 * Using specified {@link #setCampaignId(String)}, fetches the Twitter {@link User} specified by {@link #setScreenNames(String)}
 * and saves it into {@link TwitterUser} + counts.
 *
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
        TwitterStatusCountRepository statusCountRepo = getBean(TwitterStatusCountRepository.class);
        TwitterFavoriteCountRepository favoriteCountRepo = getBean(TwitterFavoriteCountRepository.class);
        TwitterFriendCountRepository friendCountRepo = getBean(TwitterFriendCountRepository.class);
        TwitterFollowerCountRepository followerCountRepo = getBean(TwitterFollowerCountRepository.class);
        TwitterListedCountRepository listedCountRepo = getBean(TwitterListedCountRepository.class);

        try (Closeable cl = CommandRequestAttributes.withTenant(tenantId)) {
            throw new UnsupportedOperationException("Need porting from OnDemandXmiLoader to JSON-LD!");

//			final BuzzApp buzzApp = new OnDemandXmiLoader<BuzzApp>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerTest.class, "/config/" + tenantId + ".BuzzApp.xmi" ).get();
//			final BuzzAccount campaign = new OnDemandXmiLoader<BuzzAccount>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerTest.class, "/config/" + campaignId + ".BuzzAccount.xmi" ).get();
//			final ConfigurationBuilder configBuilder = new ConfigurationBuilder();
//			configBuilder.setOAuthConsumerKey(buzzApp.getTwitterConsumer().getConsumerKey());
//			configBuilder.setOAuthConsumerSecret(buzzApp.getTwitterConsumer().getConsumerSecret());
//			configBuilder.setDebugEnabled(true);
//			configBuilder.setGZIPEnabled(true);
//			configBuilder.setOAuthAccessToken(campaign.getTwitterUser().getToken());
//			configBuilder.setOAuthAccessTokenSecret(campaign.getTwitterUser().getTokenSecret());
//			final Configuration config = configBuilder.build();
//			final TwitterFactory twitterFactory = new TwitterFactory(config);
//			final Twitter twitter = twitterFactory.getInstance();
//			try {
//				final ResponseList<User> responses = twitter.lookupUsers(screenNames.toArray(new String[] {}));
//				log.info("Got {} responses", responses.size());
//				for (User user : responses) {
//					TwitterUser twitterUser = twitterUserRepo.findOne(user.getId());
//					if (twitterUser != null) {
//						twitterUser.setRevId(twitterUser.getRevId() + 1);
//					} else {
//						twitterUser = new TwitterUser();
//						twitterUser.setRevId(1);
//					}
//					final DateTime fetchTime = new DateTime(/*FIXME: timezone*/);
//					twitterUser.setFetchTime(fetchTime);
//					twitterUser.copyFrom(user);
//					twitterUserRepo.save(twitterUser);
//
//					final TwitterStatusCount statusCount = new TwitterStatusCount(user.getId(), fetchTime, twitterUser.getStatusesCount());
//					try {
//						statusCountRepo.save( statusCount );
//					} catch (Exception e) {
//						log.error("Cannot add statusCount " + statusCount, e);
//					}
//					final TwitterFavoriteCount favoriteCount = new TwitterFavoriteCount(user.getId(), fetchTime, twitterUser.getFavouritesCount());
//					try {
//						favoriteCountRepo.save( favoriteCount );
//					} catch (Exception e) {
//						log.error("Cannot add favoriteCount " + favoriteCount, e);
//					}
//					final TwitterFriendCount friendCount = new TwitterFriendCount(user.getId(), fetchTime, twitterUser.getFriendsCount());
//					try {
//						friendCountRepo.save( friendCount );
//					} catch (Exception e) {
//						log.error("Cannot add friendCount " + friendCount, e);
//					}
//					final TwitterFollowerCount followerCount = new TwitterFollowerCount(user.getId(), fetchTime, twitterUser.getFollowersCount());
//					try {
//						followerCountRepo.save( followerCount );
//					} catch (Exception e) {
//						log.error("Cannot add followerCount " + followerCount, e);
//					}
//					final TwitterListedCount listedCount = new TwitterListedCount(user.getId(), fetchTime, twitterUser.getListedCount());
//					try {
//						listedCountRepo.save( listedCount );
//					} catch (Exception e) {
//						log.error("Cannot add statusCount " + listedCount, e);
//					}
//				}
//			} catch (TwitterException e) {
//				throw new JobExecutionException("Cannot lookup " + screenNames, e);
//			}
        } catch (IOException e) {
            Throwables.propagate(e);
        }
    }

}
