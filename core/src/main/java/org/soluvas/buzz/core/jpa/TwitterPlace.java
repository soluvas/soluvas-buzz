package org.soluvas.buzz.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * A representation of the model object '<em><b>TwitterPlace</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Embeddable()
public class TwitterPlace {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String id = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String streetAddress = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String countryCode = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String country = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String placeType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(length = 4096)
	private String url = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String fullName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String boundingBoxType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String geometryType = null;

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the '{@link TwitterPlace#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link TwitterPlace#getId() id}'
	 *            feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link TwitterPlace#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link TwitterPlace#getName() name}'
	 *            feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>streetAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>streetAddress</b></em>' feature
	 * @generated
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the '{@link TwitterPlace#getStreetAddress() <em>streetAddress</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStreetAddress
	 *            the new value of the '{@link TwitterPlace#getStreetAddress()
	 *            streetAddress}' feature.
	 * @generated
	 */
	public void setStreetAddress(String newStreetAddress) {
		streetAddress = newStreetAddress;
	}

	/**
	 * Returns the value of '<em><b>countryCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>countryCode</b></em>' feature
	 * @generated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the '{@link TwitterPlace#getCountryCode() <em>countryCode</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCountryCode
	 *            the new value of the '{@link TwitterPlace#getCountryCode()
	 *            countryCode}' feature.
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		countryCode = newCountryCode;
	}

	/**
	 * Returns the value of '<em><b>country</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>country</b></em>' feature
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the '{@link TwitterPlace#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCountry
	 *            the new value of the '{@link TwitterPlace#getCountry()
	 *            country}' feature.
	 * @generated
	 */
	public void setCountry(String newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of '<em><b>placeType</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>placeType</b></em>' feature
	 * @generated
	 */
	public String getPlaceType() {
		return placeType;
	}

	/**
	 * Sets the '{@link TwitterPlace#getPlaceType() <em>placeType</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPlaceType
	 *            the new value of the '{@link TwitterPlace#getPlaceType()
	 *            placeType}' feature.
	 * @generated
	 */
	public void setPlaceType(String newPlaceType) {
		placeType = newPlaceType;
	}

	/**
	 * Returns the value of '<em><b>url</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>url</b></em>' feature
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the '{@link TwitterPlace#getUrl() <em>url</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newUrl
	 *            the new value of the '{@link TwitterPlace#getUrl() url}'
	 *            feature.
	 * @generated
	 */
	public void setUrl(String newUrl) {
		url = newUrl;
	}

	/**
	 * Returns the value of '<em><b>fullName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fullName</b></em>' feature
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Sets the '{@link TwitterPlace#getFullName() <em>fullName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFullName
	 *            the new value of the '{@link TwitterPlace#getFullName()
	 *            fullName}' feature.
	 * @generated
	 */
	public void setFullName(String newFullName) {
		fullName = newFullName;
	}

	/**
	 * Returns the value of '<em><b>boundingBoxType</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>boundingBoxType</b></em>' feature
	 * @generated
	 */
	public String getBoundingBoxType() {
		return boundingBoxType;
	}

	/**
	 * Sets the '{@link TwitterPlace#getBoundingBoxType()
	 * <em>boundingBoxType</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBoundingBoxType
	 *            the new value of the '
	 *            {@link TwitterPlace#getBoundingBoxType() boundingBoxType}'
	 *            feature.
	 * @generated
	 */
	public void setBoundingBoxType(String newBoundingBoxType) {
		boundingBoxType = newBoundingBoxType;
	}

	/**
	 * Returns the value of '<em><b>geometryType</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>geometryType</b></em>' feature
	 * @generated
	 */
	public String getGeometryType() {
		return geometryType;
	}

	/**
	 * Sets the '{@link TwitterPlace#getGeometryType() <em>geometryType</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newGeometryType
	 *            the new value of the '{@link TwitterPlace#getGeometryType()
	 *            geometryType}' feature.
	 * @generated
	 */
	public void setGeometryType(String newGeometryType) {
		geometryType = newGeometryType;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "TwitterPlace " + " [id: " + getId() + "]" + " [name: "
				+ getName() + "]" + " [streetAddress: " + getStreetAddress()
				+ "]" + " [countryCode: " + getCountryCode() + "]"
				+ " [country: " + getCountry() + "]" + " [placeType: "
				+ getPlaceType() + "]" + " [url: " + getUrl() + "]"
				+ " [fullName: " + getFullName() + "]" + " [boundingBoxType: "
				+ getBoundingBoxType() + "]" + " [geometryType: "
				+ getGeometryType() + "]";
	}
}
