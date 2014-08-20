package org.soluvas.buzz.core.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import twitter4j.User;

/**
 * A representation of the model object '<em><b>TwitterUser</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A data
 * interface representing Basic user information element <!-- end-model-doc -->
 * 
 */
@Entity()
@Table(schema = "buzz", indexes = {
		@Index(name = "twitteruser_revid_idx", columnList = "revId"),
		@Index(name = "twitteruser_screenname_idx", columnList = "screenName") })
public class TwitterUser {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the id of the user <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(nullable = false)
	@Id()
	private long id = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(nullable = false)
	private int revId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Basic()
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime fetchTime = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBackgroundImageUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBackgroundImageUrlHttps = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * name of the user <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * screen name of the user <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(nullable = false, unique = true)
	private String screenName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * location of the user <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String location = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * description of the user <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String description = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Tests if the user is enabling contributors <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean contributorsEnabled = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * profile image url of the user <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileImageUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String biggerProfileImageUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String miniProfileImageUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String originalProfileImageUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String originalProfileImageUrlHttps = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBannerUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBannerRetinaUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBannerIpadUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBannerIpadRetinaUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBannerMobileUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBannerMobileRetinaUrl = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean profileBackgroundTiled = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Basic()
	@Type(type = "org.soluvas.jpa.PersistentLocale")
	private Locale lang = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int statusesCount = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean geoEnabled = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean verified = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean translator = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int listedCount = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean followRequestSent = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String url = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean protectedState = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int followersCount = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileBackgroundColor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileTextColor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileLinkColor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileSidebarFillColor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileSidebarBorderColor = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean profileUseBackgroundImage = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean showAllInlineMedia = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int friendsCount = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Basic()
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime createdAt = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int favouritesCount = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private int utcOffset = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Time zone string, Twitter-style, this is not standard. :( <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String timeZone = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Embedded()
	private TwitterStatusEmbed status = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * profile image url of the user, served over SSL <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String profileImageUrlHttps = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String biggerProfileImageUrlHttps = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String miniProfileImageUrlHttps = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "user")
	private List<TwitterFollowerSnapshot> followers = new ArrayList<TwitterFollowerSnapshot>();

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the id of the user <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the '{@link TwitterUser#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the id of the user <!-- end-model-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link TwitterUser#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>revId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>revId</b></em>' feature
	 * @generated
	 */
	public int getRevId() {
		return revId;
	}

	/**
	 * Sets the '{@link TwitterUser#getRevId() <em>revId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRevId
	 *            the new value of the '{@link TwitterUser#getRevId() revId}'
	 *            feature.
	 * @generated
	 */
	public void setRevId(int newRevId) {
		revId = newRevId;
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
	 * Sets the '{@link TwitterUser#getFetchTime() <em>fetchTime</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFetchTime
	 *            the new value of the '{@link TwitterUser#getFetchTime()
	 *            fetchTime}' feature.
	 * @generated
	 */
	public void setFetchTime(DateTime newFetchTime) {
		fetchTime = newFetchTime;
	}

