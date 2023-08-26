/**
 */
package privacyModel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.AbstractPaper#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link privacyModel.AbstractPaper#getTerminationExplanation <em>Termination Explanation</em>}</li>
 *   <li>{@link privacyModel.AbstractPaper#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link privacyModel.AbstractPaper#getTerminationDate <em>Termination Date</em>}</li>
 *   <li>{@link privacyModel.AbstractPaper#getLocation <em>Location</em>}</li>
 *   <li>{@link privacyModel.AbstractPaper#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getAbstractPaper()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StartDateShouldBeBeforeTerminationDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StartDateShouldBeBeforeTerminationDate='Tuple {\n\tmessage : String = \'Terminationdate is after startdate!\',\n\tstatus : Boolean = \n\t\t\tself.terminationDate = null or (not(self.startDate &gt; self.terminationDate))\n}.status'"
 * @generated
 */
public interface AbstractPaper extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By</em>' reference.
	 * @see #setProvidedBy(Principal)
	 * @see privacyModel.PrivacyModelPackage#getAbstractPaper_ProvidedBy()
	 * @model required="true"
	 * @generated
	 */
	Principal getProvidedBy();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractPaper#getProvidedBy <em>Provided By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided By</em>' reference.
	 * @see #getProvidedBy()
	 * @generated
	 */
	void setProvidedBy(Principal value);

	/**
	 * Returns the value of the '<em><b>Termination Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Explanation</em>' attribute.
	 * @see #setTerminationExplanation(String)
	 * @see privacyModel.PrivacyModelPackage#getAbstractPaper_TerminationExplanation()
	 * @model
	 * @generated
	 */
	String getTerminationExplanation();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractPaper#getTerminationExplanation <em>Termination Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Explanation</em>' attribute.
	 * @see #getTerminationExplanation()
	 * @generated
	 */
	void setTerminationExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see privacyModel.PrivacyModelPackage#getAbstractPaper_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractPaper#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Date</em>' attribute.
	 * @see #setTerminationDate(Date)
	 * @see privacyModel.PrivacyModelPackage#getAbstractPaper_TerminationDate()
	 * @model
	 * @generated
	 */
	Date getTerminationDate();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractPaper#getTerminationDate <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Date</em>' attribute.
	 * @see #getTerminationDate()
	 * @generated
	 */
	void setTerminationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see privacyModel.PrivacyModelPackage#getAbstractPaper_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractPaper#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see privacyModel.PrivacyModelPackage#getAbstractPaper_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractPaper#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // AbstractPaper
