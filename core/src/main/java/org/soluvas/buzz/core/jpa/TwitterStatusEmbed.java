package org.soluvas.buzz.core.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.soluvas.commons.SlugUtils;
import org.soluvas.jpa.jpa.Geolocation;

import twitter4j.GeoLocation;
import twitter4j.Place;
import twitter4j.Status;

import com.google.common.primitives.Longs;

/**
 * A representation of the model object '<em><b>TwitterStatusEmbed</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Embeddable()
public class TwitterStatusEmbed {

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
	private long id = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(columnDefinition = "text")
	private String text = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(length = 4096)
	private String source = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean truncated = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long inReplyToStatusId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long inReplyToUserId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String inReplyToScreenName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Embedded()
	private Geolocation geoLocation = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Embedded()
	private TwitterPlace place = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean favorited = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean retweet = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Column(columnDefinition = "bigint[]")
	// TODO: workaround for
	// https://github.com/JadiraOrg/jadira/issues/21#issuecomment-52621705
	@Type(type = "org.soluvas.jpa.PersistentLongList")
	private List<Long> contributors = new ArrayList<Long>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long retweetCount = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean retweetedByMe = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private long currentUserRetweetId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private boolean possiblySensitive = false;

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
	 * Sets the '{@link TwitterStatusEmbed#getCreatedAt() <em>createdAt</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreatedAt
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getCreatedAt() createdAt}' feature.
	 * @generated
	 */
	public void setCreatedAt(DateTime newCreatedAt) {
		createdAt = newCreatedAt;
	}

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
	 * Sets the '{@link TwitterStatusEmbed#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link TwitterStatusEmbed#getId() id}'
	 *            feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>text</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>text</b></em>' feature
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getText() <em>text</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newText
	 *            the new value of the '{@link TwitterStatusEmbed#getText()
	 *            text}' feature.
	 * @generated
	 */
	public void setText(String newText) {
		text = newText;
	}

	/**
	 * Returns the value of '<em><b>source</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>source</b></em>' feature
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getSource() <em>source</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSource
	 *            the new value of the '{@link TwitterStatusEmbed#getSource()
	 *            source}' feature.
	 * @generated
	 */
	public void setSource(String newSource) {
		source = newSource;
	}

	/**
	 * Returns the value of '<em><b>truncated</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>truncated</b></em>' feature
	 * @generated
	 */
	public boolean isTruncated() {
		return truncated;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#isTruncated() <em>truncated</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTruncated
	 *            the new value of the '{@link TwitterStatusEmbed#isTruncated()
	 *            truncated}' feature.
	 * @generated
	 */
	public void setTruncated(boolean newTruncated) {
		truncated = newTruncated;
	}

	/**
	 * Returns the value of '<em><b>inReplyToStatusId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>inReplyToStatusId</b></em>' feature
	 * @generated
	 */
	public long getInReplyToStatusId() {
		return inReplyToStatusId;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getInReplyToStatusId()
	 * <em>inReplyToStatusId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInReplyToStatusId
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getInReplyToStatusId()
	 *            inReplyToStatusId}' feature.
	 * @generated
	 */
	public void setInReplyToStatusId(long newInReplyToStatusId) {
		inReplyToStatusId = newInReplyToStatusId;
	}

	/**
	 * Returns the value of '<em><b>inReplyToUserId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>inReplyToUserId</b></em>' feature
	 * @generated
	 */
	public long getInReplyToUserId() {
		return inReplyToUserId;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getInReplyToUserId()
	 * <em>inReplyToUserId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInReplyToUserId
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getInReplyToUserId()
	 *            inReplyToUserId}' feature.
	 * @generated
	 */
	public void setInReplyToUserId(long newInReplyToUserId) {
		inReplyToUserId = newInReplyToUserId;
	}

	/**
	 * Returns the value of '<em><b>inReplyToScreenName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>inReplyToScreenName</b></em>' feature
	 * @generated
	 */
	public String getInReplyToScreenName() {
		return inReplyToScreenName;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getInReplyToScreenName()
	 * <em>inReplyToScreenName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInReplyToScreenName
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getInReplyToScreenName()
	 *            inReplyToScreenName}' feature.
	 * @generated
	 */
	public void setInReplyToScreenName(String newInReplyToScreenName) {
		inReplyToScreenName = newInReplyToScreenName;
	}

	/**
	 * Returns the value of '<em><b>geoLocation</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>geoLocation</b></em>' feature
	 * @generated
	 */
	public Geolocation getGeoLocation() {
		return geoLocation;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getGeoLocation()
	 * <em>geoLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newGeoLocation
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getGeoLocation() geoLocation}'
	 *            feature.
	 * @generated
	 */
	public void setGeoLocation(Geolocation newGeoLocation) {
		geoLocation = newGeoLocation;
	}

	/**
	 * Returns the value of '<em><b>place</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>place</b></em>' feature
	 * @generated
	 */
	public TwitterPlace getPlace() {
		return place;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getPlace() <em>place</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPlace
	 *            the new value of the '{@link TwitterStatusEmbed#getPlace()
	 *            place}' feature.
	 * @generated
	 */
	public void setPlace(TwitterPlace newPlace) {
		place = newPlace;
	}

	/**
	 * Returns the value of '<em><b>favorited</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>favorited</b></em>' feature
	 * @generated
	 */
	public boolean isFavorited() {
		return favorited;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#isFavorited() <em>favorited</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFavorited
	 *            the new value of the '{@link TwitterStatusEmbed#isFavorited()
	 *            favorited}' feature.
	 * @generated
	 */
	public void setFavorited(boolean newFavorited) {
		favorited = newFavorited;
	}

	/**
	 * Returns the value of '<em><b>retweet</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>retweet</b></em>' feature
	 * @generated
	 */
	public boolean isRetweet() {
		return retweet;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#isRetweet() <em>retweet</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRetweet
	 *            the new value of the '{@link TwitterStatusEmbed#isRetweet()
	 *            retweet}' feature.
	 * @generated
	 */
	public void setRetweet(boolean newRetweet) {
		retweet = newRetweet;
	}

	/**
	 * Returns the value of '<em><b>contributors</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>contributors</b></em>' feature
	 * @generated
	 */
	public List<Long> getContributors() {
		return contributors;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getContributors()
	 * <em>contributors</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newContributors
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getContributors() contributors}'
	 *            feature.
	 * @generated
	 */
	public void setContributors(List<Long> newContributors) {
		contributors = newContributors;
	}

	/**
	 * Returns the value of '<em><b>retweetCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>retweetCount</b></em>' feature
	 * @generated
	 */
	public long getRetweetCount() {
		return retweetCount;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getRetweetCount()
	 * <em>retweetCount</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRetweetCount
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getRetweetCount() retweetCount}'
	 *            feature.
	 * @generated
	 */
	public void setRetweetCount(long newRetweetCount) {
		retweetCount = newRetweetCount;
	}

	/**
	 * Returns the value of '<em><b>retweetedByMe</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>retweetedByMe</b></em>' feature
	 * @generated
	 */
	public boolean isRetweetedByMe() {
		return retweetedByMe;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#isRetweetedByMe()
	 * <em>retweetedByMe</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRetweetedByMe
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#isRetweetedByMe() retweetedByMe}'
	 *            feature.
	 * @generated
	 */
	public void setRetweetedByMe(boolean newRetweetedByMe) {
		retweetedByMe = newRetweetedByMe;
	}

	/**
	 * Returns the value of '<em><b>currentUserRetweetId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>currentUserRetweetId</b></em>' feature
	 * @generated
	 */
	public long getCurrentUserRetweetId() {
		return currentUserRetweetId;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#getCurrentUserRetweetId()
	 * <em>currentUserRetweetId</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCurrentUserRetweetId
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#getCurrentUserRetweetId()
	 *            currentUserRetweetId}' feature.
	 * @generated
	 */
	public void setCurrentUserRetweetId(long newCurrentUserRetweetId) {
		currentUserRetweetId = newCurrentUserRetweetId;
	}

	/**
	 * Returns the value of '<em><b>possiblySensitive</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>possiblySensitive</b></em>' feature
	 * @generated
	 */
	public boolean isPossiblySensitive() {
		return possiblySensitive;
	}

	/**
	 * Sets the '{@link TwitterStatusEmbed#isPossiblySensitive()
	 * <em>possiblySensitive</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPossiblySensitive
	 *            the new value of the '
	 *            {@link TwitterStatusEmbed#isPossiblySensitive()
	 *            possiblySensitive}' feature.
	 * @generated
	 */
	public void setPossiblySensitive(boolean newPossiblySensitive) {
		possiblySensitive = newPossiblySensitive;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterStatusEmbed " + " [createdAt: " + getCreatedAt() + "]"
				+ " [id: " + getId() + "]" + " [text: " + getText() + "]"
				+ " [source: " + getSource() + "]" + " [truncated: "
				+ isTruncated() + "]" + " [inReplyToStatusId: "
				+ getInReplyToStatusId() + "]" + " [inReplyToUserId: "
				+ getInReplyToUserId() + "]" + " [inReplyToScreenName: "
				+ getInReplyToScreenName() + "]" + " [favorited: "
				+ isFavorited() + "]" + " [retweet: " + isRetweet() + "]"
				+ " [retweetCount: " + getRetweetCount() + "]"
				+ " [retweetedByMe: " + isRetweetedByMe() + "]"
				+ " [currentUserRetweetId: " + getCurrentUserRetweetId() + "]"
				+ " [possiblySensitive: " + isPossiblySensitive() + "]";
	}

	public void copyFrom(@Nullable Status src) {
		if (src == null) {
			return;
		}
		SlugUtils.checkUtf8(src.getText(), Status.class, src);
		setId(src.getId());
		setCreatedAt(new DateTime(src.getCreatedAt()));
		setText(src.getText());
		setSource(src.getSource());
		setTruncated(src.isTruncated());
		setInReplyToStatusId(src.getInReplyToStatusId());
		setInReplyToUserId(src.getInReplyToUserId());
		setInReplyToScreenName(src.getInReplyToScreenName());
		setFavorited(src.isFavorited());
		setRetweet(src.isRetweet());
		setContributors(Longs.asList(src.getContributors()));
		setRetweetCount(src.getRetweetCount());
		setRetweetedByMe(src.isRetweetedByMe());
		setCurrentUserRetweetId(src.getCurrentUserRetweetId());
		setPossiblySensitive(src.isPossiblySensitive());
		setGeoLocationFromTwitter(src.getGeoLocation());
		setPlaceFromTwitter(src.getPlace());
	}

	private void setPlaceFromTwitter(@Nullable Place src) {
		TwitterPlace place = new TwitterPlace();
		if (src != null) {
			SlugUtils.checkUtf8(src.getFullName(), Place.class, src);
			place.setBoundingBoxType(src.getBoundingBoxType());
			place.setCountry(src.getCountry());
			place.setCountryCode(src.getCountryCode());
			place.setFullName(src.getFullName());
			place.setGeometryType(src.getGeometryType());
			place.setId(src.getId());
			place.setName(src.getName());
			place.setPlaceType(src.getPlaceType());
			place.setStreetAddress(src.getStreetAddress());
			place.setUrl(src.getURL());
		}
		setPlace(place);
	}

	private void setGeoLocationFromTwitter(@Nullable GeoLocation src) {
		Geolocation geol = new Geolocation();
		if (src != null) {
			geol.setLatitude(src.getLatitude());
			geol.setLongitude(src.getLongitude());
		}
		setGeoLocation(geol);
	}

}
