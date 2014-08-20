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
 * A representation of the model object '<em><b>TwitterListedCount</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "buzz")
@IdClass(TwitterCountKey.class)
public class TwitterListedCount {

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
	private int listedCount = 0;

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
	 * Sets the '{@link TwitterListedCount#getTwitterUserId()
	 * <em>twitterUserId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTwitterUserId
	 *            the new value of the '
	 *            {@link TwitterListedCount#getTwitterUserId() twitterUserId}'
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
	 * Sets the '{@link TwitterListedCount#getFetchTime() <em>fetchTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFetchTime
	 *            the new value of the '
	 *            {@link TwitterListedCount#getFetchTime() fetchTime}' feature.
	 * @generated
	 */
	public void setFetchTime(DateTime newFetchTime) {
		fetchTime = newFetchTime;
	}

	/**
	 * Returns the value of '<em><b>listedCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>listedCount</b></em>' feature
	 * @generated
	 */
	public int getListedCount() {
		return listedCount;
	}

	/**
	 * Sets the '{@link TwitterListedCount#getListedCount()
	 * <em>listedCount</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newListedCount
	 *            the new value of the '
	 *            {@link TwitterListedCount#getListedCount() listedCount}'
	 *            feature.
	 * @generated
	 */
	public void setListedCount(int newListedCount) {
		listedCount = newListedCount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterListedCount " + " [twitterUserId: " + getTwitterUserId()
				+ "]" + " [fetchTime: " + getFetchTime() + "]"
				+ " [listedCount: " + getListedCount() + "]";
	}

	public TwitterListedCount() {
		super();
	}

	public TwitterListedCount(long twitterUserId, DateTime fetchTime,
			int listedCount) {
		super();
		setTwitterUserId(twitterUserId);
		setFetchTime(fetchTime);
		setListedCount(listedCount);
	}

}
