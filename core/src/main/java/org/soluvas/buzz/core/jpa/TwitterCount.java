package org.soluvas.buzz.core.jpa;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import org.joda.time.DateTime;

/**
 * A representation of the model object '<em><b>TwitterCount</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@MappedSuperclass()
public abstract class TwitterCount {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	// @Basic()
	@Transient
	private long twitterUserId = 0;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	// @Basic()
	// @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Transient
	private DateTime fetchTime = null;

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
	 * Sets the '{@link TwitterCount#getTwitterUserId() <em>twitterUserId</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTwitterUserId
	 *            the new value of the '{@link TwitterCount#getTwitterUserId()
	 *            twitterUserId}' feature.
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
	 * Sets the '{@link TwitterCount#getFetchTime() <em>fetchTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFetchTime
	 *            the new value of the '{@link TwitterCount#getFetchTime()
	 *            fetchTime}' feature.
	 * @generated
	 */
	public void setFetchTime(DateTime newFetchTime) {
		fetchTime = newFetchTime;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterCount " + " [twitterUserId: " + getTwitterUserId() + "]"
				+ " [fetchTime: " + getFetchTime() + "]";
	}
}
