package org.soluvas.buzz.core;

import java.io.Serializable;

public class TwitterFollowerPageKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	long snapshot;
	long pageCursor;
	
	public TwitterFollowerPageKey() {
		super();
	}
	
	public TwitterFollowerPageKey(long snapshot, long pageCursor) {
		super();
		this.snapshot = snapshot;
		this.pageCursor = pageCursor;
	}

	/**
	 * @return the snapshot
	 */
	public long getSnapshot() {
		return snapshot;
	}

	/**
	 * @param snapshot the snapshot to set
	 */
	public void setSnapshot(long snapshot) {
		this.snapshot = snapshot;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (pageCursor ^ (pageCursor >>> 32));
		result = prime * result + (int) (snapshot ^ (snapshot >>> 32));
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
		if (!(obj instanceof TwitterFollowerPageKey)) {
			return false;
		}
		TwitterFollowerPageKey other = (TwitterFollowerPageKey) obj;
		if (pageCursor != other.pageCursor) {
			return false;
		}
		if (snapshot != other.snapshot) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TwitterFollowerPageKey [snapshot=" + snapshot + ", pageCursor="
				+ pageCursor + "]";
	}
	
}
