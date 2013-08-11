/**
 */
package org.soluvas.buzz.core;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.joda.time.DateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A social media integration link between an app and an external user, containing:
 * 1. Type (as concrete class)
 * 2. ID
 * 3. Username
 * 4. OAuth token (and optionally, secret)
 * 5. Token expiry
 * 
 * The relationship between the external user (i.e. Arum on Facebook) to an internal user (i.e. Arum on AksiMata) is unspecified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.SocialLink#getExpiryTime <em>Expiry Time</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.SocialLink#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getSocialLink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SocialLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expiry time of this Social Link token, if known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Time</em>' attribute.
	 * @see #setExpiryTime(DateTime)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getSocialLink_ExpiryTime()
	 * @model dataType="org.soluvas.commons.DateTime"
	 * @generated
	 */
	DateTime getExpiryTime();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.SocialLink#getExpiryTime <em>Expiry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Time</em>' attribute.
	 * @see #getExpiryTime()
	 * @generated
	 */
	void setExpiryTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Social media provider-specific permissions (scope) granted to this Social Link token.
	 * Facebook uses this (partial permissions is possible). Twitter doesn't (either yes or no).
	 * Operations may optionally check this to ensure required permissions are allowed before posting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute list.
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getSocialLink_Permissions()
	 * @model
	 * @generated
	 */
	EList<String> getPermissions();

} // SocialLink
