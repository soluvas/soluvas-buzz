package org.soluvas.buzz.core.jpa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.soluvas.jpa.jpa.JpaModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>buzzJpa</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BuzzJpaModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.soluvas.org/buzz.core.jpa/";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final BuzzJpaModelFactory MODELFACTORY = new BuzzJpaModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_REVID_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_FETCHTIME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBACKGROUNDIMAGEURL_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBACKGROUNDIMAGEURLHTTPS_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_NAME_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_SCREENNAME_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_LOCATION_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_DESCRIPTION_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_CONTRIBUTORSENABLED_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEIMAGEURL_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_BIGGERPROFILEIMAGEURL_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_MINIPROFILEIMAGEURL_FEATURE_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_ORIGINALPROFILEIMAGEURL_FEATURE_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_ORIGINALPROFILEIMAGEURLHTTPS_FEATURE_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBANNERURL_FEATURE_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBANNERRETINAURL_FEATURE_ID = 16;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBANNERIPADURL_FEATURE_ID = 17;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBANNERIPADRETINAURL_FEATURE_ID = 18;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBANNERMOBILEURL_FEATURE_ID = 19;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBANNERMOBILERETINAURL_FEATURE_ID = 20;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBACKGROUNDTILED_FEATURE_ID = 21;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_LANG_FEATURE_ID = 22;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_STATUSESCOUNT_FEATURE_ID = 23;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_GEOENABLED_FEATURE_ID = 24;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_VERIFIED_FEATURE_ID = 25;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_TRANSLATOR_FEATURE_ID = 26;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_LISTEDCOUNT_FEATURE_ID = 27;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_FOLLOWREQUESTSENT_FEATURE_ID = 28;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_URL_FEATURE_ID = 29;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROTECTEDSTATE_FEATURE_ID = 30;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_FOLLOWERSCOUNT_FEATURE_ID = 31;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEBACKGROUNDCOLOR_FEATURE_ID = 32;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILETEXTCOLOR_FEATURE_ID = 33;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILELINKCOLOR_FEATURE_ID = 34;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILESIDEBARFILLCOLOR_FEATURE_ID = 35;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILESIDEBARBORDERCOLOR_FEATURE_ID = 36;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEUSEBACKGROUNDIMAGE_FEATURE_ID = 37;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_SHOWALLINLINEMEDIA_FEATURE_ID = 38;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_FRIENDSCOUNT_FEATURE_ID = 39;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_CREATEDAT_FEATURE_ID = 40;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_FAVOURITESCOUNT_FEATURE_ID = 41;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_UTCOFFSET_FEATURE_ID = 42;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_TIMEZONE_FEATURE_ID = 43;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_STATUS_FEATURE_ID = 44;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_PROFILEIMAGEURLHTTPS_FEATURE_ID = 45;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_BIGGERPROFILEIMAGEURLHTTPS_FEATURE_ID = 46;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERUSER_MINIPROFILEIMAGEURLHTTPS_FEATURE_ID = 47;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_CREATEDAT_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_ID_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_TEXT_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_SOURCE_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_TRUNCATED_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_INREPLYTOSTATUSID_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_INREPLYTOUSERID_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_INREPLYTOSCREENNAME_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_GEOLOCATION_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_PLACE_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_FAVORITED_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_RETWEET_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_CONTRIBUTORS_FEATURE_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_RETWEETCOUNT_FEATURE_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_RETWEETEDBYME_FEATURE_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_CURRENTUSERRETWEETID_FEATURE_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERSTATUSEMBED_POSSIBLYSENSITIVE_FEATURE_ID = 16;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_STREETADDRESS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_COUNTRYCODE_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_COUNTRY_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_PLACETYPE_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_URL_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_FULLNAME_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_BOUNDINGBOXTYPE_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TWITTERPLACE_GEOMETRYTYPE_FEATURE_ID = 9;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final BuzzJpaModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static BuzzJpaModelPackage initialize() {

		if (isInitialized) {
			return (BuzzJpaModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final BuzzJpaModelPackage modelPackage = new BuzzJpaModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		JpaModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(
				TwitterUser.class, modelPackage.getTwitterUserEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				TwitterStatusEmbed.class,
				modelPackage.getTwitterStatusEmbedEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				TwitterPlace.class, modelPackage.getTwitterPlaceEClass(),
				modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the {@link BuzzJpaModelFactory} instance.
	 * @generated
	 */
	@Override
	public BuzzJpaModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "buzzJpa.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>TwitterUser</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>TwitterUser</b></em>'
	 * @generated
	 */
	public EClass getTwitterUserEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TWITTERUSER_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterUser.id</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.id</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Id() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterUser.revId</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.revId</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_RevId() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_REVID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.fetchTime</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.fetchTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_FetchTime() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_FETCHTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBackgroundImageUrl</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBackgroundImageUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBackgroundImageUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBACKGROUNDIMAGEURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBackgroundImageUrlHttps</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBackgroundImageUrlHttps</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBackgroundImageUrlHttps() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBACKGROUNDIMAGEURLHTTPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterUser.name</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.name</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Name() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.screenName</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.screenName</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ScreenName() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_SCREENNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.location</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.location</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Location() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_LOCATION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.description</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.description</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Description() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_DESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.contributorsEnabled</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.contributorsEnabled</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ContributorsEnabled() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_CONTRIBUTORSENABLED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileImageUrl</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileImageUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileImageUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEIMAGEURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.biggerProfileImageUrl</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.biggerProfileImageUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_BiggerProfileImageUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_BIGGERPROFILEIMAGEURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.miniProfileImageUrl</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.miniProfileImageUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_MiniProfileImageUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_MINIPROFILEIMAGEURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.originalProfileImageUrl</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.originalProfileImageUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_OriginalProfileImageUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_ORIGINALPROFILEIMAGEURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.originalProfileImageUrlHttps</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.originalProfileImageUrlHttps</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_OriginalProfileImageUrlHttps() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_ORIGINALPROFILEIMAGEURLHTTPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBannerUrl</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBannerUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBannerUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBANNERURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBannerRetinaUrl</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBannerRetinaUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBannerRetinaUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBANNERRETINAURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBannerIpadUrl</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBannerIpadUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBannerIpadUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBANNERIPADURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBannerIpadRetinaUrl</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBannerIpadRetinaUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBannerIpadRetinaUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBANNERIPADRETINAURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBannerMobileUrl</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBannerMobileUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBannerMobileUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBANNERMOBILEURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBannerMobileRetinaUrl</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBannerMobileRetinaUrl</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBannerMobileRetinaUrl() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBANNERMOBILERETINAURL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBackgroundTiled</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBackgroundTiled</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBackgroundTiled() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBACKGROUNDTILED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterUser.lang</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.lang</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Lang() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_LANG_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.statusesCount</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.statusesCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_StatusesCount() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_STATUSESCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.geoEnabled</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.geoEnabled</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_GeoEnabled() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_GEOENABLED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.verified</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.verified</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Verified() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_VERIFIED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.translator</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.translator</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Translator() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_TRANSLATOR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.listedCount</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.listedCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ListedCount() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_LISTEDCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.followRequestSent</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.followRequestSent</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_FollowRequestSent() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_FOLLOWREQUESTSENT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterUser.url</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.url</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_Url() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_URL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.protectedState</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.protectedState</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProtectedState() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROTECTEDSTATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.followersCount</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.followersCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_FollowersCount() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_FOLLOWERSCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileBackgroundColor</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileBackgroundColor</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileBackgroundColor() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEBACKGROUNDCOLOR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileTextColor</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileTextColor</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileTextColor() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILETEXTCOLOR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileLinkColor</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileLinkColor</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileLinkColor() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILELINKCOLOR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileSidebarFillColor</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileSidebarFillColor</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileSidebarFillColor() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILESIDEBARFILLCOLOR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileSidebarBorderColor</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileSidebarBorderColor</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileSidebarBorderColor() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILESIDEBARBORDERCOLOR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileUseBackgroundImage</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileUseBackgroundImage</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileUseBackgroundImage() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEUSEBACKGROUNDIMAGE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.showAllInlineMedia</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.showAllInlineMedia</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ShowAllInlineMedia() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_SHOWALLINLINEMEDIA_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.friendsCount</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.friendsCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_FriendsCount() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_FRIENDSCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.createdAt</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.createdAt</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_CreatedAt() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_CREATEDAT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.favouritesCount</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.favouritesCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_FavouritesCount() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_FAVOURITESCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.utcOffset</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.utcOffset</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_UtcOffset() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_UTCOFFSET_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.timeZone</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.timeZone</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_TimeZone() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_TIMEZONE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.status</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.status</b></em>'.
	 * @generated
	 */
	public EReference getTwitterUser_Status() {
		return (EReference) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_STATUS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.profileImageUrlHttps</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.profileImageUrlHttps</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_ProfileImageUrlHttps() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_PROFILEIMAGEURLHTTPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.biggerProfileImageUrlHttps</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.biggerProfileImageUrlHttps</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_BiggerProfileImageUrlHttps() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_BIGGERPROFILEIMAGEURLHTTPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterUser.miniProfileImageUrlHttps</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterUser.miniProfileImageUrlHttps</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterUser_MiniProfileImageUrlHttps() {
		return (EAttribute) getTwitterUserEClass().getEAllStructuralFeatures()
				.get(TWITTERUSER_MINIPROFILEIMAGEURLHTTPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>TwitterStatusEmbed</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>TwitterStatusEmbed</b></em>'
	 * @generated
	 */
	public EClass getTwitterStatusEmbedEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TWITTERSTATUSEMBED_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.createdAt</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.createdAt</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_CreatedAt() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_CREATEDAT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.id</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.id</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_Id() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.text</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.text</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_Text() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_TEXT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.source</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.source</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_Source() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_SOURCE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.truncated</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.truncated</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_Truncated() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_TRUNCATED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.inReplyToStatusId</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.inReplyToStatusId</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_InReplyToStatusId() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_INREPLYTOSTATUSID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.inReplyToUserId</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.inReplyToUserId</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_InReplyToUserId() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_INREPLYTOUSERID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.inReplyToScreenName</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.inReplyToScreenName</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_InReplyToScreenName() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_INREPLYTOSCREENNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.geoLocation</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.geoLocation</b></em>'.
	 * @generated
	 */
	public EReference getTwitterStatusEmbed_GeoLocation() {
		return (EReference) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_GEOLOCATION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.place</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.place</b></em>'.
	 * @generated
	 */
	public EReference getTwitterStatusEmbed_Place() {
		return (EReference) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_PLACE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.favorited</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.favorited</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_Favorited() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_FAVORITED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.retweet</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.retweet</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_Retweet() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_RETWEET_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.contributors</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.contributors</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_Contributors() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_CONTRIBUTORS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.retweetCount</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.retweetCount</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_RetweetCount() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_RETWEETCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.retweetedByMe</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.retweetedByMe</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_RetweetedByMe() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_RETWEETEDBYME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.currentUserRetweetId</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.currentUserRetweetId</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_CurrentUserRetweetId() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_CURRENTUSERRETWEETID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterStatusEmbed.possiblySensitive</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterStatusEmbed.possiblySensitive</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterStatusEmbed_PossiblySensitive() {
		return (EAttribute) getTwitterStatusEmbedEClass()
				.getEAllStructuralFeatures().get(
						TWITTERSTATUSEMBED_POSSIBLYSENSITIVE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>TwitterPlace</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>TwitterPlace</b></em>'
	 * @generated
	 */
	public EClass getTwitterPlaceEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TWITTERPLACE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterPlace.id</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.id</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_Id() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterPlace.name</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.name</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_Name() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterPlace.streetAddress</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.streetAddress</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_StreetAddress() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_STREETADDRESS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterPlace.countryCode</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.countryCode</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_CountryCode() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_COUNTRYCODE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterPlace.country</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.country</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_Country() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_COUNTRY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterPlace.placeType</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.placeType</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_PlaceType() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_PLACETYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>TwitterPlace.url</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.url</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_Url() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_URL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterPlace.fullName</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.fullName</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_FullName() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_FULLNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterPlace.boundingBoxType</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.boundingBoxType</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_BoundingBoxType() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_BOUNDINGBOXTYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TwitterPlace.geometryType</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TwitterPlace.geometryType</b></em>'.
	 * @generated
	 */
	public EAttribute getTwitterPlace_GeometryType() {
		return (EAttribute) getTwitterPlaceEClass().getEAllStructuralFeatures()
				.get(TWITTERPLACE_GEOMETRYTYPE_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case TWITTERUSER_CLASSIFIER_ID:
			return TwitterUser.class;
		case TWITTERSTATUSEMBED_CLASSIFIER_ID:
			return TwitterStatusEmbed.class;
		case TWITTERPLACE_CLASSIFIER_ID:
			return TwitterPlace.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
