/**
 */
package com.masdes.dam.Maintenance.util;

import com.masdes.dam.Maintenance.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Maintenance.MaintenancePackage
 * @generated
 */
public class MaintenanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MaintenanceValidator INSTANCE = new MaintenanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.masdes.dam.Maintenance";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Replace Size' of 'Da Replacement Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA_REPLACEMENT_STEP__REPLACE_SIZE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Map Size' of 'Da Reallocation Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA_REALLOCATION_STEP__MAP_SIZE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MaintenancePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MaintenancePackage.DA_REPLACEMENT_STEP:
				return validateDaReplacementStep((DaReplacementStep)value, diagnostics, context);
			case MaintenancePackage.DA_REALLOCATION_STEP:
				return validateDaReallocationStep((DaReallocationStep)value, diagnostics, context);
			case MaintenancePackage.DA_ACTIVATION_STEP:
				return validateDaActivationStep((DaActivationStep)value, diagnostics, context);
			case MaintenancePackage.DA_AGENT_GROUP:
				return validateDaAgentGroup((DaAgentGroup)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaReplacementStep(DaReplacementStep daReplacementStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daReplacementStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daReplacementStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateDaReplacementStep_replaceSize(daReplacementStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the replaceSize constraint of '<em>Da Replacement Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaReplacementStep_replaceSize(DaReplacementStep daReplacementStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return daReplacementStep.replaceSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaReallocationStep(DaReallocationStep daReallocationStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daReallocationStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daReallocationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateDaReallocationStep_mapSize(daReallocationStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mapSize constraint of '<em>Da Reallocation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaReallocationStep_mapSize(DaReallocationStep daReallocationStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return daReallocationStep.mapSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaActivationStep(DaActivationStep daActivationStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daActivationStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaAgentGroup(DaAgentGroup daAgentGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daAgentGroup, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MaintenanceValidator
