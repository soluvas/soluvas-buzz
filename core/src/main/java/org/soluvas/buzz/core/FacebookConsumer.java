/**
 */
package org.soluvas.buzz.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.soluvas.buzz.core.impl.FacebookConsumerImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facebook Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OAuth consumer (not user) info on Twitter for the app itself.
 * 
 * Note: When configuring your Facebook App API, you may want to set Settings > Permissions > Default Activity Privacy to Public.
 * Otherwise you get None (User Default) which usually means Friends.
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
 *   <li>{@link org.soluvas.buzz.core.FacebookConsumer#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.FacebookConsumer#getAppSecret <em>App Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.FacebookConsumer#getDefaultScope <em>Default Scope</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.FacebookConsumer#getCustomDomain <em>Custom Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer()
 * @model
 * @generated
 */
@JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes(@JsonSubTypes.Type(name="FacebookConsumer", value=FacebookConsumerImpl.class))
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface FacebookConsumer {
	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer_AppId()
	 * @model
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookConsumer#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>App Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Secret</em>' attribute.
	 * @see #setAppSecret(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer_AppSecret()
	 * @model
	 * @generated
	 */
	String getAppSecret();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookConsumer#getAppSecret <em>App Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Secret</em>' attribute.
	 * @see #getAppSecret()
	 * @generated
	 */
	void setAppSecret(String value);

	/**
	 * Returns the value of the '<em><b>Default Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default set of requested permissions.
	 * Example: read_stream,email,user_birthday,user_hometown,user_about_me,user_religion_politics,user_relationships,user_work_history,user_education_history,user_website,offline_access,publish_actions,share_item
	 * 
	 * Note: When configuring your Facebook App API, you may want to set Settings > Permissions > Default Activity Privacy to Public.
	 * Otherwise you get None (User Default) which usually means Friends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Scope</em>' attribute.
	 * @see #setDefaultScope(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer_DefaultScope()
	 * @model
	 * @generated
	 */
	String getDefaultScope();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookConsumer#getDefaultScope <em>Default Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Scope</em>' attribute.
	 * @see #getDefaultScope()
	 * @generated
	 */
	void setDefaultScope(String value);

	/**
	 * Returns the value of the '<em><b>Custom Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for testing, this fixes the domain part of the OAuth redirect URI to the specified hostname.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Domain</em>' attribute.
	 * @see #setCustomDomain(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer_CustomDomain()
	 * @model
	 * @generated
	 */
	String getCustomDomain();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookConsumer#getCustomDomain <em>Custom Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Domain</em>' attribute.
	 * @see #getCustomDomain()
	 * @generated
	 */
	void setCustomDomain(String value);

} // FacebookConsumer
