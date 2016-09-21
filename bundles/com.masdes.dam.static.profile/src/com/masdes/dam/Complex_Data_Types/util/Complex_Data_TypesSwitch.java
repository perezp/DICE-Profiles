/**
 */
package com.masdes.dam.Complex_Data_Types.util;

import com.masdes.dam.Complex_Data_Types.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage
 * @generated
 */
public class Complex_Data_TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Complex_Data_TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex_Data_TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = Complex_Data_TypesPackage.eINSTANCE;
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
			case Complex_Data_TypesPackage.DA_ERROR: {
				DaError daError = (DaError)theEObject;
				T result = caseDaError(daError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Complex_Data_TypesPackage.DA_FAULT: {
				DaFault daFault = (DaFault)theEObject;
				T result = caseDaFault(daFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Complex_Data_TypesPackage.DA_FAILURE: {
				DaFailure daFailure = (DaFailure)theEObject;
				T result = caseDaFailure(daFailure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Complex_Data_TypesPackage.DA_HAZARD: {
				DaHazard daHazard = (DaHazard)theEObject;
				T result = caseDaHazard(daHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION: {
				DaErrorPropagation daErrorPropagation = (DaErrorPropagation)theEObject;
				T result = caseDaErrorPropagation(daErrorPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Complex_Data_TypesPackage.DA_REC: {
				DaRec daRec = (DaRec)theEObject;
				T result = caseDaRec(daRec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Complex_Data_TypesPackage.DA_REPAIR: {
				DaRepair daRepair = (DaRepair)theEObject;
				T result = caseDaRepair(daRepair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Complex_Data_TypesPackage.DA_SURVIVABILITY: {
				DaSurvivability daSurvivability = (DaSurvivability)theEObject;
				T result = caseDaSurvivability(daSurvivability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaError(DaError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaFault(DaFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaFailure(DaFailure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaHazard(DaHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Error Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Error Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaErrorPropagation(DaErrorPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Rec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Rec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaRec(DaRec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Repair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Repair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaRepair(DaRepair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Survivability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Survivability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaSurvivability(DaSurvivability object) {
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

} //Complex_Data_TypesSwitch
