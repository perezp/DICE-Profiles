/**
 */
package es.unizar.disco.dice.dtsm.Core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.dtsm.Core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = es.unizar.disco.dice.dtsm.Core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computation Node</em>'.
	 * @generated
	 */
	CoreComputationNode createCoreComputationNode();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	CoreData createCoreData();

	/**
	 * Returns a new object of class '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source</em>'.
	 * @generated
	 */
	CoreDataSource createCoreDataSource();

	/**
	 * Returns a new object of class '<em>Direct Acyclic Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Acyclic Graph</em>'.
	 * @generated
	 */
	CoreDirectAcyclicGraph createCoreDirectAcyclicGraph();

	/**
	 * Returns a new object of class '<em>DAG Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAG Source Node</em>'.
	 * @generated
	 */
	CoreDAGSourceNode createCoreDAGSourceNode();

	/**
	 * Returns a new object of class '<em>DAG Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAG Node</em>'.
	 * @generated
	 */
	CoreDAGNode createCoreDAGNode();

	/**
	 * Returns a new object of class '<em>Storage Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Node</em>'.
	 * @generated
	 */
	CoreStorageNode createCoreStorageNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
