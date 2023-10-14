/**
 */
package privacyModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.TimeInterval#getStart <em>Start</em>}</li>
 *   <li>{@link privacyModel.TimeInterval#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getTimeInterval()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtTypeShouldBeDefinedAlone'"
 * @generated
 */
public interface TimeInterval extends AbstractTime {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(TimeStatement)
	 * @see privacyModel.PrivacyModelPackage#getTimeInterval_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeStatement getStart();

	/**
	 * Sets the value of the '{@link privacyModel.TimeInterval#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(TimeStatement value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(TimeStatement)
	 * @see privacyModel.PrivacyModelPackage#getTimeInterval_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeStatement getEnd();

	/**
	 * Sets the value of the '{@link privacyModel.TimeInterval#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TimeStatement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" firstPrepositionTypeRequired="true" secondPrepositionTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif(self.start.preposition = firstPrepositionType) then\n\t\t\t\t\tself.end.preposition = secondPrepositionType\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isTypeDefinedWithOtherType(TimePreposition firstPrepositionType, TimePreposition secondPrepositionType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" prepositionTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t\tif(self.start.preposition = prepositionType or self.end.preposition = prepositionType) then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse \n\t\t\t\t\t\ttrue\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean isTypeForbidden(TimePreposition prepositionType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" firstPrepositionTypeRequired="true" secondPrepositionTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t\tif(self.start.preposition = firstPrepositionType and self.end.preposition = secondPrepositionType) then\n\t\t\t\t\t\tself.start.dateTime &lt; self.end.dateTime\n\t\t\t\t\telse \n\t\t\t\t\t\tif(self.end.preposition = firstPrepositionType and self.start.preposition = secondPrepositionType) then\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean isValid(TimePreposition firstPrepositionType, TimePreposition secondPrepositionType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'After interval should be defined before before interval\',\n\tstatus : Boolean = \n\t\t\tself.isValid(TimePreposition::after, TimePreposition::before)\n}.status'"
	 * @generated
	 */
	boolean AfterStatementBeforeBeforeStatement(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Until statement should be defined alone\',\n\tstatus : Boolean = \n\t\t\tself.isTypeForbidden(TimePreposition::until)\n}.status'"
	 * @generated
	 */
	boolean UntilTypeShouldBeDefinedAlone(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'From interval should be defined before to interval\',\n\tstatus : Boolean = \n\t\t\tself.isValid(TimePreposition::from, TimePreposition::to)\n}.status'"
	 * @generated
	 */
	boolean FromStatementBeforeToStatement(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'From interval should be defined alone or with to interval\',\n\tstatus : Boolean = \n\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::from, TimePreposition::to)\n}.status'"
	 * @generated
	 */
	boolean OnlyFromOrFromWithTo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'After interval should be defined alone or with before interval\',\n\tstatus : Boolean = \n\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::after, TimePreposition::before)\n}.status'"
	 * @generated
	 */
	boolean OnlyAfterOrAfterWithBefore(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'At statement should be defined alone\',\n\tstatus : Boolean = \n\t\t\tself.isTypeForbidden(TimePreposition::at)\n}.status'"
	 * @generated
	 */
	boolean AtTypeShouldBeDefinedAlone(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TimeInterval
