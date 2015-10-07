/**
 */
package com.masdes.dam.Threats.impl;

import com.masdes.dam.Threats.*;

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
public class ThreatsFactoryImpl extends EFactoryImpl implements ThreatsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThreatsFactory init() {
		try {
			ThreatsFactory theThreatsFactory = (ThreatsFactory)EPackage.Registry.INSTANCE.getEFactory(ThreatsPackage.eNS_URI);
			if (theThreatsFactory != null) {
				return theThreatsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThreatsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatsFactoryImpl() {
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
			case ThreatsPackage.DA_ERROR_PROP_RELATION: return createDaErrorPropRelation();
			case ThreatsPackage.DA_FAULT_GENERATOR: return createDaFaultGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaErrorPropRelation createDaErrorPropRelation() {
		DaErrorPropRelationImpl daErrorPropRelation = new DaErrorPropRelationImpl();
		return daErrorPropRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaFaultGenerator createDaFaultGenerator() {
		DaFaultGeneratorImpl daFaultGenerator = new DaFaultGeneratorImpl();
		return daFaultGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatsPackage getThreatsPackage() {
		return (ThreatsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThreatsPackage getPackage() {
		return ThreatsPackage.eINSTANCE;
	}

} //ThreatsFactoryImpl
