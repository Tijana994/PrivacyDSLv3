/**
 */
package privacyModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.PolicyStatement#getWhen <em>When</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getWho <em>Who</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getWhy <em>Why</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getWhat <em>What</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getHow <em>How</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getWhose <em>Whose</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getWhom <em>Whom</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getWhere <em>Where</em>}</li>
 *   <li>{@link privacyModel.PolicyStatement#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getPolicyStatement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WhomShouldBeDefinedForTransfer'"
 * @generated
 */
public interface PolicyStatement extends NotificationInfo {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(AbstractTime)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_When()
	 * @model containment="true"
	 *        extendedMetaData="name='when'"
	 * @generated
	 */
	AbstractTime getWhen();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(AbstractTime value);

	/**
	 * Returns the value of the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' reference.
	 * @see #setWho(Principal)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_Who()
	 * @model required="true"
	 * @generated
	 */
	Principal getWho();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getWho <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Principal value);

	/**
	 * Returns the value of the '<em><b>Why</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Why</em>' containment reference.
	 * @see #setWhy(Purpose)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_Why()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Purpose getWhy();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getWhy <em>Why</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Why</em>' containment reference.
	 * @see #getWhy()
	 * @generated
	 */
	void setWhy(Purpose value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' containment reference.
	 * @see #setWhat(What)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_What()
	 * @model containment="true" required="true"
	 * @generated
	 */
	What getWhat();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getWhat <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' containment reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(What value);

	/**
	 * Returns the value of the '<em><b>How</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How</em>' containment reference.
	 * @see #setHow(How)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_How()
	 * @model containment="true"
	 * @generated
	 */
	How getHow();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getHow <em>How</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How</em>' containment reference.
	 * @see #getHow()
	 * @generated
	 */
	void setHow(How value);

	/**
	 * Returns the value of the '<em><b>Whose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whose</em>' reference.
	 * @see #setWhose(Principal)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_Whose()
	 * @model
	 * @generated
	 */
	Principal getWhose();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getWhose <em>Whose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whose</em>' reference.
	 * @see #getWhose()
	 * @generated
	 */
	void setWhose(Principal value);

	/**
	 * Returns the value of the '<em><b>Whom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whom</em>' reference.
	 * @see #setWhom(Principal)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_Whom()
	 * @model
	 * @generated
	 */
	Principal getWhom();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getWhom <em>Whom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whom</em>' reference.
	 * @see #getWhom()
	 * @generated
	 */
	void setWhom(Principal value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Where)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_Where()
	 * @model containment="true"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);

	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' reference.
	 * @see #setCausedBy(Complaint)
	 * @see privacyModel.PrivacyModelPackage#getPolicyStatement_CausedBy()
	 * @model
	 * @generated
	 */
	Complaint getCausedBy();

	/**
	 * Sets the value of the '{@link privacyModel.PolicyStatement#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(Complaint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" actionTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t\tif(self.what = null) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.what.actions-&gt;exists(act| act = actionType)) then\n\t\t\t\t\t\t\tnot(self.when = null)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean dateShouldBeDefinedForType(Action actionType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" actionTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t\tif(self.what = null) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.what.actions-&gt;exists(act| act = actionType)) then\n\t\t\t\t\t\t\tnot(self.causedBy = null)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean causedByShouldBeDefinedForType(Action actionType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" documentTypeRequired="true" processingReasonRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t\tif(self.what.actions-&gt;exists(act| act = Action::Collecting)) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.why.processingReason = processingReason) then\n\t\t\t\t\t\t not(self.how = null) and self.how.documents-&gt;exists(doc| doc.documentType = documentType)\n\t\t\t\t\t\telse\n\t\t\t\t\t\tself.why.subPurposes-&gt;forAll(purpose|\n\t\t\t\t\t\t\tif(purpose.processingReason = processingReason)then\n\t\t\t\t\t\t\t\tnot(self.how = null) and self.how.documents-&gt;exists(doc| doc.documentType = documentType)\n\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean documentIsNeededForPurpose(DocumentType documentType, ProcessingReason processingReason);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art15\',\n\tstatus : Boolean = \n\t\t\tif(self.what.actions-&gt;exists(action| action = Action::Transfer) and not(self.where.destination = null) and self.where.destination.isEUMember = false) then\n\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.type = NotificationType::ThirdPartyTransfer \n\t\t\t\t\t\tand notification.causedBy = self\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutTransferToThirdCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(what.actions-&gt;exists(action| action = Action::Rectification)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.causedBy = self and\n\t\t\t\t\t\tnotification.type = NotificationType::ExecutedRectification\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutExecutedRectification(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tif(what.actions-&gt;exists(action| action = Action::StopProcessing)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.type = NotificationType::StopProcessing and \n\t\t\t\t\t\tnotification.causedBy = self\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutStopProcessing(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject)\n}.status'"
	 * @generated
	 */
	boolean ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions-&gt;exists(action| action = Action::Collecting)) or \n\t\t\t\t(what.datas-&gt;exists(data| data.collectedFromSubject = false) and self.what.actions-&gt;exists(action| action = Action::Collecting))\n\t\t\t) then\n\t\t\t\ttrue\n\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age &lt; PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons-&gt;exists(person| self.how.consent.providedBy = person)\n\t\t\telse \n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons-&gt;exists(person| self.how.consent.providedBy = person))\n\t\t\tendif\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean MissingConsentForCollecting(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or self.what.actions-&gt;exists(act| act = Action::Collecting or act = Action::StopProcessing)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\t\tself.what.datas-&gt;forAll(data |\n\t\t\t\t\tlet statements = privacyPolicy.policyStatements-&gt;select(st| \n\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions-&gt;exists(act| act = Action::Collecting) and st.what.datas-&gt;exists(d| d = data))\n\t\t\t\t\t\tin \n\t\t\t\t\t\tif(statements-&gt;isEmpty()) then \n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tstatements -&gt; exists(st|\n\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n\t\t\t\t\t\t\t\t\tif(self.why = null \n\t\t\t\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n\t\t\t\t\t\t\t\t\t\t\treasons-&gt;includes(self.why.processingReason) or self.why.subPurposes-&gt;exists(subpurpose| reasons-&gt;includes(subpurpose)\n\t\t\t\t\t\t\t\t\t)) then\n\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\tnot(privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate)) and\n\t\t\t\t\t\t\t\t\t\t(st.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)))\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t)\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ExpiredConsent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif(not(self.what.actions-&gt;exists(act| act = Action::StopProcessing))) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tself.why.processingReason = ProcessingReason::StopProcessing\n\t\t\tendif'"
	 * @generated
	 */
	boolean StopProcessingPurposeForActionStopProcessing(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art7\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or self.what.actions-&gt;exists(act| act = Action::Collecting)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\t\tself.what.datas-&gt;forAll(data|\n\t\t\t\t\tlet statements = privacyPolicy.policyStatements-&gt;select(st: PolicyStatement| \n\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions-&gt;exists(act| act = Action::Collecting) and st.what.datas-&gt;exists(d| d = data))\n\t\t\t\t\t\tin \n\t\t\t\t\t\tif(statements-&gt;isEmpty()) then \n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tstatements -&gt; forAll(st|\n\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n\t\t\t\t\t\t\t\t\tif(self.why = null \n\t\t\t\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t\t\t\tlet reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n\t\t\t\t\t\t\t\t\t\t\treasons-&gt;includes(self.why.processingReason) or self.why.subPurposes-&gt;exists(subpurpose| reasons-&gt;includes(subpurpose)\n\t\t\t\t\t\t\t\t\t)) then\n\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\tnot(privacyPolicy.allComplaints-&gt;exists(complaint| complaint.action.oclIsTypeOf(Withdraw) and \n\t\t\t\t\t\t\t\t\t\t\tlet withdrawal: Withdraw = complaint.action.oclAsType(Withdraw) in\n\t\t\t\t\t\t\t\t\t\t\t\twithdrawal.subject = st.how.consent\n\t\t\t\t\t\t\t\t\t\t\t\tand (privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) \n\t\t\t\t\t\t\t\t\t\t\t\tor privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when))\n\t\t\t\t\t\t\t\t\t\t\tand not(privacyPolicy.policyStatements-&gt;exists(stopStatement| \n\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.what.actions-&gt;exists(act| act = Action::StopProcessing) and \n\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.what.datas-&gt;exists(d| d = data) and not(stopStatement.causedBy = null) and \n\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.causedBy.action= withdrawal))\n\t\t\t\t\t\t\t\t\t\t))\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t)\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean WithdrawedConsent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tif(self.what.actions-&gt;exists(action | action = Action::StopProcessing)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tself.what.datas-&gt;forAll(data| \n\t\t\t\tlet dataTypes  = Sequence{DataType::Biometric, DataType::Genetic, DataType::PoliticalOpinion, \n\t\t\t\t\tDataType::RacialOrEthnicOrigin, DataType::SexLife, DataType::Religic, DataType::Judical\n\t\t\t\t} in\n\t\t\t\tif(dataTypes-&gt;includes(data.privacydata.type)) then\n\t\t\t\t\t((not(self.how = null) and not(self.how.consent = null))\n\t\t\t\t\t\tor\n\t\t\t\t\t(not(self.why = null) and\n\t\t\t\t\tlet reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,\n\t\t\t\t\t\tProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::Research, ProcessingReason::PublicHealth\n\t\t\t\t\t} in\n\t\t\t\t\t\treasons-&gt;includes(self.why.processingReason) or (not(self.why.subPurposes = null) and self.why.subPurposes-&gt;exists(subpurpose| reasons-&gt;includes(subpurpose)\n\t\t\t\t\t))))\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\t)\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ProcessingOfSpecialCategories(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art14\',\n\tstatus : Boolean = \n\t\t\tif(self.what.actions-&gt;exists(action| action = Action::Collecting) and self.what.datas-&gt;exists(data| data.collectedFromSubject = false)) then\n\t\t\t\tif(not(self.why = null) and \n\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::None}) or\n\t\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Research,Sequence{ProcessingReasonSubtype::Statistical, \n\t\t\t\t\t\tProcessingReasonSubtype::Historical,ProcessingReasonSubtype::Scientific}))\n\t\t\t\t)then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.type = NotificationType::DataCollecting \n\t\t\t\t\t\tand notification.causedBy = self\n\t\t\t\t\t)\n\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutCollecting(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Date shoud be defined\',\n\tstatus : Boolean = \n\t\t\tdateShouldBeDefinedForType(Action::Store)\n}.status'"
	 * @generated
	 */
	boolean DateShoudBeDefinedForStoreAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tdocumentIsNeededForPurpose(DocumentType::CourtApproval,ProcessingReason::PublicInterest)\n}.status'"
	 * @generated
	 */
	boolean CourtApprovalIsNeedForPublicInterestPurpose(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::LegitimateInterests)\n}.status'"
	 * @generated
	 */
	boolean ControllerApprovalIsNeedForLegitimateInterestsPurpose(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Date shoud be defined\',\n\tstatus : Boolean = \n\t\t\tdateShouldBeDefinedForType(Action::Access)\n}.status'"
	 * @generated
	 */
	boolean DateShoudBeDefinedForAccessAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions-&gt;exists(act| act = Action::Collecting)) or self.how = null or self.how.consent = null) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\t\tif(self.why = null \n\t\t\t\t\tor \n\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n\t\t\t\t\t\treasons-&gt;includes(self.why.processingReason) or self.why.subPurposes-&gt;exists(subpurpose| reasons-&gt;includes(subpurpose)\n\t\t\t\t)) then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, self.how.consent.startDate) or\n\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.startDate))\n\t\t\t\t\tand\n\t\t\t\t\t(self.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.terminationDate)))\n\t\t\t\tendif\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ExpiredConsentForCollecting(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tcausedByShouldBeDefinedForType(Action::StopProcessing)\n}.status'"
	 * @generated
	 */
	boolean CausedByShouldBeDefinedForStopProcessingAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art8\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions-&gt;exists(action| action = Action::Collecting))) then\n\t\t\t\ttrue\n\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age &lt; PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tif(self.how = null or self.whose.responsiblePersons-&gt;isEmpty() or self.how.documents-&gt;isEmpty() or \n\t\t\t\t\tnot(self.how.documents-&gt;exists(document| document.documentType = DocumentType::ChildCustody and self.whose.responsiblePersons-&gt;exists(p|p=document.providedBy)))\n\t\t\t\t) then \n\t\t\t\t\tfalse\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Arts 44-50\',\n\tstatus : Boolean = \n\t\t\tif(not(self.what.actions-&gt;exists(action| action = Action::Transfer))or self.where = null or self.where.destination = null or self.where.destination.isEUMember = true) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tif((not(self.where.destination = null)) and self.where.destination.isEUMember = false) then\n\t\t\t\t\t(not(self.how = null) and (self.how.documents-&gt;exists(doc| doc.documentType = DocumentType::TransferCertificate) or (not(self.how = null) and not(self.how.consent = null)))) or\n\t\t\t\t\t(not(self.why = null) and \n\t\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}) or\n\t\t\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,Sequence{ProcessingReasonSubtype::PhisicallyIncapable, \n\t\t\t\t\t\t\tProcessingReasonSubtype::Other,ProcessingReasonSubtype::None})))\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean MissingConsentOrTransferCertificate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or self.what.actions-&gt;exists(act| act = Action::Collecting or act = Action::StopProcessing)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\t\tself.what.datas-&gt;forAll(data|\n\t\t\t\t\tlet statements = privacyPolicy.policyStatements-&gt;select(st| \n\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose  \n\t\t\t\t\t\tand st.what.actions-&gt;exists(act| act = Action::Collecting) and st.what.datas-&gt;exists(d| d = data))\n\t\t\t\t\t\tin \n\t\t\t\t\t\tif(statements-&gt;isEmpty()) then \n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tstatements -&gt; forAll(st|\n\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n\t\t\t\t\t\t\t\t\tif(self.why = null) then\n\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\t(not(st.whom = null) and (self.who.equals(st.whom) or st.whom.subPrincipals-&gt;exists(subprincipal| subprincipal = self.who)) \n\t\t\t\t\t\t\t\t\t\tor self.who.equals(st.who) or privacyPolicy.owner.subPrincipals-&gt;exists(subprincipal| subprincipal = self.who))\n\t\t\t\t\t\t\t\t\t\tand (st.why.isValid(self.why) \n\t\t\t\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::PublicHealth} in\n\t\t\t\t\t\t\t\t\t\t\treasons-&gt;includes(self.why.processingReason) or self.why.subPurposes-&gt;exists(subpurpose| reasons-&gt;includes(subpurpose))\n\t\t\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t)\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean UndefinedPurposeForAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art16\',\n\tstatus : Boolean = \n\t\t\tcausedByShouldBeDefinedForType(Action::Rectification)\n}.status'"
	 * @generated
	 */
	boolean CausedByShouldBeDefinedForRectificationAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif(self.how = null or not(self.how.documents-&gt;notEmpty())) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first() in\n\t\t\t\tself.how.documents-&gt;forAll(document|\n\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, document.startDate) or \n\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.startDate))\n\t\t\t\t\tand\n\t\t\t\t\t(document.terminationDate = null or (not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.terminationDate))))\n\t\t\t\t)\n\t\t\tendif'"
	 * @generated
	 */
	boolean ExpiredDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art20\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions-&gt;exists(action| action = Action::Transfer)) or self.where = null or self.where.destination = null or self.where.destination.isEUMember = false) then\n\t\t\t\ttrue\n\t\t\telse if(self.whose.type= PrincipalType::NaturalPerson and self.whose.age &lt; PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons-&gt;exists(person| self.how.consent.providedBy)\n\t\t\telse \n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons-&gt;exists(person| self.how.consent.providedBy))\n\t\t\tendif\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean MissingConsentForTransfer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art17\',\n\tstatus : Boolean = \n\t\t\tcausedByShouldBeDefinedForType(Action::Erasure)\n}.status'"
	 * @generated
	 */
	boolean CausedByShouldBeDefinedForErasureAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(what.actions-&gt;exists(action| action = Action::Erasure)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().notifications-&gt;exists(notification| notification.causedBy = self and\n\t\t\t\t\t\tnotification.type = NotificationType::ExecutedErasure\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean SubjectShouldBeNotifiedAboutExecutedErasure(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Based on Art20\',\n\tstatus : Boolean = \n\t\t\tif(what.actions-&gt;exists(action| action = Action::Transfer)) then\n\t\t\t\t\tnot(self.whom = null)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean WhomShouldBeDefinedForTransfer(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PolicyStatement
