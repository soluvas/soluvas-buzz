package org.soluvas.buzz.twitter;

import java.io.Closeable;
import java.io.IOException;

import org.joda.time.DateTime;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.TriggerKey;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.jpa.TwitterFavoriteCount;
import org.soluvas.buzz.core.jpa.TwitterFollower;
import org.soluvas.buzz.core.jpa.TwitterFollowerCount;
import org.soluvas.buzz.core.jpa.TwitterFollowerPage;
import org.soluvas.buzz.core.jpa.TwitterFollowerSnapshot;
import org.soluvas.buzz.core.jpa.TwitterFriendCount;
import org.soluvas.buzz.core.jpa.TwitterListedCount;
import org.soluvas.buzz.core.jpa.TwitterStatusCount;
import org.soluvas.buzz.core.jpa.TwitterUser;
import org.soluvas.commons.OnDemandXmiLoader;
import org.soluvas.commons.tenant.CommandRequestAttributes;
import org.soluvas.schedule.TenantJob;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import twitter4j.PagableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

/**
 * Fetch one page (200 users) of Twitter followers using {@link Twitter#getFollowersList(String, long, int)}.
 * @author ceefour
 */
public class FetchFollowersPageJob extends TenantJob {
	
	public static TriggerKey triggerKey(String tenantId, String campaignId, String screenName, long snapshotId, long cursor) {
		return new TriggerKey(String.format("%s://%s/%s/%s/%s/%s", 
				tenantId, FetchFollowersPageJob.class.getSimpleName(), campaignId, screenName.toLowerCase(), snapshotId, cursor));
	}
	
	String campaignId;
	String screenName;
	Long snapshotId;
	Long cursor;
	
