/**
 */
package es.unizar.disco.dice.dtsm.Core.impl;

import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;
import es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume;

import es.unizar.disco.dice.dtsm.Core.CoreData;
import es.unizar.disco.dice.dtsm.Core.CoreDataSource;
import es.unizar.disco.dice.dtsm.Core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDataImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDataImpl#getHasSpecification <em>Has Specification</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDataImpl#getHasVolume <em>Has Volume</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDataImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreDataImpl extends MinimalEObjectImpl.Container implements CoreData {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreDataSource> location;

	/**
	 * The cached value of the '{@link #getHasSpecification() <em>Has Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSpecification()
	 * @generated
	 * @ordered
	 */
	protected DiceDataSpecification hasSpecification;

	/**
	 * The cached value of the '{@link #getHasVolume() <em>Has Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasVolume()
	 * @generated
	 * @ordered
	 */
	protected DiceDataVolume hasVolume;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreDataSource> getLocation() {
		if (location == null) {
			location = new EObjectResolvingEList<CoreDataSource>(CoreDataSource.class, this, CorePackage.CORE_DATA__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataSpecification getHasSpecification() {
		return hasSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSpecification(DiceDataSpecification newHasSpecification, NotificationChain msgs) {
		DiceDataSpecification oldHasSpecification = hasSpecification;
		hasSpecification = newHasSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DATA__HAS_SPECIFICATION, oldHasSpecification, newHasSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSpecification(DiceDataSpecification newHasSpecification) {
		if (newHasSpecification != hasSpecification) {
			NotificationChain msgs = null;
			if (hasSpecification != null)
				msgs = ((InternalEObject)hasSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DATA__HAS_SPECIFICATION, null, msgs);
			if (newHasSpecification != null)
				msgs = ((InternalEObject)newHasSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DATA__HAS_SPECIFICATION, null, msgs);
			msgs = basicSetHasSpecification(newHasSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DATA__HAS_SPECIFICATION, newHasSpecification, newHasSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataVolume getHasVolume() {
		return hasVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasVolume(DiceDataVolume newHasVolume, NotificationChain msgs) {
		DiceDataVolume oldHasVolume = hasVolume;
		hasVolume = newHasVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DATA__HAS_VOLUME, oldHasVolume, newHasVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasVolume(DiceDataVolume newHasVolume) {
		if (newHasVolume != hasVolume) {
			NotificationChain msgs = null;
			if (hasVolume != null)
				msgs = ((InternalEObject)hasVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DATA__HAS_VOLUME, null, msgs);
			if (newHasVolume != null)
				msgs = ((InternalEObject)newHasVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DATA__HAS_VOLUME, null, msgs);
			msgs = basicSetHasVolume(newHasVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DATA__HAS_VOLUME, newHasVolume, newHasVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_DATA__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DATA__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CORE_DATA__HAS_SPECIFICATION:
				return basicSetHasSpecification(null, msgs);
			case CorePackage.CORE_DATA__HAS_VOLUME:
				return basicSetHasVolume(null, msgs);
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
			case CorePackage.CORE_DATA__LOCATION:
				return getLocation();
			case CorePackage.CORE_DATA__HAS_SPECIFICATION:
				return getHasSpecification();
			case CorePackage.CORE_DATA__HAS_VOLUME:
				return getHasVolume();
			case CorePackage.CORE_DATA__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case CorePackage.CORE_DATA__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends CoreDataSource>)newValue);
				return;
			case CorePackage.CORE_DATA__HAS_SPECIFICATION:
				setHasSpecification((DiceDataSpecification)newValue);
				return;
			case CorePackage.CORE_DATA__HAS_VOLUME:
				setHasVolume((DiceDataVolume)newValue);
				return;
			case CorePackage.CORE_DATA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
			case CorePackage.CORE_DATA__LOCATION:
				getLocation().clear();
				return;
			case CorePackage.CORE_DATA__HAS_SPECIFICATION:
				setHasSpecification((DiceDataSpecification)null);
				return;
			case CorePackage.CORE_DATA__HAS_VOLUME:
				setHasVolume((DiceDataVolume)null);
				return;
			case CorePackage.CORE_DATA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
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
			case CorePackage.CORE_DATA__LOCATION:
				return location != null && !location.isEmpty();
			case CorePackage.CORE_DATA__HAS_SPECIFICATION:
				return hasSpecification != null;
			case CorePackage.CORE_DATA__HAS_VOLUME:
				return hasVolume != null;
			case CorePackage.CORE_DATA__BASE_CLASS:
				return base_Class != null;
		}
		return super.eIsSet(featureID);
	}

} //CoreDataImpl
