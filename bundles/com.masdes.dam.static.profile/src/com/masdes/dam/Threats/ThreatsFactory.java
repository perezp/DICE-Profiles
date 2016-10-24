/**
 */
package com.masdes.dam.Threats;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Threats.ThreatsPackage
 * @generated
 */
public interface ThreatsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThreatsFactory eINSTANCE = com.masdes.dam.Threats.impl.ThreatsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Da Error Prop Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Error Prop Relation</em>'.
	 * @generated
	 */
	DaErrorPropRelation createDaErrorPropRelation();

	/**
	 * Returns a new object of class '<em>Da Fault Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Fault Generator</em>'.
	 * @generated
	 */
	DaFaultGenerator createDaFaultGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ThreatsPackage getThreatsPackage();

} //ThreatsFactory
