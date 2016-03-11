/**
 */
package es.unizar.disco.dice.DPIM.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.SourceType;

import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;
import es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume;

import es.unizar.disco.dice.DPIM.DPIMPackage;
import es.unizar.disco.dice.DPIM.DiceSourceNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Source Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl#getStore <em>Store</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceSourceNodeImpl extends DiceComponentImpl implements DiceSourceNode {
	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected DiceDataVolume store;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected DiceDataSpecification provides;

	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final SourceType SOURCE_TYPE_EDEFAULT = SourceType.SHARED_STORAGE;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected SourceType sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected String rate = RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceSourceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPIMPackage.Literals.DICE_SOURCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataVolume getStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStore(DiceDataVolume newStore, NotificationChain msgs) {
		DiceDataVolume oldStore = store;
		store = newStore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_SOURCE_NODE__STORE, oldStore, newStore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(DiceDataVolume newStore) {
		if (newStore != store) {
			NotificationChain msgs = null;
			if (store != null)
				msgs = ((InternalEObject)store).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.DICE_SOURCE_NODE__STORE, null, msgs);
			if (newStore != null)
				msgs = ((InternalEObject)newStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.DICE_SOURCE_NODE__STORE, null, msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_SOURCE_NODE__STORE, newStore, newStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataSpecification getProvides() {
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvides(DiceDataSpecification newProvides, NotificationChain msgs) {
		DiceDataSpecification oldProvides = provides;
		provides = newProvides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_SOURCE_NODE__PROVIDES, oldProvides, newProvides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvides(DiceDataSpecification newProvides) {
		if (newProvides != provides) {
			NotificationChain msgs = null;
			if (provides != null)
				msgs = ((InternalEObject)provides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.DICE_SOURCE_NODE__PROVIDES, null, msgs);
			if (newProvides != null)
				msgs = ((InternalEObject)newProvides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.DICE_SOURCE_NODE__PROVIDES, null, msgs);
			msgs = basicSetProvides(newProvides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_SOURCE_NODE__PROVIDES, newProvides, newProvides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(SourceType newSourceType) {
		SourceType oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_SOURCE_NODE__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(String newRate) {
		String oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DICE_SOURCE_NODE__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DPIMPackage.DICE_SOURCE_NODE__STORE:
				return basicSetStore(null, msgs);
			case DPIMPackage.DICE_SOURCE_NODE__PROVIDES:
				return basicSetProvides(null, msgs);
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
			case DPIMPackage.DICE_SOURCE_NODE__STORE:
				return getStore();
			case DPIMPackage.DICE_SOURCE_NODE__PROVIDES:
				return getProvides();
			case DPIMPackage.DICE_SOURCE_NODE__SOURCE_TYPE:
				return getSourceType();
			case DPIMPackage.DICE_SOURCE_NODE__RATE:
				return getRate();
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
			case DPIMPackage.DICE_SOURCE_NODE__STORE:
				setStore((DiceDataVolume)newValue);
				return;
			case DPIMPackage.DICE_SOURCE_NODE__PROVIDES:
				setProvides((DiceDataSpecification)newValue);
				return;
			case DPIMPackage.DICE_SOURCE_NODE__SOURCE_TYPE:
				setSourceType((SourceType)newValue);
				return;
			case DPIMPackage.DICE_SOURCE_NODE__RATE:
				setRate((String)newValue);
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
			case DPIMPackage.DICE_SOURCE_NODE__STORE:
				setStore((DiceDataVolume)null);
				return;
			case DPIMPackage.DICE_SOURCE_NODE__PROVIDES:
				setProvides((DiceDataSpecification)null);
				return;
			case DPIMPackage.DICE_SOURCE_NODE__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case DPIMPackage.DICE_SOURCE_NODE__RATE:
				setRate(RATE_EDEFAULT);
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
			case DPIMPackage.DICE_SOURCE_NODE__STORE:
				return store != null;
			case DPIMPackage.DICE_SOURCE_NODE__PROVIDES:
				return provides != null;
			case DPIMPackage.DICE_SOURCE_NODE__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case DPIMPackage.DICE_SOURCE_NODE__RATE:
				return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
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
		result.append(" (sourceType: ");
		result.append(sourceType);
		result.append(", rate: ");
		result.append(rate);
		result.append(')');
		return result.toString();
	}

} //DiceSourceNodeImpl
