/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter App Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.TwitterAppLink#getConsumerKey <em>Consumer Key</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.TwitterAppLink#getConsumerSecret <em>Consumer Secret</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterAppLink()
 * @model
 * @generated
 */
public interface TwitterAppLink extends EObject {
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
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterAppLink_ConsumerKey()
	 * @model
	 * @generated
	 */
	String getConsumerKey();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterAppLink#getConsumerKey <em>Consumer Key</em>}' attribute.
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
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterAppLink_ConsumerSecret()
	 * @model
	 * @generated
	 */
	String getConsumerSecret();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterAppLink#getConsumerSecret <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Secret</em>' attribute.
	 * @see #getConsumerSecret()
	 * @generated
	 */
	void setConsumerSecret(String value);

} // TwitterAppLink
