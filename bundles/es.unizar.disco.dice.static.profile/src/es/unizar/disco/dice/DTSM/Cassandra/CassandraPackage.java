/**
 */
package es.unizar.disco.dice.DTSM.Cassandra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraFactory
 * @model kind="package"
 * @generated
 */
public interface CassandraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Cassandra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///DICE/DICE_UML_Extensions/DTSM/Cassandra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DICE.DICE_UML_Extensions.DTSM.Cassandra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CassandraPackage eINSTANCE = es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraDBImpl <em>DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraDBImpl
	 * @see es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraPackageImpl#getCassandraDB()
	 * @generated
	 */
	int CASSANDRA_DB = 0;

	/**
	 * The feature id for the '<em><b>Replication Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_DB__REPLICATION_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Consistency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_DB__CONSISTENCY_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_DB__BASE_NODE = 2;

	/**
	 * The number of structural features of the '<em>DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_DB_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB <em>DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB</em>'.
	 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraDB
	 * @generated
	 */
	EClass getCassandraDB();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getReplicationFactor <em>Replication Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Factor</em>'.
	 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getReplicationFactor()
	 * @see #getCassandraDB()
	 * @generated
	 */
	EAttribute getCassandraDB_ReplicationFactor();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getConsistencyLevel <em>Consistency Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consistency Level</em>'.
	 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getConsistencyLevel()
	 * @see #getCassandraDB()
	 * @generated
	 */
	EAttribute getCassandraDB_ConsistencyLevel();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraDB#getBase_Node()
	 * @see #getCassandraDB()
	 * @generated
	 */
	EReference getCassandraDB_Base_Node();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CassandraFactory getCassandraFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraDBImpl <em>DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraDBImpl
		 * @see es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraPackageImpl#getCassandraDB()
		 * @generated
		 */
		EClass CASSANDRA_DB = eINSTANCE.getCassandraDB();

		/**
		 * The meta object literal for the '<em><b>Replication Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_DB__REPLICATION_FACTOR = eINSTANCE.getCassandraDB_ReplicationFactor();

		/**
		 * The meta object literal for the '<em><b>Consistency Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_DB__CONSISTENCY_LEVEL = eINSTANCE.getCassandraDB_ConsistencyLevel();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_DB__BASE_NODE = eINSTANCE.getCassandraDB_Base_Node();

	}

} //CassandraPackage
