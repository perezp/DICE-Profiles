/**
 */
package es.unizar.disco.dice.DTSM.Cassandra;

import es.unizar.disco.dice.Basic_Enumeration_Types.CassandraConsistencyLevelType;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getReplicationFactor <em>Replication Factor</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getConsistencyLevel <em>Consistency Level</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getBase_Node <em>Base Node</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage#getCassandraDB()
 * @model
 * @generated
 */
public interface CassandraDB extends EObject {
	/**
	 * Returns the value of the '<em><b>Replication Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication Factor</em>' attribute.
	 * @see #setReplicationFactor(int)
	 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage#getCassandraDB_ReplicationFactor()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getReplicationFactor();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getReplicationFactor <em>Replication Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Factor</em>' attribute.
	 * @see #getReplicationFactor()
	 * @generated
	 */
	void setReplicationFactor(int value);

	/**
	 * Returns the value of the '<em><b>Consistency Level</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.CassandraConsistencyLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consistency Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consistency Level</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.CassandraConsistencyLevelType
	 * @see #setConsistencyLevel(CassandraConsistencyLevelType)
	 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage#getCassandraDB_ConsistencyLevel()
	 * @model ordered="false"
	 * @generated
	 */
	CassandraConsistencyLevelType getConsistencyLevel();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getConsistencyLevel <em>Consistency Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Level</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.CassandraConsistencyLevelType
	 * @see #getConsistencyLevel()
	 * @generated
	 */
	void setConsistencyLevel(CassandraConsistencyLevelType value);

	/**
	 * Returns the value of the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Node</em>' reference.
	 * @see #setBase_Node(Node)
	 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage#getCassandraDB_Base_Node()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getBase_Node();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getBase_Node <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Node</em>' reference.
	 * @see #getBase_Node()
	 * @generated
	 */
	void setBase_Node(Node value);

} // CassandraDB
