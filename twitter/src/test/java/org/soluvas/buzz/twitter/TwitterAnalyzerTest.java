package org.soluvas.buzz.twitter;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.commons.OnDemandXmiLoader;

/**
 * @author ceefour
 *
 */
public class TwitterAnalyzerTest {
	private static final Logger log = LoggerFactory
			.getLogger(TwitterAnalyzerTest.class);
	private TwitterAnalyzer analyzer;
	private BuzzAccount account;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		final BuzzApp buzzApp = new OnDemandXmiLoader<BuzzApp>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerTest.class, "/config/buzz.BuzzApp.xmi" ).get();
		account = new OnDemandXmiLoader<BuzzAccount>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerTest.class, "/config/buzz.BuzzAccount.xmi" ).get();
		analyzer = new TwitterAnalyzer(null, buzzApp.getTwitterConsumer(), account.getTwitterUser());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void followersCountOfDila() {
		final String targetScreenName = "dilamala";
		final long followersCount = analyzer.getFollowersCount(targetScreenName);
		log.info("Followers count of {}: {}", targetScreenName, followersCount);
		assertThat(followersCount, greaterThanOrEqualTo(1L));
	}

	@Test
	public void friendRatioSet() {
		final String targetScreenName = "hitmansystem";
		final FriendRatioSet friendRatioSet = analyzer.calculateFriendRatioSet(targetScreenName);
		log.info("FriendRatioSet of {}: {}", targetScreenName, friendRatioSet);
		assertThat(friendRatioSet.getFollowingCount(), greaterThanOrEqualTo(1L));
		assertThat(friendRatioSet.getFollowerCount(), greaterThanOrEqualTo(1L));
		assertThat(friendRatioSet.getMutualCount(), greaterThanOrEqualTo(1L));
		assertThat(friendRatioSet.getReciprocityRatio(), greaterThan(0d));
		assertThat(friendRatioSet.getSociabilityRatio(), greaterThan(0d));
		assertThat(friendRatioSet.getPopularityRatio(), greaterThanOrEqualTo(1d));
	}

}
