package org.soluvas.buzz.twitter;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.soluvas.buzz.core.jpa.TwitterFollowerSnapshot;
import org.soluvas.buzz.twitter.TwitterFollowerManager.TwitterUnfetchedFollowerPage;
import org.soluvas.commons.tenant.CommandRequestAttributes;
import org.soluvas.schedule.TenantJob;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/**
 * Uses {@link TwitterFollowerManager#findAllUnfetchedFollowerPages()}
 * to schedule {@link FetchFollowersPageJob}. This job itself
 * needs to be scheduled periodically.
 * @todo Also schedule {@link TwitterFollowerSnapshot} without any existing page.
 * @author ceefour
 */
@DisallowConcurrentExecution
public class ScheduleFetchFollowersPageJob extends TenantJob {
	
	String campaignId;
	Long snapshotId;
	int maxJobs = 10;
	
	/**
	 * @param campaignId the campaignId to set
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	
	/**
	 * @param snapshotId
	 * @todo not used yet
	 */
	public void setSnapshotId(Long snapshotId) {
		this.snapshotId = snapshotId;
	}
	
	public void setMaxJobs(int maxJobs) {
		this.maxJobs = maxJobs;
	}
	
	public int getMaxJobs() {
		return maxJobs;
	}
	
	/* (non-Javadoc)
	 * @see org.soluvas.schedule.TenantJob#doExecute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void doExecute(JobExecutionContext context)
			throws JobExecutionException {
		Preconditions.checkNotNull(campaignId, "campaignId is required");
//		Preconditions.checkNotNull(snapshotId, "snapshotId is required"); // TODO: not used yet
		Preconditions.checkNotNull(maxJobs, "maxJobs is required");
		TwitterFollowerManager twitterFollowerMgr = getBean(TwitterFollowerManager.class);
		
		JobDetail jobDetail = JobBuilder.newJob(FetchFollowersPageJob.class).build();
		try (Closeable cl = CommandRequestAttributes.withTenant(tenantId)) {
			Scheduler scheduler = context.getScheduler();
			List<TwitterUnfetchedFollowerPage> followerPagesAll = twitterFollowerMgr.findAllUnfetchedFollowerPages();

			final ImmutableList<TwitterUnfetchedFollowerPage> unscheduledPages = FluentIterable.from(followerPagesAll)
				.filter(new Predicate<TwitterUnfetchedFollowerPage>() {
					@Override
					public boolean apply(TwitterUnfetchedFollowerPage input) {
						final TriggerKey triggerKey = FetchFollowersPageJob.triggerKey(
								tenantId, campaignId, input.screenName, input.snapshotId, input.unfetchedCursor);
						try {
							return !scheduler.checkExists(triggerKey);
						} catch (SchedulerException e) {
							throw new RuntimeException("Cannot check existence of " + triggerKey, e);
						}
					}
				})
				.limit(maxJobs)
				.toList();
			log.info("Will be scheduling {} out of {} unfetched-unscheduled follower pages", unscheduledPages.size(), followerPagesAll.size()); 
			DateTime curSchedule = new DateTime().plusSeconds(1).withMillisOfSecond(0);
			for (TwitterUnfetchedFollowerPage followerPage : unscheduledPages) {
				final Map<String, Object> jobDataMap = ImmutableMap.of(
						"tenantId", tenantId,
						"campaignId", campaignId,
						"screenName", followerPage.screenName,
						"snapshotId", followerPage.snapshotId,
						"cursor", followerPage.unfetchedCursor);
				Trigger trigger = TriggerBuilder.newTrigger()
						.withIdentity(FetchFollowersPageJob.triggerKey(tenantId, campaignId, followerPage.screenName, followerPage.snapshotId, followerPage.unfetchedCursor))
						.forJob(jobDetail)
						.usingJobData(new JobDataMap(jobDataMap))
						.startAt(curSchedule.toDate())
						.build();
				log.info("Scheduling fetch followers page job {} at {}", jobDataMap, curSchedule);
				scheduler.scheduleJob(jobDetail, trigger);
				curSchedule = curSchedule.plusMinutes(1); // for next job, 1 minute apart
			}
		} catch (IOException | SchedulerException e) {
			throw new JobExecutionException("Can't schedule fetch followers page jobs for campaign " + campaignId + ": " + e, e);
		}
	}

}
