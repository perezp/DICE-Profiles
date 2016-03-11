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
	 * Returns a new object of class '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computation Node</em>'.
	 * @generated
	 */
	ComputationNode createComputationNode();

	/**
	 * Returns a new object of class '<em>Filter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Node</em>'.
	 * @generated
	 */
	FilterNode createFilterNode();

	/**
	 * Returns a new object of class '<em>Visualization Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Node</em>'.
	 * @generated
	 */
	VisualizationNode createVisualizationNode();

	/**
	 * Returns a new object of class '<em>Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Node</em>'.
	 * @generated
	 */
	SourceNode createSourceNode();

	/**
	 * Returns a new object of class '<em>Storagate Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storagate Node</em>'.
	 * @generated
	 */
	StoragateNode createStoragateNode();

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DPIMPackage getDPIMPackage();

} //DPIMFactory
