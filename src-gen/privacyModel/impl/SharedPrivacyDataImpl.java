/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.PrivacyData;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;
import privacyModel.PrivacyPolicy;
import privacyModel.PrivacyPolicyHelper;
import privacyModel.SharedPrivacyData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Privacy Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#getAdditionalProtectionControls <em>Additional Protection Controls</em>}</li>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#getPrivacydata <em>Privacydata</em>}</li>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#isCollectedFromSubject <em>Collected From Subject</em>}</li>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedPrivacyDataImpl extends NamedElementImpl implements SharedPrivacyData {
	/**
	 * The cached value of the '{@link #getAdditionalProtectionControls() <em>Additional Protection Controls</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProtectionControls()
	 * @generated
	 * @ordered
	 */
	protected EList<String> additionalProtectionControls;

	/**
	 * The cached value of the '{@link #getPrivacydata() <em>Privacydata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacydata()
	 * @generated
	 * @ordered
	 */
	protected PrivacyData privacydata;

	/**
	 * The default value of the '{@link #isCollectedFromSubject() <em>Collected From Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectedFromSubject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTED_FROM_SUBJECT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCollectedFromSubject() <em>Collected From Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectedFromSubject()
	 * @generated
	 * @ordered
	 */
	protected boolean collectedFromSubject = COLLECTED_FROM_SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected String dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedPrivacyDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAdditionalProtectionControls() {
		if (additionalProtectionControls == null) {
			additionalProtectionControls = new EDataTypeUniqueEList<String>(String.class, this,
					PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS);
		}
		return additionalProtectionControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyData getPrivacydata() {
		if (privacydata != null && privacydata.eIsProxy()) {
			InternalEObject oldPrivacydata = (InternalEObject) privacydata;
			privacydata = (PrivacyData) eResolveProxy(oldPrivacydata);
			if (privacydata != oldPrivacydata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA, oldPrivacydata, privacydata));
			}
		}
		return privacydata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyData basicGetPrivacydata() {
		return privacydata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacydata(PrivacyData newPrivacydata) {
		PrivacyData oldPrivacydata = privacydata;
		privacydata = newPrivacydata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA,
					oldPrivacydata, privacydata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectedFromSubject() {
		return collectedFromSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectedFromSubject(boolean newCollectedFromSubject) {
		boolean oldCollectedFromSubject = collectedFromSubject;
		collectedFromSubject = newCollectedFromSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT, oldCollectedFromSubject,
					collectedFromSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(String newDataSource) {
		String oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE,
					oldDataSource, dataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProtectionControlShouldExistsInConfiguration(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "SharedPrivacyData::ProtectionControlShouldExistsInConfiguration";
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
			 *           status : Boolean[?] = self.additionalProtectionControls->forAll(protectionControl |
			 *             PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *             .privacyPolicyHelper.isPolicyControlValid(protectionControl))
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
					PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ List<String> additionalProtectionControls = this
							.getAdditionalProtectionControls();
					final /*@NonInvalid*/ OrderedSetValue BOXED_additionalProtectionControls = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_PRIMid_String, additionalProtectionControls);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_protectionControl = BOXED_additionalProtectionControls.iterator();
					/*@Thrown*/ Boolean status;
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
						 *
						 * PrivacyPolicy.allInstances()
						 * ->asSequence()
						 * ->first()
						 * .privacyPolicyHelper.isPolicyControlValid(protectionControl)
						 */
						/*@Caught*/ Object CAUGHT_isPolicyControlValid;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy_0);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							if (first == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
							}
							final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = first.getPrivacyPolicyHelper();
							final /*@Thrown*/ boolean isPolicyControlValid = privacyPolicyHelper
									.isPolicyControlValid(protectionControl);
							CAUGHT_isPolicyControlValid = isPolicyControlValid;
						} catch (Exception e) {
							CAUGHT_isPolicyControlValid = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_isPolicyControlValid == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_isPolicyControlValid == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_isPolicyControlValid instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_isPolicyControlValid; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Protection_32_controls_32_should_32_be_32_defined_32_in_32_configuration,
								status);
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
	public boolean DataSourceShouldExistsInConfiguration(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "SharedPrivacyData::DataSourceShouldExistsInConfiguration";
		try {
			/**
			 *
			 * inv DataSourceShouldExistsInConfiguration:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[?] = self.dataSource = null or
			 *           PrivacyPolicy.allInstances()
			 *           ->asSequence()
			 *           ->first()
			 *           .privacyPolicyHelper.isDataSourceValid(self.dataSource)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Data source should be defined in configuration.', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA___DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ String dataSource_0 = this.getDataSource();
					final /*@NonInvalid*/ boolean eq = dataSource_0 == null;
					final /*@Thrown*/ Boolean status;
					if (eq) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_isDataSourceValid;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy_0);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							if (first == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
							}
							final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = first.getPrivacyPolicyHelper();
							final /*@Thrown*/ boolean isDataSourceValid = privacyPolicyHelper
									.isDataSourceValid(dataSource_0);
							CAUGHT_isDataSourceValid = isDataSourceValid;
						} catch (Exception e) {
							CAUGHT_isDataSourceValid = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_isDataSourceValid == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_isDataSourceValid instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isDataSourceValid;
							}
							status = ValueUtil.FALSE_VALUE;
						}
					}
					final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_0) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Data_32_source_32_should_32_be_32_defined_32_in_32_configuration,
								status);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			return getAdditionalProtectionControls();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			if (resolve)
				return getPrivacydata();
			return basicGetPrivacydata();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			return isCollectedFromSubject();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			return getDataSource();
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			getAdditionalProtectionControls().clear();
			getAdditionalProtectionControls().addAll((Collection<? extends String>) newValue);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			setPrivacydata((PrivacyData) newValue);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			setCollectedFromSubject((Boolean) newValue);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			setDataSource((String) newValue);
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			getAdditionalProtectionControls().clear();
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			setPrivacydata((PrivacyData) null);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			setCollectedFromSubject(COLLECTED_FROM_SUBJECT_EDEFAULT);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			setDataSource(DATA_SOURCE_EDEFAULT);
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			return additionalProtectionControls != null && !additionalProtectionControls.isEmpty();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			return privacydata != null;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			return collectedFromSubject != COLLECTED_FROM_SUBJECT_EDEFAULT;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			return DATA_SOURCE_EDEFAULT == null ? dataSource != null : !DATA_SOURCE_EDEFAULT.equals(dataSource);
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
			return ProtectionControlShouldExistsInConfiguration((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.SHARED_PRIVACY_DATA___DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
			return DataSourceShouldExistsInConfiguration((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (additionalProtectionControls: ");
		result.append(additionalProtectionControls);
		result.append(", collectedFromSubject: ");
		result.append(collectedFromSubject);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //SharedPrivacyDataImpl
