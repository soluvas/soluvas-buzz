package org.soluvas.buzz.twitter;

import java.util.Set;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzAccounts;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.commons.OnDemandXmiLoader;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import twitter4j.User;

import com.google.common.collect.Iterables;

/**
 * @author ceefour
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=TestContextLoader.class, locations="/META-INF/spring/buzz-twitter.xml")
@PropertySource("classpath:/META-INF/jpa.properties")
public class TwitterAnalyzerWithCorpusTest {
	private static final Logger log = LoggerFactory
			.getLogger(TwitterAnalyzerWithCorpusTest.class);
	private BuzzAccount aksimataAccount;
	private TwitterAnalyzer analyzer;
	
	@Inject
	private TwitterCorpus corpus;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		final BuzzAccounts accounts = new OnDemandXmiLoader<BuzzAccounts>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerWithCorpusTest.class, "/META-INF/twitter.BuzzAccounts.xmi" ).get();
		aksimataAccount = accounts.getAccounts().get(0);
		analyzer = new TwitterAnalyzer(aksimataAccount.getTwitterApp(), aksimataAccount.getTwitterAppUser());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void saveFollowingsToCorpus() {
		final String targetScreenName = "hendybippo";
		// TODO: cache User profile in corpus
		final User twitterUser = analyzer.getProfile(targetScreenName);
		final Set<Long> followingIds = analyzer.getAllFollowingIDs(targetScreenName);
		final DateTime fetchTime = new DateTime();
		log.info("Following of {} has {}: {}", targetScreenName, followingIds.size(), Iterables.limit(followingIds, 10));
		for (long followingId : followingIds) {
			final TwitterFollowing following = new TwitterFollowing();
			following.setTwitterId(twitterUser.getId());
			following.setTwitterScreenName(targetScreenName);
			following.setFollowingId(followingId);
			following.setRevId(1);
			following.setFetchTime(fetchTime);
			corpus.ensureFollowing(following);
		}
	}

	@Test
	public void saveFollowersToCorpus() {
		final String targetScreenName = "hendybippo";
		// TODO: cache User profile in corpus
		final User twitterUser = analyzer.getProfile(targetScreenName);
		final Set<Long> followerIds = analyzer.getAllFollowerIDs(targetScreenName);
		final DateTime fetchTime = new DateTime();
		log.info("Follower of {} has {}: {}", targetScreenName, followerIds.size(), Iterables.limit(followerIds, 10));
		for (long followerId : followerIds) {
			final TwitterFollower follower = new TwitterFollower();
			follower.setTwitterId(twitterUser.getId());
			follower.setTwitterScreenName(targetScreenName);
			follower.setFollowerId(followerId);
			follower.setRevId(1);
			follower.setFetchTime(fetchTime);
			corpus.ensureFollower(follower);
		}
	}

	@Test
	public void saveUserToCorpus() {
		final String targetScreenName = "keisavourie";
		final User twitterUser = analyzer.getProfile(targetScreenName);
		final TwitterUser corpusUser = new TwitterUser(twitterUser, 1, new DateTime());
		corpus.ensureUser(corpusUser);
	}

//	@Test
//	public void followersCountOfDila() {
//		final String targetScreenName = "dilamala";
//		final long followersCount = analyzer.getFollowersCount(targetScreenName);
//		log.info("Followers count of {}: {}", targetScreenName, followersCount);
//		assertThat(followersCount, greaterThanOrEqualTo(1L));
//	}
//
//	@Test
//	public void friendRatioSet() {
//		final String targetScreenName = "hitmansystem";
//		final FriendRatioSet friendRatioSet = analyzer.calculateFriendRatioSet(targetScreenName);
//		log.info("FriendRatioSet of {}: {}", targetScreenName, friendRatioSet);
//		assertThat(friendRatioSet.getFollowingCount(), greaterThanOrEqualTo(1L));
//		assertThat(friendRatioSet.getFollowerCount(), greaterThanOrEqualTo(1L));
//		assertThat(friendRatioSet.getMutualCount(), greaterThanOrEqualTo(1L));
//		assertThat(friendRatioSet.getReciprocityRatio(), greaterThan(0d));
//		assertThat(friendRatioSet.getSociabilityRatio(), greaterThan(0d));
//		assertThat(friendRatioSet.getPopularityRatio(), greaterThanOrEqualTo(1d));
//	}

}