	/**
	 * Returns the value of '<em><b>profileBackgroundImageUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBackgroundImageUrl</b></em>' feature
	 * @generated
	 */
	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBackgroundImageUrl()
	 * <em>profileBackgroundImageUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBackgroundImageUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBackgroundImageUrl()
	 *            profileBackgroundImageUrl}' feature.
	 * @generated
	 */
	public void setProfileBackgroundImageUrl(String newProfileBackgroundImageUrl) {
		profileBackgroundImageUrl = newProfileBackgroundImageUrl;
	}

	/**
	 * Returns the value of '<em><b>profileBackgroundImageUrlHttps</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBackgroundImageUrlHttps</b></em>'
	 *         feature
	 * @generated
	 */
	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBackgroundImageUrlHttps()
	 * <em>profileBackgroundImageUrlHttps</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBackgroundImageUrlHttps
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBackgroundImageUrlHttps()
	 *            profileBackgroundImageUrlHttps}' feature.
	 * @generated
	 */
	public void setProfileBackgroundImageUrlHttps(
			String newProfileBackgroundImageUrlHttps) {
		profileBackgroundImageUrlHttps = newProfileBackgroundImageUrlHttps;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * name of the user <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link TwitterUser#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * name of the user <!-- end-model-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link TwitterUser#getName() name}'
	 *            feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>screenName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * screen name of the user <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>screenName</b></em>' feature
	 * @generated
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * Sets the '{@link TwitterUser#getScreenName() <em>screenName</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * screen name of the user <!-- end-model-doc -->
	 * 
	 * @param newScreenName
	 *            the new value of the '{@link TwitterUser#getScreenName()
	 *            screenName}' feature.
	 * @generated
	 */
	public void setScreenName(String newScreenName) {
		screenName = newScreenName;
	}

	/**
	 * Returns the value of '<em><b>location</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * location of the user <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>location</b></em>' feature
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the '{@link TwitterUser#getLocation() <em>location</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * location of the user <!-- end-model-doc -->
	 * 
	 * @param newLocation
	 *            the new value of the '{@link TwitterUser#getLocation()
	 *            location}' feature.
	 * @generated
	 */
	public void setLocation(String newLocation) {
		location = newLocation;
	}

	/**
	 * Returns the value of '<em><b>description</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * description of the user <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>description</b></em>' feature
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the '{@link TwitterUser#getDescription() <em>description</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * description of the user <!-- end-model-doc -->
	 * 
	 * @param newDescription
	 *            the new value of the '{@link TwitterUser#getDescription()
	 *            description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>contributorsEnabled</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Tests if the user is enabling contributors <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>contributorsEnabled</b></em>' feature
	 * @generated
	 */
	public boolean isContributorsEnabled() {
		return contributorsEnabled;
	}

	/**
	 * Sets the '{@link TwitterUser#isContributorsEnabled()
	 * <em>contributorsEnabled</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Tests if the user is enabling contributors <!-- end-model-doc -->
	 * 
	 * @param newContributorsEnabled
	 *            the new value of the '
	 *            {@link TwitterUser#isContributorsEnabled()
	 *            contributorsEnabled}' feature.
	 * @generated
	 */
	public void setContributorsEnabled(boolean newContributorsEnabled) {
		contributorsEnabled = newContributorsEnabled;
	}

	/**
	 * Returns the value of '<em><b>profileImageUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * profile image url of the user <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>profileImageUrl</b></em>' feature
	 * @generated
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileImageUrl()
	 * <em>profileImageUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * profile image url of the user <!-- end-model-doc -->
	 * 
	 * @param newProfileImageUrl
	 *            the new value of the '{@link TwitterUser#getProfileImageUrl()
	 *            profileImageUrl}' feature.
	 * @generated
	 */
	public void setProfileImageUrl(String newProfileImageUrl) {
		profileImageUrl = newProfileImageUrl;
	}

	/**
	 * Returns the value of '<em><b>biggerProfileImageUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>biggerProfileImageUrl</b></em>' feature
	 * @generated
	 */
	public String getBiggerProfileImageUrl() {
		return biggerProfileImageUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getBiggerProfileImageUrl()
	 * <em>biggerProfileImageUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBiggerProfileImageUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getBiggerProfileImageUrl()
	 *            biggerProfileImageUrl}' feature.
	 * @generated
	 */
	public void setBiggerProfileImageUrl(String newBiggerProfileImageUrl) {
		biggerProfileImageUrl = newBiggerProfileImageUrl;
	}

	/**
	 * Returns the value of '<em><b>miniProfileImageUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>miniProfileImageUrl</b></em>' feature
	 * @generated
	 */
	public String getMiniProfileImageUrl() {
		return miniProfileImageUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getMiniProfileImageUrl()
	 * <em>miniProfileImageUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMiniProfileImageUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getMiniProfileImageUrl()
	 *            miniProfileImageUrl}' feature.
	 * @generated
	 */
	public void setMiniProfileImageUrl(String newMiniProfileImageUrl) {
		miniProfileImageUrl = newMiniProfileImageUrl;
	}

	/**
	 * Returns the value of '<em><b>originalProfileImageUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>originalProfileImageUrl</b></em>' feature
	 * @generated
	 */
	public String getOriginalProfileImageUrl() {
		return originalProfileImageUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getOriginalProfileImageUrl()
	 * <em>originalProfileImageUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOriginalProfileImageUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getOriginalProfileImageUrl()
	 *            originalProfileImageUrl}' feature.
	 * @generated
	 */
	public void setOriginalProfileImageUrl(String newOriginalProfileImageUrl) {
		originalProfileImageUrl = newOriginalProfileImageUrl;
	}

	/**
	 * Returns the value of '<em><b>originalProfileImageUrlHttps</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>originalProfileImageUrlHttps</b></em>'
	 *         feature
	 * @generated
	 */
	public String getOriginalProfileImageUrlHttps() {
		return originalProfileImageUrlHttps;
	}

	/**
	 * Sets the '{@link TwitterUser#getOriginalProfileImageUrlHttps()
	 * <em>originalProfileImageUrlHttps</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOriginalProfileImageUrlHttps
	 *            the new value of the '
	 *            {@link TwitterUser#getOriginalProfileImageUrlHttps()
	 *            originalProfileImageUrlHttps}' feature.
	 * @generated
	 */
	public void setOriginalProfileImageUrlHttps(
			String newOriginalProfileImageUrlHttps) {
		originalProfileImageUrlHttps = newOriginalProfileImageUrlHttps;
	}

	/**
	 * Returns the value of '<em><b>profileBannerUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBannerUrl</b></em>' feature
	 * @generated
	 */
	public String getProfileBannerUrl() {
		return profileBannerUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBannerUrl()
	 * <em>profileBannerUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBannerUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBannerUrl() profileBannerUrl}'
	 *            feature.
	 * @generated
	 */
	public void setProfileBannerUrl(String newProfileBannerUrl) {
		profileBannerUrl = newProfileBannerUrl;
	}

	/**
	 * Returns the value of '<em><b>profileBannerRetinaUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBannerRetinaUrl</b></em>' feature
	 * @generated
	 */
	public String getProfileBannerRetinaUrl() {
		return profileBannerRetinaUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBannerRetinaUrl()
	 * <em>profileBannerRetinaUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBannerRetinaUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBannerRetinaUrl()
	 *            profileBannerRetinaUrl}' feature.
	 * @generated
	 */
	public void setProfileBannerRetinaUrl(String newProfileBannerRetinaUrl) {
		profileBannerRetinaUrl = newProfileBannerRetinaUrl;
	}

	/**
	 * Returns the value of '<em><b>profileBannerIpadUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBannerIpadUrl</b></em>' feature
	 * @generated
	 */
	public String getProfileBannerIpadUrl() {
		return profileBannerIpadUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBannerIpadUrl()
	 * <em>profileBannerIpadUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBannerIpadUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBannerIpadUrl()
	 *            profileBannerIpadUrl}' feature.
	 * @generated
	 */
	public void setProfileBannerIpadUrl(String newProfileBannerIpadUrl) {
		profileBannerIpadUrl = newProfileBannerIpadUrl;
	}

	/**
	 * Returns the value of '<em><b>profileBannerIpadRetinaUrl</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBannerIpadRetinaUrl</b></em>' feature
	 * @generated
	 */
	public String getProfileBannerIpadRetinaUrl() {
		return profileBannerIpadRetinaUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBannerIpadRetinaUrl()
	 * <em>profileBannerIpadRetinaUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBannerIpadRetinaUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBannerIpadRetinaUrl()
	 *            profileBannerIpadRetinaUrl}' feature.
	 * @generated
	 */
	public void setProfileBannerIpadRetinaUrl(
			String newProfileBannerIpadRetinaUrl) {
		profileBannerIpadRetinaUrl = newProfileBannerIpadRetinaUrl;
	}

	/**
	 * Returns the value of '<em><b>profileBannerMobileUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBannerMobileUrl</b></em>' feature
	 * @generated
	 */
	public String getProfileBannerMobileUrl() {
		return profileBannerMobileUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBannerMobileUrl()
	 * <em>profileBannerMobileUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBannerMobileUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBannerMobileUrl()
	 *            profileBannerMobileUrl}' feature.
	 * @generated
	 */
	public void setProfileBannerMobileUrl(String newProfileBannerMobileUrl) {
		profileBannerMobileUrl = newProfileBannerMobileUrl;
	}

	/**
	 * Returns the value of '<em><b>profileBannerMobileRetinaUrl</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBannerMobileRetinaUrl</b></em>'
	 *         feature
	 * @generated
	 */
	public String getProfileBannerMobileRetinaUrl() {
		return profileBannerMobileRetinaUrl;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBannerMobileRetinaUrl()
	 * <em>profileBannerMobileRetinaUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBannerMobileRetinaUrl
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBannerMobileRetinaUrl()
	 *            profileBannerMobileRetinaUrl}' feature.
	 * @generated
	 */
	public void setProfileBannerMobileRetinaUrl(
			String newProfileBannerMobileRetinaUrl) {
		profileBannerMobileRetinaUrl = newProfileBannerMobileRetinaUrl;
	}

	/**
	 * Returns the value of '<em><b>profileBackgroundTiled</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBackgroundTiled</b></em>' feature
	 * @generated
	 */
	public boolean isProfileBackgroundTiled() {
		return profileBackgroundTiled;
	}

	/**
	 * Sets the '{@link TwitterUser#isProfileBackgroundTiled()
	 * <em>profileBackgroundTiled</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBackgroundTiled
	 *            the new value of the '
	 *            {@link TwitterUser#isProfileBackgroundTiled()
	 *            profileBackgroundTiled}' feature.
	 * @generated
	 */
	public void setProfileBackgroundTiled(boolean newProfileBackgroundTiled) {
		profileBackgroundTiled = newProfileBackgroundTiled;
	}

	/**
	 * Returns the value of '<em><b>lang</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lang</b></em>' feature
	 * @generated
	 */
	public Locale getLang() {
		return lang;
	}

	/**
	 * Sets the '{@link TwitterUser#getLang() <em>lang</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLang
	 *            the new value of the '{@link TwitterUser#getLang() lang}'
	 *            feature.
	 * @generated
	 */
	public void setLang(Locale newLang) {
		lang = newLang;
	}

	/**
	 * Returns the value of '<em><b>statusesCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>statusesCount</b></em>' feature
	 * @generated
	 */
	public int getStatusesCount() {
		return statusesCount;
	}

	/**
	 * Sets the '{@link TwitterUser#getStatusesCount() <em>statusesCount</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStatusesCount
	 *            the new value of the '{@link TwitterUser#getStatusesCount()
	 *            statusesCount}' feature.
	 * @generated
	 */
	public void setStatusesCount(int newStatusesCount) {
		statusesCount = newStatusesCount;
	}

	/**
	 * Returns the value of '<em><b>geoEnabled</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>geoEnabled</b></em>' feature
	 * @generated
	 */
	public boolean isGeoEnabled() {
		return geoEnabled;
	}

	/**
	 * Sets the '{@link TwitterUser#isGeoEnabled() <em>geoEnabled</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newGeoEnabled
	 *            the new value of the '{@link TwitterUser#isGeoEnabled()
	 *            geoEnabled}' feature.
	 * @generated
	 */
	public void setGeoEnabled(boolean newGeoEnabled) {
		geoEnabled = newGeoEnabled;
	}

	/**
	 * Returns the value of '<em><b>verified</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>verified</b></em>' feature
	 * @generated
	 */
	public boolean isVerified() {
		return verified;
	}

	/**
	 * Sets the '{@link TwitterUser#isVerified() <em>verified</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newVerified
	 *            the new value of the '{@link TwitterUser#isVerified()
	 *            verified}' feature.
	 * @generated
	 */
	public void setVerified(boolean newVerified) {
		verified = newVerified;
	}

	/**
	 * Returns the value of '<em><b>translator</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>translator</b></em>' feature
	 * @generated
	 */
	public boolean isTranslator() {
		return translator;
	}

	/**
	 * Sets the '{@link TwitterUser#isTranslator() <em>translator</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTranslator
	 *            the new value of the '{@link TwitterUser#isTranslator()
	 *            translator}' feature.
	 * @generated
	 */
	public void setTranslator(boolean newTranslator) {
		translator = newTranslator;
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
	 * Sets the '{@link TwitterUser#getListedCount() <em>listedCount</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newListedCount
	 *            the new value of the '{@link TwitterUser#getListedCount()
	 *            listedCount}' feature.
	 * @generated
	 */
	public void setListedCount(int newListedCount) {
		listedCount = newListedCount;
	}

	/**
	 * Returns the value of '<em><b>followRequestSent</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>followRequestSent</b></em>' feature
	 * @generated
	 */
	public boolean isFollowRequestSent() {
		return followRequestSent;
	}

	/**
	 * Sets the '{@link TwitterUser#isFollowRequestSent()
	 * <em>followRequestSent</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFollowRequestSent
	 *            the new value of the '
	 *            {@link TwitterUser#isFollowRequestSent() followRequestSent}'
	 *            feature.
	 * @generated
	 */
	public void setFollowRequestSent(boolean newFollowRequestSent) {
		followRequestSent = newFollowRequestSent;
	}

	/**
	 * Returns the value of '<em><b>url</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>url</b></em>' feature
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the '{@link TwitterUser#getUrl() <em>url</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUrl
	 *            the new value of the '{@link TwitterUser#getUrl() url}'
	 *            feature.
	 * @generated
	 */
	public void setUrl(String newUrl) {
		url = newUrl;
	}

	/**
	 * Returns the value of '<em><b>protectedState</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>protectedState</b></em>' feature
	 * @generated
	 */
	public boolean isProtectedState() {
		return protectedState;
	}

	/**
	 * Sets the '{@link TwitterUser#isProtectedState() <em>protectedState</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProtectedState
	 *            the new value of the '{@link TwitterUser#isProtectedState()
	 *            protectedState}' feature.
	 * @generated
	 */
	public void setProtectedState(boolean newProtectedState) {
		protectedState = newProtectedState;
	}

	/**
	 * Returns the value of '<em><b>followersCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>followersCount</b></em>' feature
	 * @generated
	 */
	public int getFollowersCount() {
		return followersCount;
	}

	/**
	 * Sets the '{@link TwitterUser#getFollowersCount() <em>followersCount</em>}
	 * ' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFollowersCount
	 *            the new value of the '{@link TwitterUser#getFollowersCount()
	 *            followersCount}' feature.
	 * @generated
	 */
	public void setFollowersCount(int newFollowersCount) {
		followersCount = newFollowersCount;
	}

	/**
	 * Returns the value of '<em><b>profileBackgroundColor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileBackgroundColor</b></em>' feature
	 * @generated
	 */
	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileBackgroundColor()
	 * <em>profileBackgroundColor</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileBackgroundColor
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileBackgroundColor()
	 *            profileBackgroundColor}' feature.
	 * @generated
	 */
	public void setProfileBackgroundColor(String newProfileBackgroundColor) {
		profileBackgroundColor = newProfileBackgroundColor;
	}

	/**
	 * Returns the value of '<em><b>profileTextColor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileTextColor</b></em>' feature
	 * @generated
	 */
	public String getProfileTextColor() {
		return profileTextColor;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileTextColor()
	 * <em>profileTextColor</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileTextColor
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileTextColor() profileTextColor}'
	 *            feature.
	 * @generated
	 */
	public void setProfileTextColor(String newProfileTextColor) {
		profileTextColor = newProfileTextColor;
	}

	/**
	 * Returns the value of '<em><b>profileLinkColor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileLinkColor</b></em>' feature
	 * @generated
	 */
	public String getProfileLinkColor() {
		return profileLinkColor;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileLinkColor()
	 * <em>profileLinkColor</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileLinkColor
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileLinkColor() profileLinkColor}'
	 *            feature.
	 * @generated
	 */
	public void setProfileLinkColor(String newProfileLinkColor) {
		profileLinkColor = newProfileLinkColor;
	}

	/**
	 * Returns the value of '<em><b>profileSidebarFillColor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileSidebarFillColor</b></em>' feature
	 * @generated
	 */
	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileSidebarFillColor()
	 * <em>profileSidebarFillColor</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileSidebarFillColor
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileSidebarFillColor()
	 *            profileSidebarFillColor}' feature.
	 * @generated
	 */
	public void setProfileSidebarFillColor(String newProfileSidebarFillColor) {
		profileSidebarFillColor = newProfileSidebarFillColor;
	}

	/**
	 * Returns the value of '<em><b>profileSidebarBorderColor</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileSidebarBorderColor</b></em>' feature
	 * @generated
	 */
	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileSidebarBorderColor()
	 * <em>profileSidebarBorderColor</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileSidebarBorderColor
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileSidebarBorderColor()
	 *            profileSidebarBorderColor}' feature.
	 * @generated
	 */
	public void setProfileSidebarBorderColor(String newProfileSidebarBorderColor) {
		profileSidebarBorderColor = newProfileSidebarBorderColor;
	}

	/**
	 * Returns the value of '<em><b>profileUseBackgroundImage</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>profileUseBackgroundImage</b></em>' feature
	 * @generated
	 */
	public boolean isProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}

	/**
	 * Sets the '{@link TwitterUser#isProfileUseBackgroundImage()
	 * <em>profileUseBackgroundImage</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProfileUseBackgroundImage
	 *            the new value of the '
	 *            {@link TwitterUser#isProfileUseBackgroundImage()
	 *            profileUseBackgroundImage}' feature.
	 * @generated
	 */
	public void setProfileUseBackgroundImage(
			boolean newProfileUseBackgroundImage) {
		profileUseBackgroundImage = newProfileUseBackgroundImage;
	}

	/**
	 * Returns the value of '<em><b>showAllInlineMedia</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>showAllInlineMedia</b></em>' feature
	 * @generated
	 */
	public boolean isShowAllInlineMedia() {
		return showAllInlineMedia;
	}

	/**
	 * Sets the '{@link TwitterUser#isShowAllInlineMedia()
	 * <em>showAllInlineMedia</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newShowAllInlineMedia
	 *            the new value of the '
	 *            {@link TwitterUser#isShowAllInlineMedia() showAllInlineMedia}'
	 *            feature.
	 * @generated
	 */
	public void setShowAllInlineMedia(boolean newShowAllInlineMedia) {
		showAllInlineMedia = newShowAllInlineMedia;
	}

	/**
	 * Returns the value of '<em><b>friendsCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>friendsCount</b></em>' feature
	 * @generated
	 */
	public int getFriendsCount() {
		return friendsCount;
	}

	/**
	 * Sets the '{@link TwitterUser#getFriendsCount() <em>friendsCount</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFriendsCount
	 *            the new value of the '{@link TwitterUser#getFriendsCount()
	 *            friendsCount}' feature.
	 * @generated
	 */
	public void setFriendsCount(int newFriendsCount) {
		friendsCount = newFriendsCount;
	}

	/**
	 * Returns the value of '<em><b>createdAt</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>createdAt</b></em>' feature
	 * @generated
	 */
	public DateTime getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets the '{@link TwitterUser#getCreatedAt() <em>createdAt</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreatedAt
	 *            the new value of the '{@link TwitterUser#getCreatedAt()
	 *            createdAt}' feature.
	 * @generated
	 */
	public void setCreatedAt(DateTime newCreatedAt) {
		createdAt = newCreatedAt;
	}

	/**
	 * Returns the value of '<em><b>favouritesCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>favouritesCount</b></em>' feature
	 * @generated
	 */
	public int getFavouritesCount() {
		return favouritesCount;
	}

	/**
	 * Sets the '{@link TwitterUser#getFavouritesCount()
	 * <em>favouritesCount</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFavouritesCount
	 *            the new value of the '{@link TwitterUser#getFavouritesCount()
	 *            favouritesCount}' feature.
	 * @generated
	 */
	public void setFavouritesCount(int newFavouritesCount) {
		favouritesCount = newFavouritesCount;
	}

	/**
	 * Returns the value of '<em><b>utcOffset</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>utcOffset</b></em>' feature
	 * @generated
	 */
	public int getUtcOffset() {
		return utcOffset;
	}

	/**
	 * Sets the '{@link TwitterUser#getUtcOffset() <em>utcOffset</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUtcOffset
	 *            the new value of the '{@link TwitterUser#getUtcOffset()
	 *            utcOffset}' feature.
	 * @generated
	 */
	public void setUtcOffset(int newUtcOffset) {
		utcOffset = newUtcOffset;
	}

	/**
	 * Returns the value of '<em><b>timeZone</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Time zone string, Twitter-style, this is not standard. :( <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>timeZone</b></em>' feature
	 * @generated
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * Sets the '{@link TwitterUser#getTimeZone() <em>timeZone</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Time zone string, Twitter-style, this is not standard. :( <!--
	 * end-model-doc -->
	 * 
	 * @param newTimeZone
	 *            the new value of the '{@link TwitterUser#getTimeZone()
	 *            timeZone}' feature.
	 * @generated
	 */
	public void setTimeZone(String newTimeZone) {
		timeZone = newTimeZone;
	}

	/**
	 * Returns the value of '<em><b>status</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>status</b></em>' feature
	 * @generated
	 */
	public TwitterStatusEmbed getStatus() {
		return status;
	}

	/**
	 * Sets the '{@link TwitterUser#getStatus() <em>status</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStatus
	 *            the new value of the '{@link TwitterUser#getStatus() status}'
	 *            feature.
	 * @generated
	 */
	public void setStatus(TwitterStatusEmbed newStatus) {
		status = newStatus;
	}

	/**
	 * Returns the value of '<em><b>profileImageUrlHttps</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * profile image url of the user, served over SSL <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>profileImageUrlHttps</b></em>' feature
	 * @generated
	 */
	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}

	/**
	 * Sets the '{@link TwitterUser#getProfileImageUrlHttps()
	 * <em>profileImageUrlHttps</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * profile image url of the user, served over SSL <!-- end-model-doc -->
	 * 
	 * @param newProfileImageUrlHttps
	 *            the new value of the '
	 *            {@link TwitterUser#getProfileImageUrlHttps()
	 *            profileImageUrlHttps}' feature.
	 * @generated
	 */
	public void setProfileImageUrlHttps(String newProfileImageUrlHttps) {
		profileImageUrlHttps = newProfileImageUrlHttps;
	}

	/**
	 * Returns the value of '<em><b>biggerProfileImageUrlHttps</b></em>'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>biggerProfileImageUrlHttps</b></em>' feature
	 * @generated
	 */
	public String getBiggerProfileImageUrlHttps() {
		return biggerProfileImageUrlHttps;
	}

	/**
	 * Sets the '{@link TwitterUser#getBiggerProfileImageUrlHttps()
	 * <em>biggerProfileImageUrlHttps</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBiggerProfileImageUrlHttps
	 *            the new value of the '
	 *            {@link TwitterUser#getBiggerProfileImageUrlHttps()
	 *            biggerProfileImageUrlHttps}' feature.
	 * @generated
	 */
	public void setBiggerProfileImageUrlHttps(
			String newBiggerProfileImageUrlHttps) {
		biggerProfileImageUrlHttps = newBiggerProfileImageUrlHttps;
	}

	/**
	 * Returns the value of '<em><b>miniProfileImageUrlHttps</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>miniProfileImageUrlHttps</b></em>' feature
	 * @generated
	 */
	public String getMiniProfileImageUrlHttps() {
		return miniProfileImageUrlHttps;
	}

	/**
	 * Sets the '{@link TwitterUser#getMiniProfileImageUrlHttps()
	 * <em>miniProfileImageUrlHttps</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMiniProfileImageUrlHttps
	 *            the new value of the '
	 *            {@link TwitterUser#getMiniProfileImageUrlHttps()
	 *            miniProfileImageUrlHttps}' feature.
	 * @generated
	 */
	public void setMiniProfileImageUrlHttps(String newMiniProfileImageUrlHttps) {
		miniProfileImageUrlHttps = newMiniProfileImageUrlHttps;
	}

	/**
	 * Returns the value of '<em><b>followers</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>followers</b></em>' feature
	 * @generated
	 */
	public List<TwitterFollowerSnapshot> getFollowers() {
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
	public boolean addToFollowers(TwitterFollowerSnapshot followersValue) {
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
	public boolean removeFromFollowers(TwitterFollowerSnapshot followersValue) {
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
	 * Sets the '{@link TwitterUser#getFollowers() <em>followers</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFollowers
	 *            the new value of the '{@link TwitterUser#getFollowers()
	 *            followers}' feature.
	 * @generated
	 */
	public void setFollowers(List<TwitterFollowerSnapshot> newFollowers) {
		followers = newFollowers;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterUser " + " [id: " + getId() + "]" + " [revId: "
				+ getRevId() + "]" + " [fetchTime: " + getFetchTime() + "]"
				+ " [profileBackgroundImageUrl: "
				+ getProfileBackgroundImageUrl() + "]"
				+ " [profileBackgroundImageUrlHttps: "
				+ getProfileBackgroundImageUrlHttps() + "]" + " [name: "
				+ getName() + "]" + " [screenName: " + getScreenName() + "]"
				+ " [location: " + getLocation() + "]" + " [description: "
				+ getDescription() + "]" + " [contributorsEnabled: "
				+ isContributorsEnabled() + "]" + " [profileImageUrl: "
				+ getProfileImageUrl() + "]" + " [biggerProfileImageUrl: "
				+ getBiggerProfileImageUrl() + "]" + " [miniProfileImageUrl: "
				+ getMiniProfileImageUrl() + "]"
				+ " [originalProfileImageUrl: " + getOriginalProfileImageUrl()
				+ "]" + " [originalProfileImageUrlHttps: "
				+ getOriginalProfileImageUrlHttps() + "]"
				+ " [profileBannerUrl: " + getProfileBannerUrl() + "]"
				+ " [profileBannerRetinaUrl: " + getProfileBannerRetinaUrl()
				+ "]" + " [profileBannerIpadUrl: " + getProfileBannerIpadUrl()
				+ "]" + " [profileBannerIpadRetinaUrl: "
				+ getProfileBannerIpadRetinaUrl() + "]"
				+ " [profileBannerMobileUrl: " + getProfileBannerMobileUrl()
				+ "]" + " [profileBannerMobileRetinaUrl: "
				+ getProfileBannerMobileRetinaUrl() + "]"
				+ " [profileBackgroundTiled: " + isProfileBackgroundTiled()
				+ "]" + " [lang: " + getLang() + "]" + " [statusesCount: "
				+ getStatusesCount() + "]" + " [geoEnabled: " + isGeoEnabled()
				+ "]" + " [verified: " + isVerified() + "]" + " [translator: "
				+ isTranslator() + "]" + " [listedCount: " + getListedCount()
				+ "]" + " [followRequestSent: " + isFollowRequestSent() + "]"
				+ " [url: " + getUrl() + "]" + " [protectedState: "
				+ isProtectedState() + "]" + " [followersCount: "
				+ getFollowersCount() + "]" + " [profileBackgroundColor: "
				+ getProfileBackgroundColor() + "]" + " [profileTextColor: "
				+ getProfileTextColor() + "]" + " [profileLinkColor: "
				+ getProfileLinkColor() + "]" + " [profileSidebarFillColor: "
				+ getProfileSidebarFillColor() + "]"
				+ " [profileSidebarBorderColor: "
				+ getProfileSidebarBorderColor() + "]"
				+ " [profileUseBackgroundImage: "
				+ isProfileUseBackgroundImage() + "]"
				+ " [showAllInlineMedia: " + isShowAllInlineMedia() + "]"
				+ " [friendsCount: " + getFriendsCount() + "]"
				+ " [createdAt: " + getCreatedAt() + "]"
				+ " [favouritesCount: " + getFavouritesCount() + "]"
				+ " [utcOffset: " + getUtcOffset() + "]" + " [timeZone: "
				+ getTimeZone() + "]" + " [profileImageUrlHttps: "
				+ getProfileImageUrlHttps() + "]"
				+ " [biggerProfileImageUrlHttps: "
				+ getBiggerProfileImageUrlHttps() + "]"
				+ " [miniProfileImageUrlHttps: "
				+ getMiniProfileImageUrlHttps() + "]";
	}

	public void copyFrom(User src) {
		setId(src.getId());
		setName(src.getName());
		setScreenName(src.getScreenName());
		setLocation(src.getLocation());
		setDescription(src.getDescription());
		setContributorsEnabled(src.isContributorsEnabled());
		setProfileImageUrl(src.getProfileImageURL());
		setBiggerProfileImageUrl(src.getBiggerProfileImageURL());
		setMiniProfileImageUrl(src.getMiniProfileImageURL());
		setOriginalProfileImageUrl(src.getOriginalProfileImageURL());
		setProfileImageUrlHttps(src.getProfileImageURLHttps());
		setBiggerProfileImageUrlHttps(src.getBiggerProfileImageURLHttps());
		setMiniProfileImageUrlHttps(src.getMiniProfileImageURLHttps());
		setOriginalProfileImageUrlHttps(src.getOriginalProfileImageURLHttps());
		setUrl(src.getURL());
		setProtectedState(src.isProtected());
		setFollowersCount(src.getFollowersCount());
		setStatus(new TwitterStatusEmbed());
		getStatus().copyFrom(src.getStatus());
		setProfileBackgroundColor(src.getProfileBackgroundColor());
		setProfileTextColor(src.getProfileTextColor());
		setProfileLinkColor(src.getProfileLinkColor());
		setProfileSidebarFillColor(src.getProfileSidebarFillColor());
		setProfileSidebarBorderColor(src.getProfileSidebarBorderColor());
		setProfileUseBackgroundImage(src.isProfileUseBackgroundImage());
		setShowAllInlineMedia(src.isShowAllInlineMedia());
		setFriendsCount(src.getFriendsCount());
		setCreatedAt(new DateTime(src.getCreatedAt()));
		setFavouritesCount(src.getFavouritesCount());
		setUtcOffset(src.getUtcOffset());
		setTimeZone(src.getTimeZone());
		setProfileBackgroundImageUrl(src.getProfileBackgroundImageURL());
		setProfileBackgroundImageUrlHttps(src
				.getProfileBackgroundImageUrlHttps());
		setProfileBannerUrl(src.getProfileBannerURL());
		setProfileBannerRetinaUrl(src.getProfileBannerRetinaURL());
		setProfileBannerIpadUrl(src.getProfileBannerIPadURL());
		setProfileBannerIpadRetinaUrl(src.getProfileBannerIPadRetinaURL());
		setProfileBannerMobileUrl(src.getProfileBannerMobileURL());
		setProfileBannerMobileRetinaUrl(src.getProfileBannerMobileRetinaURL());
		setProfileBackgroundTiled(src.isProfileBackgroundTiled());
		setLang(Locale.forLanguageTag(src.getLang()));
		setStatusesCount(src.getStatusesCount());
		setGeoEnabled(src.isGeoEnabled());
		setVerified(src.isVerified());
		setTranslator(src.isTranslator());
		setListedCount(src.getListedCount());
		setFollowRequestSent(src.isFollowRequestSent());
	}

}
