/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaFault;
import com.masdes.dam.Complex_Data_Types.DaHazard;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl#getEffectF <em>Effect F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl#getEffectH <em>Effect H</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaErrorImpl extends MinimalEObjectImpl.Container implements DaError {
	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected EList<String> latency;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected EList<String> probability;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFault> cause;

	/**
	 * The cached value of the '{@link #getEffectF() <em>Effect F</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectF()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFailure> effectF;

	/**
	 * The cached value of the '{@link #getEffectH() <em>Effect H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectH()
	 * @generated
	 * @ordered
	 */
	protected EList<DaHazard> effectH;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DA_ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLatency() {
		if (latency == null) {
			latency = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_ERROR__LATENCY);
		}
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProbability() {
		if (probability == null) {
			probability = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_ERROR__PROBABILITY);
		}
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFault> getCause() {
		if (cause == null) {
			cause = new EObjectContainmentEList<DaFault>(DaFault.class, this, Complex_Data_TypesPackage.DA_ERROR__CAUSE);
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFailure> getEffectF() {
		if (effectF == null) {
			effectF = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, Complex_Data_TypesPackage.DA_ERROR__EFFECT_F);
		}
		return effectF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaHazard> getEffectH() {
		if (effectH == null) {
			effectH = new EObjectContainmentEList<DaHazard>(DaHazard.class, this, Complex_Data_TypesPackage.DA_ERROR__EFFECT_H);
		}
		return effectH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DA_ERROR__CAUSE:
				return ((InternalEList<?>)getCause()).basicRemove(otherEnd, msgs);
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_F:
				return ((InternalEList<?>)getEffectF()).basicRemove(otherEnd, msgs);
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_H:
				return ((InternalEList<?>)getEffectH()).basicRemove(otherEnd, msgs);
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
			case Complex_Data_TypesPackage.DA_ERROR__LATENCY:
				return getLatency();
			case Complex_Data_TypesPackage.DA_ERROR__PROBABILITY:
				return getProbability();
			case Complex_Data_TypesPackage.DA_ERROR__CAUSE:
				return getCause();
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_F:
				return getEffectF();
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_H:
				return getEffectH();
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
			case Complex_Data_TypesPackage.DA_ERROR__LATENCY:
				getLatency().clear();
				getLatency().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR__PROBABILITY:
				getProbability().clear();
				getProbability().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR__CAUSE:
				getCause().clear();
				getCause().addAll((Collection<? extends DaFault>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_F:
				getEffectF().clear();
				getEffectF().addAll((Collection<? extends DaFailure>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_H:
				getEffectH().clear();
				getEffectH().addAll((Collection<? extends DaHazard>)newValue);
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
			case Complex_Data_TypesPackage.DA_ERROR__LATENCY:
				getLatency().clear();
				return;
			case Complex_Data_TypesPackage.DA_ERROR__PROBABILITY:
				getProbability().clear();
				return;
			case Complex_Data_TypesPackage.DA_ERROR__CAUSE:
				getCause().clear();
				return;
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_F:
				getEffectF().clear();
				return;
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_H:
				getEffectH().clear();
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
			case Complex_Data_TypesPackage.DA_ERROR__LATENCY:
				return latency != null && !latency.isEmpty();
			case Complex_Data_TypesPackage.DA_ERROR__PROBABILITY:
				return probability != null && !probability.isEmpty();
			case Complex_Data_TypesPackage.DA_ERROR__CAUSE:
				return cause != null && !cause.isEmpty();
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_F:
				return effectF != null && !effectF.isEmpty();
			case Complex_Data_TypesPackage.DA_ERROR__EFFECT_H:
				return effectH != null && !effectH.isEmpty();
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
		result.append(" (latency: ");
		result.append(latency);
		result.append(", probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //DaErrorImpl
