package org.soluvas.buzz.core;

import java.io.Serializable;

public class TwitterFollowerKey implements Serializable {

	private static final long serialVersionUID = 1L;

	long snapshotId;
	long pageCursor;
	long userId;
	
	public TwitterFollowerKey() {
		super();
	}

	/**
	 * @return the snapshotId
	 */
	public long getSnapshotId() {
		return snapshotId;
	}

	/**
	 * @param snapshotId the snapshotId to set
	 */
	public void setSnapshotId(long snapshotId) {
		this.snapshotId = snapshotId;
	}

	/**
	 * @return the pageCursor
	 */
	public long getPageCursor() {
		return pageCursor;
	}

	/**
	 * @param pageCursor the pageCursor to set
	 */
	public void setPageCursor(long pageCursor) {
		this.pageCursor = pageCursor;
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (pageCursor ^ (pageCursor >>> 32));
		result = prime * result + (int) (snapshotId ^ (snapshotId >>> 32));
		result = prime * result + (int) (userId ^ (userId >>> 32));
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
		if (!(obj instanceof TwitterFollowerKey)) {
			return false;
		}
		TwitterFollowerKey other = (TwitterFollowerKey) obj;
		if (pageCursor != other.pageCursor) {
			return false;
		}
		if (snapshotId != other.snapshotId) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TwitterFollowerKey [snapshotId=" + snapshotId + ", pageCursor="
				+ pageCursor + ", userId=" + userId + "]";
	}
	
}
