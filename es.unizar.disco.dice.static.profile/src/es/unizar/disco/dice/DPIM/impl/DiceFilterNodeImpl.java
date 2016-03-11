/**
 */
package es.unizar.disco.dice.DPIM.impl;

import es.unizar.disco.dice.DPIM.DPIMPackage;
import es.unizar.disco.dice.DPIM.DiceFilterNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Filter Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DiceFilterNodeImpl#getInputRatio <em>Input Ratio</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DiceFilterNodeImpl#getOutputRation <em>Output Ration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceFilterNodeImpl extends DiceComponentImpl implements DiceFilterNode {
	/**
	 * The default value of the '{@link #getInputRatio() <em>Input Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRatio()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputRatio() <em>Input Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRatio()
	 * @generated
	 * @ordered
	 */
	protected String inputRatio = INPUT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputRation() <em>Output Ration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRation()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_RATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputRation() <em>Output Ration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRation()
	 * @generated
	 * @ordered
	 */
	protected String outputRation = OUTPUT_RATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceFilterNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPIMPackage.Literals.DICE_FILTER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputRatio() {
		return inputRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputRatio(String newInputRatio) {
		String oldInputRatio = inputRatio;
		inputRatio = newInputRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_FILTER_NODE__INPUT_RATIO, oldInputRatio, inputRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputRation() {
		return outputRation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputRation(String newOutputRation) {
		String oldOutputRation = outputRation;
		outputRation = newOutputRation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_FILTER_NODE__OUTPUT_RATION, oldOutputRation, outputRation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DPIMPackage.DICE_FILTER_NODE__INPUT_RATIO:
				return getInputRatio();
			case DPIMPackage.DICE_FILTER_NODE__OUTPUT_RATION:
				return getOutputRation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DPIMPackage.DICE_FILTER_NODE__INPUT_RATIO:
				setInputRatio((String)newValue);
				return;
			case DPIMPackage.DICE_FILTER_NODE__OUTPUT_RATION:
				setOutputRation((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DPIMPackage.DICE_FILTER_NODE__INPUT_RATIO:
				setInputRatio(INPUT_RATIO_EDEFAULT);
				return;
			case DPIMPackage.DICE_FILTER_NODE__OUTPUT_RATION:
				setOutputRation(OUTPUT_RATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DPIMPackage.DICE_FILTER_NODE__INPUT_RATIO:
				return INPUT_RATIO_EDEFAULT == null ? inputRatio != null : !INPUT_RATIO_EDEFAULT.equals(inputRatio);
			case DPIMPackage.DICE_FILTER_NODE__OUTPUT_RATION:
				return OUTPUT_RATION_EDEFAULT == null ? outputRation != null : !OUTPUT_RATION_EDEFAULT.equals(outputRation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inputRatio: ");
		result.append(inputRatio);
		result.append(", outputRation: ");
		result.append(outputRation);
		result.append(')');
		return result.toString();
	}

} //DiceFilterNodeImpl
