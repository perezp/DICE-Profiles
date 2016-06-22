/**
 */
package es.unizar.disco.dice.dtsm.Hadoop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage
 * @generated
 */
public interface HadoopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HadoopFactory eINSTANCE = es.unizar.disco.dice.dtsm.Hadoop.impl.HadoopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Map Reduce Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Reduce Job</em>'.
	 * @generated
	 */
	HadoopMapReduceJob createHadoopMapReduceJob();

	/**
	 * Returns a new object of class '<em>Map Reduce Phase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Reduce Phase</em>'.
	 * @generated
	 */
	HadoopMapReducePhase createHadoopMapReducePhase();

	/**
	 * Returns a new object of class '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map</em>'.
	 * @generated
	 */
	HadoopMap createHadoopMap();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	HadoopOperation createHadoopOperation();

	/**
	 * Returns a new object of class '<em>Reduce</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduce</em>'.
	 * @generated
	 */
	HadoopReduce createHadoopReduce();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	HadoopScenario createHadoopScenario();

	/**
	 * Returns a new object of class '<em>Workload Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload Event</em>'.
	 * @generated
	 */
	HadoopWorkloadEvent createHadoopWorkloadEvent();

	/**
	 * Returns a new object of class '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computation Node</em>'.
	 * @generated
	 */
	HadoopComputationNode createHadoopComputationNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HadoopPackage getHadoopPackage();

} //HadoopFactory
