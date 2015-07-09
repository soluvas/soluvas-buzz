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
public class TwitterConsumerImpl implements TwitterConsumer {
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
	public String getConsumerKey() {
		return consumerKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerKey(String newConsumerKey) {
		consumerKey = newConsumerKey;
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
		consumerSecret = newConsumerSecret;
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
		customDomain = newCustomDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
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
