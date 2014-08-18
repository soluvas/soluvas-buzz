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
import org.soluvas.buzz.core.BuzzConfig;
import org.soluvas.buzz.core.impl.SoluvasConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BuzzConfig.class, initializers=SoluvasConfigFileApplicationContextInitializer.class)
public class FetchProfileJobTest {
	
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
		JobDetail jobDetail = JobBuilder.newJob(FetchProfileJob.class).build();
		Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail).usingJobData("screenName", "asmanadia").startNow().build();
		scheduler.scheduleJob(trigger);
		TriggerState state;
		do {
			Thread.currentThread().sleep(1000);
			state = scheduler.getTriggerState(trigger.getKey());
		} while (state == TriggerState.NONE);
	}

}
