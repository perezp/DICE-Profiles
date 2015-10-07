/**
 */
package com.masdes.dam.Basic_Enumeration_Types.impl;

import com.masdes.dam.Basic_Enumeration_Types.*;

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
			case Basic_Enumeration_TypesPackage.PERSISTENCY:
				return createPersistencyFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.DOMAIN:
				return createDomainFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.CONSISTENCY:
				return createConsistencyFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.DETECTABILLITY:
				return createDetectabillityFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.FACTOR_ORIGIN:
				return createFactorOriginFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.GUIDEWORD:
				return createGuidewordFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.PHASE_CREATION:
				return createPhaseCreationFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.SYS_BOUNDARIES:
				return createSysBoundariesFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.PHENOM_CAUSE:
				return createPhenomCauseFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.OBJECTIVE:
				return createObjectiveFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.INTENT:
				return createIntentFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.CAPABILITY:
				return createCapabilityFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.METRIC_NAME:
				return createMetricNameFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.DA_FREQUENCY_UNIT_KIND:
				return createDaFrequencyUnitKindFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.CRITICAL_LEVEL:
				return createCriticalLevelFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.LIKELIHOOD:
				return createLikelihoodFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.STEP_KIND:
				return createStepKindFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.SKILL_TYPE:
				return createSkillTypeFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.DA_CURR_KIND:
				return createDaCurrKindFromString(eDataType, initialValue);
			case Basic_Enumeration_TypesPackage.ORIGIN:
				return createOriginFromString(eDataType, initialValue);
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
			case Basic_Enumeration_TypesPackage.PERSISTENCY:
				return convertPersistencyToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.DOMAIN:
				return convertDomainToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.CONSISTENCY:
				return convertConsistencyToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.DETECTABILLITY:
				return convertDetectabillityToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.FACTOR_ORIGIN:
				return convertFactorOriginToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.GUIDEWORD:
				return convertGuidewordToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.PHASE_CREATION:
				return convertPhaseCreationToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.SYS_BOUNDARIES:
				return convertSysBoundariesToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.PHENOM_CAUSE:
				return convertPhenomCauseToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.OBJECTIVE:
				return convertObjectiveToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.INTENT:
				return convertIntentToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.CAPABILITY:
				return convertCapabilityToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.METRIC_NAME:
				return convertMetricNameToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.DA_FREQUENCY_UNIT_KIND:
				return convertDaFrequencyUnitKindToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.CRITICAL_LEVEL:
				return convertCriticalLevelToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.LIKELIHOOD:
				return convertLikelihoodToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.STEP_KIND:
				return convertStepKindToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.SKILL_TYPE:
				return convertSkillTypeToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.DA_CURR_KIND:
				return convertDaCurrKindToString(eDataType, instanceValue);
			case Basic_Enumeration_TypesPackage.ORIGIN:
				return convertOriginToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistency createPersistencyFromString(EDataType eDataType, String initialValue) {
		Persistency result = Persistency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomainFromString(EDataType eDataType, String initialValue) {
		Domain result = Domain.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consistency createConsistencyFromString(EDataType eDataType, String initialValue) {
		Consistency result = Consistency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsistencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detectabillity createDetectabillityFromString(EDataType eDataType, String initialValue) {
		Detectabillity result = Detectabillity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectabillityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorOrigin createFactorOriginFromString(EDataType eDataType, String initialValue) {
		FactorOrigin result = FactorOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFactorOriginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guideword createGuidewordFromString(EDataType eDataType, String initialValue) {
		Guideword result = Guideword.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidewordToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCreation createPhaseCreationFromString(EDataType eDataType, String initialValue) {
		PhaseCreation result = PhaseCreation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseCreationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysBoundaries createSysBoundariesFromString(EDataType eDataType, String initialValue) {
		SysBoundaries result = SysBoundaries.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSysBoundariesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomCause createPhenomCauseFromString(EDataType eDataType, String initialValue) {
		PhenomCause result = PhenomCause.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhenomCauseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjectiveFromString(EDataType eDataType, String initialValue) {
		Objective result = Objective.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intent createIntentFromString(EDataType eDataType, String initialValue) {
		Intent result = Intent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapabilityFromString(EDataType eDataType, String initialValue) {
		Capability result = Capability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricName createMetricNameFromString(EDataType eDataType, String initialValue) {
		MetricName result = MetricName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaFrequencyUnitKind createDaFrequencyUnitKindFromString(EDataType eDataType, String initialValue) {
		DaFrequencyUnitKind result = DaFrequencyUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaFrequencyUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalLevel createCriticalLevelFromString(EDataType eDataType, String initialValue) {
		CriticalLevel result = CriticalLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriticalLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood createLikelihoodFromString(EDataType eDataType, String initialValue) {
		Likelihood result = Likelihood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikelihoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind createStepKindFromString(EDataType eDataType, String initialValue) {
		StepKind result = StepKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillType createSkillTypeFromString(EDataType eDataType, String initialValue) {
		SkillType result = SkillType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSkillTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaCurrKind createDaCurrKindFromString(EDataType eDataType, String initialValue) {
		DaCurrKind result = DaCurrKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaCurrKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Origin createOriginFromString(EDataType eDataType, String initialValue) {
		Origin result = Origin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOriginToString(EDataType eDataType, Object instanceValue) {
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
