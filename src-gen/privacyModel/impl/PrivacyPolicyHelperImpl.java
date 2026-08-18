/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import privacyModel.AbstractTime;
import privacyModel.ConfigurationManager;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;
import privacyModel.PrivacyPolicy;
import privacyModel.PrivacyPolicyHelper;
import privacyModel.TimeInterval;
import privacyModel.TimePreposition;
import privacyModel.TimeStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Policy Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyPolicyHelperImpl extends MinimalEObjectImpl.Container implements PrivacyPolicyHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyPolicyHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPolicyControlValid(final String policyControl) {
		/**
		 *
		 * PrivacyPolicy.allInstances()
		 * ->asSequence()
		 * ->first()
		 * .configurationManager.protectionControlMethods->exists(q | q = policyControl)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
				PrivacyModelTables.SET_CLSSid_PrivacyPolicy, TYP_privacyModel_c_c_PrivacyPolicy_0);
		final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(allInstances);
		final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
				.evaluate(asSequence);
		if (first == null) {
			throw new InvalidValueException(
					"Null source for \'\'http://privacymodel\'::PrivacyPolicy::configurationManager\'");
		}
		final /*@Thrown*/ ConfigurationManager configurationManager = first.getConfigurationManager();
		final /*@Thrown*/ List<String> protectionControlMethods = configurationManager.getProtectionControlMethods();
		final /*@Thrown*/ OrderedSetValue BOXED_protectionControlMethods = idResolver
				.createOrderedSetOfAll(PrivacyModelTables.ORD_PRIMid_String, protectionControlMethods);
		/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		Iterator<Object> ITERATOR_q = BOXED_protectionControlMethods.iterator();
		/*@Thrown*/ Boolean exists;
		while (true) {
			if (!ITERATOR_q.hasNext()) {
				if (accumulator == ValueUtil.FALSE_VALUE) {
					exists = ValueUtil.FALSE_VALUE;
				} else {
					throw (InvalidValueException) accumulator;
				}
				break;
			}
			/*@NonInvalid*/ String q = (String) ITERATOR_q.next();
			/**
			 * q = policyControl
			 */
			final /*@NonInvalid*/ boolean eq = q.equals(policyControl);
			//
			if (eq) { // Normal successful body evaluation result
				exists = ValueUtil.TRUE_VALUE;
				break; // Stop immediately
			} else if (!eq) { // Normal unsuccessful body evaluation result
				; // Carry on
			} else { // Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
			}
		}
		if (exists == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::isPolicyControlValid(String[1]) : Boolean[1]\'");
		}
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataSourceValid(final String dataSource) {
		/**
		 *
		 * PrivacyPolicy.allInstances()
		 * ->asSequence()
		 * ->first()
		 * .configurationManager.dataSources->exists(q | q = dataSource)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
				PrivacyModelTables.SET_CLSSid_PrivacyPolicy, TYP_privacyModel_c_c_PrivacyPolicy_0);
		final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(allInstances);
		final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
				.evaluate(asSequence);
		if (first == null) {
			throw new InvalidValueException(
					"Null source for \'\'http://privacymodel\'::PrivacyPolicy::configurationManager\'");
		}
		final /*@Thrown*/ ConfigurationManager configurationManager = first.getConfigurationManager();
		final /*@Thrown*/ List<String> dataSources = configurationManager.getDataSources();
		final /*@Thrown*/ OrderedSetValue BOXED_dataSources = idResolver
				.createOrderedSetOfAll(PrivacyModelTables.ORD_PRIMid_String, dataSources);
		/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		Iterator<Object> ITERATOR_q = BOXED_dataSources.iterator();
		/*@Thrown*/ Boolean exists;
		while (true) {
			if (!ITERATOR_q.hasNext()) {
				if (accumulator == ValueUtil.FALSE_VALUE) {
					exists = ValueUtil.FALSE_VALUE;
				} else {
					throw (InvalidValueException) accumulator;
				}
				break;
			}
			/*@NonInvalid*/ String q = (String) ITERATOR_q.next();
			/**
			 * q = dataSource
			 */
			final /*@NonInvalid*/ boolean eq = q.equals(dataSource);
			//
			if (eq) { // Normal successful body evaluation result
				exists = ValueUtil.TRUE_VALUE;
				break; // Stop immediately
			} else if (!eq) { // Normal unsuccessful body evaluation result
				; // Carry on
			} else { // Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
			}
		}
		if (exists == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::isDataSourceValid(String[1]) : Boolean[1]\'");
		}
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areIntervalsOverlap(final AbstractTime time1, final AbstractTime time2) {
		/**
		 *
		 * if time2.oclIsKindOf(TimeStatement)
		 * then
		 *   let timestmt : TimeStatement[1] = time2.oclAsType(TimeStatement)
		 *   in
		 *     if timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at
		 *     then areDatesOverlap(time1, timestmt.dateTime)
		 *     else not areDatesOverlap(time1, timestmt.dateTime)
		 *     endif
		 * else
		 *   let interval : TimeInterval[1] = time2.oclAsType(TimeInterval)
		 *   in
		 *     if interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after or interval.start.preposition = TimePreposition::at
		 *     then
		 *       areDatesOverlap(time1, interval.start.dateTime) and
		 *       not areDatesOverlap(time1, interval.end.dateTime)
		 *     else
		 *       not areDatesOverlap(time1, interval.start.dateTime) and
		 *       areDatesOverlap(time1, interval.end.dateTime)
		 *     endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeStatement_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_TimeStatement, null);
		final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
				.evaluate(executor, time2, TYP_privacyModel_c_c_TimeStatement_0).booleanValue();
		/*@Thrown*/ Boolean local_2;
		if (oclIsKindOf) {
			/*@Caught*/ Object CAUGHT_timestmt;
			try {
				final /*@Thrown*/ TimeStatement timestmt = (TimeStatement) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time2, TYP_privacyModel_c_c_TimeStatement_0);
				CAUGHT_timestmt = timestmt;
			} catch (Exception e) {
				CAUGHT_timestmt = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ Object CAUGHT_or;
			try {
				/*@Caught*/ Object CAUGHT_eq;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ TimePreposition preposition = ((TimeStatement) CAUGHT_timestmt).getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition.getName()));
					final /*@Thrown*/ boolean eq = BOXED_preposition == PrivacyModelTables.ELITid_from;
					CAUGHT_eq = eq;
				} catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_0;
					try {
						if (CAUGHT_timestmt instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_timestmt;
						}
						final /*@Thrown*/ TimePreposition preposition_0 = ((TimeStatement) CAUGHT_timestmt)
								.getPreposition();
						final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_0 = PrivacyModelTables.ENUMid_TimePreposition
								.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_0.getName()));
						final /*@Thrown*/ boolean eq_0 = BOXED_preposition_0 == PrivacyModelTables.ELITid_after;
						CAUGHT_eq_0 = eq_0;
					} catch (Exception e) {
						CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq;
						}
						if (CAUGHT_eq_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_0;
						}
						or = ValueUtil.FALSE_VALUE;
					}
				}
				CAUGHT_or = or;
			} catch (Exception e) {
				CAUGHT_or = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_0;
			if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
				or_0 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_1;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ TimePreposition preposition_1 = ((TimeStatement) CAUGHT_timestmt)
							.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_1 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_1.getName()));
					final /*@Thrown*/ boolean eq_1 = BOXED_preposition_1 == PrivacyModelTables.ELITid_at;
					CAUGHT_eq_1 = eq_1;
				} catch (Exception e) {
					CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
					or_0 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_or instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_or;
					}
					if (CAUGHT_eq_1 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_1;
					}
					if (CAUGHT_or == null) {
						or_0 = null;
					} else {
						or_0 = ValueUtil.FALSE_VALUE;
					}
				}
			}
			if (or_0 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_0;
			if (or_0) {
				if (CAUGHT_timestmt instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_timestmt;
				}
				final /*@Thrown*/ Date dateTime = ((TimeStatement) CAUGHT_timestmt).getDateTime();
				final /*@Thrown*/ boolean areDatesOverlap = this.areDatesOverlap(time1, dateTime);
				local_0 = areDatesOverlap;
			} else {
				/*@Caught*/ Object CAUGHT_areDatesOverlap_0;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ Date dateTime_0 = ((TimeStatement) CAUGHT_timestmt).getDateTime();
					final /*@Thrown*/ boolean areDatesOverlap_0 = this.areDatesOverlap(time1, dateTime_0);
					CAUGHT_areDatesOverlap_0 = areDatesOverlap_0;
				} catch (Exception e) {
					CAUGHT_areDatesOverlap_0 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_areDatesOverlap_0 instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_areDatesOverlap_0;
				}
				final /*@Thrown*/ Boolean not;
				if (CAUGHT_areDatesOverlap_0 == ValueUtil.FALSE_VALUE) {
					not = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_areDatesOverlap_0 == ValueUtil.TRUE_VALUE) {
						not = ValueUtil.FALSE_VALUE;
					} else {
						not = null;
					}
				}
				local_0 = not;
			}
			local_2 = local_0;
		} else {
			/*@Caught*/ Object CAUGHT_interval;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeInterval_0 = idResolver
						.getClass(PrivacyModelTables.CLSSid_TimeInterval, null);
				final /*@Thrown*/ TimeInterval interval = (TimeInterval) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time2, TYP_privacyModel_c_c_TimeInterval_0);
				CAUGHT_interval = interval;
			} catch (Exception e) {
				CAUGHT_interval = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ Object CAUGHT_or_1;
			try {
				/*@Caught*/ Object CAUGHT_eq_2;
				try {
					if (CAUGHT_interval instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_interval;
					}
					final /*@Thrown*/ TimeStatement start = ((TimeInterval) CAUGHT_interval).getStart();
					final /*@Thrown*/ TimePreposition preposition_2 = start.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_2 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_2.getName()));
					final /*@Thrown*/ boolean eq_2 = BOXED_preposition_2 == PrivacyModelTables.ELITid_from;
					CAUGHT_eq_2 = eq_2;
				} catch (Exception e) {
					CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or_1;
				if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
					or_1 = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_3;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement start_0 = ((TimeInterval) CAUGHT_interval).getStart();
						final /*@Thrown*/ TimePreposition preposition_3 = start_0.getPreposition();
						final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_3 = PrivacyModelTables.ENUMid_TimePreposition
								.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_3.getName()));
						final /*@Thrown*/ boolean eq_3 = BOXED_preposition_3 == PrivacyModelTables.ELITid_after;
						CAUGHT_eq_3 = eq_3;
					} catch (Exception e) {
						CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
						or_1 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq_2 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_2;
						}
						if (CAUGHT_eq_3 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_3;
						}
						or_1 = ValueUtil.FALSE_VALUE;
					}
				}
				CAUGHT_or_1 = or_1;
			} catch (Exception e) {
				CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_2;
			if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
				or_2 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_4;
				try {
					if (CAUGHT_interval instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_interval;
					}
					final /*@Thrown*/ TimeStatement start_1 = ((TimeInterval) CAUGHT_interval).getStart();
					final /*@Thrown*/ TimePreposition preposition_4 = start_1.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_4 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_4.getName()));
					final /*@Thrown*/ boolean eq_4 = BOXED_preposition_4 == PrivacyModelTables.ELITid_at;
					CAUGHT_eq_4 = eq_4;
				} catch (Exception e) {
					CAUGHT_eq_4 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_4 == ValueUtil.TRUE_VALUE) {
					or_2 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_or_1 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_or_1;
					}
					if (CAUGHT_eq_4 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_4;
					}
					if (CAUGHT_or_1 == null) {
						or_2 = null;
					} else {
						or_2 = ValueUtil.FALSE_VALUE;
					}
				}
			}
			if (or_2 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_1;
			if (or_2) {
				/*@Caught*/ Object CAUGHT_areDatesOverlap_1;
				try {
					if (CAUGHT_interval instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_interval;
					}
					final /*@Thrown*/ TimeStatement start_2 = ((TimeInterval) CAUGHT_interval).getStart();
					final /*@Thrown*/ Date dateTime_1 = start_2.getDateTime();
					final /*@Thrown*/ boolean areDatesOverlap_1 = this.areDatesOverlap(time1, dateTime_1);
					CAUGHT_areDatesOverlap_1 = areDatesOverlap_1;
				} catch (Exception e) {
					CAUGHT_areDatesOverlap_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean and;
				if (CAUGHT_areDatesOverlap_1 == ValueUtil.FALSE_VALUE) {
					and = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_not_0;
					try {
						/*@Caught*/ Object CAUGHT_areDatesOverlap_2;
						try {
							if (CAUGHT_interval instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_interval;
							}
							final /*@Thrown*/ TimeStatement end = ((TimeInterval) CAUGHT_interval).getEnd();
							final /*@Thrown*/ Date dateTime_2 = end.getDateTime();
							final /*@Thrown*/ boolean areDatesOverlap_2 = this.areDatesOverlap(time1, dateTime_2);
							CAUGHT_areDatesOverlap_2 = areDatesOverlap_2;
						} catch (Exception e) {
							CAUGHT_areDatesOverlap_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_areDatesOverlap_2 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_areDatesOverlap_2;
						}
						final /*@Thrown*/ Boolean not_0;
						if (CAUGHT_areDatesOverlap_2 == ValueUtil.FALSE_VALUE) {
							not_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_areDatesOverlap_2 == ValueUtil.TRUE_VALUE) {
								not_0 = ValueUtil.FALSE_VALUE;
							} else {
								not_0 = null;
							}
						}
						CAUGHT_not_0 = not_0;
					} catch (Exception e) {
						CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_not_0 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_areDatesOverlap_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_areDatesOverlap_1;
						}
						if (CAUGHT_not_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_0;
						}
						if (CAUGHT_not_0 == null) {
							and = null;
						} else {
							and = ValueUtil.TRUE_VALUE;
						}
					}
				}
				local_1 = and;
			} else {
				/*@Caught*/ Object CAUGHT_not_1;
				try {
					/*@Caught*/ Object CAUGHT_areDatesOverlap_3;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement start_3 = ((TimeInterval) CAUGHT_interval).getStart();
						final /*@Thrown*/ Date dateTime_3 = start_3.getDateTime();
						final /*@Thrown*/ boolean areDatesOverlap_3 = this.areDatesOverlap(time1, dateTime_3);
						CAUGHT_areDatesOverlap_3 = areDatesOverlap_3;
					} catch (Exception e) {
						CAUGHT_areDatesOverlap_3 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_areDatesOverlap_3 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_areDatesOverlap_3;
					}
					final /*@Thrown*/ Boolean not_1;
					if (CAUGHT_areDatesOverlap_3 == ValueUtil.FALSE_VALUE) {
						not_1 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_areDatesOverlap_3 == ValueUtil.TRUE_VALUE) {
							not_1 = ValueUtil.FALSE_VALUE;
						} else {
							not_1 = null;
						}
					}
					CAUGHT_not_1 = not_1;
				} catch (Exception e) {
					CAUGHT_not_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean and_0;
				if (CAUGHT_not_1 == ValueUtil.FALSE_VALUE) {
					and_0 = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_areDatesOverlap_4;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement end_0 = ((TimeInterval) CAUGHT_interval).getEnd();
						final /*@Thrown*/ Date dateTime_4 = end_0.getDateTime();
						final /*@Thrown*/ boolean areDatesOverlap_4 = this.areDatesOverlap(time1, dateTime_4);
						CAUGHT_areDatesOverlap_4 = areDatesOverlap_4;
					} catch (Exception e) {
						CAUGHT_areDatesOverlap_4 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_areDatesOverlap_4 == ValueUtil.FALSE_VALUE) {
						and_0 = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_not_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_1;
						}
						if (CAUGHT_areDatesOverlap_4 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_areDatesOverlap_4;
						}
						if (CAUGHT_not_1 == null) {
							and_0 = null;
						} else {
							and_0 = ValueUtil.TRUE_VALUE;
						}
					}
				}
				local_1 = and_0;
			}
			local_2 = local_1;
		}
		if (local_2 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::areIntervalsOverlap(privacyModel::AbstractTime[1],privacyModel::AbstractTime[1]) : Boolean[1]\'");
		}
		return local_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areDatesOverlap(final AbstractTime time, final Date date) {
		/**
		 *
		 * if time.oclIsKindOf(TimeStatement)
		 * then
		 *   let timestmt : TimeStatement[1] = time.oclAsType(TimeStatement)
		 *   in
		 *     if timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at
		 *     then not (timestmt.dateTime < date)
		 *     else not (timestmt.dateTime > date)
		 *     endif
		 * else
		 *   let interval : TimeInterval[1] = time.oclAsType(TimeInterval)
		 *   in
		 *     if interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after
		 *     then
		 *       not (interval.start.dateTime < date
		 *       ) and
		 *       not (interval.end.dateTime < date
		 *       )
		 *     else
		 *       not (interval.start.dateTime > date
		 *       ) and
		 *       not (interval.end.dateTime > date
		 *       )
		 *     endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeStatement_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_TimeStatement, null);
		final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
				.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0).booleanValue();
		/*@Thrown*/ Boolean local_2;
		if (oclIsKindOf) {
			/*@Caught*/ Object CAUGHT_timestmt;
			try {
				final /*@Thrown*/ TimeStatement timestmt = (TimeStatement) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0);
				CAUGHT_timestmt = timestmt;
			} catch (Exception e) {
				CAUGHT_timestmt = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ Object CAUGHT_or;
			try {
				/*@Caught*/ Object CAUGHT_eq;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ TimePreposition preposition = ((TimeStatement) CAUGHT_timestmt).getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition.getName()));
					final /*@Thrown*/ boolean eq = BOXED_preposition == PrivacyModelTables.ELITid_from;
					CAUGHT_eq = eq;
				} catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_0;
					try {
						if (CAUGHT_timestmt instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_timestmt;
						}
						final /*@Thrown*/ TimePreposition preposition_0 = ((TimeStatement) CAUGHT_timestmt)
								.getPreposition();
						final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_0 = PrivacyModelTables.ENUMid_TimePreposition
								.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_0.getName()));
						final /*@Thrown*/ boolean eq_0 = BOXED_preposition_0 == PrivacyModelTables.ELITid_after;
						CAUGHT_eq_0 = eq_0;
					} catch (Exception e) {
						CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq;
						}
						if (CAUGHT_eq_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_0;
						}
						or = ValueUtil.FALSE_VALUE;
					}
				}
				CAUGHT_or = or;
			} catch (Exception e) {
				CAUGHT_or = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_0;
			if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
				or_0 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_1;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ TimePreposition preposition_1 = ((TimeStatement) CAUGHT_timestmt)
							.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_1 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_1.getName()));
					final /*@Thrown*/ boolean eq_1 = BOXED_preposition_1 == PrivacyModelTables.ELITid_at;
					CAUGHT_eq_1 = eq_1;
				} catch (Exception e) {
					CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
					or_0 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_or instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_or;
					}
					if (CAUGHT_eq_1 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_1;
					}
					if (CAUGHT_or == null) {
						or_0 = null;
					} else {
						or_0 = ValueUtil.FALSE_VALUE;
					}
				}
			}
			if (or_0 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_0;
			if (or_0) {
				/*@Caught*/ Object CAUGHT_lt;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ Date dateTime = ((TimeStatement) CAUGHT_timestmt).getDateTime();
					final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE
							.evaluate(executor, dateTime, date).booleanValue();
					CAUGHT_lt = lt;
				} catch (Exception e) {
					CAUGHT_lt = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_lt instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_lt;
				}
				final /*@Thrown*/ Boolean not;
				if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {
					not = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_lt == ValueUtil.TRUE_VALUE) {
						not = ValueUtil.FALSE_VALUE;
					} else {
						not = null;
					}
				}
				local_0 = not;
			} else {
				/*@Caught*/ Object CAUGHT_gt;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ Date dateTime_0 = ((TimeStatement) CAUGHT_timestmt).getDateTime();
					final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, dateTime_0, date).booleanValue();
					CAUGHT_gt = gt;
				} catch (Exception e) {
					CAUGHT_gt = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_gt instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_gt;
				}
				final /*@Thrown*/ Boolean not_0;
				if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
					not_0 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
						not_0 = ValueUtil.FALSE_VALUE;
					} else {
						not_0 = null;
					}
				}
				local_0 = not_0;
			}
			local_2 = local_0;
		} else {
			/*@Caught*/ Object CAUGHT_interval;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeInterval_0 = idResolver
						.getClass(PrivacyModelTables.CLSSid_TimeInterval, null);
				final /*@Thrown*/ TimeInterval interval = (TimeInterval) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeInterval_0);
				CAUGHT_interval = interval;
			} catch (Exception e) {
				CAUGHT_interval = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ Object CAUGHT_eq_2;
			try {
				if (CAUGHT_interval instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_interval;
				}
				final /*@Thrown*/ TimeStatement start = ((TimeInterval) CAUGHT_interval).getStart();
				final /*@Thrown*/ TimePreposition preposition_2 = start.getPreposition();
				final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_2 = PrivacyModelTables.ENUMid_TimePreposition
						.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_2.getName()));
				final /*@Thrown*/ boolean eq_2 = BOXED_preposition_2 == PrivacyModelTables.ELITid_from;
				CAUGHT_eq_2 = eq_2;
			} catch (Exception e) {
				CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_1;
			if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
				or_1 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_3;
				try {
					if (CAUGHT_interval instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_interval;
					}
					final /*@Thrown*/ TimeStatement start_0 = ((TimeInterval) CAUGHT_interval).getStart();
					final /*@Thrown*/ TimePreposition preposition_3 = start_0.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_3 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_3.getName()));
					final /*@Thrown*/ boolean eq_3 = BOXED_preposition_3 == PrivacyModelTables.ELITid_after;
					CAUGHT_eq_3 = eq_3;
				} catch (Exception e) {
					CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
					or_1 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_eq_2 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_2;
					}
					if (CAUGHT_eq_3 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_3;
					}
					or_1 = ValueUtil.FALSE_VALUE;
				}
			}
			if (or_1 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_1;
			if (or_1) {
				/*@Caught*/ Object CAUGHT_not_1;
				try {
					/*@Caught*/ Object CAUGHT_lt_0;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement start_1 = ((TimeInterval) CAUGHT_interval).getStart();
						final /*@Thrown*/ Date dateTime_1 = start_1.getDateTime();
						final /*@Thrown*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE
								.evaluate(executor, dateTime_1, date).booleanValue();
						CAUGHT_lt_0 = lt_0;
					} catch (Exception e) {
						CAUGHT_lt_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_lt_0 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_lt_0;
					}
					final /*@Thrown*/ Boolean not_1;
					if (CAUGHT_lt_0 == ValueUtil.FALSE_VALUE) {
						not_1 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_lt_0 == ValueUtil.TRUE_VALUE) {
							not_1 = ValueUtil.FALSE_VALUE;
						} else {
							not_1 = null;
						}
					}
					CAUGHT_not_1 = not_1;
				} catch (Exception e) {
					CAUGHT_not_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean and;
				if (CAUGHT_not_1 == ValueUtil.FALSE_VALUE) {
					and = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_not_2;
					try {
						/*@Caught*/ Object CAUGHT_lt_1;
						try {
							if (CAUGHT_interval instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_interval;
							}
							final /*@Thrown*/ TimeStatement end = ((TimeInterval) CAUGHT_interval).getEnd();
							final /*@Thrown*/ Date dateTime_2 = end.getDateTime();
							final /*@Thrown*/ boolean lt_1 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, dateTime_2, date).booleanValue();
							CAUGHT_lt_1 = lt_1;
						} catch (Exception e) {
							CAUGHT_lt_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_lt_1;
						}
						final /*@Thrown*/ Boolean not_2;
						if (CAUGHT_lt_1 == ValueUtil.FALSE_VALUE) {
							not_2 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_lt_1 == ValueUtil.TRUE_VALUE) {
								not_2 = ValueUtil.FALSE_VALUE;
							} else {
								not_2 = null;
							}
						}
						CAUGHT_not_2 = not_2;
					} catch (Exception e) {
						CAUGHT_not_2 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_not_2 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_not_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_1;
						}
						if (CAUGHT_not_2 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_2;
						}
						if ((CAUGHT_not_1 == null) || (CAUGHT_not_2 == null)) {
							and = null;
						} else {
							and = ValueUtil.TRUE_VALUE;
						}
					}
				}
				local_1 = and;
			} else {
				/*@Caught*/ Object CAUGHT_not_3;
				try {
					/*@Caught*/ Object CAUGHT_gt_0;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement start_2 = ((TimeInterval) CAUGHT_interval).getStart();
						final /*@Thrown*/ Date dateTime_3 = start_2.getDateTime();
						final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, dateTime_3, date).booleanValue();
						CAUGHT_gt_0 = gt_0;
					} catch (Exception e) {
						CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_gt_0 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_gt_0;
					}
					final /*@Thrown*/ Boolean not_3;
					if (CAUGHT_gt_0 == ValueUtil.FALSE_VALUE) {
						not_3 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_gt_0 == ValueUtil.TRUE_VALUE) {
							not_3 = ValueUtil.FALSE_VALUE;
						} else {
							not_3 = null;
						}
					}
					CAUGHT_not_3 = not_3;
				} catch (Exception e) {
					CAUGHT_not_3 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean and_0;
				if (CAUGHT_not_3 == ValueUtil.FALSE_VALUE) {
					and_0 = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_not_4;
					try {
						/*@Caught*/ Object CAUGHT_gt_1;
						try {
							if (CAUGHT_interval instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_interval;
							}
							final /*@Thrown*/ TimeStatement end_0 = ((TimeInterval) CAUGHT_interval).getEnd();
							final /*@Thrown*/ Date dateTime_4 = end_0.getDateTime();
							final /*@Thrown*/ boolean gt_1 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, dateTime_4, date).booleanValue();
							CAUGHT_gt_1 = gt_1;
						} catch (Exception e) {
							CAUGHT_gt_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_gt_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_gt_1;
						}
						final /*@Thrown*/ Boolean not_4;
						if (CAUGHT_gt_1 == ValueUtil.FALSE_VALUE) {
							not_4 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_gt_1 == ValueUtil.TRUE_VALUE) {
								not_4 = ValueUtil.FALSE_VALUE;
							} else {
								not_4 = null;
							}
						}
						CAUGHT_not_4 = not_4;
					} catch (Exception e) {
						CAUGHT_not_4 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_not_4 == ValueUtil.FALSE_VALUE) {
						and_0 = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_not_3 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_3;
						}
						if (CAUGHT_not_4 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_4;
						}
						if ((CAUGHT_not_3 == null) || (CAUGHT_not_4 == null)) {
							and_0 = null;
						} else {
							and_0 = ValueUtil.TRUE_VALUE;
						}
					}
				}
				local_1 = and_0;
			}
			local_2 = local_1;
		}
		if (local_2 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::areDatesOverlap(privacyModel::AbstractTime[1],ecore::EDate[1]) : Boolean[1]\'");
		}
		return local_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean doesIntervalStartBeforeInterval(final AbstractTime startInterval,
			final AbstractTime finishInterval) {
		/**
		 *
		 * if startInterval.oclIsKindOf(TimeStatement)
		 * then
		 *   let
		 *     timestmt : TimeStatement[1] = startInterval.oclAsType(TimeStatement)
		 *   in
		 *     if timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at
		 *     then
		 *       isDateBeforeInterval(finishInterval, timestmt.dateTime)
		 *     else
		 *       not isDateBeforeInterval(finishInterval, timestmt.dateTime)
		 *     endif
		 * else
		 *   let
		 *     interval : TimeInterval[1] = startInterval.oclAsType(TimeInterval)
		 *   in
		 *     if interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after or interval.start.preposition = TimePreposition::at
		 *     then
		 *       isDateBeforeInterval(finishInterval, interval.start.dateTime) and
		 *       not isDateBeforeInterval(finishInterval, interval.end.dateTime)
		 *     else
		 *       not isDateBeforeInterval(finishInterval, interval.start.dateTime) and
		 *       isDateBeforeInterval(finishInterval, interval.end.dateTime)
		 *     endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeStatement_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_TimeStatement, null);
		final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
				.evaluate(executor, startInterval, TYP_privacyModel_c_c_TimeStatement_0).booleanValue();
		/*@Thrown*/ Boolean local_2;
		if (oclIsKindOf) {
			/*@Caught*/ Object CAUGHT_timestmt;
			try {
				final /*@Thrown*/ TimeStatement timestmt = (TimeStatement) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, startInterval, TYP_privacyModel_c_c_TimeStatement_0);
				CAUGHT_timestmt = timestmt;
			} catch (Exception e) {
				CAUGHT_timestmt = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ Object CAUGHT_or;
			try {
				/*@Caught*/ Object CAUGHT_eq;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ TimePreposition preposition = ((TimeStatement) CAUGHT_timestmt).getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition.getName()));
					final /*@Thrown*/ boolean eq = BOXED_preposition == PrivacyModelTables.ELITid_from;
					CAUGHT_eq = eq;
				} catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_0;
					try {
						if (CAUGHT_timestmt instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_timestmt;
						}
						final /*@Thrown*/ TimePreposition preposition_0 = ((TimeStatement) CAUGHT_timestmt)
								.getPreposition();
						final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_0 = PrivacyModelTables.ENUMid_TimePreposition
								.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_0.getName()));
						final /*@Thrown*/ boolean eq_0 = BOXED_preposition_0 == PrivacyModelTables.ELITid_after;
						CAUGHT_eq_0 = eq_0;
					} catch (Exception e) {
						CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq;
						}
						if (CAUGHT_eq_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_0;
						}
						or = ValueUtil.FALSE_VALUE;
					}
				}
				CAUGHT_or = or;
			} catch (Exception e) {
				CAUGHT_or = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_0;
			if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
				or_0 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_1;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ TimePreposition preposition_1 = ((TimeStatement) CAUGHT_timestmt)
							.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_1 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_1.getName()));
					final /*@Thrown*/ boolean eq_1 = BOXED_preposition_1 == PrivacyModelTables.ELITid_at;
					CAUGHT_eq_1 = eq_1;
				} catch (Exception e) {
					CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
					or_0 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_or instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_or;
					}
					if (CAUGHT_eq_1 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_1;
					}
					if (CAUGHT_or == null) {
						or_0 = null;
					} else {
						or_0 = ValueUtil.FALSE_VALUE;
					}
				}
			}
			if (or_0 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_0;
			if (or_0) {
				if (CAUGHT_timestmt instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_timestmt;
				}
				final /*@Thrown*/ Date dateTime = ((TimeStatement) CAUGHT_timestmt).getDateTime();
				final /*@Thrown*/ boolean isDateBeforeInterval = this.isDateBeforeInterval(finishInterval, dateTime);
				local_0 = isDateBeforeInterval;
			} else {
				/*@Caught*/ Object CAUGHT_isDateBeforeInterval_0;
				try {
					if (CAUGHT_timestmt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_timestmt;
					}
					final /*@Thrown*/ Date dateTime_0 = ((TimeStatement) CAUGHT_timestmt).getDateTime();
					final /*@Thrown*/ boolean isDateBeforeInterval_0 = this.isDateBeforeInterval(finishInterval,
							dateTime_0);
					CAUGHT_isDateBeforeInterval_0 = isDateBeforeInterval_0;
				} catch (Exception e) {
					CAUGHT_isDateBeforeInterval_0 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_isDateBeforeInterval_0 instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_isDateBeforeInterval_0;
				}
				final /*@Thrown*/ Boolean not;
				if (CAUGHT_isDateBeforeInterval_0 == ValueUtil.FALSE_VALUE) {
					not = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_isDateBeforeInterval_0 == ValueUtil.TRUE_VALUE) {
						not = ValueUtil.FALSE_VALUE;
					} else {
						not = null;
					}
				}
				local_0 = not;
			}
			local_2 = local_0;
		} else {
			/*@Caught*/ Object CAUGHT_interval;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeInterval_0 = idResolver
						.getClass(PrivacyModelTables.CLSSid_TimeInterval, null);
				final /*@Thrown*/ TimeInterval interval = (TimeInterval) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, startInterval, TYP_privacyModel_c_c_TimeInterval_0);
				CAUGHT_interval = interval;
			} catch (Exception e) {
				CAUGHT_interval = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ Object CAUGHT_or_1;
			try {
				/*@Caught*/ Object CAUGHT_eq_2;
				try {
					if (CAUGHT_interval instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_interval;
					}
					final /*@Thrown*/ TimeStatement start = ((TimeInterval) CAUGHT_interval).getStart();
					final /*@Thrown*/ TimePreposition preposition_2 = start.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_2 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_2.getName()));
					final /*@Thrown*/ boolean eq_2 = BOXED_preposition_2 == PrivacyModelTables.ELITid_from;
					CAUGHT_eq_2 = eq_2;
				} catch (Exception e) {
					CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or_1;
				if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
					or_1 = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_3;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement start_0 = ((TimeInterval) CAUGHT_interval).getStart();
						final /*@Thrown*/ TimePreposition preposition_3 = start_0.getPreposition();
						final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_3 = PrivacyModelTables.ENUMid_TimePreposition
								.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_3.getName()));
						final /*@Thrown*/ boolean eq_3 = BOXED_preposition_3 == PrivacyModelTables.ELITid_after;
						CAUGHT_eq_3 = eq_3;
					} catch (Exception e) {
						CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
						or_1 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq_2 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_2;
						}
						if (CAUGHT_eq_3 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_3;
						}
						or_1 = ValueUtil.FALSE_VALUE;
					}
				}
				CAUGHT_or_1 = or_1;
			} catch (Exception e) {
				CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_2;
			if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
				or_2 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_4;
				try {
					if (CAUGHT_interval instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_interval;
					}
					final /*@Thrown*/ TimeStatement start_1 = ((TimeInterval) CAUGHT_interval).getStart();
					final /*@Thrown*/ TimePreposition preposition_4 = start_1.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_4 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_4.getName()));
					final /*@Thrown*/ boolean eq_4 = BOXED_preposition_4 == PrivacyModelTables.ELITid_at;
					CAUGHT_eq_4 = eq_4;
				} catch (Exception e) {
					CAUGHT_eq_4 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_4 == ValueUtil.TRUE_VALUE) {
					or_2 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_or_1 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_or_1;
					}
					if (CAUGHT_eq_4 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_4;
					}
					if (CAUGHT_or_1 == null) {
						or_2 = null;
					} else {
						or_2 = ValueUtil.FALSE_VALUE;
					}
				}
			}
			if (or_2 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_1;
			if (or_2) {
				/*@Caught*/ Object CAUGHT_isDateBeforeInterval_1;
				try {
					if (CAUGHT_interval instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_interval;
					}
					final /*@Thrown*/ TimeStatement start_2 = ((TimeInterval) CAUGHT_interval).getStart();
					final /*@Thrown*/ Date dateTime_1 = start_2.getDateTime();
					final /*@Thrown*/ boolean isDateBeforeInterval_1 = this.isDateBeforeInterval(finishInterval,
							dateTime_1);
					CAUGHT_isDateBeforeInterval_1 = isDateBeforeInterval_1;
				} catch (Exception e) {
					CAUGHT_isDateBeforeInterval_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean and;
				if (CAUGHT_isDateBeforeInterval_1 == ValueUtil.FALSE_VALUE) {
					and = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_not_0;
					try {
						/*@Caught*/ Object CAUGHT_isDateBeforeInterval_2;
						try {
							if (CAUGHT_interval instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_interval;
							}
							final /*@Thrown*/ TimeStatement end = ((TimeInterval) CAUGHT_interval).getEnd();
							final /*@Thrown*/ Date dateTime_2 = end.getDateTime();
							final /*@Thrown*/ boolean isDateBeforeInterval_2 = this.isDateBeforeInterval(finishInterval,
									dateTime_2);
							CAUGHT_isDateBeforeInterval_2 = isDateBeforeInterval_2;
						} catch (Exception e) {
							CAUGHT_isDateBeforeInterval_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_isDateBeforeInterval_2 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_isDateBeforeInterval_2;
						}
						final /*@Thrown*/ Boolean not_0;
						if (CAUGHT_isDateBeforeInterval_2 == ValueUtil.FALSE_VALUE) {
							not_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_isDateBeforeInterval_2 == ValueUtil.TRUE_VALUE) {
								not_0 = ValueUtil.FALSE_VALUE;
							} else {
								not_0 = null;
							}
						}
						CAUGHT_not_0 = not_0;
					} catch (Exception e) {
						CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_not_0 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_isDateBeforeInterval_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_isDateBeforeInterval_1;
						}
						if (CAUGHT_not_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_0;
						}
						if (CAUGHT_not_0 == null) {
							and = null;
						} else {
							and = ValueUtil.TRUE_VALUE;
						}
					}
				}
				local_1 = and;
			} else {
				/*@Caught*/ Object CAUGHT_not_1;
				try {
					/*@Caught*/ Object CAUGHT_isDateBeforeInterval_3;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement start_3 = ((TimeInterval) CAUGHT_interval).getStart();
						final /*@Thrown*/ Date dateTime_3 = start_3.getDateTime();
						final /*@Thrown*/ boolean isDateBeforeInterval_3 = this.isDateBeforeInterval(finishInterval,
								dateTime_3);
						CAUGHT_isDateBeforeInterval_3 = isDateBeforeInterval_3;
					} catch (Exception e) {
						CAUGHT_isDateBeforeInterval_3 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_isDateBeforeInterval_3 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_isDateBeforeInterval_3;
					}
					final /*@Thrown*/ Boolean not_1;
					if (CAUGHT_isDateBeforeInterval_3 == ValueUtil.FALSE_VALUE) {
						not_1 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_isDateBeforeInterval_3 == ValueUtil.TRUE_VALUE) {
							not_1 = ValueUtil.FALSE_VALUE;
						} else {
							not_1 = null;
						}
					}
					CAUGHT_not_1 = not_1;
				} catch (Exception e) {
					CAUGHT_not_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean and_0;
				if (CAUGHT_not_1 == ValueUtil.FALSE_VALUE) {
					and_0 = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_isDateBeforeInterval_4;
					try {
						if (CAUGHT_interval instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_interval;
						}
						final /*@Thrown*/ TimeStatement end_0 = ((TimeInterval) CAUGHT_interval).getEnd();
						final /*@Thrown*/ Date dateTime_4 = end_0.getDateTime();
						final /*@Thrown*/ boolean isDateBeforeInterval_4 = this.isDateBeforeInterval(finishInterval,
								dateTime_4);
						CAUGHT_isDateBeforeInterval_4 = isDateBeforeInterval_4;
					} catch (Exception e) {
						CAUGHT_isDateBeforeInterval_4 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_isDateBeforeInterval_4 == ValueUtil.FALSE_VALUE) {
						and_0 = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_not_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_1;
						}
						if (CAUGHT_isDateBeforeInterval_4 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_isDateBeforeInterval_4;
						}
						if (CAUGHT_not_1 == null) {
							and_0 = null;
						} else {
							and_0 = ValueUtil.TRUE_VALUE;
						}
					}
				}
				local_1 = and_0;
			}
			local_2 = local_1;
		}
		if (local_2 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::doesIntervalStartBeforeInterval(privacyModel::AbstractTime[1],privacyModel::AbstractTime[1]) : Boolean[1]\'");
		}
		return local_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateBeforeInterval(final AbstractTime time, final Date date) {
		/**
		 *
		 * if time.oclIsKindOf(TimeStatement)
		 * then
		 *   let timestmt : TimeStatement[1] = time.oclAsType(TimeStatement)
		 *   in
		 *     if timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at
		 *     then date < timestmt.dateTime
		 *     else timestmt.dateTime < date
		 *     endif
		 * else
		 *   let interval : TimeInterval[1] = time.oclAsType(TimeInterval)
		 *   in
		 *     if interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after
		 *     then
		 *       if interval.start.dateTime < interval.end.dateTime
		 *       then interval.start.dateTime > date and interval.end.dateTime > date
		 *       else false
		 *       endif
		 *     else
		 *       if interval.end.dateTime < interval.start.dateTime
		 *       then interval.start.dateTime > date and interval.end.dateTime > date
		 *       else false
		 *       endif
		 *     endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeStatement_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_TimeStatement, null);
		final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
				.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0).booleanValue();
		/*@Thrown*/ Boolean local_4;
		if (oclIsKindOf) {
			/*@Caught*/ Object CAUGHT_timestmt;
			try {
				final /*@Thrown*/ TimeStatement timestmt = (TimeStatement) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0);
				CAUGHT_timestmt = timestmt;
			} catch (Exception e) {
				CAUGHT_timestmt = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_timestmt instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_timestmt;
			}
			final /*@Thrown*/ Date dateTime_0 = ((TimeStatement) CAUGHT_timestmt).getDateTime();
			/*@Caught*/ Object CAUGHT_or;
			try {
				/*@Caught*/ Object CAUGHT_eq;
				try {
					final /*@Thrown*/ TimePreposition preposition = ((TimeStatement) CAUGHT_timestmt).getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition.getName()));
					final /*@Thrown*/ boolean eq = BOXED_preposition == PrivacyModelTables.ELITid_from;
					CAUGHT_eq = eq;
				} catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_0;
					try {
						final /*@Thrown*/ TimePreposition preposition_0 = ((TimeStatement) CAUGHT_timestmt)
								.getPreposition();
						final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_0 = PrivacyModelTables.ENUMid_TimePreposition
								.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_0.getName()));
						final /*@Thrown*/ boolean eq_0 = BOXED_preposition_0 == PrivacyModelTables.ELITid_after;
						CAUGHT_eq_0 = eq_0;
					} catch (Exception e) {
						CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq;
						}
						if (CAUGHT_eq_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_0;
						}
						or = ValueUtil.FALSE_VALUE;
					}
				}
				CAUGHT_or = or;
			} catch (Exception e) {
				CAUGHT_or = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_0;
			if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
				or_0 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_1;
				try {
					final /*@Thrown*/ TimePreposition preposition_1 = ((TimeStatement) CAUGHT_timestmt)
							.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_1 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_1.getName()));
					final /*@Thrown*/ boolean eq_1 = BOXED_preposition_1 == PrivacyModelTables.ELITid_at;
					CAUGHT_eq_1 = eq_1;
				} catch (Exception e) {
					CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
					or_0 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_or instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_or;
					}
					if (CAUGHT_eq_1 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_1;
					}
					if (CAUGHT_or == null) {
						or_0 = null;
					} else {
						or_0 = ValueUtil.FALSE_VALUE;
					}
				}
			}
			if (or_0 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ boolean local_0;
			if (or_0) {
				if (dateTime_0 instanceof InvalidValueException) {
					throw (InvalidValueException) dateTime_0;
				}
				final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, date, dateTime_0).booleanValue();
				local_0 = lt;
			} else {
				final /*@Thrown*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_0, date).booleanValue();
				local_0 = lt_0;
			}
			local_4 = local_0;
		} else {
			/*@Caught*/ Object CAUGHT_interval;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeInterval_0 = idResolver
						.getClass(PrivacyModelTables.CLSSid_TimeInterval, null);
				final /*@Thrown*/ TimeInterval interval = (TimeInterval) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeInterval_0);
				CAUGHT_interval = interval;
			} catch (Exception e) {
				CAUGHT_interval = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_interval instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_interval;
			}
			final /*@Thrown*/ TimeStatement end_1 = ((TimeInterval) CAUGHT_interval).getEnd();
			final /*@Thrown*/ TimeStatement start_3 = ((TimeInterval) CAUGHT_interval).getStart();
			final /*@Thrown*/ Date dateTime_5 = end_1.getDateTime();
			final /*@Thrown*/ Date dateTime_6 = start_3.getDateTime();
			/*@Caught*/ Object CAUGHT_eq_2;
			try {
				final /*@Thrown*/ TimePreposition preposition_2 = start_3.getPreposition();
				final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_2 = PrivacyModelTables.ENUMid_TimePreposition
						.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_2.getName()));
				final /*@Thrown*/ boolean eq_2 = BOXED_preposition_2 == PrivacyModelTables.ELITid_from;
				CAUGHT_eq_2 = eq_2;
			} catch (Exception e) {
				CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_1;
			if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
				or_1 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_3;
				try {
					final /*@Thrown*/ TimePreposition preposition_3 = start_3.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_3 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_3.getName()));
					final /*@Thrown*/ boolean eq_3 = BOXED_preposition_3 == PrivacyModelTables.ELITid_after;
					CAUGHT_eq_3 = eq_3;
				} catch (Exception e) {
					CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
					or_1 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_eq_2 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_2;
					}
					if (CAUGHT_eq_3 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_3;
					}
					or_1 = ValueUtil.FALSE_VALUE;
				}
			}
			if (or_1 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_3;
			if (or_1) {
				if (dateTime_5 instanceof InvalidValueException) {
					throw (InvalidValueException) dateTime_5;
				}
				final /*@Thrown*/ boolean lt_1 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_6, dateTime_5).booleanValue();
				/*@Thrown*/ Boolean local_1;
				if (lt_1) {
					/*@Caught*/ Object CAUGHT_gt;
					try {
						final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, dateTime_6, date).booleanValue();
						CAUGHT_gt = gt;
					} catch (Exception e) {
						CAUGHT_gt = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and;
					if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_gt_0;
						try {
							final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, dateTime_5, date).booleanValue();
							CAUGHT_gt_0 = gt_0;
						} catch (Exception e) {
							CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_gt_0 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_gt instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt;
							}
							if (CAUGHT_gt_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt_0;
							}
							and = ValueUtil.TRUE_VALUE;
						}
					}
					local_1 = and;
				} else {
					local_1 = ValueUtil.FALSE_VALUE;
				}
				local_3 = local_1;
			} else {
				if (dateTime_6 instanceof InvalidValueException) {
					throw (InvalidValueException) dateTime_6;
				}
				final /*@Thrown*/ boolean lt_2 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_5, dateTime_6).booleanValue();
				/*@Thrown*/ Boolean local_2;
				if (lt_2) {
					/*@Caught*/ Object CAUGHT_gt_1;
					try {
						final /*@Thrown*/ boolean gt_1 = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, dateTime_6, date).booleanValue();
						CAUGHT_gt_1 = gt_1;
					} catch (Exception e) {
						CAUGHT_gt_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_0;
					if (CAUGHT_gt_1 == ValueUtil.FALSE_VALUE) {
						and_0 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_gt_2;
						try {
							final /*@Thrown*/ boolean gt_2 = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, dateTime_5, date).booleanValue();
							CAUGHT_gt_2 = gt_2;
						} catch (Exception e) {
							CAUGHT_gt_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_gt_2 == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_gt_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt_1;
							}
							if (CAUGHT_gt_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt_2;
							}
							and_0 = ValueUtil.TRUE_VALUE;
						}
					}
					local_2 = and_0;
				} else {
					local_2 = ValueUtil.FALSE_VALUE;
				}
				local_3 = local_2;
			}
			local_4 = local_3;
		}
		if (local_4 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::isDateBeforeInterval(privacyModel::AbstractTime[1],ecore::EDate[1]) : Boolean[1]\'");
		}
		return local_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateAfterInterval(final AbstractTime time, final Date date) {
		/**
		 *
		 * if time.oclIsKindOf(TimeStatement)
		 * then
		 *   let timestmt : TimeStatement[1] = time.oclAsType(TimeStatement)
		 *   in
		 *     if timestmt.preposition = TimePreposition::to or timestmt.preposition = TimePreposition::before or timestmt.preposition = TimePreposition::until
		 *     then timestmt.dateTime > date
		 *     else timestmt.dateTime < date
		 *     endif
		 * else
		 *   let interval : TimeInterval[1] = time.oclAsType(TimeInterval)
		 *   in
		 *     if interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after
		 *     then
		 *       if interval.start.dateTime < interval.end.dateTime
		 *       then interval.start.dateTime < date and interval.end.dateTime < date
		 *       else false
		 *       endif
		 *     else
		 *       if interval.end.dateTime < interval.start.dateTime
		 *       then interval.start.dateTime < date and interval.end.dateTime < date
		 *       else false
		 *       endif
		 *     endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeStatement_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_TimeStatement, null);
		final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
				.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0).booleanValue();
		/*@Thrown*/ Boolean local_4;
		if (oclIsKindOf) {
			/*@Caught*/ Object CAUGHT_timestmt;
			try {
				final /*@Thrown*/ TimeStatement timestmt = (TimeStatement) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0);
				CAUGHT_timestmt = timestmt;
			} catch (Exception e) {
				CAUGHT_timestmt = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_timestmt instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_timestmt;
			}
			final /*@Thrown*/ Date dateTime_0 = ((TimeStatement) CAUGHT_timestmt).getDateTime();
			/*@Caught*/ Object CAUGHT_or;
			try {
				/*@Caught*/ Object CAUGHT_eq;
				try {
					final /*@Thrown*/ TimePreposition preposition = ((TimeStatement) CAUGHT_timestmt).getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition.getName()));
					final /*@Thrown*/ boolean eq = BOXED_preposition == PrivacyModelTables.ELITid_to;
					CAUGHT_eq = eq;
				} catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_0;
					try {
						final /*@Thrown*/ TimePreposition preposition_0 = ((TimeStatement) CAUGHT_timestmt)
								.getPreposition();
						final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_0 = PrivacyModelTables.ENUMid_TimePreposition
								.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_0.getName()));
						final /*@Thrown*/ boolean eq_0 = BOXED_preposition_0 == PrivacyModelTables.ELITid_before;
						CAUGHT_eq_0 = eq_0;
					} catch (Exception e) {
						CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq;
						}
						if (CAUGHT_eq_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_0;
						}
						or = ValueUtil.FALSE_VALUE;
					}
				}
				CAUGHT_or = or;
			} catch (Exception e) {
				CAUGHT_or = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_0;
			if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
				or_0 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_1;
				try {
					final /*@Thrown*/ TimePreposition preposition_1 = ((TimeStatement) CAUGHT_timestmt)
							.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_1 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_1.getName()));
					final /*@Thrown*/ boolean eq_1 = BOXED_preposition_1 == PrivacyModelTables.ELITid_until;
					CAUGHT_eq_1 = eq_1;
				} catch (Exception e) {
					CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
					or_0 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_or instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_or;
					}
					if (CAUGHT_eq_1 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_1;
					}
					if (CAUGHT_or == null) {
						or_0 = null;
					} else {
						or_0 = ValueUtil.FALSE_VALUE;
					}
				}
			}
			if (or_0 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ boolean local_0;
			if (or_0) {
				final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, dateTime_0, date).booleanValue();
				local_0 = gt;
			} else {
				final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_0, date).booleanValue();
				local_0 = lt;
			}
			local_4 = local_0;
		} else {
			/*@Caught*/ Object CAUGHT_interval;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeInterval_0 = idResolver
						.getClass(PrivacyModelTables.CLSSid_TimeInterval, null);
				final /*@Thrown*/ TimeInterval interval = (TimeInterval) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeInterval_0);
				CAUGHT_interval = interval;
			} catch (Exception e) {
				CAUGHT_interval = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_interval instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_interval;
			}
			final /*@Thrown*/ TimeStatement end_1 = ((TimeInterval) CAUGHT_interval).getEnd();
			final /*@Thrown*/ TimeStatement start_3 = ((TimeInterval) CAUGHT_interval).getStart();
			final /*@Thrown*/ Date dateTime_5 = end_1.getDateTime();
			final /*@Thrown*/ Date dateTime_6 = start_3.getDateTime();
			/*@Caught*/ Object CAUGHT_eq_2;
			try {
				final /*@Thrown*/ TimePreposition preposition_2 = start_3.getPreposition();
				final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_2 = PrivacyModelTables.ENUMid_TimePreposition
						.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_2.getName()));
				final /*@Thrown*/ boolean eq_2 = BOXED_preposition_2 == PrivacyModelTables.ELITid_from;
				CAUGHT_eq_2 = eq_2;
			} catch (Exception e) {
				CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_1;
			if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
				or_1 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_3;
				try {
					final /*@Thrown*/ TimePreposition preposition_3 = start_3.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_3 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_3.getName()));
					final /*@Thrown*/ boolean eq_3 = BOXED_preposition_3 == PrivacyModelTables.ELITid_after;
					CAUGHT_eq_3 = eq_3;
				} catch (Exception e) {
					CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
					or_1 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_eq_2 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_2;
					}
					if (CAUGHT_eq_3 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_3;
					}
					or_1 = ValueUtil.FALSE_VALUE;
				}
			}
			if (or_1 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_3;
			if (or_1) {
				if (dateTime_5 instanceof InvalidValueException) {
					throw (InvalidValueException) dateTime_5;
				}
				final /*@Thrown*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_6, dateTime_5).booleanValue();
				/*@Thrown*/ Boolean local_1;
				if (lt_0) {
					/*@Caught*/ Object CAUGHT_lt_1;
					try {
						final /*@Thrown*/ boolean lt_1 = OclComparableLessThanOperation.INSTANCE
								.evaluate(executor, dateTime_6, date).booleanValue();
						CAUGHT_lt_1 = lt_1;
					} catch (Exception e) {
						CAUGHT_lt_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and;
					if (CAUGHT_lt_1 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_lt_2;
						try {
							final /*@Thrown*/ boolean lt_2 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, dateTime_5, date).booleanValue();
							CAUGHT_lt_2 = lt_2;
						} catch (Exception e) {
							CAUGHT_lt_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt_2 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_lt_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_lt_1;
							}
							if (CAUGHT_lt_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_lt_2;
							}
							and = ValueUtil.TRUE_VALUE;
						}
					}
					local_1 = and;
				} else {
					local_1 = ValueUtil.FALSE_VALUE;
				}
				local_3 = local_1;
			} else {
				if (dateTime_6 instanceof InvalidValueException) {
					throw (InvalidValueException) dateTime_6;
				}
				final /*@Thrown*/ boolean lt_3 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_5, dateTime_6).booleanValue();
				/*@Thrown*/ Boolean local_2;
				if (lt_3) {
					/*@Caught*/ Object CAUGHT_lt_4;
					try {
						final /*@Thrown*/ boolean lt_4 = OclComparableLessThanOperation.INSTANCE
								.evaluate(executor, dateTime_6, date).booleanValue();
						CAUGHT_lt_4 = lt_4;
					} catch (Exception e) {
						CAUGHT_lt_4 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_0;
					if (CAUGHT_lt_4 == ValueUtil.FALSE_VALUE) {
						and_0 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_lt_5;
						try {
							final /*@Thrown*/ boolean lt_5 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, dateTime_5, date).booleanValue();
							CAUGHT_lt_5 = lt_5;
						} catch (Exception e) {
							CAUGHT_lt_5 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt_5 == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_lt_4 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_lt_4;
							}
							if (CAUGHT_lt_5 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_lt_5;
							}
							and_0 = ValueUtil.TRUE_VALUE;
						}
					}
					local_2 = and_0;
				} else {
					local_2 = ValueUtil.FALSE_VALUE;
				}
				local_3 = local_2;
			}
			local_4 = local_3;
		}
		if (local_4 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::isDateAfterInterval(privacyModel::AbstractTime[1],ecore::EDate[1]) : Boolean[1]\'");
		}
		return local_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateInInterval(final AbstractTime time, final Date date) {
		/**
		 *
		 * if time.oclIsKindOf(TimeStatement)
		 * then
		 *   let timestmt : TimeStatement[1] = time.oclAsType(TimeStatement)
		 *   in
		 *     if timestmt.preposition = TimePreposition::at
		 *     then timestmt.dateTime = date
		 *     else
		 *       if timestmt.preposition = TimePreposition::to or timestmt.preposition = TimePreposition::before or timestmt.preposition = TimePreposition::until
		 *       then not (timestmt.dateTime > date)
		 *       else not (timestmt.dateTime < date)
		 *       endif
		 *     endif
		 * else
		 *   let interval : TimeInterval[1] = time.oclAsType(TimeInterval)
		 *   in
		 *     if interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after
		 *     then
		 *       if interval.start.dateTime < interval.end.dateTime
		 *       then
		 *         not (interval.start.dateTime < date
		 *         ) and
		 *         not (interval.end.dateTime > date
		 *         )
		 *       else not (date < interval.end.dateTime) and not (date > interval.start.dateTime)
		 *       endif
		 *     else
		 *       if interval.end.dateTime < interval.start.dateTime
		 *       then
		 *         not (interval.end.dateTime < date
		 *         ) and
		 *         not (interval.start.dateTime > date
		 *         )
		 *       else not (date < interval.start.dateTime) and not (date > interval.end.dateTime)
		 *       endif
		 *     endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeStatement_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_TimeStatement, null);
		final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
				.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0).booleanValue();
		/*@Thrown*/ Boolean local_5;
		if (oclIsKindOf) {
			/*@Caught*/ Object CAUGHT_timestmt;
			try {
				final /*@Thrown*/ TimeStatement timestmt = (TimeStatement) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeStatement_0);
				CAUGHT_timestmt = timestmt;
			} catch (Exception e) {
				CAUGHT_timestmt = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_timestmt instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_timestmt;
			}
			final /*@Thrown*/ TimePreposition preposition = ((TimeStatement) CAUGHT_timestmt).getPreposition();
			final /*@Thrown*/ EnumerationLiteralId BOXED_preposition = PrivacyModelTables.ENUMid_TimePreposition
					.getEnumerationLiteralId(ClassUtil.nonNullState(preposition.getName()));
			final /*@Thrown*/ boolean eq = BOXED_preposition == PrivacyModelTables.ELITid_at;
			/*@Thrown*/ Boolean local_1;
			if (eq) {
				final /*@Thrown*/ Date dateTime = ((TimeStatement) CAUGHT_timestmt).getDateTime();
				final /*@Thrown*/ boolean eq_0 = dateTime.equals(date);
				local_1 = eq_0;
			} else {
				/*@Caught*/ Object CAUGHT_or;
				try {
					/*@Caught*/ Object CAUGHT_eq_1;
					try {
						final /*@Thrown*/ boolean eq_1 = BOXED_preposition == PrivacyModelTables.ELITid_to;
						CAUGHT_eq_1 = eq_1;
					} catch (Exception e) {
						CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean or;
					if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_eq_2;
						try {
							final /*@Thrown*/ boolean eq_2 = BOXED_preposition == PrivacyModelTables.ELITid_before;
							CAUGHT_eq_2 = eq_2;
						} catch (Exception e) {
							CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_eq_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq_1;
							}
							if (CAUGHT_eq_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq_2;
							}
							or = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_or = or;
				} catch (Exception e) {
					CAUGHT_or = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or_0;
				if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
					or_0 = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_eq_3;
					try {
						final /*@Thrown*/ boolean eq_3 = BOXED_preposition == PrivacyModelTables.ELITid_until;
						CAUGHT_eq_3 = eq_3;
					} catch (Exception e) {
						CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
						or_0 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_or instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_or;
						}
						if (CAUGHT_eq_3 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_3;
						}
						if (CAUGHT_or == null) {
							or_0 = null;
						} else {
							or_0 = ValueUtil.FALSE_VALUE;
						}
					}
				}
				if (or_0 == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@Thrown*/ Boolean local_0;
				if (or_0) {
					/*@Caught*/ Object CAUGHT_gt;
					try {
						final /*@Thrown*/ Date dateTime_0 = ((TimeStatement) CAUGHT_timestmt).getDateTime();
						final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, dateTime_0, date).booleanValue();
						CAUGHT_gt = gt;
					} catch (Exception e) {
						CAUGHT_gt = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_gt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_gt;
					}
					final /*@Thrown*/ Boolean not;
					if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					local_0 = not;
				} else {
					/*@Caught*/ Object CAUGHT_lt;
					try {
						final /*@Thrown*/ Date dateTime_1 = ((TimeStatement) CAUGHT_timestmt).getDateTime();
						final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE
								.evaluate(executor, dateTime_1, date).booleanValue();
						CAUGHT_lt = lt;
					} catch (Exception e) {
						CAUGHT_lt = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_lt instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_lt;
					}
					final /*@Thrown*/ Boolean not_0;
					if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {
						not_0 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_lt == ValueUtil.TRUE_VALUE) {
							not_0 = ValueUtil.FALSE_VALUE;
						} else {
							not_0 = null;
						}
					}
					local_0 = not_0;
				}
				local_1 = local_0;
			}
			local_5 = local_1;
		} else {
			/*@Caught*/ Object CAUGHT_interval;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_TimeInterval_0 = idResolver
						.getClass(PrivacyModelTables.CLSSid_TimeInterval, null);
				final /*@Thrown*/ TimeInterval interval = (TimeInterval) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, time, TYP_privacyModel_c_c_TimeInterval_0);
				CAUGHT_interval = interval;
			} catch (Exception e) {
				CAUGHT_interval = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_interval instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_interval;
			}
			final /*@Thrown*/ TimeStatement end_2 = ((TimeInterval) CAUGHT_interval).getEnd();
			final /*@Thrown*/ TimeStatement start_4 = ((TimeInterval) CAUGHT_interval).getStart();
			final /*@Thrown*/ Date dateTime_8 = end_2.getDateTime();
			final /*@Thrown*/ Date dateTime_9 = start_4.getDateTime();
			/*@Caught*/ Object CAUGHT_eq_4;
			try {
				final /*@Thrown*/ TimePreposition preposition_3 = start_4.getPreposition();
				final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_3 = PrivacyModelTables.ENUMid_TimePreposition
						.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_3.getName()));
				final /*@Thrown*/ boolean eq_4 = BOXED_preposition_3 == PrivacyModelTables.ELITid_from;
				CAUGHT_eq_4 = eq_4;
			} catch (Exception e) {
				CAUGHT_eq_4 = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_1;
			if (CAUGHT_eq_4 == ValueUtil.TRUE_VALUE) {
				or_1 = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_eq_5;
				try {
					final /*@Thrown*/ TimePreposition preposition_4 = start_4.getPreposition();
					final /*@Thrown*/ EnumerationLiteralId BOXED_preposition_4 = PrivacyModelTables.ENUMid_TimePreposition
							.getEnumerationLiteralId(ClassUtil.nonNullState(preposition_4.getName()));
					final /*@Thrown*/ boolean eq_5 = BOXED_preposition_4 == PrivacyModelTables.ELITid_after;
					CAUGHT_eq_5 = eq_5;
				} catch (Exception e) {
					CAUGHT_eq_5 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_5 == ValueUtil.TRUE_VALUE) {
					or_1 = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_eq_4 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_4;
					}
					if (CAUGHT_eq_5 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_5;
					}
					or_1 = ValueUtil.FALSE_VALUE;
				}
			}
			if (or_1 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ Boolean local_4;
			if (or_1) {
				if (dateTime_8 instanceof InvalidValueException) {
					throw (InvalidValueException) dateTime_8;
				}
				final /*@Thrown*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_9, dateTime_8).booleanValue();
				/*@Thrown*/ Boolean local_2;
				if (lt_0) {
					/*@Caught*/ Object CAUGHT_not_1;
					try {
						/*@Caught*/ Object CAUGHT_lt_1;
						try {
							final /*@Thrown*/ boolean lt_1 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, dateTime_9, date).booleanValue();
							CAUGHT_lt_1 = lt_1;
						} catch (Exception e) {
							CAUGHT_lt_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_lt_1;
						}
						final /*@Thrown*/ Boolean not_1;
						if (CAUGHT_lt_1 == ValueUtil.FALSE_VALUE) {
							not_1 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_lt_1 == ValueUtil.TRUE_VALUE) {
								not_1 = ValueUtil.FALSE_VALUE;
							} else {
								not_1 = null;
							}
						}
						CAUGHT_not_1 = not_1;
					} catch (Exception e) {
						CAUGHT_not_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and;
					if (CAUGHT_not_1 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not_2;
						try {
							/*@Caught*/ Object CAUGHT_gt_0;
							try {
								final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, dateTime_8, date).booleanValue();
								CAUGHT_gt_0 = gt_0;
							} catch (Exception e) {
								CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_gt_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt_0;
							}
							final /*@Thrown*/ Boolean not_2;
							if (CAUGHT_gt_0 == ValueUtil.FALSE_VALUE) {
								not_2 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_gt_0 == ValueUtil.TRUE_VALUE) {
									not_2 = ValueUtil.FALSE_VALUE;
								} else {
									not_2 = null;
								}
							}
							CAUGHT_not_2 = not_2;
						} catch (Exception e) {
							CAUGHT_not_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not_2 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_not_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_1;
							}
							if (CAUGHT_not_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_2;
							}
							if ((CAUGHT_not_1 == null) || (CAUGHT_not_2 == null)) {
								and = null;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
					}
					local_2 = and;
				} else {
					/*@Caught*/ Object CAUGHT_not_3;
					try {
						/*@Caught*/ Object CAUGHT_lt_2;
						try {
							if (dateTime_8 instanceof InvalidValueException) {
								throw (InvalidValueException) dateTime_8;
							}
							final /*@Thrown*/ boolean lt_2 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, date, dateTime_8).booleanValue();
							CAUGHT_lt_2 = lt_2;
						} catch (Exception e) {
							CAUGHT_lt_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt_2 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_lt_2;
						}
						final /*@Thrown*/ Boolean not_3;
						if (CAUGHT_lt_2 == ValueUtil.FALSE_VALUE) {
							not_3 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_lt_2 == ValueUtil.TRUE_VALUE) {
								not_3 = ValueUtil.FALSE_VALUE;
							} else {
								not_3 = null;
							}
						}
						CAUGHT_not_3 = not_3;
					} catch (Exception e) {
						CAUGHT_not_3 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_0;
					if (CAUGHT_not_3 == ValueUtil.FALSE_VALUE) {
						and_0 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not_4;
						try {
							/*@Caught*/ Object CAUGHT_gt_1;
							try {
								if (dateTime_9 instanceof InvalidValueException) {
									throw (InvalidValueException) dateTime_9;
								}
								final /*@Thrown*/ boolean gt_1 = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, date, dateTime_9).booleanValue();
								CAUGHT_gt_1 = gt_1;
							} catch (Exception e) {
								CAUGHT_gt_1 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_gt_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt_1;
							}
							final /*@Thrown*/ Boolean not_4;
							if (CAUGHT_gt_1 == ValueUtil.FALSE_VALUE) {
								not_4 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_gt_1 == ValueUtil.TRUE_VALUE) {
									not_4 = ValueUtil.FALSE_VALUE;
								} else {
									not_4 = null;
								}
							}
							CAUGHT_not_4 = not_4;
						} catch (Exception e) {
							CAUGHT_not_4 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not_4 == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_not_3 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_3;
							}
							if (CAUGHT_not_4 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_4;
							}
							if ((CAUGHT_not_3 == null) || (CAUGHT_not_4 == null)) {
								and_0 = null;
							} else {
								and_0 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					local_2 = and_0;
				}
				local_4 = local_2;
			} else {
				if (dateTime_9 instanceof InvalidValueException) {
					throw (InvalidValueException) dateTime_9;
				}
				final /*@Thrown*/ boolean lt_3 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, dateTime_8, dateTime_9).booleanValue();
				/*@Thrown*/ Boolean local_3;
				if (lt_3) {
					/*@Caught*/ Object CAUGHT_not_5;
					try {
						/*@Caught*/ Object CAUGHT_lt_4;
						try {
							final /*@Thrown*/ boolean lt_4 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, dateTime_8, date).booleanValue();
							CAUGHT_lt_4 = lt_4;
						} catch (Exception e) {
							CAUGHT_lt_4 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt_4 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_lt_4;
						}
						final /*@Thrown*/ Boolean not_5;
						if (CAUGHT_lt_4 == ValueUtil.FALSE_VALUE) {
							not_5 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_lt_4 == ValueUtil.TRUE_VALUE) {
								not_5 = ValueUtil.FALSE_VALUE;
							} else {
								not_5 = null;
							}
						}
						CAUGHT_not_5 = not_5;
					} catch (Exception e) {
						CAUGHT_not_5 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_1;
					if (CAUGHT_not_5 == ValueUtil.FALSE_VALUE) {
						and_1 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not_6;
						try {
							/*@Caught*/ Object CAUGHT_gt_2;
							try {
								final /*@Thrown*/ boolean gt_2 = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, dateTime_9, date).booleanValue();
								CAUGHT_gt_2 = gt_2;
							} catch (Exception e) {
								CAUGHT_gt_2 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_gt_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt_2;
							}
							final /*@Thrown*/ Boolean not_6;
							if (CAUGHT_gt_2 == ValueUtil.FALSE_VALUE) {
								not_6 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_gt_2 == ValueUtil.TRUE_VALUE) {
									not_6 = ValueUtil.FALSE_VALUE;
								} else {
									not_6 = null;
								}
							}
							CAUGHT_not_6 = not_6;
						} catch (Exception e) {
							CAUGHT_not_6 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not_6 == ValueUtil.FALSE_VALUE) {
							and_1 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_not_5 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_5;
							}
							if (CAUGHT_not_6 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_6;
							}
							if ((CAUGHT_not_5 == null) || (CAUGHT_not_6 == null)) {
								and_1 = null;
							} else {
								and_1 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					local_3 = and_1;
				} else {
					/*@Caught*/ Object CAUGHT_not_7;
					try {
						/*@Caught*/ Object CAUGHT_lt_5;
						try {
							if (dateTime_9 instanceof InvalidValueException) {
								throw (InvalidValueException) dateTime_9;
							}
							final /*@Thrown*/ boolean lt_5 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, date, dateTime_9).booleanValue();
							CAUGHT_lt_5 = lt_5;
						} catch (Exception e) {
							CAUGHT_lt_5 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt_5 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_lt_5;
						}
						final /*@Thrown*/ Boolean not_7;
						if (CAUGHT_lt_5 == ValueUtil.FALSE_VALUE) {
							not_7 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_lt_5 == ValueUtil.TRUE_VALUE) {
								not_7 = ValueUtil.FALSE_VALUE;
							} else {
								not_7 = null;
							}
						}
						CAUGHT_not_7 = not_7;
					} catch (Exception e) {
						CAUGHT_not_7 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_2;
					if (CAUGHT_not_7 == ValueUtil.FALSE_VALUE) {
						and_2 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not_8;
						try {
							/*@Caught*/ Object CAUGHT_gt_3;
							try {
								if (dateTime_8 instanceof InvalidValueException) {
									throw (InvalidValueException) dateTime_8;
								}
								final /*@Thrown*/ boolean gt_3 = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, date, dateTime_8).booleanValue();
								CAUGHT_gt_3 = gt_3;
							} catch (Exception e) {
								CAUGHT_gt_3 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_gt_3 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt_3;
							}
							final /*@Thrown*/ Boolean not_8;
							if (CAUGHT_gt_3 == ValueUtil.FALSE_VALUE) {
								not_8 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_gt_3 == ValueUtil.TRUE_VALUE) {
									not_8 = ValueUtil.FALSE_VALUE;
								} else {
									not_8 = null;
								}
							}
							CAUGHT_not_8 = not_8;
						} catch (Exception e) {
							CAUGHT_not_8 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not_8 == ValueUtil.FALSE_VALUE) {
							and_2 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_not_7 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_7;
							}
							if (CAUGHT_not_8 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not_8;
							}
							if ((CAUGHT_not_7 == null) || (CAUGHT_not_8 == null)) {
								and_2 = null;
							} else {
								and_2 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					local_3 = and_2;
				}
				local_4 = local_3;
			}
			local_5 = local_4;
		}
		if (local_5 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PrivacyPolicyHelper::isDateInInterval(privacyModel::AbstractTime[1],ecore::EDate[1]) : Boolean[1]\'");
		}
		return local_5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_POLICY_CONTROL_VALID__STRING:
			return isPolicyControlValid((String) arguments.get(0));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATA_SOURCE_VALID__STRING:
			return isDataSourceValid((String) arguments.get(0));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___ARE_INTERVALS_OVERLAP__ABSTRACTTIME_ABSTRACTTIME:
			return areIntervalsOverlap((AbstractTime) arguments.get(0), (AbstractTime) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___ARE_DATES_OVERLAP__ABSTRACTTIME_DATE:
			return areDatesOverlap((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___DOES_INTERVAL_START_BEFORE_INTERVAL__ABSTRACTTIME_ABSTRACTTIME:
			return doesIntervalStartBeforeInterval((AbstractTime) arguments.get(0), (AbstractTime) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATE_BEFORE_INTERVAL__ABSTRACTTIME_DATE:
			return isDateBeforeInterval((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATE_AFTER_INTERVAL__ABSTRACTTIME_DATE:
			return isDateAfterInterval((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATE_IN_INTERVAL__ABSTRACTTIME_DATE:
			return isDateInInterval((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PrivacyPolicyHelperImpl
