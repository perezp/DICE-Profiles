/**
 */
package es.unizar.disco.dice.DTSM.Cassandra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage
 * @generated
 */
public interface CassandraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CassandraFactory eINSTANCE = es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB</em>'.
	 * @generated
	 */
	CassandraDB createCassandraDB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CassandraPackage getCassandraPackage();

} //CassandraFactory
