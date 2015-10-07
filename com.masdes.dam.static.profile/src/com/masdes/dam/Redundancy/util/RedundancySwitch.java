/**
 */
package com.masdes.dam.Redundancy.util;

import com.masdes.dam.Core.DaComponent;

import com.masdes.dam.Redundancy.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;

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
 * @see com.masdes.dam.Redundancy.RedundancyPackage
 * @generated
 */
public class RedundancySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RedundancyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancySwitch() {
		if (modelPackage == null) {
			modelPackage = RedundancyPackage.eINSTANCE;
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
			case RedundancyPackage.DA_CONTROLLER: {
				DaController daController = (DaController)theEObject;
				T result = caseDaController(daController);
				if (result == null) result = caseDaComponent(daController);
				if (result == null) result = caseResource(daController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedundancyPackage.DA_VARIANT: {
				DaVariant daVariant = (DaVariant)theEObject;
				T result = caseDaVariant(daVariant);
				if (result == null) result = caseDaComponent(daVariant);
				if (result == null) result = caseResource(daVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedundancyPackage.DA_ADJUDICATOR: {
				DaAdjudicator daAdjudicator = (DaAdjudicator)theEObject;
				T result = caseDaAdjudicator(daAdjudicator);
				if (result == null) result = caseDaComponent(daAdjudicator);
				if (result == null) result = caseResource(daAdjudicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE: {
				DaRedundantStructure daRedundantStructure = (DaRedundantStructure)theEObject;
				T result = caseDaRedundantStructure(daRedundantStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedundancyPackage.DA_SPARE: {
				DaSpare daSpare = (DaSpare)theEObject;
				T result = caseDaSpare(daSpare);
				if (result == null) result = caseDaComponent(daSpare);
				if (result == null) result = caseResource(daSpare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaController(DaController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaVariant(DaVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Adjudicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Adjudicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaAdjudicator(DaAdjudicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Redundant Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Redundant Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaRedundantStructure(DaRedundantStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Spare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Spare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaSpare(DaSpare object) {
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

} //RedundancySwitch
