/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaChange;
import com.masdes.dam.Core.DaRecognition;
import com.masdes.dam.Core.DaRecovery;
import com.masdes.dam.Core.DaResistance;
import com.masdes.dam.Core.DaStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.impl.DaChangeImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaChangeImpl#getRecognition <em>Recognition</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaChangeImpl#getRecovery <em>Recovery</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaChangeImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaChangeImpl#getBase_Transition <em>Base Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaChangeImpl extends MinimalEObjectImpl.Container implements DaChange {
	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected DaStep threats;

	/**
	 * The cached value of the '{@link #getRecognition() <em>Recognition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognition()
	 * @generated
	 * @ordered
	 */
	protected DaRecognition recognition;

	/**
	 * The cached value of the '{@link #getRecovery() <em>Recovery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecovery()
	 * @generated
	 * @ordered
	 */
	protected DaRecovery recovery;

	/**
	 * The cached value of the '{@link #getResistance() <em>Resistance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected DaResistance resistance;

	/**
	 * The cached value of the '{@link #getBase_Transition() <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Transition()
	 * @generated
	 * @ordered
	 */
	protected Transition base_Transition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DA_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaStep getThreats() {
		if (threats != null && threats.eIsProxy()) {
			InternalEObject oldThreats = (InternalEObject)threats;
			threats = (DaStep)eResolveProxy(oldThreats);
			if (threats != oldThreats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CHANGE__THREATS, oldThreats, threats));
			}
		}
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaStep basicGetThreats() {
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreats(DaStep newThreats) {
		DaStep oldThreats = threats;
		threats = newThreats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CHANGE__THREATS, oldThreats, threats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRecognition getRecognition() {
		if (recognition != null && recognition.eIsProxy()) {
			InternalEObject oldRecognition = (InternalEObject)recognition;
			recognition = (DaRecognition)eResolveProxy(oldRecognition);
			if (recognition != oldRecognition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CHANGE__RECOGNITION, oldRecognition, recognition));
			}
		}
		return recognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRecognition basicGetRecognition() {
		return recognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecognition(DaRecognition newRecognition) {
		DaRecognition oldRecognition = recognition;
		recognition = newRecognition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CHANGE__RECOGNITION, oldRecognition, recognition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRecovery getRecovery() {
		if (recovery != null && recovery.eIsProxy()) {
			InternalEObject oldRecovery = (InternalEObject)recovery;
			recovery = (DaRecovery)eResolveProxy(oldRecovery);
			if (recovery != oldRecovery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CHANGE__RECOVERY, oldRecovery, recovery));
			}
		}
		return recovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRecovery basicGetRecovery() {
		return recovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecovery(DaRecovery newRecovery) {
		DaRecovery oldRecovery = recovery;
		recovery = newRecovery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CHANGE__RECOVERY, oldRecovery, recovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaResistance getResistance() {
		if (resistance != null && resistance.eIsProxy()) {
			InternalEObject oldResistance = (InternalEObject)resistance;
			resistance = (DaResistance)eResolveProxy(oldResistance);
			if (resistance != oldResistance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CHANGE__RESISTANCE, oldResistance, resistance));
			}
		}
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaResistance basicGetResistance() {
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistance(DaResistance newResistance) {
		DaResistance oldResistance = resistance;
		resistance = newResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CHANGE__RESISTANCE, oldResistance, resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getBase_Transition() {
		if (base_Transition != null && base_Transition.eIsProxy()) {
			InternalEObject oldBase_Transition = (InternalEObject)base_Transition;
			base_Transition = (Transition)eResolveProxy(oldBase_Transition);
			if (base_Transition != oldBase_Transition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CHANGE__BASE_TRANSITION, oldBase_Transition, base_Transition));
			}
		}
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetBase_Transition() {
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Transition(Transition newBase_Transition) {
		Transition oldBase_Transition = base_Transition;
		base_Transition = newBase_Transition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CHANGE__BASE_TRANSITION, oldBase_Transition, base_Transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DA_CHANGE__THREATS:
				if (resolve) return getThreats();
				return basicGetThreats();
			case CorePackage.DA_CHANGE__RECOGNITION:
				if (resolve) return getRecognition();
				return basicGetRecognition();
			case CorePackage.DA_CHANGE__RECOVERY:
				if (resolve) return getRecovery();
				return basicGetRecovery();
			case CorePackage.DA_CHANGE__RESISTANCE:
				if (resolve) return getResistance();
				return basicGetResistance();
			case CorePackage.DA_CHANGE__BASE_TRANSITION:
				if (resolve) return getBase_Transition();
				return basicGetBase_Transition();
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
			case CorePackage.DA_CHANGE__THREATS:
				setThreats((DaStep)newValue);
				return;
			case CorePackage.DA_CHANGE__RECOGNITION:
				setRecognition((DaRecognition)newValue);
				return;
			case CorePackage.DA_CHANGE__RECOVERY:
				setRecovery((DaRecovery)newValue);
				return;
			case CorePackage.DA_CHANGE__RESISTANCE:
				setResistance((DaResistance)newValue);
				return;
			case CorePackage.DA_CHANGE__BASE_TRANSITION:
				setBase_Transition((Transition)newValue);
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
			case CorePackage.DA_CHANGE__THREATS:
				setThreats((DaStep)null);
				return;
			case CorePackage.DA_CHANGE__RECOGNITION:
				setRecognition((DaRecognition)null);
				return;
			case CorePackage.DA_CHANGE__RECOVERY:
				setRecovery((DaRecovery)null);
				return;
			case CorePackage.DA_CHANGE__RESISTANCE:
				setResistance((DaResistance)null);
				return;
			case CorePackage.DA_CHANGE__BASE_TRANSITION:
				setBase_Transition((Transition)null);
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
			case CorePackage.DA_CHANGE__THREATS:
				return threats != null;
			case CorePackage.DA_CHANGE__RECOGNITION:
				return recognition != null;
			case CorePackage.DA_CHANGE__RECOVERY:
				return recovery != null;
			case CorePackage.DA_CHANGE__RESISTANCE:
				return resistance != null;
			case CorePackage.DA_CHANGE__BASE_TRANSITION:
				return base_Transition != null;
		}
		return super.eIsSet(featureID);
	}

} //DaChangeImpl
