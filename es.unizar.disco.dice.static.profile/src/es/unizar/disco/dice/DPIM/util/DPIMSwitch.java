/**
 */
package es.unizar.disco.dice.DPIM.util;

import com.masdes.dam.Core.DaComponent;
import com.masdes.dam.Core.DaConnector;

import es.unizar.disco.dice.DPIM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.StorageResource;

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
 * @see es.unizar.disco.dice.DPIM.DPIMPackage
 * @generated
 */
public class DPIMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DPIMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPIMSwitch() {
		if (modelPackage == null) {
			modelPackage = DPIMPackage.eINSTANCE;
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
			case DPIMPackage.DICE_COMPONENT: {
				DiceComponent diceComponent = (DiceComponent)theEObject;
				T result = caseDiceComponent(diceComponent);
				if (result == null) result = caseDaComponent(diceComponent);
				if (result == null) result = caseResource(diceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DPIMPackage.DICE_FILTER_NODE: {
				DiceFilterNode diceFilterNode = (DiceFilterNode)theEObject;
				T result = caseDiceFilterNode(diceFilterNode);
				if (result == null) result = caseDiceComponent(diceFilterNode);
				if (result == null) result = caseDaComponent(diceFilterNode);
				if (result == null) result = caseResource(diceFilterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DPIMPackage.DICE_VISUALIZATION_NODE: {
				DiceVisualizationNode diceVisualizationNode = (DiceVisualizationNode)theEObject;
				T result = caseDiceVisualizationNode(diceVisualizationNode);
				if (result == null) result = caseDiceComponent(diceVisualizationNode);
				if (result == null) result = caseDaComponent(diceVisualizationNode);
				if (result == null) result = caseResource(diceVisualizationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DPIMPackage.DICE_SOURCE_NODE: {
				DiceSourceNode diceSourceNode = (DiceSourceNode)theEObject;
				T result = caseDiceSourceNode(diceSourceNode);
				if (result == null) result = caseDiceComponent(diceSourceNode);
				if (result == null) result = caseDaComponent(diceSourceNode);
				if (result == null) result = caseResource(diceSourceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DPIMPackage.DICE_STORAGE_RESOURCE: {
				DiceStorageResource diceStorageResource = (DiceStorageResource)theEObject;
				T result = caseDiceStorageResource(diceStorageResource);
				if (result == null) result = caseStorageResource(diceStorageResource);
				if (result == null) result = caseResource(diceStorageResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DPIMPackage.DICE_CHANNEL: {
				DiceChannel diceChannel = (DiceChannel)theEObject;
				T result = caseDiceChannel(diceChannel);
				if (result == null) result = caseDaConnector(diceChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceComponent(DiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Filter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Filter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceFilterNode(DiceFilterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Visualization Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Visualization Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceVisualizationNode(DiceVisualizationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Source Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceSourceNode(DiceSourceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Storage Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Storage Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceStorageResource(DiceStorageResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceChannel(DiceChannel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Storage Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageResource(StorageResource object) {
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

} //DPIMSwitch
