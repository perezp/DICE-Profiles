/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DDS Mcomponent Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getDDSMcomponentType()
 * @model
 * @generated
 */
public enum DDSMcomponentType implements Enumerator {
	/**
	 * The '<em><b>Master Slave Platform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_SLAVE_PLATFORM_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_SLAVE_PLATFORM(0, "MasterSlavePlatform", "MasterSlavePlatform"),

	/**
	 * The '<em><b>Peer To Peer Platform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEER_TO_PEER_PLATFORM_VALUE
	 * @generated
	 * @ordered
	 */
	PEER_TO_PEER_PLATFORM(1, "PeerToPeerPlatform", "PeerToPeerPlatform"),

	/**
	 * The '<em><b>Peer Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEER_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	PEER_NODE(2, "PeerNode", "PeerNode"),

	/**
	 * The '<em><b>Peers Quorum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEERS_QUORUM_VALUE
	 * @generated
	 * @ordered
	 */
	PEERS_QUORUM(3, "PeersQuorum", "PeersQuorum"),

	/**
	 * The '<em><b>Cassandra Seed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SEED_VALUE
	 * @generated
	 * @ordered
	 */
	CASSANDRA_SEED(4, "CassandraSeed", "CassandraSeed"),

	/**
	 * The '<em><b>Master Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_NODE(5, "MasterNode", "MasterNode"),

	/**
	 * The '<em><b>Slave Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLAVE_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	SLAVE_NODE(6, "SlaveNode", "SlaveNode");

	/**
	 * The '<em><b>Master Slave Platform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Master Slave Platform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTER_SLAVE_PLATFORM
	 * @model name="MasterSlavePlatform"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_SLAVE_PLATFORM_VALUE = 0;

	/**
	 * The '<em><b>Peer To Peer Platform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Peer To Peer Platform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEER_TO_PEER_PLATFORM
	 * @model name="PeerToPeerPlatform"
	 * @generated
	 * @ordered
	 */
	public static final int PEER_TO_PEER_PLATFORM_VALUE = 1;

	/**
	 * The '<em><b>Peer Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Peer Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEER_NODE
	 * @model name="PeerNode"
	 * @generated
	 * @ordered
	 */
	public static final int PEER_NODE_VALUE = 2;

	/**
	 * The '<em><b>Peers Quorum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Peers Quorum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEERS_QUORUM
	 * @model name="PeersQuorum"
	 * @generated
	 * @ordered
	 */
	public static final int PEERS_QUORUM_VALUE = 3;

	/**
	 * The '<em><b>Cassandra Seed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cassandra Seed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SEED
	 * @model name="CassandraSeed"
	 * @generated
	 * @ordered
	 */
	public static final int CASSANDRA_SEED_VALUE = 4;

	/**
	 * The '<em><b>Master Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Master Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTER_NODE
	 * @model name="MasterNode"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_NODE_VALUE = 5;

	/**
	 * The '<em><b>Slave Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Slave Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLAVE_NODE
	 * @model name="SlaveNode"
	 * @generated
	 * @ordered
	 */
	public static final int SLAVE_NODE_VALUE = 6;

	/**
	 * An array of all the '<em><b>DDS Mcomponent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DDSMcomponentType[] VALUES_ARRAY =
		new DDSMcomponentType[] {
			MASTER_SLAVE_PLATFORM,
			PEER_TO_PEER_PLATFORM,
			PEER_NODE,
			PEERS_QUORUM,
			CASSANDRA_SEED,
			MASTER_NODE,
			SLAVE_NODE,
		};

	/**
	 * A public read-only list of all the '<em><b>DDS Mcomponent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DDSMcomponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DDS Mcomponent Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDSMcomponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DDSMcomponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DDS Mcomponent Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDSMcomponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DDSMcomponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DDS Mcomponent Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDSMcomponentType get(int value) {
		switch (value) {
			case MASTER_SLAVE_PLATFORM_VALUE: return MASTER_SLAVE_PLATFORM;
			case PEER_TO_PEER_PLATFORM_VALUE: return PEER_TO_PEER_PLATFORM;
			case PEER_NODE_VALUE: return PEER_NODE;
			case PEERS_QUORUM_VALUE: return PEERS_QUORUM;
			case CASSANDRA_SEED_VALUE: return CASSANDRA_SEED;
			case MASTER_NODE_VALUE: return MASTER_NODE;
			case SLAVE_NODE_VALUE: return SLAVE_NODE;
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
	private DDSMcomponentType(int value, String name, String literal) {
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
	
} //DDSMcomponentType
