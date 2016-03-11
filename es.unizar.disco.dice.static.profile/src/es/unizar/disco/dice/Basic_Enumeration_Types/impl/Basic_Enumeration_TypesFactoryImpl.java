/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.*;

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
public class Basic_Enumeration_TypesFactoryImpl extends EFactoryImpl implements Basic_Enumeration_TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Basic_Enumeration_TypesFactory init() {
		try {
			Basic_Enumeration_TypesFactory theBasic_Enumeration_TypesFactory = (Basic_Enumeration_TypesFactory)EPackage.Registry.INSTANCE.getEFactory(Basic_Enumeration_TypesPackage.eNS_URI);
			if (theBasic_Enumeration_TypesFactory != null) {
				return theBasic_Enumeration_TypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Basic_Enumeration_TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Enumeration_TypesFactoryImpl() {
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
			case Basic_Enumeration_TypesPackage.REF_TYPE:
				return createRefTypeFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.REF_DATA_FORMAT_TYPE:
				return createRefDataFormatTypeFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.TECH_TYPE:
				return createTechTypeFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.PROCESSING_TYPE:
				return createProcessingTypeFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.SOURCE_TYPE:
				return createSourceTypeFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.COMPUTATION_TYPE:
				return createComputationTypeFromString(eDataType, initialValue);
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
			case Basic_Enumeration_TypesPackage.REF_TYPE:
				return convertRefTypeToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.REF_DATA_FORMAT_TYPE:
				return convertRefDataFormatTypeToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.TECH_TYPE:
				return convertTechTypeToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.PROCESSING_TYPE:
				return convertProcessingTypeToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.SOURCE_TYPE:
				return convertSourceTypeToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.COMPUTATION_TYPE:
				return convertComputationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefType createRefTypeFromString(EDataType eDataType, String initialValue) {
		RefType result = RefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDataFormatType createRefDataFormatTypeFromString(EDataType eDataType, String initialValue) {
		RefDataFormatType result = RefDataFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefDataFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechType createTechTypeFromString(EDataType eDataType, String initialValue) {
		TechType result = TechType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTechTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingType createProcessingTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingType result = ProcessingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeFromString(EDataType eDataType, String initialValue) {
		SourceType result = SourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationType createComputationTypeFromString(EDataType eDataType, String initialValue) {
		ComputationType result = ComputationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComputationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Enumeration_TypesPackage getBasic_Enumeration_TypesPackage() {
		return (Basic_Enumeration_TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Basic_Enumeration_TypesPackage getPackage() {
		return Basic_Enumeration_TypesPackage.eINSTANCE;
	}

} //Basic_Enumeration_TypesFactoryImpl
