/**
 */
package com.masdes.dam.Core.util;

import com.masdes.dam.Core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedElement;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedProcessing;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.DA_COMPONENT: {
				DaComponent daComponent = (DaComponent)theEObject;
				T result = caseDaComponent(daComponent);
				if (result == null) result = caseResource(daComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_SERVICE: {
				DaService daService = (DaService)theEObject;
				T result = caseDaService(daService);
				if (result == null) result = caseGaScenario(daService);
				if (result == null) result = caseResourceUsage(daService);
				if (result == null) result = caseTimedProcessing(daService);
				if (result == null) result = caseTimedElement(daService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_STEP: {
				DaStep daStep = (DaStep)theEObject;
				T result = caseDaStep(daStep);
				if (result == null) result = caseDaService(daStep);
				if (result == null) result = caseGaStep(daStep);
				if (result == null) result = caseGaScenario(daStep);
				if (result == null) result = caseResourceUsage(daStep);
				if (result == null) result = caseTimedProcessing(daStep);
				if (result == null) result = caseTimedElement(daStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_RESISTANCE: {
				DaResistance daResistance = (DaResistance)theEObject;
				T result = caseDaResistance(daResistance);
				if (result == null) result = caseDaService(daResistance);
				if (result == null) result = caseGaScenario(daResistance);
				if (result == null) result = caseResourceUsage(daResistance);
				if (result == null) result = caseTimedProcessing(daResistance);
				if (result == null) result = caseTimedElement(daResistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_RECOGNITION: {
				DaRecognition daRecognition = (DaRecognition)theEObject;
				T result = caseDaRecognition(daRecognition);
				if (result == null) result = caseDaService(daRecognition);
				if (result == null) result = caseGaScenario(daRecognition);
				if (result == null) result = caseResourceUsage(daRecognition);
				if (result == null) result = caseTimedProcessing(daRecognition);
				if (result == null) result = caseTimedElement(daRecognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_RECOVERY: {
				DaRecovery daRecovery = (DaRecovery)theEObject;
				T result = caseDaRecovery(daRecovery);
				if (result == null) result = caseDaService(daRecovery);
				if (result == null) result = caseGaScenario(daRecovery);
				if (result == null) result = caseResourceUsage(daRecovery);
				if (result == null) result = caseTimedProcessing(daRecovery);
				if (result == null) result = caseTimedElement(daRecovery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_SERVICE_MODE: {
				DaServiceMode daServiceMode = (DaServiceMode)theEObject;
				T result = caseDaServiceMode(daServiceMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_SERVICE_REQUEST: {
				DaServiceRequest daServiceRequest = (DaServiceRequest)theEObject;
				T result = caseDaServiceRequest(daServiceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_CONNECTOR: {
				DaConnector daConnector = (DaConnector)theEObject;
				T result = caseDaConnector(daConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DA_CHANGE: {
				DaChange daChange = (DaChange)theEObject;
				T result = caseDaChange(daChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaComponent(DaComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaService(DaService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaStep(DaStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Resistance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Resistance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaResistance(DaResistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Recognition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Recognition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaRecognition(DaRecognition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Recovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Recovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaRecovery(DaRecovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Service Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Service Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaServiceMode(DaServiceMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Service Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaServiceRequest(DaServiceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaConnector(DaConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaChange(DaChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUsage(ResourceUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedElement(TimedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedProcessing(TimedProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ga Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ga Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaScenario(GaScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ga Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ga Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaStep(GaStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
