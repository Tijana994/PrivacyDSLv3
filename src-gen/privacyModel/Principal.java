/**
 */
package privacyModel;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Principal#getSubPrincipals <em>Sub Principals</em>}</li>
 *   <li>{@link privacyModel.Principal#getType <em>Type</em>}</li>
 *   <li>{@link privacyModel.Principal#getScope <em>Scope</em>}</li>
 *   <li>{@link privacyModel.Principal#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link privacyModel.Principal#getInhabits <em>Inhabits</em>}</li>
 *   <li>{@link privacyModel.Principal#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link privacyModel.Principal#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getPrincipal()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='JuvenileShouldHaveResponsiblePerson'"
 * @generated
 */
public interface Principal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Principals</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Principals</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrincipal_SubPrincipals()
	 * @model
	 * @generated
	 */
	EList<Principal> getSubPrincipals();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.PrincipalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacyModel.PrincipalType
	 * @see #setType(PrincipalType)
	 * @see privacyModel.PrivacyModelPackage#getPrincipal_Type()
	 * @model required="true"
	 * @generated
	 */
	PrincipalType getType();

	/**
	 * Sets the value of the '{@link privacyModel.Principal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacyModel.PrincipalType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrincipalType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.PrincipalScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see privacyModel.PrincipalScope
	 * @see #setScope(PrincipalScope)
	 * @see privacyModel.PrivacyModelPackage#getPrincipal_Scope()
	 * @model required="true"
	 * @generated
	 */
	PrincipalScope getScope();

	/**
	 * Sets the value of the '{@link privacyModel.Principal#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see privacyModel.PrincipalScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(PrincipalScope value);

	/**
	 * Returns the value of the '<em><b>Responsible Persons</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Persons</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrincipal_ResponsiblePersons()
	 * @model
	 * @generated
	 */
	EList<Principal> getResponsiblePersons();

	/**
	 * Returns the value of the '<em><b>Inhabits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhabits</em>' reference.
	 * @see #setInhabits(Location)
	 * @see privacyModel.PrivacyModelPackage#getPrincipal_Inhabits()
	 * @model
	 * @generated
	 */
	Location getInhabits();

	/**
	 * Sets the value of the '{@link privacyModel.Principal#getInhabits <em>Inhabits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhabits</em>' reference.
	 * @see #getInhabits()
	 * @generated
	 */
	void setInhabits(Location value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see privacyModel.PrivacyModelPackage#getPrincipal_Birthdate()
	 * @model
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link privacyModel.Principal#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see privacyModel.PrivacyModelPackage#getPrincipal_Age()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link privacyModel.Principal#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if(self = null) then\n\t\t\t\t\tfalse\n\t\t\t\telse\n\t\t\t\t\tself = observed or self.subPrincipals-&gt;exists(principal| principal = observed)\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean equals(Principal observed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif(self.type = PrincipalType::NaturalPerson) then\n\t\t\t\tself.subPrincipals-&gt;isEmpty()\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif'"
	 * @generated
	 */
	boolean NaturalPersonCanNotConatainsSubPrincipals(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art8\',\n\tstatus : Boolean = \n\t\tif(self.type = PrincipalType::NaturalPerson and self.age &lt; PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tnot(self.responsiblePersons-&gt;isEmpty())\n\t\t\telse\n\t\t\t\ttrue\n\t\tendif\n}.status'"
	 * @generated
	 */
	boolean JuvenileShouldHaveResponsiblePerson(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Principal
