/**
 */
package es.unizar.disco.dice.Basic_Data_Types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage
 * @generated
 */
public interface Basic_Data_TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Basic_Data_TypesFactory eINSTANCE = es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NFP Privacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Privacy</em>'.
	 * @generated
	 */
	NFP_Privacy createNFP_Privacy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Basic_Data_TypesPackage getBasic_Data_TypesPackage();

} //Basic_Data_TypesFactory
