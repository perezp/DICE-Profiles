/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spark Map</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getSparkMap()
 * @model
 * @generated
 */
public enum SparkMap implements Enumerator {
	/**
	 * The '<em><b>Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUE
	 * @generated
	 * @ordered
	 */
	MAP(0, "Map", "Map"),

	/**
	 * The '<em><b>Filter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILTER_VALUE
	 * @generated
	 * @ordered
	 */
	FILTER(1, "Filter", "Filter"),

	/**
	 * The '<em><b>Sample</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE(2, "Sample", "Sample"),

	/**
	 * The '<em><b>RDD Set Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDD_SET_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	RDD_SET_OPERATION(3, "RDDSetOperation", "RDDSetOperation"),

	/**
	 * The '<em><b>Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION_VALUE
	 * @generated
	 * @ordered
	 */
	UNION(4, "Union", "Union"),

	/**
	 * The '<em><b>Intersection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECTION(5, "Intersection", "Intersection"),

	/**
	 * The '<em><b>Substraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTRACTION(6, "Substraction", "Substraction"),

	/**
	 * The '<em><b>Distinct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTINCT_VALUE
	 * @generated
	 * @ordered
	 */
	DISTINCT(7, "Distinct", "Distinct"),

	/**
	 * The '<em><b>By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	BY_KEY(8, "ByKey", "ByKey"),

	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN(9, "Join", "Join"),

	/**
	 * The '<em><b>Cartesian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARTESIAN_VALUE
	 * @generated
	 * @ordered
	 */
	CARTESIAN(10, "Cartesian", "Cartesian"),

	/**
	 * The '<em><b>Repartition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPARTITION_VALUE
	 * @generated
	 * @ordered
	 */
	REPARTITION(11, "Repartition", "Repartition");

	/**
	 * The '<em><b>Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAP
	 * @model name="Map"
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUE = 0;

	/**
	 * The '<em><b>Filter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Filter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILTER
	 * @model name="Filter"
	 * @generated
	 * @ordered
	 */
	public static final int FILTER_VALUE = 1;

	/**
	 * The '<em><b>Sample</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sample</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLE
	 * @model name="Sample"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_VALUE = 2;

	/**
	 * The '<em><b>RDD Set Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RDD Set Operation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RDD_SET_OPERATION
	 * @model name="RDDSetOperation"
	 * @generated
	 * @ordered
	 */
	public static final int RDD_SET_OPERATION_VALUE = 3;

	/**
	 * The '<em><b>Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Union</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNION
	 * @model name="Union"
	 * @generated
	 * @ordered
	 */
	public static final int UNION_VALUE = 4;

	/**
	 * The '<em><b>Intersection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intersection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERSECTION
	 * @model name="Intersection"
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECTION_VALUE = 5;

	/**
	 * The '<em><b>Substraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substraction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACTION
	 * @model name="Substraction"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTRACTION_VALUE = 6;

	/**
	 * The '<em><b>Distinct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distinct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTINCT
	 * @model name="Distinct"
	 * @generated
	 * @ordered
	 */
	public static final int DISTINCT_VALUE = 7;

	/**
	 * The '<em><b>By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_KEY
	 * @model name="ByKey"
	 * @generated
	 * @ordered
	 */
	public static final int BY_KEY_VALUE = 8;

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @model name="Join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_VALUE = 9;

	/**
	 * The '<em><b>Cartesian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cartesian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARTESIAN
	 * @model name="Cartesian"
	 * @generated
	 * @ordered
	 */
	public static final int CARTESIAN_VALUE = 10;

	/**
	 * The '<em><b>Repartition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repartition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPARTITION
	 * @model name="Repartition"
	 * @generated
	 * @ordered
	 */
	public static final int REPARTITION_VALUE = 11;

	/**
	 * An array of all the '<em><b>Spark Map</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SparkMap[] VALUES_ARRAY =
		new SparkMap[] {
			MAP,
			FILTER,
			SAMPLE,
			RDD_SET_OPERATION,
			UNION,
			INTERSECTION,
			SUBSTRACTION,
			DISTINCT,
			BY_KEY,
			JOIN,
			CARTESIAN,
			REPARTITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Spark Map</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SparkMap> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spark Map</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkMap get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkMap result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Map</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkMap getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkMap result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Map</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkMap get(int value) {
		switch (value) {
			case MAP_VALUE: return MAP;
			case FILTER_VALUE: return FILTER;
			case SAMPLE_VALUE: return SAMPLE;
			case RDD_SET_OPERATION_VALUE: return RDD_SET_OPERATION;
			case UNION_VALUE: return UNION;
			case INTERSECTION_VALUE: return INTERSECTION;
			case SUBSTRACTION_VALUE: return SUBSTRACTION;
			case DISTINCT_VALUE: return DISTINCT;
			case BY_KEY_VALUE: return BY_KEY;
			case JOIN_VALUE: return JOIN;
			case CARTESIAN_VALUE: return CARTESIAN;
			case REPARTITION_VALUE: return REPARTITION;
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
	private SparkMap(int value, String name, String literal) {
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
	
} //SparkMap
