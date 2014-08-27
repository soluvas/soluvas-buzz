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

	public void copyFrom(String screenName, @Nullable Status src) {
		if (src == null) {
			return;
		}
//		SlugUtils.checkUtf8("@" + screenName + " status=" + src.getId(), Status.class, src);
		setId(src.getId());
		setCreatedAt(new DateTime(src.getCreatedAt()));
		// status.text in followers/list also has trailing 00s: https://dev.twitter.com/issues/1908
		// Caused by: java.lang.RuntimeException: @rediantihera status:502781160297332736: public abstract java.lang.String twitter4j.Status.getText() result contains 00 at index 142: RT @JobsDBIndonesia: ..Nah, untuk lebih lengkapnya daftar Kementerian dan instansi yang membuka formasi 2014, klik: http://t.co/VsCZwJkSyk … - 525420404a6f62734442496e646f6e657369613a202e2e4e61682c20756e74756b206c65626968206c656e676b61706e796120646166746172204b656d656e74657269616e2064616e20696e7374616e73692079616e67206d656d62756b6120666f726d61736920323031342c206b6c696b3a20687474703a2f2f742e636f2f5673435a774a6b53796b20e280a6000000000000000000000000
		setText(SlugUtils.stripNullChars(src.getText()));
		// @@rediantihera status=502781160297332736: public abstract java.lang.String twitter4j.Status.getSource() result contains 00 at index 67: <a href="http://www.makeatweet.com" rel="nofollow">Make a Tweet</a> - 3c6120687265663d22687474703a2f2f7777772e6d616b656174776565742e636f6d222072656c3d226e6f666f6c6c6f77223e4d616b6520612054776565743c2f613e000000000000
		setSource(SlugUtils.stripNullChars(src.getSource()));
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
		setPlaceFromTwitter(screenName, src.getPlace());
		SlugUtils.checkUtf8("@" + screenName + " status=" + src.getId(), TwitterStatusEmbed.class, this);
	}

	private void setPlaceFromTwitter(String id, @Nullable Place src) {
		TwitterPlace place = new TwitterPlace();
		if (src != null) {
//			SlugUtils.checkUtf8("@" + screenName + " place=" + src.getFullName(), Place.class, src);
			place.setBoundingBoxType(src.getBoundingBoxType());
			place.setCountry(src.getCountry());
			place.setCountryCode(src.getCountryCode());
			// https://dev.twitter.com/issues/1908
			// @asriRuwiati place:Ciracas, Jakarta Timur: public abstract java.lang.String twitter4j.Place.getFullName() result contains 00 at index 22: Ciracas, Jakarta Timur - 436972616361732c204a616b617274612054696d75720000
			place.setFullName(SlugUtils.stripNullChars(src.getFullName()));
			place.setGeometryType(src.getGeometryType());
			// @@asriRuwiati place=Ciracas, Jakarta Timur: public abstract java.lang.String twitter4j.Place.getId() result contains 00 at index 16: 7b6a59ab52ddb419 - 3762366135396162353264646234313900
			place.setId(SlugUtils.stripNullChars(src.getId()));
			place.setName(src.getName());
			place.setPlaceType(src.getPlaceType());
			place.setStreetAddress(src.getStreetAddress());
			// @@asriRuwiati place=Ciracas, Jakarta Timur: public abstract java.lang.String twitter4j.Place.getURL() result contains 00 at index 56: https://api.twitter.com/1.1/geo/id/7b6a59ab52ddb419.json - 68747470733a2f2f6170692e747769747465722e636f6d2f312e312f67656f2f69642f376236613539616235326464623431392e6a736f6e0000000000
			place.setUrl(SlugUtils.stripNullChars(src.getURL()));
			
			SlugUtils.checkUtf8(id + " place=" + src.getFullName(), TwitterPlace.class, place);
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
