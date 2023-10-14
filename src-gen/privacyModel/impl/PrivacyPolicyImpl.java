/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import privacyModel.Complaint;
import privacyModel.ConfigurationManager;
import privacyModel.Consent;
import privacyModel.Denial;
import privacyModel.Document;
import privacyModel.Location;
import privacyModel.Notification;
import privacyModel.PolicyStatement;
import privacyModel.Principal;
import privacyModel.PrivacyData;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyPolicy;
import privacyModel.PrivacyPolicyHelper;
import privacyModel.Provider;
import privacyModel.Service;
import privacyModel.SharedPrivacyData;
import privacyModel.util.PrivacyModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getPolicyStatements <em>Policy Statements</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllPrincipals <em>All Principals</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getDefaultProtectionControls <em>Default Protection Controls</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllServices <em>All Services</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllProviders <em>All Providers</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getConfigurationManager <em>Configuration Manager</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllDatas <em>All Datas</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllComplaints <em>All Complaints</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getPrivacyPolicyHelper <em>Privacy Policy Helper</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllDenials <em>All Denials</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllConsents <em>All Consents</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllDocuments <em>All Documents</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getNotifications <em>Notifications</em>}</li>
 *   <li>{@link privacyModel.impl.PrivacyPolicyImpl#getAllSharedPrivacyData <em>All Shared Privacy Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivacyPolicyImpl extends NamedElementImpl implements PrivacyPolicy {
	/**
	 * The cached value of the '{@link #getPolicyStatements() <em>Policy Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyStatement> policyStatements;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Principal owner;

	/**
	 * The cached value of the '{@link #getAllPrincipals() <em>All Principals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllPrincipals()
	 * @generated
	 * @ordered
	 */
	protected EList<Principal> allPrincipals;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getDefaultProtectionControls() <em>Default Protection Controls</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProtectionControls()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultProtectionControls;

	/**
	 * The cached value of the '{@link #getAllServices() <em>All Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> allServices;

	/**
	 * The cached value of the '{@link #getAllProviders() <em>All Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> allProviders;

	/**
	 * The cached value of the '{@link #getConfigurationManager() <em>Configuration Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationManager()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationManager configurationManager;

	/**
	 * The cached value of the '{@link #getAllDatas() <em>All Datas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<PrivacyData> allDatas;

	/**
	 * The cached value of the '{@link #getAllComplaints() <em>All Complaints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllComplaints()
	 * @generated
	 * @ordered
	 */
	protected EList<Complaint> allComplaints;

	/**
	 * The cached value of the '{@link #getPrivacyPolicyHelper() <em>Privacy Policy Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyPolicyHelper()
	 * @generated
	 * @ordered
	 */
	protected PrivacyPolicyHelper privacyPolicyHelper;

	/**
	 * The cached value of the '{@link #getAllDenials() <em>All Denials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDenials()
	 * @generated
	 * @ordered
	 */
	protected EList<Denial> allDenials;

	/**
	 * The cached value of the '{@link #getAllConsents() <em>All Consents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllConsents()
	 * @generated
	 * @ordered
	 */
	protected EList<Consent> allConsents;

	/**
	 * The cached value of the '{@link #getAllDocuments() <em>All Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> allDocuments;

	/**
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> notifications;

	/**
	 * The cached value of the '{@link #getAllSharedPrivacyData() <em>All Shared Privacy Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSharedPrivacyData()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedPrivacyData> allSharedPrivacyData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.PRIVACY_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyStatement> getPolicyStatements() {
		if (policyStatements == null) {
			policyStatements = new EObjectContainmentEList<PolicyStatement>(PolicyStatement.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__POLICY_STATEMENTS);
		}
		return policyStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject) owner;
			owner = (Principal) eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							PrivacyModelPackage.PRIVACY_POLICY__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Principal newOwner) {
		Principal oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.PRIVACY_POLICY__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Principal> getAllPrincipals() {
		if (allPrincipals == null) {
			allPrincipals = new EObjectContainmentEList<Principal>(Principal.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_PRINCIPALS);
		}
		return allPrincipals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefaultProtectionControls() {
		if (defaultProtectionControls == null) {
			defaultProtectionControls = new EDataTypeUniqueEList<String>(String.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS);
		}
		return defaultProtectionControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getAllServices() {
		if (allServices == null) {
			allServices = new EObjectContainmentEList<Service>(Service.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_SERVICES);
		}
		return allServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getAllProviders() {
		if (allProviders == null) {
			allProviders = new EObjectContainmentEList<Provider>(Provider.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_PROVIDERS);
		}
		return allProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationManager getConfigurationManager() {
		return configurationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationManager(ConfigurationManager newConfigurationManager,
			NotificationChain msgs) {
		ConfigurationManager oldConfigurationManager = configurationManager;
		configurationManager = newConfigurationManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER, oldConfigurationManager,
					newConfigurationManager);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationManager(ConfigurationManager newConfigurationManager) {
		if (newConfigurationManager != configurationManager) {
			NotificationChain msgs = null;
			if (configurationManager != null)
				msgs = ((InternalEObject) configurationManager).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER, null, msgs);
			if (newConfigurationManager != null)
				msgs = ((InternalEObject) newConfigurationManager).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER, null, msgs);
			msgs = basicSetConfigurationManager(newConfigurationManager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER, newConfigurationManager,
					newConfigurationManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrivacyData> getAllDatas() {
		if (allDatas == null) {
			allDatas = new EObjectContainmentEList<PrivacyData>(PrivacyData.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_DATAS);
		}
		return allDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Complaint> getAllComplaints() {
		if (allComplaints == null) {
			allComplaints = new EObjectContainmentEList<Complaint>(Complaint.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_COMPLAINTS);
		}
		return allComplaints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyPolicyHelper getPrivacyPolicyHelper() {
		return privacyPolicyHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrivacyPolicyHelper(PrivacyPolicyHelper newPrivacyPolicyHelper,
			NotificationChain msgs) {
		PrivacyPolicyHelper oldPrivacyPolicyHelper = privacyPolicyHelper;
		privacyPolicyHelper = newPrivacyPolicyHelper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER, oldPrivacyPolicyHelper,
					newPrivacyPolicyHelper);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyPolicyHelper(PrivacyPolicyHelper newPrivacyPolicyHelper) {
		if (newPrivacyPolicyHelper != privacyPolicyHelper) {
			NotificationChain msgs = null;
			if (privacyPolicyHelper != null)
				msgs = ((InternalEObject) privacyPolicyHelper).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER, null, msgs);
			if (newPrivacyPolicyHelper != null)
				msgs = ((InternalEObject) newPrivacyPolicyHelper).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER, null, msgs);
			msgs = basicSetPrivacyPolicyHelper(newPrivacyPolicyHelper, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER, newPrivacyPolicyHelper,
					newPrivacyPolicyHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Denial> getAllDenials() {
		if (allDenials == null) {
			allDenials = new EObjectContainmentEList<Denial>(Denial.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_DENIALS);
		}
		return allDenials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consent> getAllConsents() {
		if (allConsents == null) {
			allConsents = new EObjectContainmentEList<Consent>(Consent.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_CONSENTS);
		}
		return allConsents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getAllDocuments() {
		if (allDocuments == null) {
			allDocuments = new EObjectContainmentEList<Document>(Document.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_DOCUMENTS);
		}
		return allDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new EObjectContainmentEList<Notification>(Notification.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__NOTIFICATIONS);
		}
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedPrivacyData> getAllSharedPrivacyData() {
		if (allSharedPrivacyData == null) {
			allSharedPrivacyData = new EObjectContainmentEList<SharedPrivacyData>(SharedPrivacyData.class, this,
					PrivacyModelPackage.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA);
		}
		return allSharedPrivacyData;
	}

	/**
	 * The cached validation expression for the '{@link #UniqueProviderName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Provider Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueProviderName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_PROVIDER_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Provider name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allProviders->forAll(provider1:Provider,provider2:Provider| provider1.name = provider2.name implies provider1 = provider2)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueProviderName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_PROVIDER_NAME__DIAGNOSTICCHAIN_MAP,
				UNIQUE_PROVIDER_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_PROVIDER_NAME);
	}

	/**
	 * The cached validation expression for the '{@link #UniqueConsentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Consent Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueConsentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_CONSENT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Consent name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allConsents->forAll(consent1:Consent,consent2:Consent| consent1.name = consent2.name implies consent1 = consent2)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueConsentName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_CONSENT_NAME__DIAGNOSTICCHAIN_MAP,
				UNIQUE_CONSENT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_CONSENT_NAME);
	}

	/**
	 * The cached validation expression for the '{@link #UniqueServiceName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Service Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueServiceName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_SERVICE_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Service name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allServices->forAll(service1:Service,service2:Service| service1.name = service2.name implies service1 = service2)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueServiceName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_SERVICE_NAME__DIAGNOSTICCHAIN_MAP,
				UNIQUE_SERVICE_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_SERVICE_NAME);
	}

	/**
	 * The cached validation expression for the '{@link #OwnerShouldHaveDefinedInhabits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Owner Should Have Defined Inhabits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OwnerShouldHaveDefinedInhabits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_SHOULD_HAVE_DEFINED_INHABITS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art 3',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\t(not(self.owner = null) and not(self.owner.inhabits = null))\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OwnerShouldHaveDefinedInhabits(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___OWNER_SHOULD_HAVE_DEFINED_INHABITS__DIAGNOSTICCHAIN_MAP,
				OWNER_SHOULD_HAVE_DEFINED_INHABITS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRIVACY_POLICY__OWNER_SHOULD_HAVE_DEFINED_INHABITS);
	}

	/**
	 * The cached validation expression for the '{@link #UniquePolicyStatementName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Policy Statement Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniquePolicyStatementName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_POLICY_STATEMENT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'PolicyStatement name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.policyStatements->forAll(st1:PolicyStatement,st2:PolicyStatement| st1.name = st2.name implies st1 = st2)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniquePolicyStatementName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_POLICY_STATEMENT_NAME__DIAGNOSTICCHAIN_MAP,
				UNIQUE_POLICY_STATEMENT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_POLICY_STATEMENT_NAME);
	}

	/**
	 * The cached validation expression for the '{@link #ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Protection Control Should Exists In Configuration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Protection controls should be defined in configuration.',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tself.defaultProtectionControls->forAll(protectionControl:String|\n"
			+ "\t\t\t\tself.privacyPolicyHelper.isPolicyControlValid(protectionControl)\n" + "\t\t\t)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProtectionControlShouldExistsInConfiguration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP,
				PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRIVACY_POLICY__PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION);
	}

	/**
	 * The cached validation expression for the '{@link #UniquePrivacyDataName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Privacy Data Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniquePrivacyDataName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_PRIVACY_DATA_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'PrivacyData name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allDatas->forAll(data1:PrivacyData,data2:PrivacyData| data1.name = data2.name implies data1 = data2)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniquePrivacyDataName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP,
				UNIQUE_PRIVACY_DATA_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_PRIVACY_DATA_NAME);
	}

	/**
	 * The cached validation expression for the '{@link #UniqueDocumentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Document Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueDocumentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_DOCUMENT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Document name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allDocuments->forAll(document1:Document,document2:Document| document1.name = document2.name implies document1 = document2)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueDocumentName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_DOCUMENT_NAME__DIAGNOSTICCHAIN_MAP,
				UNIQUE_DOCUMENT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_DOCUMENT_NAME);
	}

	/**
	 * The cached validation expression for the '{@link #UniqueLocationPerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Location Per Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueLocationPerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_LOCATION_PER_TYPE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Location name per type is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.locations->forAll(loc1:Location,loc2:Location| \n" + "\t\t\tif(loc1.type = loc2.type) then \n"
			+ "\t\t\t\tloc1.name = loc2.name implies loc1 = loc2\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "\t\t)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueLocationPerType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_LOCATION_PER_TYPE__DIAGNOSTICCHAIN_MAP,
				UNIQUE_LOCATION_PER_TYPE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_LOCATION_PER_TYPE);
	}

	/**
	 * The cached validation expression for the '{@link #UniquePrincipalNamePerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Principal Name Per Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniquePrincipalNamePerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_PRINCIPAL_NAME_PER_TYPE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Principal name per type is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allPrincipals->forAll(pr1:Principal,pr2:Principal| \n" + "\t\t\tif(pr1.type = pr2.type) then \n"
			+ "\t\t\tpr1.name = pr2.name implies pr1 = pr2\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "\t\t)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniquePrincipalNamePerType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_PRINCIPAL_NAME_PER_TYPE__DIAGNOSTICCHAIN_MAP,
				UNIQUE_PRINCIPAL_NAME_PER_TYPE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_PRINCIPAL_NAME_PER_TYPE);
	}

	/**
	 * The cached validation expression for the '{@link #UniqueComplaintName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Complaint Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueComplaintName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_COMPLAINT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Complaint name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allComplaints->forAll(complaint1:Complaint,complaint2:Complaint| complaint1.name = complaint2.name implies complaint1 = complaint2)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueComplaintName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_COMPLAINT_NAME__DIAGNOSTICCHAIN_MAP,
				UNIQUE_COMPLAINT_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.PRIVACY_POLICY__UNIQUE_COMPLAINT_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PrivacyModelPackage.PRIVACY_POLICY__POLICY_STATEMENTS:
			return ((InternalEList<?>) getPolicyStatements()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PRINCIPALS:
			return ((InternalEList<?>) getAllPrincipals()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__LOCATIONS:
			return ((InternalEList<?>) getLocations()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SERVICES:
			return ((InternalEList<?>) getAllServices()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PROVIDERS:
			return ((InternalEList<?>) getAllProviders()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER:
			return basicSetConfigurationManager(null, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DATAS:
			return ((InternalEList<?>) getAllDatas()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_COMPLAINTS:
			return ((InternalEList<?>) getAllComplaints()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER:
			return basicSetPrivacyPolicyHelper(null, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DENIALS:
			return ((InternalEList<?>) getAllDenials()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_CONSENTS:
			return ((InternalEList<?>) getAllConsents()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DOCUMENTS:
			return ((InternalEList<?>) getAllDocuments()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__NOTIFICATIONS:
			return ((InternalEList<?>) getNotifications()).basicRemove(otherEnd, msgs);
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA:
			return ((InternalEList<?>) getAllSharedPrivacyData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.PRIVACY_POLICY__POLICY_STATEMENTS:
			return getPolicyStatements();
		case PrivacyModelPackage.PRIVACY_POLICY__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PRINCIPALS:
			return getAllPrincipals();
		case PrivacyModelPackage.PRIVACY_POLICY__LOCATIONS:
			return getLocations();
		case PrivacyModelPackage.PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS:
			return getDefaultProtectionControls();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SERVICES:
			return getAllServices();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PROVIDERS:
			return getAllProviders();
		case PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER:
			return getConfigurationManager();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DATAS:
			return getAllDatas();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_COMPLAINTS:
			return getAllComplaints();
		case PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER:
			return getPrivacyPolicyHelper();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DENIALS:
			return getAllDenials();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_CONSENTS:
			return getAllConsents();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DOCUMENTS:
			return getAllDocuments();
		case PrivacyModelPackage.PRIVACY_POLICY__NOTIFICATIONS:
			return getNotifications();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA:
			return getAllSharedPrivacyData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrivacyModelPackage.PRIVACY_POLICY__POLICY_STATEMENTS:
			getPolicyStatements().clear();
			getPolicyStatements().addAll((Collection<? extends PolicyStatement>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__OWNER:
			setOwner((Principal) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PRINCIPALS:
			getAllPrincipals().clear();
			getAllPrincipals().addAll((Collection<? extends Principal>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__LOCATIONS:
			getLocations().clear();
			getLocations().addAll((Collection<? extends Location>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS:
			getDefaultProtectionControls().clear();
			getDefaultProtectionControls().addAll((Collection<? extends String>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SERVICES:
			getAllServices().clear();
			getAllServices().addAll((Collection<? extends Service>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PROVIDERS:
			getAllProviders().clear();
			getAllProviders().addAll((Collection<? extends Provider>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER:
			setConfigurationManager((ConfigurationManager) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DATAS:
			getAllDatas().clear();
			getAllDatas().addAll((Collection<? extends PrivacyData>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_COMPLAINTS:
			getAllComplaints().clear();
			getAllComplaints().addAll((Collection<? extends Complaint>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER:
			setPrivacyPolicyHelper((PrivacyPolicyHelper) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DENIALS:
			getAllDenials().clear();
			getAllDenials().addAll((Collection<? extends Denial>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_CONSENTS:
			getAllConsents().clear();
			getAllConsents().addAll((Collection<? extends Consent>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DOCUMENTS:
			getAllDocuments().clear();
			getAllDocuments().addAll((Collection<? extends Document>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__NOTIFICATIONS:
			getNotifications().clear();
			getNotifications().addAll((Collection<? extends Notification>) newValue);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA:
			getAllSharedPrivacyData().clear();
			getAllSharedPrivacyData().addAll((Collection<? extends SharedPrivacyData>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PrivacyModelPackage.PRIVACY_POLICY__POLICY_STATEMENTS:
			getPolicyStatements().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__OWNER:
			setOwner((Principal) null);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PRINCIPALS:
			getAllPrincipals().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__LOCATIONS:
			getLocations().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS:
			getDefaultProtectionControls().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SERVICES:
			getAllServices().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PROVIDERS:
			getAllProviders().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER:
			setConfigurationManager((ConfigurationManager) null);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DATAS:
			getAllDatas().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_COMPLAINTS:
			getAllComplaints().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER:
			setPrivacyPolicyHelper((PrivacyPolicyHelper) null);
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DENIALS:
			getAllDenials().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_CONSENTS:
			getAllConsents().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DOCUMENTS:
			getAllDocuments().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__NOTIFICATIONS:
			getNotifications().clear();
			return;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA:
			getAllSharedPrivacyData().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PrivacyModelPackage.PRIVACY_POLICY__POLICY_STATEMENTS:
			return policyStatements != null && !policyStatements.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__OWNER:
			return owner != null;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PRINCIPALS:
			return allPrincipals != null && !allPrincipals.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__LOCATIONS:
			return locations != null && !locations.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS:
			return defaultProtectionControls != null && !defaultProtectionControls.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SERVICES:
			return allServices != null && !allServices.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_PROVIDERS:
			return allProviders != null && !allProviders.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__CONFIGURATION_MANAGER:
			return configurationManager != null;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DATAS:
			return allDatas != null && !allDatas.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_COMPLAINTS:
			return allComplaints != null && !allComplaints.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__PRIVACY_POLICY_HELPER:
			return privacyPolicyHelper != null;
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DENIALS:
			return allDenials != null && !allDenials.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_CONSENTS:
			return allConsents != null && !allConsents.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_DOCUMENTS:
			return allDocuments != null && !allDocuments.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__NOTIFICATIONS:
			return notifications != null && !notifications.isEmpty();
		case PrivacyModelPackage.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA:
			return allSharedPrivacyData != null && !allSharedPrivacyData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_PROVIDER_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueProviderName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_CONSENT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueConsentName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_SERVICE_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueServiceName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___OWNER_SHOULD_HAVE_DEFINED_INHABITS__DIAGNOSTICCHAIN_MAP:
			return OwnerShouldHaveDefinedInhabits((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_POLICY_STATEMENT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniquePolicyStatementName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
			return ProtectionControlShouldExistsInConfiguration((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP:
			return UniquePrivacyDataName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_DOCUMENT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueDocumentName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_LOCATION_PER_TYPE__DIAGNOSTICCHAIN_MAP:
			return UniqueLocationPerType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_PRINCIPAL_NAME_PER_TYPE__DIAGNOSTICCHAIN_MAP:
			return UniquePrincipalNamePerType((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_COMPLAINT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueComplaintName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (defaultProtectionControls: ");
		result.append(defaultProtectionControls);
		result.append(')');
		return result.toString();
	}

} //PrivacyPolicyImpl
