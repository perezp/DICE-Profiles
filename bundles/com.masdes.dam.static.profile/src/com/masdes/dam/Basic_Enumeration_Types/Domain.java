/**
 */
package com.masdes.dam.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Domain</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getDomain()
 * @model
 * @generated
 */
public enum Domain implements Enumerator {
	/**
	 * The '<em><b>Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT(0, "content", "content"),

	/**
	 * The '<em><b>Early Timing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLY_TIMING_VALUE
	 * @generated
	 * @ordered
	 */
	EARLY_TIMING(1, "earlyTiming", "earlyTiming"),

	/**
	 * The '<em><b>Late Timing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATE_TIMING_VALUE
	 * @generated
	 * @ordered
	 */
	LATE_TIMING(2, "lateTiming", "lateTiming"),

	/**
	 * The '<em><b>Halt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALT_VALUE
	 * @generated
	 * @ordered
	 */
	HALT(3, "halt", "halt"),

	/**
	 * The '<em><b>Erratic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERRATIC_VALUE
	 * @generated
	 * @ordered
	 */
	ERRATIC(4, "erratic", "erratic");

	/**
	 * The '<em><b>Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTENT
	 * @model name="content"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_VALUE = 0;

	/**
	 * The '<em><b>Early Timing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Early Timing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARLY_TIMING
	 * @model name="earlyTiming"
	 * @generated
	 * @ordered
	 */
	public static final int EARLY_TIMING_VALUE = 1;

	/**
	 * The '<em><b>Late Timing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Late Timing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATE_TIMING
	 * @model name="lateTiming"
	 * @generated
	 * @ordered
	 */
	public static final int LATE_TIMING_VALUE = 2;

	/**
	 * The '<em><b>Halt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Halt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALT
	 * @model name="halt"
	 * @generated
	 * @ordered
	 */
	public static final int HALT_VALUE = 3;

	/**
	 * The '<em><b>Erratic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Erratic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERRATIC
	 * @model name="erratic"
	 * @generated
	 * @ordered
	 */
	public static final int ERRATIC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Domain</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Domain[] VALUES_ARRAY =
		new Domain[] {
			CONTENT,
			EARLY_TIMING,
			LATE_TIMING,
			HALT,
			ERRATIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Domain</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Domain> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Domain</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Domain get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Domain result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Domain</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Domain getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Domain result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Domain</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Domain get(int value) {
		switch (value) {
			case CONTENT_VALUE: return CONTENT;
			case EARLY_TIMING_VALUE: return EARLY_TIMING;
			case LATE_TIMING_VALUE: return LATE_TIMING;
			case HALT_VALUE: return HALT;
			case ERRATIC_VALUE: return ERRATIC;
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
	private Domain(int value, String name, String literal) {
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
	
} //Domain
