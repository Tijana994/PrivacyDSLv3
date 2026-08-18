/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.Complaint;
import privacyModel.ConfigurationManager;
import privacyModel.Consent;
import privacyModel.Denial;
import privacyModel.Document;
import privacyModel.Location;
import privacyModel.LocationType;
import privacyModel.Notification;
import privacyModel.PolicyStatement;
import privacyModel.Principal;
import privacyModel.PrincipalType;
import privacyModel.PrivacyData;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;
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
	public boolean UniqueProviderName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniqueProviderName";
		try {
			/**
			 *
			 * inv UniqueProviderName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allProviders->forAll(provider1, provider2 | provider1.name = provider2.name implies provider1 = provider2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Provider name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_PROVIDER_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Provider> allProviders = this.getAllProviders();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allProviders = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Provider, allProviders);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allProviders);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * provider1.name = provider2.name implies provider1 = provider2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allProviders = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object provider1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object provider2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Provider local_2 = (Provider) provider1;
								final /*@NonInvalid*/ Provider local_3 = (Provider) provider2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allProviders, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Provider_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueConsentName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniqueConsentName";
		try {
			/**
			 *
			 * inv UniqueConsentName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allConsents->forAll(consent1, consent2 | consent1.name = consent2.name implies consent1 = consent2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Consent name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_CONSENT_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Consent> allConsents = this.getAllConsents();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allConsents = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Consent, allConsents);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allConsents);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * consent1.name = consent2.name implies consent1 = consent2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allConsents = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object consent1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object consent2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Consent local_2 = (Consent) consent1;
								final /*@NonInvalid*/ Consent local_3 = (Consent) consent2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allConsents, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Consent_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueServiceName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniqueServiceName";
		try {
			/**
			 *
			 * inv UniqueServiceName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allServices->forAll(service1, service2 | service1.name = service2.name implies service1 = service2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Service name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_SERVICE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Service> allServices = this.getAllServices();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allServices = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Service, allServices);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allServices);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * service1.name = service2.name implies service1 = service2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allServices = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object service1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object service2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Service local_2 = (Service) service1;
								final /*@NonInvalid*/ Service local_3 = (Service) service2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allServices, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Service_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OwnerShouldHaveDefinedInhabits(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::OwnerShouldHaveDefinedInhabits";
		try {
			/**
			 *
			 * inv OwnerShouldHaveDefinedInhabits:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not (self.owner = null
			 *           ) and
			 *           not (self.owner.inhabits = null
			 *           )
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art 3', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___OWNER_SHOULD_HAVE_DEFINED_INHABITS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
					final /*@Thrown*/ Boolean status;
					if (not == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ Principal owner = this.getOwner();
						final /*@NonInvalid*/ Location inhabits = owner.getInhabits();
						final /*@NonInvalid*/ boolean eq = inhabits == null;
						final /*@NonInvalid*/ Boolean not_0;
						if (!eq) {
							not_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (eq) {
								not_0 = ValueUtil.FALSE_VALUE;
							} else {
								not_0 = null;
							}
						}
						if (not_0 == ValueUtil.FALSE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							if ((not == null) || (not_0 == null)) {
								status = null;
							} else {
								status = ValueUtil.TRUE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_0) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art_32_3, status);
						local_1 = local_0;
					}
					CAUGHT_local_1 = local_1;
				} catch (Exception e) {
					CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniquePolicyStatementName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniquePolicyStatementName";
		try {
			/**
			 *
			 * inv UniquePolicyStatementName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.policyStatements->forAll(st1, st2 | st1.name = st2.name implies st1 = st2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'PolicyStatement name is unique', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_POLICY_STATEMENT_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<PolicyStatement> policyStatements = this.getPolicyStatements();
					final /*@NonInvalid*/ OrderedSetValue BOXED_policyStatements = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PolicyStatement, policyStatements);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_policyStatements);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * st1.name = st2.name implies st1 = st2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_policyStatements = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object st1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object st2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ PolicyStatement local_2 = (PolicyStatement) st1;
								final /*@NonInvalid*/ PolicyStatement local_3 = (PolicyStatement) st2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_policyStatements, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_PolicyStatement_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProtectionControlShouldExistsInConfiguration(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::ProtectionControlShouldExistsInConfiguration";
		try {
			/**
			 *
			 * inv ProtectionControlShouldExistsInConfiguration:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.defaultProtectionControls->forAll(protectionControl |
			 *             self.privacyPolicyHelper.isPolicyControlValid(protectionControl))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Protection controls should be defined in configuration.', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<String> defaultProtectionControls = this.getDefaultProtectionControls();
				final /*@NonInvalid*/ OrderedSetValue BOXED_defaultProtectionControls = idResolver
						.createOrderedSetOfAll(PrivacyModelTables.ORD_PRIMid_String, defaultProtectionControls);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_protectionControl = BOXED_defaultProtectionControls.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_protectionControl.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ String protectionControl = (String) ITERATOR_protectionControl.next();
					/**
					 * self.privacyPolicyHelper.isPolicyControlValid(protectionControl)
					 */
					final /*@NonInvalid*/ PrivacyPolicyHelper privacyPolicyHelper = this.getPrivacyPolicyHelper();
					final /*@NonInvalid*/ boolean isPolicyControlValid = privacyPolicyHelper
							.isPolicyControlValid(protectionControl);
					//
					if (!isPolicyControlValid) { // Normal unsuccessful body evaluation result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (isPolicyControlValid) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean eq = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Protection_32_controls_32_should_32_be_32_defined_32_in_32_configuration,
							status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniquePrivacyDataName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniquePrivacyDataName";
		try {
			/**
			 *
			 * inv UniquePrivacyDataName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allDatas->forAll(pd1, pd2 | pd1.name = pd2.name implies pd1 = pd2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'PrivacyData name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<PrivacyData> allDatas = this.getAllDatas();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allDatas = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PrivacyData, allDatas);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allDatas);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * pd1.name = pd2.name implies pd1 = pd2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allDatas = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object pd1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object pd2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ PrivacyData local_2 = (PrivacyData) pd1;
								final /*@NonInvalid*/ PrivacyData local_3 = (PrivacyData) pd2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allDatas, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_PrivacyData_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueDocumentName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniqueDocumentName";
		try {
			/**
			 *
			 * inv UniqueDocumentName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allDocuments->forAll(document1, document2 | document1.name = document2.name implies document1 = document2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Document name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_DOCUMENT_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Document> allDocuments = this.getAllDocuments();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allDocuments = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document, allDocuments);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allDocuments);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * document1.name = document2.name implies document1 = document2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allDocuments = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object document1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object document2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Document local_2 = (Document) document1;
								final /*@NonInvalid*/ Document local_3 = (Document) document2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allDocuments, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Document_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueLocationPerType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniqueLocationPerType";
		try {
			/**
			 *
			 * inv UniqueLocationPerType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.locations->forAll(loc1, loc2 |
			 *             if loc1.type = loc2.type
			 *             then loc1.name = loc2.name implies loc1 = loc2
			 *             else true
			 *             endif)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Location name per type is unique', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_LOCATION_PER_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_9;
			if (le) {
				local_9 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_8;
				try {
					final /*@NonInvalid*/ List<Location> locations = this.getLocations();
					final /*@NonInvalid*/ OrderedSetValue BOXED_locations = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Location, locations);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_locations);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 *
						 * if loc1.type = loc2.type
						 * then loc1.name = loc2.name implies loc1 = loc2
						 * else true
						 * endif
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_locations = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object loc1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object loc2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_local_6;
							try {
								final /*@NonInvalid*/ Location local_4 = (Location) loc1;
								final /*@NonInvalid*/ Location local_5 = (Location) loc2;
								if (local_4 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Location::type\'");
								}
								if (local_5 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Location::type\'");
								}
								final /*@Thrown*/ LocationType type = local_4.getType();
								final /*@Thrown*/ LocationType type_0 = local_5.getType();
								final /*@Thrown*/ boolean eq = type.equals(type_0);
								/*@Thrown*/ Boolean local_6;
								if (eq) {
									/*@Caught*/ Object CAUGHT_eq_0;
									try {
										final /*@Thrown*/ String name = local_4.getName();
										final /*@Thrown*/ String name_0 = local_5.getName();
										final /*@Thrown*/ boolean eq_0 = name.equals(name_0);
										CAUGHT_eq_0 = eq_0;
									} catch (Exception e) {
										CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean implies;
									if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										final /*@NonInvalid*/ boolean eq_1 = (local_4 != null) ? local_4.equals(local_5)
												: (local_5 == null);
										if (eq_1) {
											implies = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_eq_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_0;
											}
											implies = ValueUtil.FALSE_VALUE;
										}
									}
									local_6 = implies;
								} else {
									local_6 = ValueUtil.TRUE_VALUE;
								}
								CAUGHT_local_6 = local_6;
							} catch (Exception e) {
								CAUGHT_local_6 = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_local_6;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_locations, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_8;
					if (eq_2) {
						local_8 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_7 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Location_32_name_32_per_32_type_32_is_32_unique, status);
						local_8 = local_7;
					}
					CAUGHT_local_8 = local_8;
				} catch (Exception e) {
					CAUGHT_local_8 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_8, PrivacyModelTables.INT_0)
						.booleanValue();
				local_9 = logDiagnostic;
			}
			return local_9;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniquePrincipalNamePerType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniquePrincipalNamePerType";
		try {
			/**
			 *
			 * inv UniquePrincipalNamePerType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allPrincipals->forAll(pr1, pr2 |
			 *             if pr1.type = pr2.type
			 *             then pr1.name = pr2.name implies pr1 = pr2
			 *             else true
			 *             endif)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Principal name per type is unique', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_PRINCIPAL_NAME_PER_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_9;
			if (le) {
				local_9 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_8;
				try {
					final /*@NonInvalid*/ List<Principal> allPrincipals = this.getAllPrincipals();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allPrincipals = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal, allPrincipals);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allPrincipals);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 *
						 * if pr1.type = pr2.type
						 * then pr1.name = pr2.name implies pr1 = pr2
						 * else true
						 * endif
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allPrincipals = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object pr1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object pr2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_local_6;
							try {
								final /*@NonInvalid*/ Principal local_4 = (Principal) pr1;
								final /*@NonInvalid*/ Principal local_5 = (Principal) pr2;
								if (local_4 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Principal::type\'");
								}
								if (local_5 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Principal::type\'");
								}
								final /*@Thrown*/ PrincipalType type = local_4.getType();
								final /*@Thrown*/ PrincipalType type_0 = local_5.getType();
								final /*@Thrown*/ boolean eq = type.equals(type_0);
								/*@Thrown*/ Boolean local_6;
								if (eq) {
									/*@Caught*/ Object CAUGHT_eq_0;
									try {
										final /*@Thrown*/ String name = local_4.getName();
										final /*@Thrown*/ String name_0 = local_5.getName();
										final /*@Thrown*/ boolean eq_0 = name.equals(name_0);
										CAUGHT_eq_0 = eq_0;
									} catch (Exception e) {
										CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean implies;
									if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										final /*@NonInvalid*/ boolean eq_1 = (local_4 != null) ? local_4.equals(local_5)
												: (local_5 == null);
										if (eq_1) {
											implies = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_eq_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_0;
											}
											implies = ValueUtil.FALSE_VALUE;
										}
									}
									local_6 = implies;
								} else {
									local_6 = ValueUtil.TRUE_VALUE;
								}
								CAUGHT_local_6 = local_6;
							} catch (Exception e) {
								CAUGHT_local_6 = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_local_6;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allPrincipals, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_8;
					if (eq_2) {
						local_8 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_7 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Principal_32_name_32_per_32_type_32_is_32_unique, status);
						local_8 = local_7;
					}
					CAUGHT_local_8 = local_8;
				} catch (Exception e) {
					CAUGHT_local_8 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_8, PrivacyModelTables.INT_0)
						.booleanValue();
				local_9 = logDiagnostic;
			}
			return local_9;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueSharedPrivacyDataName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniqueSharedPrivacyDataName";
		try {
			/**
			 *
			 * inv UniqueSharedPrivacyDataName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allSharedPrivacyData->forAll(sd1, sd2 | sd1.name = sd2.name implies sd1 = sd2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'SharedPrivacyData name is unique', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_SHARED_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<SharedPrivacyData> allSharedPrivacyData = this.getAllSharedPrivacyData();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allSharedPrivacyData = idResolver.createOrderedSetOfAll(
							PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, allSharedPrivacyData);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allSharedPrivacyData);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * sd1.name = sd2.name implies sd1 = sd2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allSharedPrivacyData = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object sd1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object sd2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ SharedPrivacyData local_2 = (SharedPrivacyData) sd1;
								final /*@NonInvalid*/ SharedPrivacyData local_3 = (SharedPrivacyData) sd2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allSharedPrivacyData, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_SharedPrivacyData_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueComplaintName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PrivacyPolicy::UniqueComplaintName";
		try {
			/**
			 *
			 * inv UniqueComplaintName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.allComplaints->forAll(complaint1, complaint2 | complaint1.name = complaint2.name implies complaint1 = complaint2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Complaint name is unique', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRIVACY_POLICY___UNIQUE_COMPLAINT_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_5;
				try {
					final /*@NonInvalid*/ List<Complaint> allComplaints = this.getAllComplaints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_allComplaints = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Complaint, allComplaints);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_allComplaints);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * complaint1.name = complaint2.name implies complaint1 = complaint2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_allComplaints = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object complaint1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object complaint2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Complaint local_2 = (Complaint) complaint1;
								final /*@NonInvalid*/ Complaint local_3 = (Complaint) complaint2;
								/*@Caught*/ Object CAUGHT_eq;
								try {
									if (local_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name = local_2.getName();
									if (local_3 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::NamedElement::name\'");
									}
									final /*@Thrown*/ String name_0 = local_3.getName();
									final /*@Thrown*/ boolean eq = name.equals(name_0);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_0 = (local_2 != null) ? local_2.equals(local_3)
											: (local_3 == null);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_allComplaints, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_5;
					if (eq_1) {
						local_5 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_4 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Complaint_32_name_32_is_32_unique, status);
						local_5 = local_4;
					}
					CAUGHT_local_5 = local_5;
				} catch (Exception e) {
					CAUGHT_local_5 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_5, PrivacyModelTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_LOCATION_PER_TYPE__DIAGNOSTICCHAIN_MAP:
			return UniqueLocationPerType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_PRINCIPAL_NAME_PER_TYPE__DIAGNOSTICCHAIN_MAP:
			return UniquePrincipalNamePerType((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_SHARED_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueSharedPrivacyDataName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_DOCUMENT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueDocumentName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
			return ProtectionControlShouldExistsInConfiguration((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_CONSENT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueConsentName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_COMPLAINT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueComplaintName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___OWNER_SHOULD_HAVE_DEFINED_INHABITS__DIAGNOSTICCHAIN_MAP:
			return OwnerShouldHaveDefinedInhabits((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_POLICY_STATEMENT_NAME__DIAGNOSTICCHAIN_MAP:
			return UniquePolicyStatementName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP:
			return UniquePrivacyDataName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY___UNIQUE_SERVICE_NAME__DIAGNOSTICCHAIN_MAP:
			return UniqueServiceName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
