/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ref Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getRefType()
 * @model
 * @generated
 */
public enum RefType implements Enumerator {
	/**
	 * The '<em><b>Cassandra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_VALUE
	 * @generated
	 * @ordered
	 */
	CASSANDRA(0, "cassandra", "cassandra"),

	/**
	 * The '<em><b>Hdfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDFS_VALUE
	 * @generated
	 * @ordered
	 */
	HDFS(1, "hdfs", "hdfs"),

	/**
	 * The '<em><b>Mongodb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGODB_VALUE
	 * @generated
	 * @ordered
	 */
	MONGODB(2, "mongodb", "mongodb"),

	/**
	 * The '<em><b>Mysql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYSQL_VALUE
	 * @generated
	 * @ordered
	 */
	MYSQL(3, "mysql", "mysql");

	/**
	 * The '<em><b>Cassandra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cassandra</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA
	 * @model name="cassandra"
	 * @generated
	 * @ordered
	 */
	public static final int CASSANDRA_VALUE = 0;

	/**
	 * The '<em><b>Hdfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hdfs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HDFS
	 * @model name="hdfs"
	 * @generated
	 * @ordered
	 */
	public static final int HDFS_VALUE = 1;

	/**
	 * The '<em><b>Mongodb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mongodb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONGODB
	 * @model name="mongodb"
	 * @generated
	 * @ordered
	 */
	public static final int MONGODB_VALUE = 2;

	/**
	 * The '<em><b>Mysql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mysql</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MYSQL
	 * @model name="mysql"
	 * @generated
	 * @ordered
	 */
	public static final int MYSQL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ref Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RefType[] VALUES_ARRAY =
		new RefType[] {
			CASSANDRA,
			HDFS,
			MONGODB,
			MYSQL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ref Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RefType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ref Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ref Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ref Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefType get(int value) {
		switch (value) {
			case CASSANDRA_VALUE: return CASSANDRA;
			case HDFS_VALUE: return HDFS;
			case MONGODB_VALUE: return MONGODB;
			case MYSQL_VALUE: return MYSQL;
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
	private RefType(int value, String name, String literal) {
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
	
} //RefType
