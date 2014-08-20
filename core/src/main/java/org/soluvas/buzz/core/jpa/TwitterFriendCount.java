package org.soluvas.buzz.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.soluvas.buzz.core.TwitterCountKey;

/**
 * A representation of the model object '<em><b>TwitterFriendCount</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "buzz")
@IdClass(TwitterCountKey.class)
public class TwitterFriendCount {

	// TODO: https://hibernate.atlassian.net/browse/HHH-9114

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id
	@Basic()
	@Column(name = "twitteruserid")
	private long twitterUserId = 0;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id
	@Basic()
	@Column(name = "fetchtime")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime fetchTime = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private int friendCount = 0;

	/**
	 * Returns the value of '<em><b>twitterUserId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>twitterUserId</b></em>' feature
	 * @generated
	 */
	public long getTwitterUserId() {
		return twitterUserId;
	}

	/**
	 * Sets the '{@link TwitterFriendCount#getTwitterUserId()
	 * <em>twitterUserId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTwitterUserId
	 *            the new value of the '
	 *            {@link TwitterFriendCount#getTwitterUserId() twitterUserId}'
	 *            feature.
	 * @generated
	 */
	public void setTwitterUserId(long newTwitterUserId) {
		twitterUserId = newTwitterUserId;
	}

	/**
	 * Returns the value of '<em><b>fetchTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fetchTime</b></em>' feature
	 * @generated
	 */
	public DateTime getFetchTime() {
		return fetchTime;
	}

	/**
	 * Sets the '{@link TwitterFriendCount#getFetchTime() <em>fetchTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFetchTime
	 *            the new value of the '
	 *            {@link TwitterFriendCount#getFetchTime() fetchTime}' feature.
	 * @generated
	 */
	public void setFetchTime(DateTime newFetchTime) {
		fetchTime = newFetchTime;
	}

	/**
	 * Returns the value of '<em><b>friendCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>friendCount</b></em>' feature
	 * @generated
	 */
	public int getFriendCount() {
		return friendCount;
	}

	/**
	 * Sets the '{@link TwitterFriendCount#getFriendCount()
	 * <em>friendCount</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFriendCount
	 *            the new value of the '
	 *            {@link TwitterFriendCount#getFriendCount() friendCount}'
	 *            feature.
	 * @generated
	 */
	public void setFriendCount(int newFriendCount) {
		friendCount = newFriendCount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterFriendCount " + " [twitterUserId: " + getTwitterUserId()
				+ "]" + " [fetchTime: " + getFetchTime() + "]"
				+ " [friendCount: " + getFriendCount() + "]";
	}

	public TwitterFriendCount() {
		super();
	}

	public TwitterFriendCount(long twitterUserId, DateTime fetchTime,
			int friendCount) {
		super();
		setTwitterUserId(twitterUserId);
		setFetchTime(fetchTime);
		setFriendCount(friendCount);
	}

}
