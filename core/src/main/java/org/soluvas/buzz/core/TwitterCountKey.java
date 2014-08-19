package org.soluvas.buzz.core;

import java.io.Serializable;

import org.joda.time.DateTime;

public class TwitterCountKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long twitterUserId = 0;
	private DateTime fetchTime = null;
	
	public TwitterCountKey() {
		super();
	}
	
	public TwitterCountKey(long twitterUserId, DateTime fetchTime) {
		super();
		this.twitterUserId = twitterUserId;
		this.fetchTime = fetchTime;
	}

	public long getTwitterUserId() {
		return twitterUserId;
	}

	public void setTwitterUserId(long newTwitterUserId) {
		twitterUserId = newTwitterUserId;
	}

	public DateTime getFetchTime() {
		return fetchTime;
	}

	public void setFetchTime(DateTime newFetchTime) {
		fetchTime = newFetchTime;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fetchTime == null) ? 0 : fetchTime.hashCode());
		result = prime * result
				+ (int) (twitterUserId ^ (twitterUserId >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TwitterCountKey)) {
			return false;
		}
		TwitterCountKey other = (TwitterCountKey) obj;
		if (fetchTime == null) {
			if (other.fetchTime != null) {
				return false;
			}
		} else if (!fetchTime.equals(other.fetchTime)) {
			return false;
		}
		if (twitterUserId != other.twitterUserId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TwitterCountKey " + " [twitterUserId: " + getTwitterUserId()
				+ "]" + " [fetchTime: " + getFetchTime() + "]";
	}
}
