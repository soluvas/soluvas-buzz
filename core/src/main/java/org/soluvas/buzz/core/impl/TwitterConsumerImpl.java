/**
 */
package org.soluvas.buzz.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.TwitterConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter App Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterConsumerImpl#getConsumerKey <em>Consumer Key</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterConsumerImpl#getConsumerSecret <em>Consumer Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterConsumerImpl#getCustomDomain <em>Custom Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwitterConsumerImpl extends EObjectImpl implements TwitterConsumer {
	/**
	 * The default value of the '{@link #getConsumerKey() <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerKey() <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerKey()
	 * @generated
	 * @ordered
	 */
	protected String consumerKey = CONSUMER_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumerSecret() <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerSecret() <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerSecret()
	 * @generated
	 * @ordered
	 */
	protected String consumerSecret = CONSUMER_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomDomain() <em>Custom Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomDomain() <em>Custom Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDomain()
	 * @generated
	 * @ordered
	 */
	protected String customDomain = CUSTOM_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuzzCorePackage.Literals.TWITTER_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerKey() {
		return consumerKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerKey(String newConsumerKey) {
		String oldConsumerKey = consumerKey;
		consumerKey = newConsumerKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_KEY, oldConsumerKey, consumerKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerSecret() {
		return consumerSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerSecret(String newConsumerSecret) {
		String oldConsumerSecret = consumerSecret;
		consumerSecret = newConsumerSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_SECRET, oldConsumerSecret, consumerSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomDomain() {
		return customDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomDomain(String newCustomDomain) {
		String oldCustomDomain = customDomain;
		customDomain = newCustomDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_CONSUMER__CUSTOM_DOMAIN, oldCustomDomain, customDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_KEY:
				return getConsumerKey();
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_SECRET:
				return getConsumerSecret();
			case BuzzCorePackage.TWITTER_CONSUMER__CUSTOM_DOMAIN:
				return getCustomDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_KEY:
				setConsumerKey((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_SECRET:
				setConsumerSecret((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_CONSUMER__CUSTOM_DOMAIN:
				setCustomDomain((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_KEY:
				setConsumerKey(CONSUMER_KEY_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_SECRET:
				setConsumerSecret(CONSUMER_SECRET_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_CONSUMER__CUSTOM_DOMAIN:
				setCustomDomain(CUSTOM_DOMAIN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_KEY:
				return CONSUMER_KEY_EDEFAULT == null ? consumerKey != null : !CONSUMER_KEY_EDEFAULT.equals(consumerKey);
			case BuzzCorePackage.TWITTER_CONSUMER__CONSUMER_SECRET:
				return CONSUMER_SECRET_EDEFAULT == null ? consumerSecret != null : !CONSUMER_SECRET_EDEFAULT.equals(consumerSecret);
			case BuzzCorePackage.TWITTER_CONSUMER__CUSTOM_DOMAIN:
				return CUSTOM_DOMAIN_EDEFAULT == null ? customDomain != null : !CUSTOM_DOMAIN_EDEFAULT.equals(customDomain);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (consumerKey: ");
		result.append(consumerKey);
		result.append(", consumerSecret: ");
		result.append(consumerSecret);
		result.append(", customDomain: ");
		result.append(customDomain);
		result.append(')');
		return result.toString();
	}

} //TwitterConsumerImpl
