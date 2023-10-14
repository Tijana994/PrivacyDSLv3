/**
 */
package privacyModel;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Notification#getType <em>Type</em>}</li>
 *   <li>{@link privacyModel.Notification#getNotifiers <em>Notifiers</em>}</li>
 *   <li>{@link privacyModel.Notification#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link privacyModel.Notification#getCausedBy <em>Caused By</em>}</li>
 *   <li>{@link privacyModel.Notification#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getNotification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ShouldDefineCausedByAsRectification'"
 * @generated
 */
public interface Notification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.NotificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacyModel.NotificationType
	 * @see #setType(NotificationType)
	 * @see privacyModel.PrivacyModelPackage#getNotification_Type()
	 * @model required="true"
	 * @generated
	 */
	NotificationType getType();

	/**
	 * Sets the value of the '{@link privacyModel.Notification#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacyModel.NotificationType
	 * @see #getType()
	 * @generated
	 */
	void setType(NotificationType value);

	/**
	 * Returns the value of the '<em><b>Notifiers</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifiers</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getNotification_Notifiers()
	 * @model required="true"
	 * @generated
	 */
	EList<Principal> getNotifiers();

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getNotification_Receivers()
	 * @model required="true"
	 * @generated
	 */
	EList<Principal> getReceivers();

	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' reference.
	 * @see #setCausedBy(NotificationInfo)
	 * @see privacyModel.PrivacyModelPackage#getNotification_CausedBy()
	 * @model required="true"
	 * @generated
	 */
	NotificationInfo getCausedBy();

	/**
	 * Sets the value of the '{@link privacyModel.Notification#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(NotificationInfo value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(Date)
	 * @see privacyModel.PrivacyModelPackage#getNotification_When()
	 * @model required="true"
	 * @generated
	 */
	Date getWhen();

	/**
	 * Sets the value of the '{@link privacyModel.Notification#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'NotifyAboutErasure should contain causedBy with complaint Erasure\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::Erasure) then\n\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Erasure\n\t\t\t\t\telse\n\t\t\t\t\t\tfalse\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ShouldDefineCausedByAsErasure(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'NotifyAboutCollecting or StopProcessing should contain causedBy with policy statement\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::DataCollecting or type = NotificationType::StopProcessing \n\t\t\t\tor type = NotificationType::ExecutedRectification or type = NotificationType::ExecutedErasure\n\t\t\t) then\n\t\t\t\tcausedBy.oclIsKindOf(PolicyStatement)\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ShouldDefineCausedByAsPrivacyPolicy(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'NotifyAboutWithdraw should contain causedBy with complaint Withraw\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::Withdraw) then\n\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n\t\t\t\t\tcomplaint.action.oclIsKindOf(Withdraw)\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ShouldDefineCausedByAsWithdraw(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'NotifyAboutRectification should contain causedBy with complaint Rectification\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::Rectification) then\n\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Rectification\n\t\t\t\t\telse\n\t\t\t\t\t\tfalse\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ShouldDefineCausedByAsRectification(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Notification
