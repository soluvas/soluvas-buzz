package org.soluvas.buzz.twitter;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.inject.Inject;

import org.joda.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzConfig;
import org.soluvas.buzz.core.impl.SchedulerConfig;
import org.soluvas.buzz.core.impl.SoluvasConfigFileApplicationContextInitializer;
import org.soluvas.buzz.twitter.TwitterFollowerManager.TwitterUnfetchedFollowerPage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={BuzzConfig.class, SchedulerConfig.class, BuzzTwitterConfig.class}, 
	initializers=SoluvasConfigFileApplicationContextInitializer.class)
public class ScheduleFetchFollowersPageJobTest {

	private static final Logger log = LoggerFactory
			.getLogger(ScheduleFetchFollowersPageJobTest.class);
	
	@Inject
	Scheduler scheduler;
	@Inject
	TwitterUserRepository twitterUserRepo;
	@Inject
	TwitterFollowerSnapshotRepository twitterFollowerSnapshotRepo;
	@Inject
	TwitterFollowerManager twitterFollowerMgr;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void findAllUnfetchedFollowerPages() throws SchedulerException, InterruptedException {
		List<TwitterUnfetchedFollowerPage> followerPages = twitterFollowerMgr.findAllUnfetchedFollowerPages();
		assertThat(followerPages, not(empty()));
	}
	
	@Test
	public void scheduleOnce() throws SchedulerException, InterruptedException {
		JobDetail jobDetail = JobBuilder.newJob(ScheduleFetchFollowersPageJob.class).build();
		Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail)
				.usingJobData("tenantId", "buzz")
				.usingJobData("campaignId", "buzz")
				.startNow().build();
		scheduler.scheduleJob(jobDetail, trigger);
		log.info("Waiting 1 minute...");
		Thread.sleep(60 * 1000);
		log.info("Waited done.");
	}
	
	@Test
	public void schedule10minutes() throws SchedulerException, InterruptedException {
		JobDetail jobDetail = JobBuilder.newJob(ScheduleFetchFollowersPageJob.class).build();
		Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail)
				.usingJobData("tenantId", "buzz")
				.usingJobData("campaignId", "buzz")
				.startNow()
				.withSchedule(SimpleScheduleBuilder.repeatMinutelyForever(2))
				.build();
		scheduler.scheduleJob(jobDetail, trigger);
		log.info("Waiting 10 minutes...");
		Thread.sleep(Duration.standardMinutes(10).getMillis());
		log.info("Waited done.");
	}
	
}
