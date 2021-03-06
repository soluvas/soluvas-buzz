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
import org.quartz.JobKey;
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
		
		try (Closeable cl = CommandRequestAttributes.withTenant(tenantId)) {
			Scheduler scheduler = context.getScheduler();
			
			// TODO: should be per access token, not per campaign: https://github.com/soluvas/soluvas-buzz/issues/2
			JobKey jobKey = new JobKey(String.format("%s://%s/%s",
					tenantId, FetchFollowersPageJob.class.getSimpleName(), campaignId));
			JobDetail jobDetail = JobBuilder.newJob(FetchFollowersPageJob.class).withIdentity(jobKey).storeDurably().build();
			scheduler.addJob(jobDetail, true);
			// if any existing trigger then 1 minute after the most future trigger, otherwise immediately
			Trigger futurestTrigger = null;
			for (Trigger trigger : scheduler.getTriggersOfJob(jobKey)) {
				if (trigger.getNextFireTime() != null && (futurestTrigger == null || trigger.getNextFireTime().after(futurestTrigger.getNextFireTime()))) {
					futurestTrigger = trigger;
				}
			}
			
			List<TwitterUnfetchedFollowerPage> followerPagesAll = twitterFollowerMgr.findAllUnfetchedFollowerPages(tenantId);
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
			DateTime curSchedule;
			if (futurestTrigger != null) {
				curSchedule = new DateTime(futurestTrigger.getNextFireTime()).plusMinutes(1);
				log.info("Scheduling {} out of {} unfetched-unscheduled follower pages from {} after {}", 
						unscheduledPages.size(), followerPagesAll.size(), curSchedule, futurestTrigger.getKey()); 
			} else {
				curSchedule = new DateTime().plusSeconds(1).withMillisOfSecond(0);
				log.info("Scheduling {} out of {} unfetched-unscheduled follower pages immediately from {}", 
						unscheduledPages.size(), followerPagesAll.size(), curSchedule); 
			}
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
				scheduler.scheduleJob(trigger);
				curSchedule = curSchedule.plusMinutes(1); // for next job, 1 minute apart
			}
		} catch (IOException | SchedulerException e) {
			throw new JobExecutionException("Can't schedule fetch followers page jobs for campaign " + campaignId + ": " + e, e);
		}
	}

}
