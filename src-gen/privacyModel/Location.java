/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Location#isIsEUMember <em>Is EU Member</em>}</li>
 *   <li>{@link privacyModel.Location#getType <em>Type</em>}</li>
 *   <li>{@link privacyModel.Location#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link privacyModel.Location#getLegalAgeLimit <em>Legal Age Limit</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is EU Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is EU Member</em>' attribute.
	 * @see #setIsEUMember(boolean)
	 * @see privacyModel.PrivacyModelPackage#getLocation_IsEUMember()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsEUMember();

	/**
	 * Sets the value of the '{@link privacyModel.Location#isIsEUMember <em>Is EU Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is EU Member</em>' attribute.
	 * @see #isIsEUMember()
	 * @generated
	 */
	void setIsEUMember(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacyModel.LocationType
	 * @see #setType(LocationType)
	 * @see privacyModel.PrivacyModelPackage#getLocation_Type()
	 * @model required="true"
	 * @generated
	 */
	LocationType getType();

	/**
	 * Sets the value of the '{@link privacyModel.Location#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacyModel.LocationType
	 * @see #getType()
	 * @generated
	 */
	void setType(LocationType value);

	/**
	 * Returns the value of the '<em><b>Sub Locations</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Locations</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getLocation_SubLocations()
	 * @model
	 * @generated
	 */
	EList<Location> getSubLocations();

	/**
	 * Returns the value of the '<em><b>Legal Age Limit</b></em>' attribute.
	 * The default value is <code>"16"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Age Limit</em>' attribute.
	 * @see #setLegalAgeLimit(int)
	 * @see privacyModel.PrivacyModelPackage#getLocation_LegalAgeLimit()
	 * @model default="16" required="true"
	 * @generated
	 */
	int getLegalAgeLimit();

	/**
	 * Sets the value of the '{@link privacyModel.Location#getLegalAgeLimit <em>Legal Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Age Limit</em>' attribute.
	 * @see #getLegalAgeLimit()
	 * @generated
	 */
	void setLegalAgeLimit(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if(self = observed) then\n\t\t\t\t\t\ttrue\n\t\t\t\t  else \n\t\t\t\t  \tself.subLocations-&gt;notEmpty() and self.subLocations-&gt;exists(s| s.equals(observed))\n\t\t\t\t  endif'"
	 * @generated
	 */
	boolean equals(Location observed);

} // Location
