package org.soluvas.buzz.twitter;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=TestContextLoader.class, locations="/META-INF/spring/buzz-twitter.xml")
@PropertySource("classpath:/META-INF/jpa.properties")
public class TwitterCorpusTest {
	private static final Logger log = LoggerFactory
			.getLogger(TwitterCorpusTest.class);
	
//	private ClassPathXmlApplicationContext appCtx;
	@Inject
	private TwitterCorpus corpus;

	@Before
	public void setUp() throws Exception {
//		appCtx = new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/buzz-twitter.xml"}, false);
//		appCtx.getEnvironment().getPropertySources().addFirst(new ResourcePropertySource("classpath:/META-INF/jpa.properties"));
//		appCtx.refresh();
	}

	@After
	public void tearDown() throws Exception {
//		appCtx.close();
	}

	@Test
	public void ensureFollower() {
		final TwitterFollower follower = new TwitterFollower();
		follower.setFetchRev(1);
		follower.setFetchTime(new DateTime());
		follower.setTwitterId(1L);
		follower.setTwitterScreenName("bob");
		follower.setFollowerId(2L);
		follower.setFollowerScreenName("alice");
		final TwitterFollower ensuredFollower = corpus.ensureFollower(follower);
		log.info("Ensured follower: {}", ensuredFollower);
		assertNotNull(ensuredFollower);
		assertThat(ensuredFollower.getId(), greaterThanOrEqualTo(1L));
	}

}
