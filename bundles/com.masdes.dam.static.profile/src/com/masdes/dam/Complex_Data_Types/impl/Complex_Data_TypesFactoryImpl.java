/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Complex_Data_Types.*;

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
public class Complex_Data_TypesFactoryImpl extends EFactoryImpl implements Complex_Data_TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Complex_Data_TypesFactory init() {
		try {
			Complex_Data_TypesFactory theComplex_Data_TypesFactory = (Complex_Data_TypesFactory)EPackage.Registry.INSTANCE.getEFactory(Complex_Data_TypesPackage.eNS_URI);
			if (theComplex_Data_TypesFactory != null) {
				return theComplex_Data_TypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Complex_Data_TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex_Data_TypesFactoryImpl() {
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
			case Complex_Data_TypesPackage.DA_ERROR: return createDaError();
			case Complex_Data_TypesPackage.DA_FAULT: return createDaFault();
			case Complex_Data_TypesPackage.DA_FAILURE: return createDaFailure();
			case Complex_Data_TypesPackage.DA_HAZARD: return createDaHazard();
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION: return createDaErrorPropagation();
			case Complex_Data_TypesPackage.DA_REC: return createDaRec();
			case Complex_Data_TypesPackage.DA_REPAIR: return createDaRepair();
			case Complex_Data_TypesPackage.DA_SURVIVABILITY: return createDaSurvivability();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaError createDaError() {
		DaErrorImpl daError = new DaErrorImpl();
		return daError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaFault createDaFault() {
		DaFaultImpl daFault = new DaFaultImpl();
		return daFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaFailure createDaFailure() {
		DaFailureImpl daFailure = new DaFailureImpl();
		return daFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaHazard createDaHazard() {
		DaHazardImpl daHazard = new DaHazardImpl();
		return daHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaErrorPropagation createDaErrorPropagation() {
		DaErrorPropagationImpl daErrorPropagation = new DaErrorPropagationImpl();
		return daErrorPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRec createDaRec() {
		DaRecImpl daRec = new DaRecImpl();
		return daRec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRepair createDaRepair() {
		DaRepairImpl daRepair = new DaRepairImpl();
		return daRepair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaSurvivability createDaSurvivability() {
		DaSurvivabilityImpl daSurvivability = new DaSurvivabilityImpl();
		return daSurvivability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex_Data_TypesPackage getComplex_Data_TypesPackage() {
		return (Complex_Data_TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Complex_Data_TypesPackage getPackage() {
		return Complex_Data_TypesPackage.eINSTANCE;
	}

} //Complex_Data_TypesFactoryImpl
