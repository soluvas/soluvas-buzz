package org.soluvas.buzz.core.jpa;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.soluvas.buzz.core.TwitterFollowerKey;

/**
 * A representation of the model object '<em><b>TwitterFollower</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
 * contain at least {@code #userId}. The rest should be looked up (if available)
 * in {@link TwitterUser}.
 * 
 * <p>
 * It was decided to use a dedicated TwitterFollower table instead of List of
 * Long, to make it easy to SQL join. <!-- end-model-doc -->
 * 
 */
@IdClass(TwitterFollowerKey.class)
@Entity()
@Table(schema = "buzz")
public class TwitterFollower {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id()
	@Basic(optional = false)
	@Column(name = "snapshot_id")
	private long snapshotId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id()
	@Basic(optional = false)
	@Column(name = "pagecursor")
	private long pageCursor = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * This is <b>not</b> guaranteed to exist in {@link TwitterUser}. <!--
	 * end-model-doc -->
	 * 
	 */
	@Id()
	@Column(name = "userid")
	private long userId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, optional = false)
	@JoinColumns({
			@JoinColumn(name = "snapshot_id", referencedColumnName = "snapshot_id", insertable = false, updatable = false),
			@JoinColumn(name = "pagecursor", referencedColumnName = "pagecursor", insertable = false, updatable = false) })
	private TwitterFollowerPage page = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Provided as a convenience, in case {@link TwitterUser} is deleted. This
	 * attribute is not always available. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String screenName = null;

	/**
	 * Returns the value of '<em><b>userId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * This is <b>not</b> guaranteed to exist in {@link TwitterUser}. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>userId</b></em>' feature
	 * @generated
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * Sets the '{@link TwitterFollower#getUserId() <em>userId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * This is <b>not</b> guaranteed to exist in {@link TwitterUser}. <!--
	 * end-model-doc -->
	 * 
	 * @param newUserId
	 *            the new value of the '{@link TwitterFollower#getUserId()
	 *            userId}' feature.
	 * @generated
	 */
	public void setUserId(long newUserId) {
		userId = newUserId;
	}

	/**
	 * Returns the value of '<em><b>screenName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Provided as a convenience, in case {@link TwitterUser} is deleted. This
	 * attribute is not always available. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>screenName</b></em>' feature
	 * @generated
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * Sets the '{@link TwitterFollower#getScreenName() <em>screenName</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Provided as a convenience, in case {@link TwitterUser} is deleted. This
	 * attribute is not always available. <!-- end-model-doc -->
	 * 
	 * @param newScreenName
	 *            the new value of the '{@link TwitterFollower#getScreenName()
	 *            screenName}' feature.
	 * @generated
	 */
	public void setScreenName(String newScreenName) {
		screenName = newScreenName;
	}

	/**
	 * Returns the value of '<em><b>page</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>page</b></em>' feature
	 * @generated
	 */
	public TwitterFollowerPage getPage() {
		return page;
	}

	/**
	 * Sets the '{@link TwitterFollower#getPage() <em>page</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPage
	 *            the new value of the '{@link TwitterFollower#getPage() page}'
	 *            feature.
	 */
	public void setPage(TwitterFollowerPage newPage) {
		page = newPage;
		setSnapshotId(newPage.getSnapshot().getId());
		setPageCursor(newPage.getPageCursor());
	}

	/**
	 * Returns the value of '<em><b>snapshotId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>snapshotId</b></em>' feature
	 * @generated
	 */
	public long getSnapshotId() {
		return snapshotId;
	}

	/**
	 * Sets the '{@link TwitterFollower#getSnapshotId() <em>snapshotId</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSnapshotId
	 *            the new value of the '{@link TwitterFollower#getSnapshotId()
	 *            snapshotId}' feature.
	 * @generated
	 */
	public void setSnapshotId(long newSnapshotId) {
		snapshotId = newSnapshotId;
	}

	/**
	 * Returns the value of '<em><b>pageCursor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>pageCursor</b></em>' feature
	 * @generated
	 */
	public long getPageCursor() {
		return pageCursor;
	}

	/**
	 * Sets the '{@link TwitterFollower#getPageCursor() <em>pageCursor</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPageCursor
	 *            the new value of the '{@link TwitterFollower#getPageCursor()
	 *            pageCursor}' feature.
	 * @generated
	 */
	public void setPageCursor(long newPageCursor) {
		pageCursor = newPageCursor;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterFollower " + " [snapshotId: " + getSnapshotId() + "]"
				+ " [pageCursor: " + getPageCursor() + "]" + " [userId: "
				+ getUserId() + "]" + " [screenName: " + getScreenName() + "]";
	}
}
