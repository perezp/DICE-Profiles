/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Complex_Data_Types.DaErrorPropagation;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaHazard;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getCoupling <em>Coupling</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getErrorProp <em>Error Prop</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getHazard <em>Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getBase_InvocationAction <em>Base Invocation Action</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getBase_Extend <em>Base Extend</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getBase_Include <em>Base Include</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaConnectorImpl#getBase_Association <em>Base Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaConnectorImpl extends MinimalEObjectImpl.Container implements DaConnector {
	/**
	 * The cached value of the '{@link #getCoupling() <em>Coupling</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<String> coupling;

	/**
	 * The cached value of the '{@link #getErrorProp() <em>Error Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorProp()
	 * @generated
	 * @ordered
	 */
	protected EList<DaErrorPropagation> errorProp;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFailure> failure;

	/**
	 * The cached value of the '{@link #getHazard() <em>Hazard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazard()
	 * @generated
	 * @ordered
	 */
	protected EList<DaHazard> hazard;

	/**
	 * The cached value of the '{@link #getBase_InvocationAction() <em>Base Invocation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InvocationAction()
	 * @generated
	 * @ordered
	 */
	protected InvocationAction base_InvocationAction;

	/**
	 * The cached value of the '{@link #getBase_Extend() <em>Base Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Extend()
	 * @generated
	 * @ordered
	 */
	protected Extend base_Extend;

	/**
	 * The cached value of the '{@link #getBase_Include() <em>Base Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Include()
	 * @generated
	 * @ordered
	 */
	protected Include base_Include;

	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected Connector base_Connector;

	/**
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * The cached value of the '{@link #getBase_Association() <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Association()
	 * @generated
	 * @ordered
	 */
	protected Association base_Association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DA_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCoupling() {
		if (coupling == null) {
			coupling = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_CONNECTOR__COUPLING);
		}
		return coupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaErrorPropagation> getErrorProp() {
		if (errorProp == null) {
			errorProp = new EObjectContainmentEList<DaErrorPropagation>(DaErrorPropagation.class, this, CorePackage.DA_CONNECTOR__ERROR_PROP);
		}
		return errorProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFailure> getFailure() {
		if (failure == null) {
			failure = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, CorePackage.DA_CONNECTOR__FAILURE);
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaHazard> getHazard() {
		if (hazard == null) {
			hazard = new EObjectContainmentEList<DaHazard>(DaHazard.class, this, CorePackage.DA_CONNECTOR__HAZARD);
		}
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction getBase_InvocationAction() {
		if (base_InvocationAction != null && base_InvocationAction.eIsProxy()) {
			InternalEObject oldBase_InvocationAction = (InternalEObject)base_InvocationAction;
			base_InvocationAction = (InvocationAction)eResolveProxy(oldBase_InvocationAction);
			if (base_InvocationAction != oldBase_InvocationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
			}
		}
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction basicGetBase_InvocationAction() {
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InvocationAction(InvocationAction newBase_InvocationAction) {
		InvocationAction oldBase_InvocationAction = base_InvocationAction;
		base_InvocationAction = newBase_InvocationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend getBase_Extend() {
		if (base_Extend != null && base_Extend.eIsProxy()) {
			InternalEObject oldBase_Extend = (InternalEObject)base_Extend;
			base_Extend = (Extend)eResolveProxy(oldBase_Extend);
			if (base_Extend != oldBase_Extend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CONNECTOR__BASE_EXTEND, oldBase_Extend, base_Extend));
			}
		}
		return base_Extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend basicGetBase_Extend() {
		return base_Extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Extend(Extend newBase_Extend) {
		Extend oldBase_Extend = base_Extend;
		base_Extend = newBase_Extend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CONNECTOR__BASE_EXTEND, oldBase_Extend, base_Extend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getBase_Include() {
		if (base_Include != null && base_Include.eIsProxy()) {
			InternalEObject oldBase_Include = (InternalEObject)base_Include;
			base_Include = (Include)eResolveProxy(oldBase_Include);
			if (base_Include != oldBase_Include) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CONNECTOR__BASE_INCLUDE, oldBase_Include, base_Include));
			}
		}
		return base_Include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include basicGetBase_Include() {
		return base_Include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Include(Include newBase_Include) {
		Include oldBase_Include = base_Include;
		base_Include = newBase_Include;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CONNECTOR__BASE_INCLUDE, oldBase_Include, base_Include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CONNECTOR__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CONNECTOR__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject)base_Connector;
			base_Connector = (Connector)eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Connector(Connector newBase_Connector) {
		Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getBase_Dependency() {
		if (base_Dependency != null && base_Dependency.eIsProxy()) {
			InternalEObject oldBase_Dependency = (InternalEObject)base_Dependency;
			base_Dependency = (Dependency)eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CONNECTOR__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetBase_Dependency() {
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Dependency(Dependency newBase_Dependency) {
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CONNECTOR__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getBase_Association() {
		if (base_Association != null && base_Association.eIsProxy()) {
			InternalEObject oldBase_Association = (InternalEObject)base_Association;
			base_Association = (Association)eResolveProxy(oldBase_Association);
			if (base_Association != oldBase_Association) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_CONNECTOR__BASE_ASSOCIATION, oldBase_Association, base_Association));
			}
		}
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetBase_Association() {
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Association(Association newBase_Association) {
		Association oldBase_Association = base_Association;
		base_Association = newBase_Association;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_CONNECTOR__BASE_ASSOCIATION, oldBase_Association, base_Association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DA_CONNECTOR__ERROR_PROP:
				return ((InternalEList<?>)getErrorProp()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_CONNECTOR__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_CONNECTOR__HAZARD:
				return ((InternalEList<?>)getHazard()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DA_CONNECTOR__COUPLING:
				return getCoupling();
			case CorePackage.DA_CONNECTOR__ERROR_PROP:
				return getErrorProp();
			case CorePackage.DA_CONNECTOR__FAILURE:
				return getFailure();
			case CorePackage.DA_CONNECTOR__HAZARD:
				return getHazard();
			case CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION:
				if (resolve) return getBase_InvocationAction();
				return basicGetBase_InvocationAction();
			case CorePackage.DA_CONNECTOR__BASE_EXTEND:
				if (resolve) return getBase_Extend();
				return basicGetBase_Extend();
			case CorePackage.DA_CONNECTOR__BASE_INCLUDE:
				if (resolve) return getBase_Include();
				return basicGetBase_Include();
			case CorePackage.DA_CONNECTOR__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case CorePackage.DA_CONNECTOR__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case CorePackage.DA_CONNECTOR__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
			case CorePackage.DA_CONNECTOR__BASE_ASSOCIATION:
				if (resolve) return getBase_Association();
				return basicGetBase_Association();
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
			case CorePackage.DA_CONNECTOR__COUPLING:
				getCoupling().clear();
				getCoupling().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_CONNECTOR__ERROR_PROP:
				getErrorProp().clear();
				getErrorProp().addAll((Collection<? extends DaErrorPropagation>)newValue);
				return;
			case CorePackage.DA_CONNECTOR__FAILURE:
				getFailure().clear();
				getFailure().addAll((Collection<? extends DaFailure>)newValue);
				return;
			case CorePackage.DA_CONNECTOR__HAZARD:
				getHazard().clear();
				getHazard().addAll((Collection<? extends DaHazard>)newValue);
				return;
			case CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)newValue);
				return;
			case CorePackage.DA_CONNECTOR__BASE_EXTEND:
				setBase_Extend((Extend)newValue);
				return;
			case CorePackage.DA_CONNECTOR__BASE_INCLUDE:
				setBase_Include((Include)newValue);
				return;
			case CorePackage.DA_CONNECTOR__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case CorePackage.DA_CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case CorePackage.DA_CONNECTOR__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
				return;
			case CorePackage.DA_CONNECTOR__BASE_ASSOCIATION:
				setBase_Association((Association)newValue);
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
			case CorePackage.DA_CONNECTOR__COUPLING:
				getCoupling().clear();
				return;
			case CorePackage.DA_CONNECTOR__ERROR_PROP:
				getErrorProp().clear();
				return;
			case CorePackage.DA_CONNECTOR__FAILURE:
				getFailure().clear();
				return;
			case CorePackage.DA_CONNECTOR__HAZARD:
				getHazard().clear();
				return;
			case CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)null);
				return;
			case CorePackage.DA_CONNECTOR__BASE_EXTEND:
				setBase_Extend((Extend)null);
				return;
			case CorePackage.DA_CONNECTOR__BASE_INCLUDE:
				setBase_Include((Include)null);
				return;
			case CorePackage.DA_CONNECTOR__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case CorePackage.DA_CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case CorePackage.DA_CONNECTOR__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
				return;
			case CorePackage.DA_CONNECTOR__BASE_ASSOCIATION:
				setBase_Association((Association)null);
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
			case CorePackage.DA_CONNECTOR__COUPLING:
				return coupling != null && !coupling.isEmpty();
			case CorePackage.DA_CONNECTOR__ERROR_PROP:
				return errorProp != null && !errorProp.isEmpty();
			case CorePackage.DA_CONNECTOR__FAILURE:
				return failure != null && !failure.isEmpty();
			case CorePackage.DA_CONNECTOR__HAZARD:
				return hazard != null && !hazard.isEmpty();
			case CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION:
				return base_InvocationAction != null;
			case CorePackage.DA_CONNECTOR__BASE_EXTEND:
				return base_Extend != null;
			case CorePackage.DA_CONNECTOR__BASE_INCLUDE:
				return base_Include != null;
			case CorePackage.DA_CONNECTOR__BASE_MESSAGE:
				return base_Message != null;
			case CorePackage.DA_CONNECTOR__BASE_CONNECTOR:
				return base_Connector != null;
			case CorePackage.DA_CONNECTOR__BASE_DEPENDENCY:
				return base_Dependency != null;
			case CorePackage.DA_CONNECTOR__BASE_ASSOCIATION:
				return base_Association != null;
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
		result.append(" (coupling: ");
		result.append(coupling);
		result.append(')');
		return result.toString();
	}

} //DaConnectorImpl
