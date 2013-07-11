package org.soluvas.buzz.twitter;

import java.util.Set;

import javax.annotation.Nullable;

import org.apache.commons.lang3.ArrayUtils;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.TwitterAppLink;
import org.soluvas.buzz.core.TwitterUserLink;

import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

/**
 * @author ceefour
 *
 */
public class TwitterAnalyzer {

	private static final Logger log = LoggerFactory
			.getLogger(TwitterAnalyzer.class);
	private final Twitter twitter;
	private final TwitterCorpus corpus;

	/**
	 * 
	 */
	public TwitterAnalyzer(TwitterCorpus corpus, TwitterAppLink app, TwitterUserLink appUser) {
		super();
		this.corpus = corpus;
		final ConfigurationBuilder configBuilder = new ConfigurationBuilder();
		configBuilder.setOAuthConsumerKey(app.getConsumerKey());
		configBuilder.setOAuthConsumerSecret(app.getConsumerSecret());
		configBuilder.setDebugEnabled(true);
		configBuilder.setGZIPEnabled(true);
		configBuilder.setOAuthAccessToken(appUser.getToken());
		configBuilder.setOAuthAccessTokenSecret(appUser.getTokenSecret());
		final Configuration config = configBuilder.build();
		TwitterFactory twitterFactory = new TwitterFactory(config);
		twitter = twitterFactory.getInstance();
	}
	
	public long getFollowersCount(String screenName) {
		int followersCount;
		try {
			followersCount = twitter.showUser(screenName).getFollowersCount();
		} catch (TwitterException e) {
			throw new RuntimeException("Cannot get followersCount for @" + screenName, e);
		}
		return followersCount;
	}

	public long getFollowingsCount(String screenName) {
		int followingsCount;
		try {
			followingsCount = twitter.showUser(screenName).getFriendsCount();
		} catch (TwitterException e) {
			throw new RuntimeException("Cannot get followingsCount for @" + screenName, e);
		}
		return followingsCount;
	}
	
	public User getProfile(String screenName) {
		try {
			return twitter.showUser(screenName);
		} catch (TwitterException e) {
			throw new RuntimeException("Cannot get Twitter profile for @" + screenName, e);
		}
	}

	/**
	 * Get the Twitter profile.
	 * @param screenName
	 * @param maxAge Maximum corpus copy age. If 0, always fetch. If {@code null},
	 * 		always use corpus copy if exists.
	 * @param allowFetch Allow fetch if corpus copy too old or non-existent.
	 * @return
	 */
	public TwitterUser getProfile(String screenName, @Nullable Duration maxAge, boolean allowFetch) {
		final DateTime minFetchTime;
		final TwitterUser corpusUser;
		if (maxAge != null) {
			minFetchTime = new DateTime().minus(maxAge);
//			corpusUser = corpus.findOneUser(screenName, minFetchTime);
		} else {
			minFetchTime = null;
		}
		corpusUser = corpus.findOneUserLatest(screenName);
		
		// got it?
		if (corpusUser != null && (corpusUser.getFetchTime().isEqual(minFetchTime) || corpusUser.getFetchTime().isAfter(minFetchTime))) {
			return corpusUser;
		} else {
			if (allowFetch) {
				final TwitterUser updatedCorpusUser;
				try {
					final User twitterUser = twitter.showUser(screenName);
					int updatedRevId = corpusUser != null ? corpusUser.getRevId() + 1 : 1;
					updatedCorpusUser = new TwitterUser(twitterUser, updatedRevId, new DateTime());
				} catch (TwitterException e) {
					throw new RuntimeException("Cannot fetch Twitter profile for @" + screenName, e);
				}
				corpus.ensureUser(updatedCorpusUser);
				return updatedCorpusUser;
			} else {
				throw new RuntimeException(String.format("Cannot find Twitter user @%s in corpus (minFetchTime: %s) but fetch disallowed",
						screenName, minFetchTime));
			}
		}
		
	}

//	public long getFriendsCount(String screenName) {
//		int followersCount;
//		try {
//			followersCount = twitter.showUser(screenName).getFriendsCount();
//		} catch (TwitterException e) {
//			throw new RuntimeException("Cannot get followersCount for " + screenName, e);
//		}
//		return followersCount;
//	}
	
