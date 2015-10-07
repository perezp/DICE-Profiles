/**
 */
package com.masdes.dam.Maintenance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Maintenance.MaintenancePackage
 * @generated
 */
public interface MaintenanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenanceFactory eINSTANCE = com.masdes.dam.Maintenance.impl.MaintenanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Da Replacement Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Replacement Step</em>'.
	 * @generated
	 */
	DaReplacementStep createDaReplacementStep();

	/**
	 * Returns a new object of class '<em>Da Reallocation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Reallocation Step</em>'.
	 * @generated
	 */
	DaReallocationStep createDaReallocationStep();

	/**
	 * Returns a new object of class '<em>Da Activation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Activation Step</em>'.
	 * @generated
	 */
	DaActivationStep createDaActivationStep();

	/**
	 * Returns a new object of class '<em>Da Agent Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Agent Group</em>'.
	 * @generated
	 */
	DaAgentGroup createDaAgentGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaintenancePackage getMaintenancePackage();

} //MaintenanceFactory
