package org.soluvas.buzz.core.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.soluvas.buzz.core.TwitterFollowerPageKey;
import org.soluvas.jpa.jpa.Positionable;
import org.soluvas.jpa.jpa.Timestamped;

/**
 * A representation of the model object '<em><b>TwitterFollowerPage</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "buzz")
@IdClass(TwitterFollowerPageKey.class)
public class TwitterFollowerPage implements Timestamped, Positionable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, optional = false)
	@JoinColumns({ @JoinColumn(name = "snapshot_id") })
	private TwitterFollowerSnapshot snapshot = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id()
	@Column(name = "pagecursor")
	private long pageCursor = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Shortcut for query purposes so no lookup to {@link TwitterUser} is
	 * needed. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private String screenName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "page")
	private List<TwitterFollower> followers = new ArrayList<TwitterFollower>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Shortcut for query purposes so no lookup to {@link TwitterUser} is
	 * needed. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private long userId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private Long previousCursor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private Long nextCursor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Usually either 20 or 200 for full fetch, or 5000 (IDs only). <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private long pageSize = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Basic(optional = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime creationTime = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Basic(optional = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime modificationTime = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(nullable = false)
	private int positioner = 0;

	/**
	 * Returns the value of '<em><b>screenName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Shortcut for query purposes so no lookup to {@link TwitterUser} is
	 * needed. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>screenName</b></em>' feature
	 * @generated
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getScreenName() <em>screenName</em>}
	 * ' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Shortcut for query purposes so no lookup to {@link TwitterUser} is
	 * needed. <!-- end-model-doc -->
	 * 
	 * @param newScreenName
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getScreenName() screenName}'
	 *            feature.
	 * @generated
	 */
	public void setScreenName(String newScreenName) {
		screenName = newScreenName;
	}

	/**
	 * Returns the value of '<em><b>followers</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>followers</b></em>' feature
	 * @generated
	 */
	public List<TwitterFollower> getFollowers() {
		return followers;
	}

	/**
	 * Adds to the <em>followers</em> feature.
	 *
	 * @param followersValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToFollowers(TwitterFollower followersValue) {
		if (!followers.contains(followersValue)) {
			boolean result = followers.add(followersValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>followers</em> feature.
	 *
	 * @param followersValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromFollowers(TwitterFollower followersValue) {
		if (followers.contains(followersValue)) {
			boolean result = followers.remove(followersValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>followers</em> feature.
	 * 
	 * @generated
	 */
	public void clearFollowers() {
		while (!followers.isEmpty()) {
			removeFromFollowers(followers.iterator().next());
		}
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getFollowers() <em>followers</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFollowers
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getFollowers() followers}' feature.
	 * @generated
	 */
	public void setFollowers(List<TwitterFollower> newFollowers) {
		followers = newFollowers;
	}

	/**
	 * Returns the value of '<em><b>snapshot</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>snapshot</b></em>' feature
	 * @generated
	 */
	public TwitterFollowerSnapshot getSnapshot() {
		return snapshot;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getSnapshot() <em>snapshot</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSnapshot
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getSnapshot() snapshot}' feature.
	 * @generated
	 */
	public void setSnapshot(TwitterFollowerSnapshot newSnapshot) {
		snapshot = newSnapshot;
	}

	/**
	 * Returns the value of '<em><b>userId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Shortcut for query purposes so no lookup to {@link TwitterUser} is
	 * needed. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>userId</b></em>' feature
	 * @generated
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getUserId() <em>userId</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Shortcut for query purposes so no lookup to {@link TwitterUser} is
	 * needed. <!-- end-model-doc -->
	 * 
	 * @param newUserId
	 *            the new value of the '{@link TwitterFollowerPage#getUserId()
	 *            userId}' feature.
	 * @generated
	 */
	public void setUserId(long newUserId) {
		userId = newUserId;
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
	 * Sets the '{@link TwitterFollowerPage#getPageCursor() <em>pageCursor</em>}
	 * ' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPageCursor
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getPageCursor() pageCursor}'
	 *            feature.
	 * @generated
	 */
	public void setPageCursor(long newPageCursor) {
		pageCursor = newPageCursor;
	}

	/**
	 * Returns the value of '<em><b>previousCursor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>previousCursor</b></em>' feature
	 * @generated
	 */
	public Long getPreviousCursor() {
		return previousCursor;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getPreviousCursor()
	 * <em>previousCursor</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPreviousCursor
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getPreviousCursor() previousCursor}
	 *            ' feature.
	 * @generated
	 */
	public void setPreviousCursor(Long newPreviousCursor) {
		previousCursor = newPreviousCursor;
	}

	/**
	 * Returns the value of '<em><b>nextCursor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>nextCursor</b></em>' feature
	 * @generated
	 */
	public Long getNextCursor() {
		return nextCursor;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getNextCursor() <em>nextCursor</em>}
	 * ' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newNextCursor
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getNextCursor() nextCursor}'
	 *            feature.
	 * @generated
	 */
	public void setNextCursor(Long newNextCursor) {
		nextCursor = newNextCursor;
	}

	/**
	 * Returns the value of '<em><b>pageSize</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Usually either 20 or 200 for full fetch, or 5000 (IDs only). <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>pageSize</b></em>' feature
	 * @generated
	 */
	public long getPageSize() {
		return pageSize;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getPageSize() <em>pageSize</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Usually either 20 or 200 for full fetch, or 5000 (IDs only). <!--
	 * end-model-doc -->
	 * 
	 * @param newPageSize
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getPageSize() pageSize}' feature.
	 * @generated
	 */
	public void setPageSize(long newPageSize) {
		pageSize = newPageSize;
	}

	/**
	 * Returns the value of '<em><b>creationTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>creationTime</b></em>' feature
	 * @generated
	 */
	public DateTime getCreationTime() {
		return creationTime;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getCreationTime()
	 * <em>creationTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreationTime
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getCreationTime() creationTime}'
	 *            feature.
	 * @generated
	 */
	public void setCreationTime(DateTime newCreationTime) {
		creationTime = newCreationTime;
	}

	/**
	 * Returns the value of '<em><b>modificationTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>modificationTime</b></em>' feature
	 * @generated
	 */
	public DateTime getModificationTime() {
		return modificationTime;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getModificationTime()
	 * <em>modificationTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newModificationTime
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getModificationTime()
	 *            modificationTime}' feature.
	 * @generated
	 */
	public void setModificationTime(DateTime newModificationTime) {
		modificationTime = newModificationTime;
	}

	/**
	 * Returns the value of '<em><b>positioner</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>positioner</b></em>' feature
	 * @generated
	 */
	public int getPositioner() {
		return positioner;
	}

	/**
	 * Sets the '{@link TwitterFollowerPage#getPositioner() <em>positioner</em>}
	 * ' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPositioner
	 *            the new value of the '
	 *            {@link TwitterFollowerPage#getPositioner() positioner}'
	 *            feature.
	 * @generated
	 */
	public void setPositioner(int newPositioner) {
		positioner = newPositioner;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterFollowerPage " + " [previousCursor: "
				+ getPreviousCursor() + "]" + " [nextCursor: "
				+ getNextCursor() + "]" + " [pageCursor: " + getPageCursor()
				+ "]" + " [screenName: " + getScreenName() + "]" + " [userId: "
				+ getUserId() + "]" + " [pageSize: " + getPageSize() + "]"
				+ " [creationTime: " + getCreationTime() + "]"
				+ " [modificationTime: " + getModificationTime() + "]"
				+ " [positioner: " + getPositioner() + "]";
	}
}
