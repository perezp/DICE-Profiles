/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getConstraintType()
 * @model
 * @generated
 */
public enum ConstraintType implements Enumerator {
	/**
	 * The '<em><b>Less</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS(0, "less", "less"),

	/**
	 * The '<em><b>Less Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_EQUAL(1, "lessEqual", "lessEqual"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(2, "equal", "equal"),

	/**
	 * The '<em><b>Greater Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_EQUAL(3, "greaterEqual", "greaterEqual"),

	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(4, "greater", "greater");

	/**
	 * The '<em><b>Less</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS
	 * @model name="less"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_VALUE = 0;

	/**
	 * The '<em><b>Less Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_EQUAL
	 * @model name="lessEqual"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_EQUAL_VALUE = 1;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 2;

	/**
	 * The '<em><b>Greater Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUAL
	 * @model name="greaterEqual"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_EQUAL_VALUE = 3;

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="greater"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintType[] VALUES_ARRAY =
		new ConstraintType[] {
			LESS,
			LESS_EQUAL,
			EQUAL,
			GREATER_EQUAL,
			GREATER,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConstraintType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintType get(int value) {
		switch (value) {
			case LESS_VALUE: return LESS;
			case LESS_EQUAL_VALUE: return LESS_EQUAL;
			case EQUAL_VALUE: return EQUAL;
			case GREATER_EQUAL_VALUE: return GREATER_EQUAL;
			case GREATER_VALUE: return GREATER;
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
	private ConstraintType(int value, String name, String literal) {
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
	
} //ConstraintType
