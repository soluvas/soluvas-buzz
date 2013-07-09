package org.soluvas.buzz.twitter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Index;
import org.joda.time.DateTime;

/**
 * Stores the following list.
 * @author ceefour
 */
@Entity
public class TwitterFollowing implements Serializable {

	private static final Long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(nullable=false)
	private Long id;
	@Index(name="twitter_id_idx")
	private Long twitterId;
	@Index(name="twitter_screen_name_idx")
	private String twitterScreenName;
	@Index(name="following_id_idx")
	private Long followingId;
	@Index(name="following_screen_name_idx")
	private String followingScreenName;
	@Column(nullable=false) @Index(name="fetch_rev_idx")
	private int fetchRev;
	@Column(nullable=false)
	private DateTime fetchTime;

	/**
	 * Autogenerated ID.
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * User's Twitter ID. Either {@link #twitterId} or {@link #twitterScreenName} must be provided. 
	 */
	public Long getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(Long twitterId) {
		this.twitterId = twitterId;
	}

	/**
	 * User's Twitter screen name. Either {@link #twitterId} or {@link #twitterScreenName} must be provided. 
	 */
	public String getTwitterScreenName() {
		return twitterScreenName;
	}

	public void setTwitterScreenName(String twitterScreenName) {
		this.twitterScreenName = twitterScreenName;
	}

	/**
	 * Revision number of this data. 
	 */
	public int getFetchRev() {
		return fetchRev;
	}
	
	public void setFetchRev(int fetchRev) {
		this.fetchRev = fetchRev;
	}
	
	/**
	 * When this data was fetched.
	 */
	public DateTime getFetchTime() {
		return fetchTime;
	}
	
	public void setFetchTime(DateTime fetchTime) {
		this.fetchTime = fetchTime;
	}

	/**
	 * Following (or followed) user's ID. Either {@link #getFollowingId()} or {@link #getFollowingScreenName()} must be filled. 
	 */
	public Long getFollowingId() {
		return followingId;
	}

	public void setFollowingId(Long followingId) {
		this.followingId = followingId;
	}

	/**
	 * Following (or followed) user's screen name. Either {@link #getFollowingId()} or {@link #getFollowingScreenName()} must be filled. 
	 */
	public String getFollowingScreenName() {
		return followingScreenName;
	}

	public void setFollowingScreenName(String followingScreenName) {
		this.followingScreenName = followingScreenName;
	}

	@Override
	public String toString() {
		return "TwitterFollowing ["
				+ (id != null ? "id=" + id + ", " : "")
				+ (twitterId != null ? "twitterId=" + twitterId + ", " : "")
				+ (twitterScreenName != null ? "twitterScreenName="
						+ twitterScreenName + ", " : "")
				+ (followingId != null ? "followingId=" + followingId + ", "
						: "")
				+ (followingScreenName != null ? "followingScreenName="
						+ followingScreenName + ", " : "") + "fetchRev="
				+ fetchRev + ", "
				+ (fetchTime != null ? "fetchTime=" + fetchTime : "") + "]";
	}
	
}
