package org.soluvas.buzz.twitter;

import java.io.Serializable;

public class FriendRatioSet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private final long followingCount;
	private final long followerCount;
	private final long mutualCount;
	/**
	 * Mutual friends count divided by followers count (Range: 0.0-1.0). A naturally popular asymmetric user
	 * would have < 10%. A synthetic follow-everyone-so-they'll-follow-back user would have > 90%
	 * (it may imply a good user trying to follow-back every follower, but this is the rare conclusion). 
	 */
	private final double reciprocityRatio;
	/**
	 * Mutual friends count divided by following count (Range: 0.0-1.0). A naturally sociable user
	 * would have > 90%. A user that's unable to get a follow-back would have < 90%. 
	 */
	private final double sociabilityRatio;
	/**
	 * Followers count divided by mutual friends count (Range: >= 1.0). A naturally popular asymmetric user
	 * would have >= 2.0. A synthetic auto-follow-back user would have < 1.1. 
	 */
	private final double popularityRatio;
	
	public FriendRatioSet(long followingCount, long followerCount,
			long mutualCount, double reciprocityRatio, double sociabilityRatio,
			double popularityRatio) {
		super();
		this.followingCount = followingCount;
		this.followerCount = followerCount;
		this.mutualCount = mutualCount;
		this.reciprocityRatio = reciprocityRatio;
		this.sociabilityRatio = sociabilityRatio;
		this.popularityRatio = popularityRatio;
	}

	public long getFollowingCount() {
		return followingCount;
	}

	public long getFollowerCount() {
		return followerCount;
	}

	public long getMutualCount() {
		return mutualCount;
	}

	/**
	 * Mutual friends count divided by followers count (Range: 0.0-1.0). A naturally popular asymmetric user
	 * would have < 10%. A synthetic follow-everyone-so-they'll-follow-back user would have > 90%
	 * (it may imply a good user trying to follow-back every follower, but this is the rare conclusion). 
	 */
	public double getReciprocityRatio() {
		return reciprocityRatio;
	}

	/**
	 * Mutual friends count divided by following count (Range: 0.0-1.0). A naturally sociable user
	 * would have > 90%. A user that's unable to get a follow-back would have < 90%. 
	 * @return
	 */
	public double getSociabilityRatio() {
		return sociabilityRatio;
	}

	/**
	 * Followers count divided by mutual friends count (Range: >= 1.0). A naturally popular asymmetric user
	 * would have >= 2.0. A synthetic auto-follow-back user would have < 1.1. 
	 * @return
	 */
	public double getPopularityRatio() {
		return popularityRatio;
	}

	@Override
	public String toString() {
		return "FriendRatioSet [followingCount=" + followingCount
				+ ", followerCount=" + followerCount + ", mutualCount="
				+ mutualCount + ", popularityRatio=" + popularityRatio
				+ ", sociabilityRatio=" + sociabilityRatio + "]";
	}
	
}
