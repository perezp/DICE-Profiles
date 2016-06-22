/**
 */
package es.unizar.disco.dice.DPIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DPIM.DPIMPackage
 * @generated
 */
public interface DPIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DPIMFactory eINSTANCE = es.unizar.disco.dice.DPIM.impl.DPIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dpim Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpim Computation Node</em>'.
	 * @generated
	 */
	DpimComputationNode createDpimComputationNode();

	/**
	 * Returns a new object of class '<em>Dpim Filter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpim Filter Node</em>'.
	 * @generated
	 */
	DpimFilterNode createDpimFilterNode();

	/**
	 * Returns a new object of class '<em>Dpim Visualization Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpim Visualization Node</em>'.
	 * @generated
	 */
	DpimVisualizationNode createDpimVisualizationNode();

	/**
	 * Returns a new object of class '<em>Dpim Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpim Source Node</em>'.
	 * @generated
	 */
	DpimSourceNode createDpimSourceNode();

	/**
	 * Returns a new object of class '<em>Dpim Storage Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpim Storage Node</em>'.
	 * @generated
	 */
	DpimStorageNode createDpimStorageNode();

	/**
	 * Returns a new object of class '<em>Dpim Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpim Channel</em>'.
	 * @generated
	 */
	DpimChannel createDpimChannel();

	/**
	 * Returns a new object of class '<em>Dpim Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpim Scenario</em>'.
	 * @generated
	 */
	DpimScenario createDpimScenario();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DPIMPackage getDPIMPackage();

} //DPIMFactory
