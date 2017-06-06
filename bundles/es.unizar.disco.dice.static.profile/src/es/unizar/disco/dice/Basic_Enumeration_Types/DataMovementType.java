/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Movement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getDataMovementType()
 * @model
 * @generated
 */
public enum DataMovementType implements Enumerator {
	/**
	 * The '<em><b>One To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_ONE(0, "OneToOne", "OneToOne"),

	/**
	 * The '<em><b>Scatter Gather</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_GATHER_VALUE
	 * @generated
	 * @ordered
	 */
	SCATTER_GATHER(1, "ScatterGather", "ScatterGather"),

	/**
	 * The '<em><b>Broadcast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROADCAST_VALUE
	 * @generated
	 * @ordered
	 */
	BROADCAST(2, "Broadcast", "Broadcast");

	/**
	 * The '<em><b>One To One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One To One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE
	 * @model name="OneToOne"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_ONE_VALUE = 0;

	/**
	 * The '<em><b>Scatter Gather</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scatter Gather</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCATTER_GATHER
	 * @model name="ScatterGather"
	 * @generated
	 * @ordered
	 */
	public static final int SCATTER_GATHER_VALUE = 1;

	/**
	 * The '<em><b>Broadcast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Broadcast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BROADCAST
	 * @model name="Broadcast"
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Movement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataMovementType[] VALUES_ARRAY =
		new DataMovementType[] {
			ONE_TO_ONE,
			SCATTER_GATHER,
			BROADCAST,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Movement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataMovementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Movement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataMovementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataMovementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Movement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataMovementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataMovementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Movement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataMovementType get(int value) {
		switch (value) {
			case ONE_TO_ONE_VALUE: return ONE_TO_ONE;
			case SCATTER_GATHER_VALUE: return SCATTER_GATHER;
			case BROADCAST_VALUE: return BROADCAST;
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
	private DataMovementType(int value, String name, String literal) {
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
	
} //DataMovementType
