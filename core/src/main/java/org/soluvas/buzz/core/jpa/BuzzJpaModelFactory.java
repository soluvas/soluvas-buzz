package org.soluvas.buzz.core.jpa;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.joda.time.DateTime;
import org.soluvas.jpa.jpa.Geolocation;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: buzzJpa. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BuzzJpaModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BuzzJpaModelPackage.TWITTERUSER_CLASSIFIER_ID:
			return createTwitterUser();
		case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CLASSIFIER_ID:
			return createTwitterStatusEmbed();
		case BuzzJpaModelPackage.TWITTERPLACE_CLASSIFIER_ID:
			return createTwitterPlace();
		default:
			throw new IllegalArgumentException("The EClass '"
					+ eClass.getName()
					+ "' is not a valid EClass for this EPackage");
		}
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case BuzzJpaModelPackage.TWITTERUSER_CLASSIFIER_ID:
			modelObject = new TwitterUserModelObject();
			break;
		case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CLASSIFIER_ID:
			modelObject = new TwitterStatusEmbedModelObject();
			break;
		case BuzzJpaModelPackage.TWITTERPLACE_CLASSIFIER_ID:
			modelObject = new TwitterPlaceModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 *
	 * @param eFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param eFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         TwitterUser
	 * @generated
	 */
	public TwitterUser createTwitterUser() {
		return new TwitterUser();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         TwitterStatusEmbed
	 * @generated
	 */
	public TwitterStatusEmbed createTwitterStatusEmbed() {
		return new TwitterStatusEmbed();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         TwitterPlace
	 * @generated
	 */
	public TwitterPlace createTwitterPlace() {
		return new TwitterPlace();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage");
		}
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage.");
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>TwitterUser</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TwitterUserModelObject<E extends TwitterUser> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return BuzzJpaModelPackage.INSTANCE.getTwitterUserEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return BuzzJpaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case BuzzJpaModelPackage.TWITTERUSER_ID_FEATURE_ID:
				return getTarget().getId();
			case BuzzJpaModelPackage.TWITTERUSER_REVID_FEATURE_ID:
				return getTarget().getRevId();
			case BuzzJpaModelPackage.TWITTERUSER_FETCHTIME_FEATURE_ID:
				return getTarget().getFetchTime();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDIMAGEURL_FEATURE_ID:
				return getTarget().getProfileBackgroundImageUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDIMAGEURLHTTPS_FEATURE_ID:
				return getTarget().getProfileBackgroundImageUrlHttps();
			case BuzzJpaModelPackage.TWITTERUSER_NAME_FEATURE_ID:
				return getTarget().getName();
			case BuzzJpaModelPackage.TWITTERUSER_SCREENNAME_FEATURE_ID:
				return getTarget().getScreenName();
			case BuzzJpaModelPackage.TWITTERUSER_LOCATION_FEATURE_ID:
				return getTarget().getLocation();
			case BuzzJpaModelPackage.TWITTERUSER_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case BuzzJpaModelPackage.TWITTERUSER_CONTRIBUTORSENABLED_FEATURE_ID:
				return getTarget().isContributorsEnabled();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEIMAGEURL_FEATURE_ID:
				return getTarget().getProfileImageUrl();
			case BuzzJpaModelPackage.TWITTERUSER_BIGGERPROFILEIMAGEURL_FEATURE_ID:
				return getTarget().getBiggerProfileImageUrl();
			case BuzzJpaModelPackage.TWITTERUSER_MINIPROFILEIMAGEURL_FEATURE_ID:
				return getTarget().getMiniProfileImageUrl();
			case BuzzJpaModelPackage.TWITTERUSER_ORIGINALPROFILEIMAGEURL_FEATURE_ID:
				return getTarget().getOriginalProfileImageUrl();
			case BuzzJpaModelPackage.TWITTERUSER_ORIGINALPROFILEIMAGEURLHTTPS_FEATURE_ID:
				return getTarget().getOriginalProfileImageUrlHttps();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERURL_FEATURE_ID:
				return getTarget().getProfileBannerUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERRETINAURL_FEATURE_ID:
				return getTarget().getProfileBannerRetinaUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERIPADURL_FEATURE_ID:
				return getTarget().getProfileBannerIpadUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERIPADRETINAURL_FEATURE_ID:
				return getTarget().getProfileBannerIpadRetinaUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERMOBILEURL_FEATURE_ID:
				return getTarget().getProfileBannerMobileUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERMOBILERETINAURL_FEATURE_ID:
				return getTarget().getProfileBannerMobileRetinaUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDTILED_FEATURE_ID:
				return getTarget().isProfileBackgroundTiled();
			case BuzzJpaModelPackage.TWITTERUSER_LANG_FEATURE_ID:
				return getTarget().getLang();
			case BuzzJpaModelPackage.TWITTERUSER_STATUSESCOUNT_FEATURE_ID:
				return getTarget().getStatusesCount();
			case BuzzJpaModelPackage.TWITTERUSER_GEOENABLED_FEATURE_ID:
				return getTarget().isGeoEnabled();
			case BuzzJpaModelPackage.TWITTERUSER_VERIFIED_FEATURE_ID:
				return getTarget().isVerified();
			case BuzzJpaModelPackage.TWITTERUSER_TRANSLATOR_FEATURE_ID:
				return getTarget().isTranslator();
			case BuzzJpaModelPackage.TWITTERUSER_LISTEDCOUNT_FEATURE_ID:
				return getTarget().getListedCount();
			case BuzzJpaModelPackage.TWITTERUSER_FOLLOWREQUESTSENT_FEATURE_ID:
				return getTarget().isFollowRequestSent();
			case BuzzJpaModelPackage.TWITTERUSER_URL_FEATURE_ID:
				return getTarget().getUrl();
			case BuzzJpaModelPackage.TWITTERUSER_PROTECTEDSTATE_FEATURE_ID:
				return getTarget().isProtectedState();
			case BuzzJpaModelPackage.TWITTERUSER_FOLLOWERSCOUNT_FEATURE_ID:
				return getTarget().getFollowersCount();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDCOLOR_FEATURE_ID:
				return getTarget().getProfileBackgroundColor();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILETEXTCOLOR_FEATURE_ID:
				return getTarget().getProfileTextColor();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILELINKCOLOR_FEATURE_ID:
				return getTarget().getProfileLinkColor();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILESIDEBARFILLCOLOR_FEATURE_ID:
				return getTarget().getProfileSidebarFillColor();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILESIDEBARBORDERCOLOR_FEATURE_ID:
				return getTarget().getProfileSidebarBorderColor();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEUSEBACKGROUNDIMAGE_FEATURE_ID:
				return getTarget().isProfileUseBackgroundImage();
			case BuzzJpaModelPackage.TWITTERUSER_SHOWALLINLINEMEDIA_FEATURE_ID:
				return getTarget().isShowAllInlineMedia();
			case BuzzJpaModelPackage.TWITTERUSER_FRIENDSCOUNT_FEATURE_ID:
				return getTarget().getFriendsCount();
			case BuzzJpaModelPackage.TWITTERUSER_CREATEDAT_FEATURE_ID:
				return getTarget().getCreatedAt();
			case BuzzJpaModelPackage.TWITTERUSER_FAVOURITESCOUNT_FEATURE_ID:
				return getTarget().getFavouritesCount();
			case BuzzJpaModelPackage.TWITTERUSER_UTCOFFSET_FEATURE_ID:
				return getTarget().getUtcOffset();
			case BuzzJpaModelPackage.TWITTERUSER_TIMEZONE_FEATURE_ID:
				return getTarget().getTimeZone();
			case BuzzJpaModelPackage.TWITTERUSER_STATUS_FEATURE_ID:
				return getTarget().getStatus();
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEIMAGEURLHTTPS_FEATURE_ID:
				return getTarget().getProfileImageUrlHttps();
			case BuzzJpaModelPackage.TWITTERUSER_BIGGERPROFILEIMAGEURLHTTPS_FEATURE_ID:
				return getTarget().getBiggerProfileImageUrlHttps();
			case BuzzJpaModelPackage.TWITTERUSER_MINIPROFILEIMAGEURLHTTPS_FEATURE_ID:
				return getTarget().getMiniProfileImageUrlHttps();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case BuzzJpaModelPackage.TWITTERUSER_ID_FEATURE_ID:
				getTarget().setId((Long) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_REVID_FEATURE_ID:
				getTarget().setRevId((Integer) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_FETCHTIME_FEATURE_ID:
				getTarget().setFetchTime((DateTime) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDIMAGEURL_FEATURE_ID:
				getTarget().setProfileBackgroundImageUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDIMAGEURLHTTPS_FEATURE_ID:
				getTarget().setProfileBackgroundImageUrlHttps((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_SCREENNAME_FEATURE_ID:
				getTarget().setScreenName((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_LOCATION_FEATURE_ID:
				getTarget().setLocation((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_CONTRIBUTORSENABLED_FEATURE_ID:
				getTarget().setContributorsEnabled((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEIMAGEURL_FEATURE_ID:
				getTarget().setProfileImageUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_BIGGERPROFILEIMAGEURL_FEATURE_ID:
				getTarget().setBiggerProfileImageUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_MINIPROFILEIMAGEURL_FEATURE_ID:
				getTarget().setMiniProfileImageUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_ORIGINALPROFILEIMAGEURL_FEATURE_ID:
				getTarget().setOriginalProfileImageUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_ORIGINALPROFILEIMAGEURLHTTPS_FEATURE_ID:
				getTarget().setOriginalProfileImageUrlHttps((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERURL_FEATURE_ID:
				getTarget().setProfileBannerUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERRETINAURL_FEATURE_ID:
				getTarget().setProfileBannerRetinaUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERIPADURL_FEATURE_ID:
				getTarget().setProfileBannerIpadUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERIPADRETINAURL_FEATURE_ID:
				getTarget().setProfileBannerIpadRetinaUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERMOBILEURL_FEATURE_ID:
				getTarget().setProfileBannerMobileUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBANNERMOBILERETINAURL_FEATURE_ID:
				getTarget().setProfileBannerMobileRetinaUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDTILED_FEATURE_ID:
				getTarget().setProfileBackgroundTiled((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_LANG_FEATURE_ID:
				getTarget().setLang((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_STATUSESCOUNT_FEATURE_ID:
				getTarget().setStatusesCount((Integer) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_GEOENABLED_FEATURE_ID:
				getTarget().setGeoEnabled((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_VERIFIED_FEATURE_ID:
				getTarget().setVerified((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_TRANSLATOR_FEATURE_ID:
				getTarget().setTranslator((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_LISTEDCOUNT_FEATURE_ID:
				getTarget().setListedCount((Integer) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_FOLLOWREQUESTSENT_FEATURE_ID:
				getTarget().setFollowRequestSent((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_URL_FEATURE_ID:
				getTarget().setUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROTECTEDSTATE_FEATURE_ID:
				getTarget().setProtectedState((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_FOLLOWERSCOUNT_FEATURE_ID:
				getTarget().setFollowersCount((Integer) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEBACKGROUNDCOLOR_FEATURE_ID:
				getTarget().setProfileBackgroundColor((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILETEXTCOLOR_FEATURE_ID:
				getTarget().setProfileTextColor((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILELINKCOLOR_FEATURE_ID:
				getTarget().setProfileLinkColor((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILESIDEBARFILLCOLOR_FEATURE_ID:
				getTarget().setProfileSidebarFillColor((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILESIDEBARBORDERCOLOR_FEATURE_ID:
				getTarget().setProfileSidebarBorderColor((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEUSEBACKGROUNDIMAGE_FEATURE_ID:
				getTarget().setProfileUseBackgroundImage((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_SHOWALLINLINEMEDIA_FEATURE_ID:
				getTarget().setShowAllInlineMedia((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_FRIENDSCOUNT_FEATURE_ID:
				getTarget().setFriendsCount((Integer) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_CREATEDAT_FEATURE_ID:
				getTarget().setCreatedAt((DateTime) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_FAVOURITESCOUNT_FEATURE_ID:
				getTarget().setFavouritesCount((Integer) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_UTCOFFSET_FEATURE_ID:
				getTarget().setUtcOffset((Integer) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_TIMEZONE_FEATURE_ID:
				getTarget().setTimeZone((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_STATUS_FEATURE_ID:
				getTarget().setStatus((TwitterStatusEmbed) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_PROFILEIMAGEURLHTTPS_FEATURE_ID:
				getTarget().setProfileImageUrlHttps((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_BIGGERPROFILEIMAGEURLHTTPS_FEATURE_ID:
				getTarget().setBiggerProfileImageUrlHttps((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERUSER_MINIPROFILEIMAGEURLHTTPS_FEATURE_ID:
				getTarget().setMiniProfileImageUrlHttps((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>TwitterStatusEmbed</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TwitterStatusEmbedModelObject<E extends TwitterStatusEmbed>
			extends AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return BuzzJpaModelPackage.INSTANCE.getTwitterStatusEmbedEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return BuzzJpaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CREATEDAT_FEATURE_ID:
				return getTarget().getCreatedAt();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_ID_FEATURE_ID:
				return getTarget().getId();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_TEXT_FEATURE_ID:
				return getTarget().getText();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_SOURCE_FEATURE_ID:
				return getTarget().getSource();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_TRUNCATED_FEATURE_ID:
				return getTarget().isTruncated();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_INREPLYTOSTATUSID_FEATURE_ID:
				return getTarget().getInReplyToStatusId();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_INREPLYTOUSERID_FEATURE_ID:
				return getTarget().getInReplyToUserId();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_INREPLYTOSCREENNAME_FEATURE_ID:
				return getTarget().getInReplyToScreenName();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_GEOLOCATION_FEATURE_ID:
				return getTarget().getGeoLocation();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_PLACE_FEATURE_ID:
				return getTarget().getPlace();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_FAVORITED_FEATURE_ID:
				return getTarget().isFavorited();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_RETWEET_FEATURE_ID:
				return getTarget().isRetweet();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CONTRIBUTORS_FEATURE_ID:
				return getTarget().getContributors();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_RETWEETCOUNT_FEATURE_ID:
				return getTarget().getRetweetCount();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_RETWEETEDBYME_FEATURE_ID:
				return getTarget().isRetweetedByMe();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CURRENTUSERRETWEETID_FEATURE_ID:
				return getTarget().getCurrentUserRetweetId();
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_POSSIBLYSENSITIVE_FEATURE_ID:
				return getTarget().isPossiblySensitive();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CREATEDAT_FEATURE_ID:
				getTarget().setCreatedAt((DateTime) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_ID_FEATURE_ID:
				getTarget().setId((Long) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_TEXT_FEATURE_ID:
				getTarget().setText((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_SOURCE_FEATURE_ID:
				getTarget().setSource((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_TRUNCATED_FEATURE_ID:
				getTarget().setTruncated((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_INREPLYTOSTATUSID_FEATURE_ID:
				getTarget().setInReplyToStatusId((Long) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_INREPLYTOUSERID_FEATURE_ID:
				getTarget().setInReplyToUserId((Long) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_INREPLYTOSCREENNAME_FEATURE_ID:
				getTarget().setInReplyToScreenName((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_GEOLOCATION_FEATURE_ID:
				getTarget().setGeoLocation((Geolocation) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_PLACE_FEATURE_ID:
				getTarget().setPlace((TwitterPlace) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_FAVORITED_FEATURE_ID:
				getTarget().setFavorited((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_RETWEET_FEATURE_ID:
				getTarget().setRetweet((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CONTRIBUTORS_FEATURE_ID:
				getTarget().setContributors((List<Long>) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_RETWEETCOUNT_FEATURE_ID:
				getTarget().setRetweetCount((Long) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_RETWEETEDBYME_FEATURE_ID:
				getTarget().setRetweetedByMe((Boolean) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CURRENTUSERRETWEETID_FEATURE_ID:
				getTarget().setCurrentUserRetweetId((Long) value);
				return;
			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_POSSIBLYSENSITIVE_FEATURE_ID:
				getTarget().setPossiblySensitive((Boolean) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CONTRIBUTORS_FEATURE_ID:
				return getTarget().getContributors().add((Long) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case BuzzJpaModelPackage.TWITTERSTATUSEMBED_CONTRIBUTORS_FEATURE_ID:
				return getTarget().getContributors().remove(value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>TwitterPlace</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TwitterPlaceModelObject<E extends TwitterPlace> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return BuzzJpaModelPackage.INSTANCE.getTwitterPlaceEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return BuzzJpaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case BuzzJpaModelPackage.TWITTERPLACE_ID_FEATURE_ID:
				return getTarget().getId();
			case BuzzJpaModelPackage.TWITTERPLACE_NAME_FEATURE_ID:
				return getTarget().getName();
			case BuzzJpaModelPackage.TWITTERPLACE_STREETADDRESS_FEATURE_ID:
				return getTarget().getStreetAddress();
			case BuzzJpaModelPackage.TWITTERPLACE_COUNTRYCODE_FEATURE_ID:
				return getTarget().getCountryCode();
			case BuzzJpaModelPackage.TWITTERPLACE_COUNTRY_FEATURE_ID:
				return getTarget().getCountry();
			case BuzzJpaModelPackage.TWITTERPLACE_PLACETYPE_FEATURE_ID:
				return getTarget().getPlaceType();
			case BuzzJpaModelPackage.TWITTERPLACE_URL_FEATURE_ID:
				return getTarget().getUrl();
			case BuzzJpaModelPackage.TWITTERPLACE_FULLNAME_FEATURE_ID:
				return getTarget().getFullName();
			case BuzzJpaModelPackage.TWITTERPLACE_BOUNDINGBOXTYPE_FEATURE_ID:
				return getTarget().getBoundingBoxType();
			case BuzzJpaModelPackage.TWITTERPLACE_GEOMETRYTYPE_FEATURE_ID:
				return getTarget().getGeometryType();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case BuzzJpaModelPackage.TWITTERPLACE_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_STREETADDRESS_FEATURE_ID:
				getTarget().setStreetAddress((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_COUNTRYCODE_FEATURE_ID:
				getTarget().setCountryCode((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_COUNTRY_FEATURE_ID:
				getTarget().setCountry((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_PLACETYPE_FEATURE_ID:
				getTarget().setPlaceType((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_URL_FEATURE_ID:
				getTarget().setUrl((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_FULLNAME_FEATURE_ID:
				getTarget().setFullName((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_BOUNDINGBOXTYPE_FEATURE_ID:
				getTarget().setBoundingBoxType((String) value);
				return;
			case BuzzJpaModelPackage.TWITTERPLACE_GEOMETRYTYPE_FEATURE_ID:
				getTarget().setGeometryType((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}