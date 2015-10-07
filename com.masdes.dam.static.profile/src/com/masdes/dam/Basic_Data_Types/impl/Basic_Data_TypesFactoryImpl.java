/**
 */
package com.masdes.dam.Basic_Data_Types.impl;

import com.masdes.dam.Basic_Data_Types.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Basic_Data_TypesFactoryImpl extends EFactoryImpl implements Basic_Data_TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Basic_Data_TypesFactory init() {
		try {
			Basic_Data_TypesFactory theBasic_Data_TypesFactory = (Basic_Data_TypesFactory)EPackage.Registry.INSTANCE.getEFactory(Basic_Data_TypesPackage.eNS_URI);
			if (theBasic_Data_TypesFactory != null) {
				return theBasic_Data_TypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Basic_Data_TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Data_TypesFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Basic_Data_TypesPackage.DA_LIKELIHOOD:
				return createDaLikelihoodFromString(eDataType, initialValue);
			case Basic_Data_TypesPackage.DA_LEVEL:
				return createDaLevelFromString(eDataType, initialValue);
			case Basic_Data_TypesPackage.DA_CRITICAL_LEVEL:
				return createDaCriticalLevelFromString(eDataType, initialValue);
			case Basic_Data_TypesPackage.DA_CURRENCY:
				return createDaCurrencyFromString(eDataType, initialValue);
			case Basic_Data_TypesPackage.DA_FREQUENCY:
				return createDaFrequencyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Basic_Data_TypesPackage.DA_LIKELIHOOD:
				return convertDaLikelihoodToString(eDataType, instanceValue);
			case Basic_Data_TypesPackage.DA_LEVEL:
				return convertDaLevelToString(eDataType, instanceValue);
			case Basic_Data_TypesPackage.DA_CRITICAL_LEVEL:
				return convertDaCriticalLevelToString(eDataType, instanceValue);
			case Basic_Data_TypesPackage.DA_CURRENCY:
				return convertDaCurrencyToString(eDataType, instanceValue);
			case Basic_Data_TypesPackage.DA_FREQUENCY:
				return convertDaFrequencyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDaLikelihoodFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaLikelihoodToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDaLevelFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaLevelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDaCriticalLevelFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaCriticalLevelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDaCurrencyFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaCurrencyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDaFrequencyFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaFrequencyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Data_TypesPackage getBasic_Data_TypesPackage() {
		return (Basic_Data_TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Basic_Data_TypesPackage getPackage() {
		return Basic_Data_TypesPackage.eINSTANCE;
	}

} //Basic_Data_TypesFactoryImpl
