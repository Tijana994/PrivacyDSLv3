/**
 */
package privacyModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

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
