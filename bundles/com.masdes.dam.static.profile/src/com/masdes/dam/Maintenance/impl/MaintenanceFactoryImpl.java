/**
 */
package com.masdes.dam.Maintenance.impl;

import com.masdes.dam.Maintenance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenanceFactoryImpl extends EFactoryImpl implements MaintenanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaintenanceFactory init() {
		try {
			MaintenanceFactory theMaintenanceFactory = (MaintenanceFactory)EPackage.Registry.INSTANCE.getEFactory(MaintenancePackage.eNS_URI);
			if (theMaintenanceFactory != null) {
				return theMaintenanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MaintenanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MaintenancePackage.DA_REPLACEMENT_STEP: return createDaReplacementStep();
			case MaintenancePackage.DA_REALLOCATION_STEP: return createDaReallocationStep();
			case MaintenancePackage.DA_ACTIVATION_STEP: return createDaActivationStep();
			case MaintenancePackage.DA_AGENT_GROUP: return createDaAgentGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaReplacementStep createDaReplacementStep() {
		DaReplacementStepImpl daReplacementStep = new DaReplacementStepImpl();
		return daReplacementStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaReallocationStep createDaReallocationStep() {
		DaReallocationStepImpl daReallocationStep = new DaReallocationStepImpl();
		return daReallocationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaActivationStep createDaActivationStep() {
		DaActivationStepImpl daActivationStep = new DaActivationStepImpl();
		return daActivationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaAgentGroup createDaAgentGroup() {
		DaAgentGroupImpl daAgentGroup = new DaAgentGroupImpl();
		return daAgentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenancePackage getMaintenancePackage() {
		return (MaintenancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MaintenancePackage getPackage() {
		return MaintenancePackage.eINSTANCE;
	}

} //MaintenanceFactoryImpl
