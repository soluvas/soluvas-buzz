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
 * A representation of the model object '<em><b>TwitterStatusCount</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "buzz")
@IdClass(TwitterCountKey.class)
public class TwitterStatusCount {

	// TODO: https://hibernate.atlassian.net/browse/HHH-9114

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id
	@Basic()
	@Column(name="twitteruserid")
	private long twitterUserId = 0;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id
	@Basic()
	@Column(name="fetchtime")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime fetchTime = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private int statusCount = 0;

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
	 * Sets the '{@link TwitterStatusCount#getTwitterUserId()
	 * <em>twitterUserId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTwitterUserId
	 *            the new value of the '
	 *            {@link TwitterStatusCount#getTwitterUserId() twitterUserId}'
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
	 * Sets the '{@link TwitterStatusCount#getFetchTime() <em>fetchTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFetchTime
	 *            the new value of the '
	 *            {@link TwitterStatusCount#getFetchTime() fetchTime}' feature.
	 * @generated
	 */
	public void setFetchTime(DateTime newFetchTime) {
		fetchTime = newFetchTime;
	}

	/**
	 * Returns the value of '<em><b>statusCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>statusCount</b></em>' feature
	 * @generated
	 */
	public int getStatusCount() {
		return statusCount;
	}

	/**
	 * Sets the '{@link TwitterStatusCount#getStatusCount()
	 * <em>statusCount</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStatusCount
	 *            the new value of the '
	 *            {@link TwitterStatusCount#getStatusCount() statusCount}'
	 *            feature.
	 * @generated
	 */
	public void setStatusCount(int newStatusCount) {
		statusCount = newStatusCount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterStatusCount " + " [twitterUserId: " + getTwitterUserId()
				+ "]" + " [fetchTime: " + getFetchTime() + "]"
				+ " [statusCount: " + getStatusCount() + "]";
	}

	public TwitterStatusCount() {
		super();
	}

	public TwitterStatusCount(long twitterUserId, DateTime fetchTime,
			int statusCount) {
		super();
		setTwitterUserId(twitterUserId);
		setFetchTime(fetchTime);
		setStatusCount(statusCount);
	}

}