	/**
	 * <p>Warning: This may exhaust the rate limit when used with a user with large number (> 5000) of followers.
	 * @param screenName
	 * @return
	 */
	public Set<Long> getAllFollowerIDs(String screenName) {
		final Set<Long> ids = Sets.newHashSet();
		long cursor = -1;
		long pageCount = 0;
		try {
			while (cursor != 0) {
				log.debug("Fetching @{}'s follower IDs for cursor {} (page #{})", screenName, cursor, pageCount);
				IDs page = twitter.getFollowersIDs(screenName, cursor);
				final Set<Long> currentIds = ImmutableSet.copyOf(ArrayUtils.toObject(page.getIDs()));
				log.info("Fetched @{}'s follower IDs for cursor {} (page #{}), {} IDs: {}", 
						screenName, cursor, pageCount, page.getIDs().length, Iterables.limit(currentIds, 10));
				ids.addAll(currentIds);
				// next page
				cursor = page.getNextCursor();
				pageCount++;
			}
			log.info("@{} has {} follower IDs in {} pages", screenName, ids.size(), pageCount);
			return ids;
		} catch (TwitterException e) {
			throw new RuntimeException(String.format("Cannot fetch @%s's follower IDs for cursor %s (%s IDs from %s pages collected so far)", 
					screenName, cursor, ids.size(), pageCount), e);
		}
	}

	/**
	 * <p>Warning: This may exhaust the rate limit when used with a user with large number (> 5000) of followings.
	 * @param screenName
	 * @return
	 */
	public Set<Long> getAllFollowingIDs(String screenName) {
		final Set<Long> ids = Sets.newHashSet();
		long cursor = -1;
		long pageCount = 0;
		try {
			while (cursor != 0) {
				log.debug("Fetching @{}'s following IDs for cursor {} (page #{})", screenName, cursor, pageCount);
				IDs page = twitter.getFriendsIDs(screenName, cursor);
				final ImmutableSet<Long> currentIds = ImmutableSet.copyOf(ArrayUtils.toObject(page.getIDs()));
				log.info("Fetched @{}'s following IDs for cursor {} (page #{}), {} IDs: {}", 
						screenName, cursor, pageCount, page.getIDs().length, Iterables.limit(currentIds, 10));
				ids.addAll(currentIds);
				// next page
				cursor = page.getNextCursor();
				pageCount++;
			}
			log.info("@{} follows {} IDs in {} pages", screenName, ids.size(), pageCount);
			return ids;
		} catch (TwitterException e) {
			throw new RuntimeException(String.format("Cannot fetch @%s's following IDs for cursor %s (%s IDs from %s pages collected so far)", 
					screenName, cursor, ids.size(), pageCount), e);
		}
	}

	/**
	 * <p>Warning: This may exhaust the rate limit when used with a user with large number (> 5000) of followings or followers.
	 * @param screenName
	 * @return
	 */
	public FriendRatioSet calculateFriendRatioSet(String screenName) {
		final Set<Long> followingIds = getAllFollowingIDs(screenName);
		final Set<Long> followerIds = getAllFollowerIDs(screenName);
		final SetView<Long> mutualIds = Sets.intersection(followingIds, followerIds);
		final double reciprocityRatio = followerIds.size() > 0 ? (double) mutualIds.size() / (double) followerIds.size() : 0d;
		final double sociableRatio = followingIds.size() > 0 ? (double) mutualIds.size() / (double) followingIds.size() : 0d;
		final double popularityRatio = mutualIds.size() > 0 ? (double) followerIds.size() / (double) mutualIds.size() : 0d;
		log.info("@{}'s ratios - following: {} followers: {} mutual: {} reciprocity: {}% sociable: {}% popularity: {}",
				screenName, followingIds.size(), followerIds.size(), mutualIds.size(), (int) (reciprocityRatio * 100d), (int) (sociableRatio * 100d), popularityRatio);
		return new FriendRatioSet(followingIds.size(), followerIds.size(), mutualIds.size(), reciprocityRatio, sociableRatio, popularityRatio);
	}

}
