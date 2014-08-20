package org.soluvas.buzz.twitter;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.Trigger.TriggerState;
import org.quartz.TriggerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzConfig;
import org.soluvas.buzz.core.impl.SchedulerConfig;
import org.soluvas.buzz.core.impl.SoluvasConfigFileApplicationContextInitializer;
import org.soluvas.buzz.core.jpa.TwitterFollowerSnapshot;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={BuzzConfig.class, SchedulerConfig.class, BuzzTwitterConfig.class}, 
	initializers=SoluvasConfigFileApplicationContextInitializer.class)
public class FetchFollowersPageJobTest {

	private static final Logger log = LoggerFactory
			.getLogger(FetchFollowersPageJobTest.class);
	
	@Inject
	Scheduler scheduler;
	@Inject
	TwitterUserRepository twitterUserRepo;
	@Inject
	TwitterFollowerSnapshotRepository twitterFollowerSnapshotRepo;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void addSnapshotForAsmanadia() throws SchedulerException, InterruptedException {
		org.soluvas.buzz.core.jpa.TwitterUser asmanadia = twitterUserRepo.findOneByScreenName("asmanadia");
		
		TwitterFollowerSnapshot snapshot = new TwitterFollowerSnapshot();
		snapshot.setCreationTime(new DateTime());
		snapshot.setModificationTime(new DateTime());
		snapshot.setUser(asmanadia);
		snapshot.setId(asmanadia.getId());
		snapshot.setScreenName(asmanadia.getScreenName());
		twitterFollowerSnapshotRepo.save(snapshot);
	}
	
	@Test
	public void followersOfAsmanadia() throws SchedulerException, InterruptedException {
		JobDetail jobDetail = JobBuilder.newJob(FetchFollowersPageJob.class).build();
//		scheduler.triggerJob(jobDetail.getKey(), 
//				new JobDataMap(ImmutableMap.of("screenName", "asmanadia")));
		Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail)
				.usingJobData("tenantId", "buzz")
				.usingJobData("campaignId", "buzz")
				.usingJobData("screenName", "asmanadia")
				.usingJobData("snapshotId", 1L)
				.usingJobData("cursor", -1L)
				.startNow().build();
		scheduler.scheduleJob(jobDetail, trigger);
		TriggerState state = scheduler.getTriggerState(trigger.getKey());
		log.info("initial trigger {} state: {}", trigger.getKey(), state);
		do {
			Thread.currentThread().sleep(1000);
			state = scheduler.getTriggerState(trigger.getKey());
			log.info("trigger {} state: {}", trigger.getKey(), state);
			// TODO: aneh nich padahal jobnya belum selesai tapi triggerstatenya udah COMPLETE :(
		} while (state == TriggerState.NORMAL);
	}

}
