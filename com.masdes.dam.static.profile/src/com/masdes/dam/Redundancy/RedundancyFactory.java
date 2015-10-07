/**
 */
package com.masdes.dam.Redundancy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Redundancy.RedundancyPackage
 * @generated
 */
public interface RedundancyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedundancyFactory eINSTANCE = com.masdes.dam.Redundancy.impl.RedundancyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Da Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Controller</em>'.
	 * @generated
	 */
	DaController createDaController();

	/**
	 * Returns a new object of class '<em>Da Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Variant</em>'.
	 * @generated
	 */
	DaVariant createDaVariant();

	/**
	 * Returns a new object of class '<em>Da Adjudicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Adjudicator</em>'.
	 * @generated
	 */
	DaAdjudicator createDaAdjudicator();

	/**
	 * Returns a new object of class '<em>Da Redundant Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Redundant Structure</em>'.
	 * @generated
	 */
	DaRedundantStructure createDaRedundantStructure();

	/**
	 * Returns a new object of class '<em>Da Spare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Spare</em>'.
	 * @generated
	 */
	DaSpare createDaSpare();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RedundancyPackage getRedundancyPackage();

} //RedundancyFactory
