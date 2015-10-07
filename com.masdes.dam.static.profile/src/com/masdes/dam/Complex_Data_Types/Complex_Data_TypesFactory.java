/**
 */
package com.masdes.dam.Complex_Data_Types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage
 * @generated
 */
public interface Complex_Data_TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Complex_Data_TypesFactory eINSTANCE = com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Da Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Error</em>'.
	 * @generated
	 */
	DaError createDaError();

	/**
	 * Returns a new object of class '<em>Da Fault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Fault</em>'.
	 * @generated
	 */
	DaFault createDaFault();

	/**
	 * Returns a new object of class '<em>Da Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Failure</em>'.
	 * @generated
	 */
	DaFailure createDaFailure();

	/**
	 * Returns a new object of class '<em>Da Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Hazard</em>'.
	 * @generated
	 */
	DaHazard createDaHazard();

	/**
	 * Returns a new object of class '<em>Da Error Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Error Propagation</em>'.
	 * @generated
	 */
	DaErrorPropagation createDaErrorPropagation();

	/**
	 * Returns a new object of class '<em>Da Rec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Rec</em>'.
	 * @generated
	 */
	DaRec createDaRec();

	/**
	 * Returns a new object of class '<em>Da Repair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Repair</em>'.
	 * @generated
	 */
	DaRepair createDaRepair();

	/**
	 * Returns a new object of class '<em>Da Survivability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Survivability</em>'.
	 * @generated
	 */
	DaSurvivability createDaSurvivability();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Complex_Data_TypesPackage getComplex_Data_TypesPackage();

} //Complex_Data_TypesFactory
