/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter App Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OAuth consumer (not user) info on Twitter for the app itself.
 * 
 * Apps include:
 * 1. Buzz Cloud
 * 2. AksiMata
 * 3. GaulDong
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.TwitterConsumer#getConsumerKey <em>Consumer Key</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.TwitterConsumer#getConsumerSecret <em>Consumer Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.TwitterConsumer#getCustomDomain <em>Custom Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterConsumer()
 * @model
 * @generated
 */
public interface TwitterConsumer {
	/**
	 * Returns the value of the '<em><b>Consumer Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Key</em>' attribute.
	 * @see #setConsumerKey(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterConsumer_ConsumerKey()
	 * @model
	 * @generated
	 */
	String getConsumerKey();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterConsumer#getConsumerKey <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Key</em>' attribute.
	 * @see #getConsumerKey()
	 * @generated
	 */
	void setConsumerKey(String value);

	/**
	 * Returns the value of the '<em><b>Consumer Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Secret</em>' attribute.
	 * @see #setConsumerSecret(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterConsumer_ConsumerSecret()
	 * @model
	 * @generated
	 */
	String getConsumerSecret();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterConsumer#getConsumerSecret <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Secret</em>' attribute.
	 * @see #getConsumerSecret()
	 * @generated
	 */
	void setConsumerSecret(String value);

	/**
	 * Returns the value of the '<em><b>Custom Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for testing, this fixes the domain part of the OAuth redirect URI to the specified hostname.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Domain</em>' attribute.
	 * @see #setCustomDomain(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterConsumer_CustomDomain()
	 * @model
	 * @generated
	 */
	String getCustomDomain();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterConsumer#getCustomDomain <em>Custom Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Domain</em>' attribute.
	 * @see #getCustomDomain()
	 * @generated
	 */
	void setCustomDomain(String value);

} // TwitterConsumer
