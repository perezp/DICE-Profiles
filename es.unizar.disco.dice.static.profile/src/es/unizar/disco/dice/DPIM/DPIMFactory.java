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
	 * Returns a new object of class '<em>Dice Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Component</em>'.
	 * @generated
	 */
	DiceComponent createDiceComponent();

	/**
	 * Returns a new object of class '<em>Dice Filter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Filter Node</em>'.
	 * @generated
	 */
	DiceFilterNode createDiceFilterNode();

	/**
	 * Returns a new object of class '<em>Dice Visualization Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Visualization Node</em>'.
	 * @generated
	 */
	DiceVisualizationNode createDiceVisualizationNode();

	/**
	 * Returns a new object of class '<em>Dice Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Source Node</em>'.
	 * @generated
	 */
	DiceSourceNode createDiceSourceNode();

	/**
	 * Returns a new object of class '<em>Dice Storage Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Storage Resource</em>'.
	 * @generated
	 */
	DiceStorageResource createDiceStorageResource();

	/**
	 * Returns a new object of class '<em>Dice Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Channel</em>'.
	 * @generated
	 */
	DiceChannel createDiceChannel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DPIMPackage getDPIMPackage();

} //DPIMFactory
