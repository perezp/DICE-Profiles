/**
 */
package es.unizar.disco.dice.dtsm.Storm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage
 * @generated
 */
public interface StormFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StormFactory eINSTANCE = es.unizar.disco.dice.dtsm.Storm.impl.StormFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bolt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bolt</em>'.
	 * @generated
	 */
	StormBolt createStormBolt();

	/**
	 * Returns a new object of class '<em>Spout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spout</em>'.
	 * @generated
	 */
	StormSpout createStormSpout();

	/**
	 * Returns a new object of class '<em>Scenario Topology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Topology</em>'.
	 * @generated
	 */
	StormScenarioTopology createStormScenarioTopology();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	StormApplication createStormApplication();

	/**
	 * Returns a new object of class '<em>Nimbus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nimbus</em>'.
	 * @generated
	 */
	Nimbus createNimbus();

	/**
	 * Returns a new object of class '<em>Supervisor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supervisor</em>'.
	 * @generated
	 */
	Supervisor createSupervisor();

	/**
	 * Returns a new object of class '<em>Zookeeper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zookeeper</em>'.
	 * @generated
	 */
	Zookeeper createZookeeper();

	/**
	 * Returns a new object of class '<em>Stream Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Step</em>'.
	 * @generated
	 */
	StormStreamStep createStormStreamStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StormPackage getStormPackage();

} //StormFactory
