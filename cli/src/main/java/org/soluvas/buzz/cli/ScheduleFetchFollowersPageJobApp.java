package org.soluvas.buzz.cli;

import javax.inject.Inject;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.BuzzConfig;
import org.soluvas.buzz.core.impl.SchedulerConfig;
import org.soluvas.buzz.core.impl.SoluvasConfigFileApplicationContextInitializer;
import org.soluvas.buzz.twitter.BuzzTwitterConfig;
import org.soluvas.buzz.twitter.ScheduleFetchFollowersPageJob;
import org.soluvas.buzz.twitter.TwitterFollowerManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BuzzConfig.class, SchedulerConfig.class, BuzzTwitterConfig.class})
@EnableAutoConfiguration(exclude=LiquibaseAutoConfiguration.class)
public class ScheduleFetchFollowersPageJobApp implements CommandLineRunner {

	private static final Logger log = LoggerFactory
			.getLogger(ScheduleFetchFollowersPageJobApp.class);
	
	@Inject
	Scheduler scheduler;
	@Inject
	TwitterFollowerManager twitterFollowerMgr;

	@Override
	public void run(String... args) throws Exception {
		int minutes = 1;
		JobKey jobKey = new JobKey(ScheduleFetchFollowersPageJob.class.getSimpleName());
		TriggerKey triggerKey = new TriggerKey(ScheduleFetchFollowersPageJob.class.getSimpleName() + "://repeated");
		JobDetail jobDetail = JobBuilder.newJob(ScheduleFetchFollowersPageJob.class).withIdentity(jobKey).build();
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerKey).forJob(jobDetail)
				.usingJobData("tenantId", "buzz")
				.usingJobData("campaignId", "buzz")
				.startNow()
				.withSchedule(SimpleScheduleBuilder.repeatMinutelyForever(minutes))
				.build();
		try {
			scheduler.scheduleJob(jobDetail, trigger);
		} catch (Exception e) {
			log.info("Cannot schedule job, probably already exists: " + e);
		}
		log.info("Joining thread, press Ctrl+C to exit...");
		Thread.currentThread().join();
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(ScheduleFetchFollowersPageJobApp.class);
		app.addInitializers(new SoluvasConfigFileApplicationContextInitializer());
		app.run(args);
	}

}
