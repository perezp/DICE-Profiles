/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaErrorPropagation;
import com.masdes.dam.Complex_Data_Types.DaFailure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Error Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaErrorPropagationImpl extends MinimalEObjectImpl.Container implements DaErrorPropagation {
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
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected DaFailure cause;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected DaError effect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaErrorPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DA_ERROR_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProbability() {
		if (probability == null) {
			probability = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__PROBABILITY);
		}
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaFailure getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCause(DaFailure newCause, NotificationChain msgs) {
		DaFailure oldCause = cause;
		cause = newCause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE, oldCause, newCause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(DaFailure newCause) {
		if (newCause != cause) {
			NotificationChain msgs = null;
			if (cause != null)
				msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE, null, msgs);
			if (newCause != null)
				msgs = ((InternalEObject)newCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE, null, msgs);
			msgs = basicSetCause(newCause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE, newCause, newCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaError getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(DaError newEffect, NotificationChain msgs) {
		DaError oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(DaError newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE:
				return basicSetCause(null, msgs);
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT:
				return basicSetEffect(null, msgs);
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
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__PROBABILITY:
				return getProbability();
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__FROM:
				return getFrom();
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__TO:
				return getTo();
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE:
				return getCause();
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT:
				return getEffect();
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
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__PROBABILITY:
				getProbability().clear();
				getProbability().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__FROM:
				setFrom((String)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__TO:
				setTo((String)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE:
				setCause((DaFailure)newValue);
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT:
				setEffect((DaError)newValue);
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
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__PROBABILITY:
				getProbability().clear();
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__TO:
				setTo(TO_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE:
				setCause((DaFailure)null);
				return;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT:
				setEffect((DaError)null);
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
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__PROBABILITY:
				return probability != null && !probability.isEmpty();
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__CAUSE:
				return cause != null;
			case Complex_Data_TypesPackage.DA_ERROR_PROPAGATION__EFFECT:
				return effect != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //DaErrorPropagationImpl
