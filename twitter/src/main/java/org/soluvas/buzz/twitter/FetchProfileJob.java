package org.soluvas.buzz.twitter;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.soluvas.buzz.core.jpa.TwitterUser;
import org.soluvas.schedule.TenantJob;

import twitter4j.User;

/**
 * Fetches the Twitter {@link User} specified by {@link #setScreenName(String)}
 * and saves it into {@link TwitterUser}.
 * @author ceefour
 */
public class FetchProfileJob extends TenantJob {
	
	String screenName;
	
	/**
	 * @return the screenName
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * @param screenName the screenName to set
	 */
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	/* (non-Javadoc)
	 * @see org.soluvas.schedule.TenantJob#doExecute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void doExecute(JobExecutionContext context)
			throws JobExecutionException {
		
	}

}
