/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Map Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getMapType()
 * @model
 * @generated
 */
public enum MapType implements Enumerator {
	/**
	 * The '<em><b>Regex Mapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEX_MAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	REGEX_MAPPER(0, "regexMapper", "regexMapper"),

	/**
	 * The '<em><b>Field Selection Mapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_SELECTION_MAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD_SELECTION_MAPPER(1, "fieldSelectionMapper", "fieldSelectionMapper"),

	/**
	 * The '<em><b>Chain Mapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAIN_MAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	CHAIN_MAPPER(2, "chainMapper", "chainMapper");

	/**
	 * The '<em><b>Regex Mapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regex Mapper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGEX_MAPPER
	 * @model name="regexMapper"
	 * @generated
	 * @ordered
	 */
	public static final int REGEX_MAPPER_VALUE = 0;

	/**
	 * The '<em><b>Field Selection Mapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Field Selection Mapper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELD_SELECTION_MAPPER
	 * @model name="fieldSelectionMapper"
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_SELECTION_MAPPER_VALUE = 1;

	/**
	 * The '<em><b>Chain Mapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chain Mapper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAIN_MAPPER
	 * @model name="chainMapper"
	 * @generated
	 * @ordered
	 */
	public static final int CHAIN_MAPPER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Map Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MapType[] VALUES_ARRAY =
		new MapType[] {
			REGEX_MAPPER,
			FIELD_SELECTION_MAPPER,
			CHAIN_MAPPER,
		};

	/**
	 * A public read-only list of all the '<em><b>Map Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MapType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Map Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MapType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MapType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Map Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MapType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MapType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Map Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MapType get(int value) {
		switch (value) {
			case REGEX_MAPPER_VALUE: return REGEX_MAPPER;
			case FIELD_SELECTION_MAPPER_VALUE: return FIELD_SELECTION_MAPPER;
			case CHAIN_MAPPER_VALUE: return CHAIN_MAPPER;
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
	private MapType(int value, String name, String literal) {
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
	
} //MapType
