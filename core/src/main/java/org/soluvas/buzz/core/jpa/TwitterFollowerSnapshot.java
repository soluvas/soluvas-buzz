package org.soluvas.buzz.core.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.soluvas.jpa.jpa.Timestamped;

/**
 * A representation of the model object '<em><b>TwitterFollowerSnapshot</b></em>
 * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
 * snapshot groups a set of follower pages that are "somewhat consistent". i.e.
 * To retrieve 200,000 followers (typical selebtwit followers), you need 1,000
 * pages of 200 followers each, which is one snapshot. To detect unfollowers,
 * first you need to fetch all followers into a snapshot, then you need to fetch
 * again all followers into the second snapshot, and compare two snapshots.
 * 
 * <p>
 * A parent {@link TwitterUser} is required. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "buzz")
public class TwitterFollowerSnapshot implements Timestamped {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "snapshot")
	@OrderColumn(name = "positioner")
	private List<TwitterFollowerPage> pages = new ArrayList<TwitterFollowerPage>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, optional = false)
	@JoinColumns({ @JoinColumn() })
	private TwitterUser user = null;

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
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the '{@link TwitterFollowerSnapshot#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link TwitterFollowerSnapshot#getId()
	 *            id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>pages</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>pages</b></em>' feature
	 * @generated
	 */
	public List<TwitterFollowerPage> getPages() {
		return pages;
	}

	/**
	 * Adds to the <em>pages</em> feature.
	 *
	 * @param pagesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToPages(TwitterFollowerPage pagesValue) {
		if (!pages.contains(pagesValue)) {
			boolean result = pages.add(pagesValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>pages</em> feature.
	 *
	 * @param pagesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromPages(TwitterFollowerPage pagesValue) {
		if (pages.contains(pagesValue)) {
			boolean result = pages.remove(pagesValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>pages</em> feature.
	 * 
	 * @generated
	 */
	public void clearPages() {
		while (!pages.isEmpty()) {
			removeFromPages(pages.iterator().next());
		}
	}

	/**
	 * Sets the '{@link TwitterFollowerSnapshot#getPages() <em>pages</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPages
	 *            the new value of the '
	 *            {@link TwitterFollowerSnapshot#getPages() pages}' feature.
	 * @generated
	 */
	public void setPages(List<TwitterFollowerPage> newPages) {
		pages = newPages;
	}

	/**
	 * Returns the value of '<em><b>user</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>user</b></em>' feature
	 * @generated
	 */
	public TwitterUser getUser() {
		return user;
	}

	/**
	 * Sets the '{@link TwitterFollowerSnapshot#getUser() <em>user</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUser
	 *            the new value of the '
	 *            {@link TwitterFollowerSnapshot#getUser() user}' feature.
	 * @generated
	 */
	public void setUser(TwitterUser newUser) {
		user = newUser;
	}

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
	 * Sets the '{@link TwitterFollowerSnapshot#getScreenName()
	 * <em>screenName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Shortcut for query purposes so no lookup to {@link TwitterUser} is
	 * needed. <!-- end-model-doc -->
	 * 
	 * @param newScreenName
	 *            the new value of the '
	 *            {@link TwitterFollowerSnapshot#getScreenName() screenName}'
	 *            feature.
	 * @generated
	 */
	public void setScreenName(String newScreenName) {
		screenName = newScreenName;
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
	 * Sets the '{@link TwitterFollowerSnapshot#getCreationTime()
	 * <em>creationTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreationTime
	 *            the new value of the '
	 *            {@link TwitterFollowerSnapshot#getCreationTime() creationTime}
	 *            ' feature.
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
	 * Sets the '{@link TwitterFollowerSnapshot#getModificationTime()
	 * <em>modificationTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newModificationTime
	 *            the new value of the '
	 *            {@link TwitterFollowerSnapshot#getModificationTime()
	 *            modificationTime}' feature.
	 * @generated
	 */
	public void setModificationTime(DateTime newModificationTime) {
		modificationTime = newModificationTime;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterFollowerSnapshot " + " [id: " + getId() + "]"
				+ " [screenName: " + getScreenName() + "]" + " [creationTime: "
				+ getCreationTime() + "]" + " [modificationTime: "
				+ getModificationTime() + "]";
	}
}
