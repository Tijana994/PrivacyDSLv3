/**
 */
package privacyModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import privacyModel.Consent;
import privacyModel.Contract;
import privacyModel.Document;
import privacyModel.How;
import privacyModel.PrivacyModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>How</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.HowImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link privacyModel.impl.HowImpl#getConsent <em>Consent</em>}</li>
 *   <li>{@link privacyModel.impl.HowImpl#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HowImpl extends MinimalEObjectImpl.Container implements How {
	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * The cached value of the '{@link #getConsent() <em>Consent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsent()
	 * @generated
	 * @ordered
	 */
	protected Consent consent;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Contract contract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.HOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectResolvingEList<Document>(Document.class, this, PrivacyModelPackage.HOW__DOCUMENTS);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent getConsent() {
		if (consent != null && consent.eIsProxy()) {
			InternalEObject oldConsent = (InternalEObject) consent;
			consent = (Consent) eResolveProxy(oldConsent);
			if (consent != oldConsent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.HOW__CONSENT,
							oldConsent, consent));
			}
		}
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent basicGetConsent() {
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsent(Consent newConsent) {
		Consent oldConsent = consent;
		consent = newConsent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.HOW__CONSENT, oldConsent,
					consent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract getContract() {
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject) contract;
			contract = (Contract) eResolveProxy(oldContract);
			if (contract != oldContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.HOW__CONTRACT,
							oldContract, contract));
			}
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract basicGetContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Contract newContract) {
		Contract oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.HOW__CONTRACT, oldContract,
					contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.HOW__DOCUMENTS:
			return getDocuments();
		case PrivacyModelPackage.HOW__CONSENT:
			if (resolve)
				return getConsent();
			return basicGetConsent();
		case PrivacyModelPackage.HOW__CONTRACT:
			if (resolve)
				return getContract();
			return basicGetContract();
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
		case PrivacyModelPackage.HOW__DOCUMENTS:
			getDocuments().clear();
			getDocuments().addAll((Collection<? extends Document>) newValue);
			return;
		case PrivacyModelPackage.HOW__CONSENT:
			setConsent((Consent) newValue);
			return;
		case PrivacyModelPackage.HOW__CONTRACT:
			setContract((Contract) newValue);
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
		case PrivacyModelPackage.HOW__DOCUMENTS:
			getDocuments().clear();
			return;
		case PrivacyModelPackage.HOW__CONSENT:
			setConsent((Consent) null);
			return;
		case PrivacyModelPackage.HOW__CONTRACT:
			setContract((Contract) null);
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
		case PrivacyModelPackage.HOW__DOCUMENTS:
			return documents != null && !documents.isEmpty();
		case PrivacyModelPackage.HOW__CONSENT:
			return consent != null;
		case PrivacyModelPackage.HOW__CONTRACT:
			return contract != null;
		}
		return super.eIsSet(featureID);
	}

} //HowImpl
