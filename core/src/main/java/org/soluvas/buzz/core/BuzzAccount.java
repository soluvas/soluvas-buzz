/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buzz Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccount#getTwitterApp <em>Twitter App</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccount#getId <em>Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccount#getTwitterAppUser <em>Twitter App User</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccount#getTwitterUsers <em>Twitter Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount()
 * @model
 * @generated
 */
public interface BuzzAccount extends EObject {
	/**
	 * Returns the value of the '<em><b>Twitter App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OAuth consumer info on Twitter for the app itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Twitter App</em>' containment reference.
	 * @see #setTwitterApp(TwitterAppLink)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount_TwitterApp()
	 * @model containment="true"
	 * @generated
	 */
	TwitterAppLink getTwitterApp();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.BuzzAccount#getTwitterApp <em>Twitter App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twitter App</em>' containment reference.
	 * @see #getTwitterApp()
	 * @generated
	 */
	void setTwitterApp(TwitterAppLink value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.BuzzAccount#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Twitter App User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OAuth credentials for the app's Twitter user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Twitter App User</em>' containment reference.
	 * @see #setTwitterAppUser(TwitterUserLink)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount_TwitterAppUser()
	 * @model containment="true"
	 * @generated
	 */
	TwitterUserLink getTwitterAppUser();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.BuzzAccount#getTwitterAppUser <em>Twitter App User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twitter App User</em>' containment reference.
	 * @see #getTwitterAppUser()
	 * @generated
	 */
	void setTwitterAppUser(TwitterUserLink value);

	/**
	 * Returns the value of the '<em><b>Twitter Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.soluvas.buzz.core.TwitterUserLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of OAuth credentials for each registered Twitter user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Twitter Users</em>' containment reference list.
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount_TwitterUsers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TwitterUserLink> getTwitterUsers();

} // BuzzAccount
