package org.soluvas.buzz.twitter;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzAccounts;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.commons.OnDemandXmiLoader;

/**
 * @author ceefour
 *
 */
public class TwitterAnalyzerTest {
	private static final Logger log = LoggerFactory
			.getLogger(TwitterAnalyzerTest.class);
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void followersCountOfDila() {
		final BuzzAccounts accounts = new OnDemandXmiLoader<BuzzAccounts>( BuzzCorePackage.eINSTANCE, TwitterAnalyzerTest.class, "/META-INF/twitter.BuzzAccounts.xmi" ).get();
		final BuzzAccount account = accounts.getAccounts().get(0);
		final TwitterAnalyzer analyzer = new TwitterAnalyzer(account.getTwitterApp(), account.getTwitterAppUser());
		final String targetScreenName = "dilamala";
		final long followersCount = analyzer.getFollowersCount(targetScreenName);
		log.info("Followers count of {}: {}", targetScreenName, followersCount);
		assertThat(followersCount, greaterThanOrEqualTo(1L));
	}

}
