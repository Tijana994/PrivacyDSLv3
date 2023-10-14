/**
 */
package privacyModel;

import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complaint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Complaint#getWho <em>Who</em>}</li>
 *   <li>{@link privacyModel.Complaint#getWhen <em>When</em>}</li>
 *   <li>{@link privacyModel.Complaint#getReason <em>Reason</em>}</li>
 *   <li>{@link privacyModel.Complaint#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getComplaint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SubjectShouldBeNotifiedAboutExistingComplaintForRectification'"
 * @generated
 */
public interface Complaint extends NotificationInfo {
	/**
	 * Returns the value of the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' reference.
	 * @see #setWho(Principal)
	 * @see privacyModel.PrivacyModelPackage#getComplaint_Who()
	 * @model required="true"
	 * @generated
	 */
	Principal getWho();

	/**
	 * Sets the value of the '{@link privacyModel.Complaint#getWho <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Principal value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(Date)
	 * @see privacyModel.PrivacyModelPackage#getComplaint_When()
	 * @model required="true"
	 * @generated
	 */
	Date getWhen();

	/**
	 * Sets the value of the '{@link privacyModel.Complaint#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Date value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see privacyModel.PrivacyModelPackage#getComplaint_Reason()
	 * @model
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link privacyModel.Complaint#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AbstractComplaintAction)
	 * @see privacyModel.PrivacyModelPackage#getComplaint_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractComplaintAction getAction();

	/**
	 * Sets the value of the '{@link privacyModel.Complaint#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AbstractComplaintAction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" actionTypeRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\t\t \t\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnData))) then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\tif(basedOnData.type = type) then\n\t\t\t\t\tif(not(basedOnData.denialReason = null) or not(basedOnData.status = ComplaintStatus::Pending)) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\tbasedOnData.subject-&gt;forAll(data: PrivacyData|\n\t\t\t\t\t\tprivacyPolicy.policyStatements-&gt;exists(stmt| stmt.what.actions-&gt;exists(action| action = actionType) and \n\t\t\t\t\t\t\tnot(stmt.whose = null) and stmt.whose = self.who and privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) \n\t\t\t\t\t\t\tand stmt.what.datas-&gt;exists(selectedData| selectedData.privacydata = data) and not(stmt.causedBy = null) and stmt.causedBy = self)\n\t\t\t\t\t)\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\t  endif'"
	 * @generated
	 */
	boolean doesPolicyStatementExists(Action actionType, ComplaintBasedOnDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art11\',\n\tstatus : Boolean = \n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnData))) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\tbasedOnData.subject-&gt;forAll(data: PrivacyData|\n\t\t\t\t\tprivacyPolicy.policyStatements-&gt;exists(stmt| stmt.what.actions-&gt;exists(action| action = Action::Collecting) and \n\t\t\t\t\t\tnot(stmt.whose = null) and (stmt.whose = self.who or stmt.whose.responsiblePersons-&gt;exists(rp| rp = self.who))\n\t\t\t\t\t\tand privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) \n\t\t\t\t\t\tand stmt.what.datas-&gt;exists(selectedData| selectedData.privacydata = data)\n\t\t\t\t\t)\n\t\t\t\t)\n\t\t  endif\n}.status'"
	 * @generated
	 */
	boolean CannotIdentifyDataFromComplaint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n\t\t\t\t\tif(not(basedOnAction.denialReason = null)) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tprivacyPolicy.policyStatements-&gt;exists(stmt| stmt.what.actions-&gt;exists(action| action = Action::StopProcessing) and \n\t\t\t\t\t\t\tnot(stmt.causedBy = null) and stmt.causedBy = self)\n\t\t\t\t\tendif\n\t\t\t  endif\n}.status'"
	 * @generated
	 */
	boolean StopProcessingShouldBeExecutedAsSoonAsPossible(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art7\',\n\tstatus : Boolean = \n\t\t\tif(not(self.action.oclIsKindOf(Withdraw))) then\n\t\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tlet withdraw : Withdraw = self.action.oclAsType(Withdraw) in\n\t\t\t\t\tself.who = withdraw.subject.providedBy or  withdraw.subject.providedBy.responsiblePersons-&gt;exists(rp| rp = self.who)\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean UserDoesntHavePermissionToWithdrawConsent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art17\',\n\tstatus : Boolean = \n\t\t\tdoesPolicyStatementExists(Action::Erasure,ComplaintBasedOnDataType::Erasure)\n}.status'"
	 * @generated
	 */
	boolean ErasureShouldBeExecutedAsSoonAsPossible(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Erasure)then\n\t\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.causedBy = self and\n\t\t\t\t\t\t\tnotification.type = NotificationType::Erasure\n\t\t\t\t\t\t)\n\t\t\t\t\telse\n\t\t\t\t\t\ttrue\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutExistingComplaintForErasure(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art16\',\n\tstatus : Boolean = \n\t\t\tdoesPolicyStatementExists(Action::Rectification,ComplaintBasedOnDataType::Rectification)\n}.status'"
	 * @generated
	 */
	boolean RectificationShouldBeExecutedAsSoonAsPossible(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n\t\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n\t\t\t\tif(basedOnAction.statement.why = null or not(basedOnAction.denialReason = null)) then\n\t\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\t(not(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,\n\t\t\t\t\tSequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}))) \n\t\t\t\t\tand\n\t\t\t\t\t(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Marketing,Sequence{ProcessingReasonSubtype::None})\n\t\t\t\t\tor\n\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Profiling,Sequence{ProcessingReasonSubtype::None}))\n\t\t\t\tendif\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean InvalidTypeOfPurposeForAnObject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n\t\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n\t\t\t\t\tnot(basedOnAction.statement.whose = null) \n\t\t\t\t\tand \n\t\t\t\t\t(basedOnAction.statement.whose = self.who or basedOnAction.statement.whose.responsiblePersons-&gt;exists(rp| rp = self.who))\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean UserDoesntHavePermissionToComplaint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(self.action.oclIsKindOf(Withdraw)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.causedBy = self and \n\t\t\t\t\t\tnotification.type = NotificationType::Withdraw\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutWithdraw(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Rectification)then\n\t\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.causedBy = self and\n\t\t\t\t\t\t\tnotification.type = NotificationType::Rectification\n\t\t\t\t\t\t)\n\t\t\t\t\telse\n\t\t\t\t\t\ttrue\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutExistingComplaintForRectification(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Complaint
