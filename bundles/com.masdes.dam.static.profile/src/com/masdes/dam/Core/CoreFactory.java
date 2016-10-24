/**
 */
package com.masdes.dam.Core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = com.masdes.dam.Core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Da Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Component</em>'.
	 * @generated
	 */
	DaComponent createDaComponent();

	/**
	 * Returns a new object of class '<em>Da Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Service</em>'.
	 * @generated
	 */
	DaService createDaService();

	/**
	 * Returns a new object of class '<em>Da Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Step</em>'.
	 * @generated
	 */
	DaStep createDaStep();

	/**
	 * Returns a new object of class '<em>Da Resistance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Resistance</em>'.
	 * @generated
	 */
	DaResistance createDaResistance();

	/**
	 * Returns a new object of class '<em>Da Recognition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Recognition</em>'.
	 * @generated
	 */
	DaRecognition createDaRecognition();

	/**
	 * Returns a new object of class '<em>Da Recovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Recovery</em>'.
	 * @generated
	 */
	DaRecovery createDaRecovery();

	/**
	 * Returns a new object of class '<em>Da Service Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Service Mode</em>'.
	 * @generated
	 */
	DaServiceMode createDaServiceMode();

	/**
	 * Returns a new object of class '<em>Da Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Service Request</em>'.
	 * @generated
	 */
	DaServiceRequest createDaServiceRequest();

	/**
	 * Returns a new object of class '<em>Da Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Connector</em>'.
	 * @generated
	 */
	DaConnector createDaConnector();

	/**
	 * Returns a new object of class '<em>Da Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Da Change</em>'.
	 * @generated
	 */
	DaChange createDaChange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
