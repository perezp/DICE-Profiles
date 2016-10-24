/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Complex_Data_Types.DaSurvivability;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaService;
import com.masdes.dam.Core.DaServiceMode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Service Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceModeImpl#getService <em>Service</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceModeImpl#getQos <em>Qos</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceModeImpl#getProb <em>Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceModeImpl#getBase_State <em>Base State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaServiceModeImpl extends MinimalEObjectImpl.Container implements DaServiceMode {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<DaService> service;

	/**
	 * The cached value of the '{@link #getQos() <em>Qos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQos()
	 * @generated
	 * @ordered
	 */
	protected EList<DaSurvivability> qos;

	/**
	 * The default value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected static final String PROB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected String prob = PROB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_State() <em>Base State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_State()
	 * @generated
	 * @ordered
	 */
	protected State base_State;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaServiceModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DA_SERVICE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaService> getService() {
		if (service == null) {
			service = new EObjectResolvingEList<DaService>(DaService.class, this, CorePackage.DA_SERVICE_MODE__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaSurvivability> getQos() {
		if (qos == null) {
			qos = new EObjectContainmentEList<DaSurvivability>(DaSurvivability.class, this, CorePackage.DA_SERVICE_MODE__QOS);
		}
		return qos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb(String newProb) {
		String oldProb = prob;
		prob = newProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_SERVICE_MODE__PROB, oldProb, prob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getBase_State() {
		if (base_State != null && base_State.eIsProxy()) {
			InternalEObject oldBase_State = (InternalEObject)base_State;
			base_State = (State)eResolveProxy(oldBase_State);
			if (base_State != oldBase_State) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_SERVICE_MODE__BASE_STATE, oldBase_State, base_State));
			}
		}
		return base_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetBase_State() {
		return base_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_State(State newBase_State) {
		State oldBase_State = base_State;
		base_State = newBase_State;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_SERVICE_MODE__BASE_STATE, oldBase_State, base_State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DA_SERVICE_MODE__QOS:
				return ((InternalEList<?>)getQos()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DA_SERVICE_MODE__SERVICE:
				return getService();
			case CorePackage.DA_SERVICE_MODE__QOS:
				return getQos();
			case CorePackage.DA_SERVICE_MODE__PROB:
				return getProb();
			case CorePackage.DA_SERVICE_MODE__BASE_STATE:
				if (resolve) return getBase_State();
				return basicGetBase_State();
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
			case CorePackage.DA_SERVICE_MODE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends DaService>)newValue);
				return;
			case CorePackage.DA_SERVICE_MODE__QOS:
				getQos().clear();
				getQos().addAll((Collection<? extends DaSurvivability>)newValue);
				return;
			case CorePackage.DA_SERVICE_MODE__PROB:
				setProb((String)newValue);
				return;
			case CorePackage.DA_SERVICE_MODE__BASE_STATE:
				setBase_State((State)newValue);
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
			case CorePackage.DA_SERVICE_MODE__SERVICE:
				getService().clear();
				return;
			case CorePackage.DA_SERVICE_MODE__QOS:
				getQos().clear();
				return;
			case CorePackage.DA_SERVICE_MODE__PROB:
				setProb(PROB_EDEFAULT);
				return;
			case CorePackage.DA_SERVICE_MODE__BASE_STATE:
				setBase_State((State)null);
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
			case CorePackage.DA_SERVICE_MODE__SERVICE:
				return service != null && !service.isEmpty();
			case CorePackage.DA_SERVICE_MODE__QOS:
				return qos != null && !qos.isEmpty();
			case CorePackage.DA_SERVICE_MODE__PROB:
				return PROB_EDEFAULT == null ? prob != null : !PROB_EDEFAULT.equals(prob);
			case CorePackage.DA_SERVICE_MODE__BASE_STATE:
				return base_State != null;
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
		result.append(" (prob: ");
		result.append(prob);
		result.append(')');
		return result.toString();
	}

} //DaServiceModeImpl
