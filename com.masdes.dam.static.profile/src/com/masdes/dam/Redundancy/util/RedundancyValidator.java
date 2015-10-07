/**
 */
package com.masdes.dam.Redundancy.util;

import com.masdes.dam.Redundancy.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Redundancy.RedundancyPackage
 * @generated
 */
public class RedundancyValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RedundancyValidator INSTANCE = new RedundancyValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.masdes.dam.Redundancy";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Package Size' of 'Da Redundant Structure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA_REDUNDANT_STRUCTURE__PACKAGE_SIZE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exclude Self Element' of 'Da Spare'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA_SPARE__EXCLUDE_SELF_ELEMENT = 2;

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
	public RedundancyValidator() {
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
	  return RedundancyPackage.eINSTANCE;
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
			case RedundancyPackage.DA_CONTROLLER:
				return validateDaController((DaController)value, diagnostics, context);
			case RedundancyPackage.DA_VARIANT:
				return validateDaVariant((DaVariant)value, diagnostics, context);
			case RedundancyPackage.DA_ADJUDICATOR:
				return validateDaAdjudicator((DaAdjudicator)value, diagnostics, context);
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE:
				return validateDaRedundantStructure((DaRedundantStructure)value, diagnostics, context);
			case RedundancyPackage.DA_SPARE:
				return validateDaSpare((DaSpare)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaController(DaController daController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaVariant(DaVariant daVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daVariant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaAdjudicator(DaAdjudicator daAdjudicator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daAdjudicator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaRedundantStructure(DaRedundantStructure daRedundantStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daRedundantStructure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daRedundantStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateDaRedundantStructure_packageSize(daRedundantStructure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the packageSize constraint of '<em>Da Redundant Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaRedundantStructure_packageSize(DaRedundantStructure daRedundantStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return daRedundantStructure.packageSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaSpare(DaSpare daSpare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daSpare, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daSpare, diagnostics, context);
		if (result || diagnostics != null) result &= validateDaSpare_excludeSelfElement(daSpare, diagnostics, context);
		return result;
	}

	/**
	 * Validates the excludeSelfElement constraint of '<em>Da Spare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaSpare_excludeSelfElement(DaSpare daSpare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return daSpare.excludeSelfElement(diagnostics, context);
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

} //RedundancyValidator
