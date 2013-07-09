package org.soluvas.buzz.twitter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Index;
import org.joda.time.DateTime;

/**
 * Stores the following list.
 * @author ceefour
 */
public class TwitterFollowing implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE) @Column(nullable=false)
	private long id;
	@Index(name="twitter_id_idx")
	private Long twitterId;
	@Index(name="twitter_screen_name_idx")
	private String twitterScreenName;
	@Index(name="following_id_idx")
	private Long followingId;
	@Index(name="following_screen_name_idx")
	private Long followingScreenName;
	@Column(nullable=false) @Index(name="fetch_rev_idx")
	private DateTime fetchRev;
	@Column(nullable=false)
	private DateTime fetchTime;

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
	public DateTime getFetchRev() {
		return fetchRev;
	}
	
	public void setFetchRev(DateTime fetchRev) {
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
	public Long getFollowingScreenName() {
		return followingScreenName;
	}

	public void setFollowingScreenName(Long followingScreenName) {
		this.followingScreenName = followingScreenName;
	}
	
}
