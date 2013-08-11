/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter User Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.TwitterUserLink#getToken <em>Token</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.TwitterUserLink#getTokenSecret <em>Token Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.TwitterUserLink#getTwitterId <em>Twitter Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.TwitterUserLink#getScreenName <em>Screen Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterUserLink()
 * @model
 * @generated
 */
public interface TwitterUserLink extends SocialLink {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterUserLink_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterUserLink#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Secret</em>' attribute.
	 * @see #setTokenSecret(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterUserLink_TokenSecret()
	 * @model
	 * @generated
	 */
	String getTokenSecret();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterUserLink#getTokenSecret <em>Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Secret</em>' attribute.
	 * @see #getTokenSecret()
	 * @generated
	 */
	void setTokenSecret(String value);

	/**
	 * Returns the value of the '<em><b>Twitter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twitter Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twitter Id</em>' attribute.
	 * @see #setTwitterId(Long)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterUserLink_TwitterId()
	 * @model
	 * @generated
	 */
	Long getTwitterId();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterUserLink#getTwitterId <em>Twitter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twitter Id</em>' attribute.
	 * @see #getTwitterId()
	 * @generated
	 */
	void setTwitterId(Long value);

	/**
	 * Returns the value of the '<em><b>Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Name</em>' attribute.
	 * @see #setScreenName(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getTwitterUserLink_ScreenName()
	 * @model
	 * @generated
	 */
	String getScreenName();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.TwitterUserLink#getScreenName <em>Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Name</em>' attribute.
	 * @see #getScreenName()
	 * @generated
	 */
	void setScreenName(String value);

} // TwitterUserLink
