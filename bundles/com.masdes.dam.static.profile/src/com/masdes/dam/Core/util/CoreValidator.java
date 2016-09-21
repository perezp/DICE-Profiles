/**
 */
package com.masdes.dam.Core.util;

import com.masdes.dam.Core.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.masdes.dam.Core";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Request Size' of 'Da Service Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA_SERVICE_REQUEST__REQUEST_SIZE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
	public CoreValidator() {
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
	  return CorePackage.eINSTANCE;
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
			case CorePackage.DA_COMPONENT:
				return validateDaComponent((DaComponent)value, diagnostics, context);
			case CorePackage.DA_SERVICE:
				return validateDaService((DaService)value, diagnostics, context);
			case CorePackage.DA_STEP:
				return validateDaStep((DaStep)value, diagnostics, context);
			case CorePackage.DA_RESISTANCE:
				return validateDaResistance((DaResistance)value, diagnostics, context);
			case CorePackage.DA_RECOGNITION:
				return validateDaRecognition((DaRecognition)value, diagnostics, context);
			case CorePackage.DA_RECOVERY:
				return validateDaRecovery((DaRecovery)value, diagnostics, context);
			case CorePackage.DA_SERVICE_MODE:
				return validateDaServiceMode((DaServiceMode)value, diagnostics, context);
			case CorePackage.DA_SERVICE_REQUEST:
				return validateDaServiceRequest((DaServiceRequest)value, diagnostics, context);
			case CorePackage.DA_CONNECTOR:
				return validateDaConnector((DaConnector)value, diagnostics, context);
			case CorePackage.DA_CHANGE:
				return validateDaChange((DaChange)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaComponent(DaComponent daComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaService(DaService daService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaStep(DaStep daStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaResistance(DaResistance daResistance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daResistance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaRecognition(DaRecognition daRecognition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daRecognition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaRecovery(DaRecovery daRecovery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daRecovery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaServiceMode(DaServiceMode daServiceMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daServiceMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaServiceRequest(DaServiceRequest daServiceRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daServiceRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daServiceRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateDaServiceRequest_requestSize(daServiceRequest, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requestSize constraint of '<em>Da Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaServiceRequest_requestSize(DaServiceRequest daServiceRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return daServiceRequest.requestSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaConnector(DaConnector daConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaChange(DaChange daChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daChange, diagnostics, context);
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

} //CoreValidator
