/**
 */
package privacyModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import privacyModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage
 * @generated
 */
public class PrivacyModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrivacyModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PrivacyModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyModelSwitch<Adapter> modelSwitch = new PrivacyModelSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter casePrivacyPolicy(PrivacyPolicy object) {
			return createPrivacyPolicyAdapter();
		}

		@Override
		public Adapter casePolicyStatement(PolicyStatement object) {
			return createPolicyStatementAdapter();
		}

		@Override
		public Adapter casePrivacyData(PrivacyData object) {
			return createPrivacyDataAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseProvider(Provider object) {
			return createProviderAdapter();
		}

		@Override
		public Adapter casePrincipal(Principal object) {
			return createPrincipalAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseAbstractTime(AbstractTime object) {
			return createAbstractTimeAdapter();
		}

		@Override
		public Adapter caseTimeInterval(TimeInterval object) {
			return createTimeIntervalAdapter();
		}

		@Override
		public Adapter caseTimeStatement(TimeStatement object) {
			return createTimeStatementAdapter();
		}

		@Override
		public Adapter casePurpose(Purpose object) {
			return createPurposeAdapter();
		}

		@Override
		public Adapter caseWhat(What object) {
			return createWhatAdapter();
		}

		@Override
		public Adapter caseHow(How object) {
			return createHowAdapter();
		}

		@Override
		public Adapter caseConsent(Consent object) {
			return createConsentAdapter();
		}

		@Override
		public Adapter caseConfigurationManager(ConfigurationManager object) {
			return createConfigurationManagerAdapter();
		}

		@Override
		public Adapter caseComplaint(Complaint object) {
			return createComplaintAdapter();
		}

		@Override
		public Adapter casePrivacyPolicyHelper(PrivacyPolicyHelper object) {
			return createPrivacyPolicyHelperAdapter();
		}

		@Override
		public Adapter caseWhere(Where object) {
			return createWhereAdapter();
		}

		@Override
		public Adapter caseDocument(Document object) {
			return createDocumentAdapter();
		}

		@Override
		public Adapter caseAbstractPaper(AbstractPaper object) {
			return createAbstractPaperAdapter();
		}

		@Override
		public Adapter caseAbstractComplaintAction(AbstractComplaintAction object) {
			return createAbstractComplaintActionAdapter();
		}

		@Override
		public Adapter caseWithdraw(Withdraw object) {
			return createWithdrawAdapter();
		}

		@Override
		public Adapter caseComplaintBasedOnData(ComplaintBasedOnData object) {
			return createComplaintBasedOnDataAdapter();
		}

		@Override
		public Adapter caseSharedPrivacyData(SharedPrivacyData object) {
			return createSharedPrivacyDataAdapter();
		}

		@Override
		public Adapter caseDenial(Denial object) {
			return createDenialAdapter();
		}

		@Override
		public Adapter caseNotification(Notification object) {
			return createNotificationAdapter();
		}

		@Override
		public Adapter caseNotificationInfo(NotificationInfo object) {
			return createNotificationInfoAdapter();
		}

		@Override
		public Adapter caseAbstractComplaint(AbstractComplaint object) {
			return createAbstractComplaintAdapter();
		}

		@Override
		public Adapter caseComplaintBasedOnAction(ComplaintBasedOnAction object) {
			return createComplaintBasedOnActionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.PrivacyPolicy <em>Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.PrivacyPolicy
	 * @generated
	 */
	public Adapter createPrivacyPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.PolicyStatement <em>Policy Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.PolicyStatement
	 * @generated
	 */
	public Adapter createPolicyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.PrivacyData <em>Privacy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.PrivacyData
	 * @generated
	 */
	public Adapter createPrivacyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Principal
	 * @generated
	 */
	public Adapter createPrincipalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.AbstractTime <em>Abstract Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.AbstractTime
	 * @generated
	 */
	public Adapter createAbstractTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.TimeStatement <em>Time Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.TimeStatement
	 * @generated
	 */
	public Adapter createTimeStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Purpose
	 * @generated
	 */
	public Adapter createPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.What
	 * @generated
	 */
	public Adapter createWhatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.How
	 * @generated
	 */
	public Adapter createHowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Consent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Consent
	 * @generated
	 */
	public Adapter createConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.ConfigurationManager <em>Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.ConfigurationManager
	 * @generated
	 */
	public Adapter createConfigurationManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Complaint <em>Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Complaint
	 * @generated
	 */
	public Adapter createComplaintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.PrivacyPolicyHelper <em>Privacy Policy Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.PrivacyPolicyHelper
	 * @generated
	 */
	public Adapter createPrivacyPolicyHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Where
	 * @generated
	 */
	public Adapter createWhereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.AbstractPaper <em>Abstract Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.AbstractPaper
	 * @generated
	 */
	public Adapter createAbstractPaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.AbstractComplaintAction <em>Abstract Complaint Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.AbstractComplaintAction
	 * @generated
	 */
	public Adapter createAbstractComplaintActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Withdraw <em>Withdraw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Withdraw
	 * @generated
	 */
	public Adapter createWithdrawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.ComplaintBasedOnData <em>Complaint Based On Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.ComplaintBasedOnData
	 * @generated
	 */
	public Adapter createComplaintBasedOnDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.SharedPrivacyData <em>Shared Privacy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.SharedPrivacyData
	 * @generated
	 */
	public Adapter createSharedPrivacyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Denial <em>Denial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Denial
	 * @generated
	 */
	public Adapter createDenialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.NotificationInfo <em>Notification Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.NotificationInfo
	 * @generated
	 */
	public Adapter createNotificationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.AbstractComplaint <em>Abstract Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.AbstractComplaint
	 * @generated
	 */
	public Adapter createAbstractComplaintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacyModel.ComplaintBasedOnAction <em>Complaint Based On Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacyModel.ComplaintBasedOnAction
	 * @generated
	 */
	public Adapter createComplaintBasedOnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PrivacyModelAdapterFactory
