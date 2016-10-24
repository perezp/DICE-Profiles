/**
 */
package com.masdes.dam.Threats.impl;

import com.masdes.dam.Complex_Data_Types.DaFault;

import com.masdes.dam.Threats.DaFaultGenerator;
import com.masdes.dam.Threats.ThreatsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaWorkloadGeneratorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Fault Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Threats.impl.DaFaultGeneratorImpl#getNumberOfFaults <em>Number Of Faults</em>}</li>
 *   <li>{@link com.masdes.dam.Threats.impl.DaFaultGeneratorImpl#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaFaultGeneratorImpl extends GaWorkloadGeneratorImpl implements DaFaultGenerator {
	/**
	 * The cached value of the '{@link #getNumberOfFaults() <em>Number Of Faults</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFaults()
	 * @generated
	 * @ordered
	 */
	protected EList<String> numberOfFaults;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected DaFault fault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaFaultGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatsPackage.Literals.DA_FAULT_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNumberOfFaults() {
		if (numberOfFaults == null) {
			numberOfFaults = new EDataTypeUniqueEList<String>(String.class, this, ThreatsPackage.DA_FAULT_GENERATOR__NUMBER_OF_FAULTS);
		}
		return numberOfFaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaFault getFault() {
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFault(DaFault newFault, NotificationChain msgs) {
		DaFault oldFault = fault;
		fault = newFault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThreatsPackage.DA_FAULT_GENERATOR__FAULT, oldFault, newFault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault(DaFault newFault) {
		if (newFault != fault) {
			NotificationChain msgs = null;
			if (fault != null)
				msgs = ((InternalEObject)fault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThreatsPackage.DA_FAULT_GENERATOR__FAULT, null, msgs);
			if (newFault != null)
				msgs = ((InternalEObject)newFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThreatsPackage.DA_FAULT_GENERATOR__FAULT, null, msgs);
			msgs = basicSetFault(newFault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThreatsPackage.DA_FAULT_GENERATOR__FAULT, newFault, newFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThreatsPackage.DA_FAULT_GENERATOR__FAULT:
				return basicSetFault(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThreatsPackage.DA_FAULT_GENERATOR__NUMBER_OF_FAULTS:
				return getNumberOfFaults();
			case ThreatsPackage.DA_FAULT_GENERATOR__FAULT:
				return getFault();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThreatsPackage.DA_FAULT_GENERATOR__NUMBER_OF_FAULTS:
				getNumberOfFaults().clear();
				getNumberOfFaults().addAll((Collection<? extends String>)newValue);
				return;
			case ThreatsPackage.DA_FAULT_GENERATOR__FAULT:
				setFault((DaFault)newValue);
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
			case ThreatsPackage.DA_FAULT_GENERATOR__NUMBER_OF_FAULTS:
				getNumberOfFaults().clear();
				return;
			case ThreatsPackage.DA_FAULT_GENERATOR__FAULT:
				setFault((DaFault)null);
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
			case ThreatsPackage.DA_FAULT_GENERATOR__NUMBER_OF_FAULTS:
				return numberOfFaults != null && !numberOfFaults.isEmpty();
			case ThreatsPackage.DA_FAULT_GENERATOR__FAULT:
				return fault != null;
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
		result.append(" (numberOfFaults: ");
		result.append(numberOfFaults);
		result.append(')');
		return result.toString();
	}

} //DaFaultGeneratorImpl
