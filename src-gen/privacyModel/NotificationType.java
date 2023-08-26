/**
 */
package privacyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notification Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage#getNotificationType()
 * @model
 * @generated
 */
public enum NotificationType implements Enumerator {
	/**
	 * The '<em><b>Erasure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASURE_VALUE
	 * @generated
	 * @ordered
	 */
	ERASURE(0, "Erasure", "Erasure"),

	/**
	 * The '<em><b>Withdraw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAW_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAW(1, "Withdraw", "Withdraw"),

	/**
	 * The '<em><b>Rectification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	RECTIFICATION(2, "Rectification", "Rectification"),

	/**
	 * The '<em><b>Data Collecting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_COLLECTING_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_COLLECTING(3, "DataCollecting", "DataCollecting"),

	/**
	 * The '<em><b>Stop Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_PROCESSING(4, "StopProcessing", "StopProcessing"),

	/**
	 * The '<em><b>Third Party Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_PARTY_TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_PARTY_TRANSFER(5, "ThirdPartyTransfer", "ThirdPartyTransfer"),

	/**
	 * The '<em><b>Executed Rectification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTED_RECTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTED_RECTIFICATION(6, "ExecutedRectification", "ExecutedRectification"),

	/**
	 * The '<em><b>Executed Erasure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTED_ERASURE_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTED_ERASURE(7, "ExecutedErasure", "ExecutedErasure");

	/**
	 * The '<em><b>Erasure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASURE
	 * @model name="Erasure"
	 * @generated
	 * @ordered
	 */
	public static final int ERASURE_VALUE = 0;

	/**
	 * The '<em><b>Withdraw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAW
	 * @model name="Withdraw"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAW_VALUE = 1;

	/**
	 * The '<em><b>Rectification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTIFICATION
	 * @model name="Rectification"
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFICATION_VALUE = 2;

	/**
	 * The '<em><b>Data Collecting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_COLLECTING
	 * @model name="DataCollecting"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_COLLECTING_VALUE = 3;

	/**
	 * The '<em><b>Stop Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING
	 * @model name="StopProcessing"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_PROCESSING_VALUE = 4;

	/**
	 * The '<em><b>Third Party Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_PARTY_TRANSFER
	 * @model name="ThirdPartyTransfer"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_PARTY_TRANSFER_VALUE = 5;

	/**
	 * The '<em><b>Executed Rectification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTED_RECTIFICATION
	 * @model name="ExecutedRectification"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTED_RECTIFICATION_VALUE = 6;

	/**
	 * The '<em><b>Executed Erasure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTED_ERASURE
	 * @model name="ExecutedErasure"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTED_ERASURE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Notification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NotificationType[] VALUES_ARRAY = new NotificationType[] { ERASURE, WITHDRAW, RECTIFICATION,
			DATA_COLLECTING, STOP_PROCESSING, THIRD_PARTY_TRANSFER, EXECUTED_RECTIFICATION, EXECUTED_ERASURE, };

	/**
	 * A public read-only list of all the '<em><b>Notification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NotificationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notification Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationType get(int value) {
		switch (value) {
		case ERASURE_VALUE:
			return ERASURE;
		case WITHDRAW_VALUE:
			return WITHDRAW;
		case RECTIFICATION_VALUE:
			return RECTIFICATION;
		case DATA_COLLECTING_VALUE:
			return DATA_COLLECTING;
		case STOP_PROCESSING_VALUE:
			return STOP_PROCESSING;
		case THIRD_PARTY_TRANSFER_VALUE:
			return THIRD_PARTY_TRANSFER;
		case EXECUTED_RECTIFICATION_VALUE:
			return EXECUTED_RECTIFICATION;
		case EXECUTED_ERASURE_VALUE:
			return EXECUTED_ERASURE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NotificationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //NotificationType
