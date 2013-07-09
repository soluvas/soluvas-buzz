package org.soluvas.buzz.twitter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Index;
import org.joda.time.DateTime;

/**
 * Stores the follower list.
 * @author ceefour
 */
public class TwitterFollower implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE) @Column(nullable=false)
	private long id;
	@Index(name="twitter_id_idx")
	private Long twitterId;
	@Index(name="twitter_screen_name_idx")
	private String twitterScreenName;
	@Index(name="follower_id_idx")
	private Long followerId;
	@Index(name="follower_screen_name_idx")
	private Long followerScreenName;
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
	 * Follower's Twitter ID. One of {@link #getFollowerId()} or {@link #getFollowerScreenName()} must be filled.
	 * @return
	 */
	public Long getFollowerId() {
		return followerId;
	}

	public void setFollowerId(Long followerId) {
		this.followerId = followerId;
	}

	/**
	 * Follower's Twitter screen name. One of {@link #getFollowerId()} or {@link #getFollowerScreenName()} must be filled.
	 * @return
	 */
	public Long getFollowerScreenName() {
		return followerScreenName;
	}

	public void setFollowerScreenName(Long followerScreenName) {
		this.followerScreenName = followerScreenName;
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

}
