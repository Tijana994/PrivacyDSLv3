/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import privacyModel.Location;
import privacyModel.PrivacyModelPackage;
import privacyModel.Where;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.WhereImpl#getSource <em>Source</em>}</li>
 *   <li>{@link privacyModel.impl.WhereImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereImpl extends MinimalEObjectImpl.Container implements Where {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Location source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Location destination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.WHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Location) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.WHERE__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Location newSource) {
		Location oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.WHERE__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (Location) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.WHERE__DESTINATION,
							oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Location newDestination) {
		Location oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.WHERE__DESTINATION,
					oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(final Where observed) {
		/**
		 *
		 * if self.source = null
		 * then
		 *   if self.destination = null
		 *   then true
		 *   else
		 *     if observed.destination = null
		 *     then false
		 *     else self.destination.equals(observed.destination)
		 *     endif
		 *   endif
		 * else
		 *   if self.destination = null
		 *   then
		 *     if observed.source = null
		 *     then false
		 *     else self.source.equals(observed.source)
		 *     endif
		 *   else
		 *     if observed.destination = null
		 *     then false
		 *     else
		 *       if observed.source = null
		 *       then false
		 *       else
		 *         self.source.equals(observed.source) and
		 *         self.destination.equals(observed.destination)
		 *       endif
		 *     endif
		 *   endif
		 * endif
		 */
		final /*@NonInvalid*/ Location destination_3 = this.getDestination();
		final /*@NonInvalid*/ Location source = this.getSource();
		final /*@NonInvalid*/ boolean eq_2 = destination_3 == null;
		final /*@NonInvalid*/ boolean eq = source == null;
		/*@Thrown*/ Boolean local_6;
		if (eq) {
			/*@Thrown*/ boolean local_1;
			if (eq_2) {
				local_1 = true;
			} else {
				final /*@NonInvalid*/ Location destination_2 = observed.getDestination();
				final /*@NonInvalid*/ boolean eq_1 = destination_2 == null;
				/*@Thrown*/ boolean local_0;
				if (eq_1) {
					local_0 = false;
				} else {
					if (destination_3 == null) {
						throw new InvalidValueException(
								"Null source for \'privacyModel::Location::equals(privacyModel::Location[?]) : Boolean[1]\'");
					}
					final /*@Thrown*/ boolean equals = destination_3.equals(destination_2);
					local_0 = equals;
				}
				local_1 = local_0;
			}
			local_6 = local_1;
		} else {
			/*@Thrown*/ Boolean local_5;
			if (eq_2) {
				final /*@NonInvalid*/ Location source_2 = observed.getSource();
				final /*@NonInvalid*/ boolean eq_3 = source_2 == null;
				/*@Thrown*/ boolean local_2;
				if (eq_3) {
					local_2 = false;
				} else {
					if (source == null) {
						throw new InvalidValueException(
								"Null source for \'privacyModel::Location::equals(privacyModel::Location[?]) : Boolean[1]\'");
					}
					final /*@Thrown*/ boolean equals_0 = source.equals(source_2);
					local_2 = equals_0;
				}
				local_5 = local_2;
			} else {
				final /*@NonInvalid*/ Location destination_4 = observed.getDestination();
				final /*@NonInvalid*/ boolean eq_4 = destination_4 == null;
				/*@Thrown*/ Boolean local_4;
				if (eq_4) {
					local_4 = ValueUtil.FALSE_VALUE;
				} else {
					final /*@NonInvalid*/ Location source_3 = observed.getSource();
					final /*@NonInvalid*/ boolean eq_5 = source_3 == null;
					/*@Thrown*/ Boolean local_3;
					if (eq_5) {
						local_3 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_equals_1;
						try {
							if (source == null) {
								throw new InvalidValueException(
										"Null source for \'privacyModel::Location::equals(privacyModel::Location[?]) : Boolean[1]\'");
							}
							final /*@Thrown*/ boolean equals_1 = source.equals(source_3);
							CAUGHT_equals_1 = equals_1;
						} catch (Exception e) {
							CAUGHT_equals_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_equals_1 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_equals_2;
							try {
								if (destination_3 == null) {
									throw new InvalidValueException(
											"Null source for \'privacyModel::Location::equals(privacyModel::Location[?]) : Boolean[1]\'");
								}
								final /*@Thrown*/ boolean equals_2 = destination_3.equals(destination_4);
								CAUGHT_equals_2 = equals_2;
							} catch (Exception e) {
								CAUGHT_equals_2 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_equals_2 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_equals_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_equals_1;
								}
								if (CAUGHT_equals_2 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_equals_2;
								}
								and = ValueUtil.TRUE_VALUE;
							}
						}
						local_3 = and;
					}
					local_4 = local_3;
				}
				local_5 = local_4;
			}
			local_6 = local_5;
		}
		if (local_6 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::Where::equals(privacyModel::Where[1]) : Boolean[1]\'");
		}
		return local_6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.WHERE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case PrivacyModelPackage.WHERE__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrivacyModelPackage.WHERE__SOURCE:
			setSource((Location) newValue);
			return;
		case PrivacyModelPackage.WHERE__DESTINATION:
			setDestination((Location) newValue);
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
		case PrivacyModelPackage.WHERE__SOURCE:
			setSource((Location) null);
			return;
		case PrivacyModelPackage.WHERE__DESTINATION:
			setDestination((Location) null);
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
		case PrivacyModelPackage.WHERE__SOURCE:
			return source != null;
		case PrivacyModelPackage.WHERE__DESTINATION:
			return destination != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.WHERE___EQUALS__WHERE:
			return equals((Where) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //WhereImpl
