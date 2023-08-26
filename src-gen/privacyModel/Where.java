/**
 */
package privacyModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Where#getSource <em>Source</em>}</li>
 *   <li>{@link privacyModel.Where#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Location)
	 * @see privacyModel.PrivacyModelPackage#getWhere_Source()
	 * @model
	 * @generated
	 */
	Location getSource();

	/**
	 * Sets the value of the '{@link privacyModel.Where#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Location value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Location)
	 * @see privacyModel.PrivacyModelPackage#getWhere_Destination()
	 * @model
	 * @generated
	 */
	Location getDestination();

	/**
	 * Sets the value of the '{@link privacyModel.Where#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Location value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" observedRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t\tif(self.source = null) then\n\t\t\t\t\t\tif(self.destination = null) then\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(observed.destination = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tself.destination.equals(observed.destination)\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\t\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.destination = null) then\n\t\t\t\t\t\t\tif(observed.source = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tself.source.equals(observed.source)\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(observed.destination = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tif(observed.source = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tself.source.equals(observed.source) and self.destination.equals(observed.destination)\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean equals(Where observed);

} // Where
