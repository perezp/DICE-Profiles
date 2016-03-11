/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage
 * @generated
 */
public interface Complex_Data_TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Complex_Data_TypesFactory eINSTANCE = es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dice Data Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Data Volume</em>'.
	 * @generated
	 */
	DiceDataVolume createDiceDataVolume();

	/**
	 * Returns a new object of class '<em>Dice Data Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Data Specification</em>'.
	 * @generated
	 */
	DiceDataSpecification createDiceDataSpecification();

	/**
	 * Returns a new object of class '<em>Dice Channel Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Channel Specification</em>'.
	 * @generated
	 */
	DiceChannelSpecification createDiceChannelSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Complex_Data_TypesPackage getComplex_Data_TypesPackage();

} //Complex_Data_TypesFactory
