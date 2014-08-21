package org.soluvas.buzz.twitter;

import javax.inject.Inject;

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
import org.soluvas.json.JsonUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.ImmutableSet;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={BuzzConfig.class, SchedulerConfig.class, BuzzTwitterConfig.class}, 
	initializers=SoluvasConfigFileApplicationContextInitializer.class)
public class LookupUsersJobTest {

	private static final Logger log = LoggerFactory
			.getLogger(LookupUsersJobTest.class);
	
	@Inject
	Scheduler scheduler;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void fetchAsmanadia() throws SchedulerException, InterruptedException {
		JobDetail jobDetail = JobBuilder.newJob(LookupUsersJob.class).build();
//		scheduler.triggerJob(jobDetail.getKey(), 
//				new JobDataMap(ImmutableMap.of("screenName", "asmanadia")));
		Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail)
				.usingJobData("tenantId", "buzz")
				.usingJobData("campaignId", "buzz")
				.usingJobData("screenNames", JsonUtils.asJson(ImmutableSet.of("asmanadia")))
				.startNow().build();
		scheduler.scheduleJob(jobDetail, trigger);
		TriggerState state = scheduler.getTriggerState(trigger.getKey());
		log.info("initial trigger {} state: {}", trigger.getKey(), state);
		do {
			Thread.currentThread().sleep(1000);
			state = scheduler.getTriggerState(trigger.getKey());
			log.info("trigger {} state: {}", trigger.getKey(), state);
		} while (state == TriggerState.NORMAL);
	}

	@Test
	public void fetchFelixsiauw() throws SchedulerException, InterruptedException {
		JobDetail jobDetail = JobBuilder.newJob(LookupUsersJob.class).build();
		Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail)
				.usingJobData("tenantId", "buzz")
				.usingJobData("campaignId", "buzz")
				.usingJobData("screenNames", JsonUtils.asJson(ImmutableSet.of("felixsiauw")))
				.startNow().build();
		scheduler.scheduleJob(jobDetail, trigger);
		Thread.sleep(1000);
	}

}