	/**
	 * @param campaignId the campaignId to set
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	
	public void setScreenName(String upScreenName) {
		this.screenName = upScreenName;
	}
	
	public void setSnapshotId(Long snapshotId) {
		this.snapshotId = snapshotId;
	}
	
	/**
	 * First page is -1.
	 * @param cursor
	 */
	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}
	
	/* (non-Javadoc)
	 * @see org.soluvas.schedule.TenantJob#doExecute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void doExecute(JobExecutionContext context)
			throws JobExecutionException {
		Preconditions.checkNotNull(campaignId, "campaignId is required");
		Preconditions.checkNotNull(screenName, "screenName is required");
		Preconditions.checkNotNull(snapshotId, "snapshotId is required");
		Preconditions.checkNotNull(cursor, "cursor is required");
		TwitterUserRepository twitterUserRepo = getBean(TwitterUserRepository.class);
		TwitterFollowerSnapshotRepository twitterFollowerSnapshotRepo = getBean(TwitterFollowerSnapshotRepository.class);
		TwitterFollowerPageRepository twitterFollowerPageRepo = getBean(TwitterFollowerPageRepository.class);
		TwitterFollowerRepository twitterFollowerRepo = getBean(TwitterFollowerRepository.class);
		TwitterStatusCountRepository statusCountRepo = getBean(TwitterStatusCountRepository.class);
		TwitterFavoriteCountRepository favoriteCountRepo = getBean(TwitterFavoriteCountRepository.class);
		TwitterFriendCountRepository friendCountRepo = getBean(TwitterFriendCountRepository.class);
		TwitterFollowerCountRepository followerCountRepo = getBean(TwitterFollowerCountRepository.class);
		TwitterListedCountRepository listedCountRepo = getBean(TwitterListedCountRepository.class);
		TransactionTemplate txTemplate = new TransactionTemplate(getBean(JpaTransactionManager.class));
		
		try (Closeable cl = CommandRequestAttributes.withTenant(tenantId)) {
			txTemplate.execute(new TransactionCallback<Void>() {
				@Override
				public Void doInTransaction(TransactionStatus status) {
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
					
					TwitterUser user = Preconditions.checkNotNull(twitterUserRepo.findOneByScreenName(screenName),
							"Cannot find Twitter user '%s'", screenName);
					final TwitterFollowerSnapshot snapshot = Preconditions.checkNotNull(twitterFollowerSnapshotRepo.findOne(snapshotId),
							"Cannot find Twitter follower snapshot '%s'", snapshotId);				
					
					final int pageSize = 200;
					final PagableResponseList<User> resp;
					try {
						log.info("Fetching followers of @{} ({}) page {}...", user.getScreenName(), user.getId(), cursor);
						resp = twitter.getFollowersList(user.getId(), cursor, pageSize);
					} catch (TwitterException e) {
						throw new RuntimeException("Cannot get followers for @" + user.getScreenName() + " (" + user.getId() + ") page " + cursor, e);
					}
					TwitterFollowerPage page = new TwitterFollowerPage();
					page.setSnapshot(snapshot);
					page.setPageCursor(cursor);
					if (resp.hasPrevious()) {
						page.setPreviousCursor(resp.getPreviousCursor());
					}
					if (resp.hasNext()) {
						page.setNextCursor(resp.getNextCursor());
					}
					page.setPageSize(pageSize);
					page.setCreationTime(new DateTime());
					page.setModificationTime(new DateTime());
					page.setUserId(user.getId());
					page.setScreenName(user.getScreenName());
//					page = twitterFollowerPageRepo.save(page);
					
					log.info("User @{} ({}) page {} has {} followers", user.getScreenName(), user.getId(), cursor, resp.size());
					for (User follower : resp) {
						// add to Page
						TwitterFollower followerEntity = new TwitterFollower();
						followerEntity.setPage(page);
						followerEntity.setUserId(follower.getId());
						followerEntity.setScreenName(follower.getScreenName());
						page.addToFollowers(followerEntity);
//						twitterFollowerRepo.save(followerEntity);
						
						// add to TwitterUser
						TwitterUser twitterUser = twitterUserRepo.findOne(follower.getId());
						if (twitterUser != null) {
							twitterUser.setRevId(twitterUser.getRevId() + 1);
							log.info("Updating Twitter User @{} ({}) rev {}", follower.getId(), follower.getScreenName(), twitterUser.getRevId());
						} else {
							twitterUser = new TwitterUser();
							twitterUser.setRevId(1);
							log.info("Adding Twitter User @{} ({})", follower.getId(), follower.getScreenName());
						}
						final DateTime fetchTime = new DateTime(/*FIXME: timezone*/);
						twitterUser.setFetchTime(fetchTime);
						twitterUser.copyFrom(follower);
						twitterUserRepo.save(twitterUser);
						
						final TwitterStatusCount statusCount = new TwitterStatusCount(follower.getId(), fetchTime, twitterUser.getStatusesCount());
						try {
							statusCountRepo.save( statusCount );
						} catch (Exception e) {
							log.error("Cannot add statusCount " + statusCount, e);
						}
						final TwitterFavoriteCount favoriteCount = new TwitterFavoriteCount(follower.getId(), fetchTime, twitterUser.getFavouritesCount());
						try {
							favoriteCountRepo.save( favoriteCount );
						} catch (Exception e) {
							log.error("Cannot add favoriteCount " + favoriteCount, e);
						}
						final TwitterFriendCount friendCount = new TwitterFriendCount(follower.getId(), fetchTime, twitterUser.getFriendsCount());
						try {
							friendCountRepo.save( friendCount );
						} catch (Exception e) {
							log.error("Cannot add friendCount " + friendCount, e);
						}
						final TwitterFollowerCount followerCount = new TwitterFollowerCount(follower.getId(), fetchTime, twitterUser.getFollowersCount());
						try {
							followerCountRepo.save( followerCount );
						} catch (Exception e) {
							log.error("Cannot add followerCount " + followerCount, e);
						}
						final TwitterListedCount listedCount = new TwitterListedCount(follower.getId(), fetchTime, twitterUser.getListedCount());
						try {
							listedCountRepo.save( listedCount );
						} catch (Exception e) {
							log.error("Cannot add statusCount " + listedCount, e);
						}
					}
					
					// save page + followers
					page = twitterFollowerPageRepo.save(page);
					return null;
				}
			});
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	}

}
