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
 * A representation of the model object '<em><b>TwitterFavoriteCount</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "buzz")
@IdClass(TwitterCountKey.class)
public class TwitterFavoriteCount {

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
	private int favoriteCount = 0;

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
	 * Sets the '{@link TwitterFavoriteCount#getTwitterUserId()
	 * <em>twitterUserId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTwitterUserId
	 *            the new value of the '
	 *            {@link TwitterFavoriteCount#getTwitterUserId() twitterUserId}'
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
	 * Sets the '{@link TwitterFavoriteCount#getFetchTime() <em>fetchTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFetchTime
	 *            the new value of the '
	 *            {@link TwitterFavoriteCount#getFetchTime() fetchTime}'
	 *            feature.
	 * @generated
	 */
	public void setFetchTime(DateTime newFetchTime) {
		fetchTime = newFetchTime;
	}

	/**
	 * Returns the value of '<em><b>favoriteCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>favoriteCount</b></em>' feature
	 * @generated
	 */
	public int getFavoriteCount() {
		return favoriteCount;
	}

	/**
	 * Sets the '{@link TwitterFavoriteCount#getFavoriteCount()
	 * <em>favoriteCount</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFavoriteCount
	 *            the new value of the '
	 *            {@link TwitterFavoriteCount#getFavoriteCount() favoriteCount}'
	 *            feature.
	 * @generated
	 */
	public void setFavoriteCount(int newFavoriteCount) {
		favoriteCount = newFavoriteCount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterFavoriteCount " + " [twitterUserId: "
				+ getTwitterUserId() + "]" + " [fetchTime: " + getFetchTime()
				+ "]" + " [favoriteCount: " + getFavoriteCount() + "]";
	}

	public TwitterFavoriteCount() {
		super();
	}

	public TwitterFavoriteCount(long twitterUserId, DateTime fetchTime,
			int favoriteCount) {
		super();
		setTwitterUserId(twitterUserId);
		setFetchTime(fetchTime);
		setFavoriteCount(favoriteCount);
	}

}
