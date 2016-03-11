/**
 */
package es.unizar.disco.dice.DPIM.impl;

import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;

import es.unizar.disco.dice.DPIM.DPIMPackage;
import es.unizar.disco.dice.DPIM.StoragateNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.StorageResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storagate Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.StoragateNodeImpl#getElementSize <em>Element Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.StoragateNodeImpl#getRespondsTo <em>Responds To</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.StoragateNodeImpl#getCrudRate <em>Crud Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoragateNodeImpl extends ComputationNodeImpl implements StoragateNode {
	/**
	 * The default value of the '{@link #getElementSize() <em>Element Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSize()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementSize() <em>Element Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSize()
	 * @generated
	 * @ordered
	 */
	protected String elementSize = ELEMENT_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRespondsTo() <em>Responds To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondsTo()
	 * @generated
	 * @ordered
	 */
	protected DiceDataSpecification respondsTo;

	/**
	 * The default value of the '{@link #getCrudRate() <em>Crud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudRate()
	 * @generated
	 * @ordered
	 */
	protected static final String CRUD_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrudRate() <em>Crud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudRate()
	 * @generated
	 * @ordered
	 */
	protected String crudRate = CRUD_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragateNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPIMPackage.Literals.STORAGATE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementSize() {
		return elementSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSize(String newElementSize) {
		String oldElementSize = elementSize;
		elementSize = newElementSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.STORAGATE_NODE__ELEMENT_SIZE, oldElementSize, elementSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataSpecification getRespondsTo() {
		return respondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespondsTo(DiceDataSpecification newRespondsTo, NotificationChain msgs) {
		DiceDataSpecification oldRespondsTo = respondsTo;
		respondsTo = newRespondsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DPIMPackage.STORAGATE_NODE__RESPONDS_TO, oldRespondsTo, newRespondsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondsTo(DiceDataSpecification newRespondsTo) {
		if (newRespondsTo != respondsTo) {
			NotificationChain msgs = null;
			if (respondsTo != null)
				msgs = ((InternalEObject)respondsTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.STORAGATE_NODE__RESPONDS_TO, null, msgs);
			if (newRespondsTo != null)
				msgs = ((InternalEObject)newRespondsTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.STORAGATE_NODE__RESPONDS_TO, null, msgs);
			msgs = basicSetRespondsTo(newRespondsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.STORAGATE_NODE__RESPONDS_TO, newRespondsTo, newRespondsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrudRate() {
		return crudRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrudRate(String newCrudRate) {
		String oldCrudRate = crudRate;
		crudRate = newCrudRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.STORAGATE_NODE__CRUD_RATE, oldCrudRate, crudRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DPIMPackage.STORAGATE_NODE__RESPONDS_TO:
				return basicSetRespondsTo(null, msgs);
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
			case DPIMPackage.STORAGATE_NODE__ELEMENT_SIZE:
				return getElementSize();
			case DPIMPackage.STORAGATE_NODE__RESPONDS_TO:
				return getRespondsTo();
			case DPIMPackage.STORAGATE_NODE__CRUD_RATE:
				return getCrudRate();
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
			case DPIMPackage.STORAGATE_NODE__ELEMENT_SIZE:
				setElementSize((String)newValue);
				return;
			case DPIMPackage.STORAGATE_NODE__RESPONDS_TO:
				setRespondsTo((DiceDataSpecification)newValue);
				return;
			case DPIMPackage.STORAGATE_NODE__CRUD_RATE:
				setCrudRate((String)newValue);
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
			case DPIMPackage.STORAGATE_NODE__ELEMENT_SIZE:
				setElementSize(ELEMENT_SIZE_EDEFAULT);
				return;
			case DPIMPackage.STORAGATE_NODE__RESPONDS_TO:
				setRespondsTo((DiceDataSpecification)null);
				return;
			case DPIMPackage.STORAGATE_NODE__CRUD_RATE:
				setCrudRate(CRUD_RATE_EDEFAULT);
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
			case DPIMPackage.STORAGATE_NODE__ELEMENT_SIZE:
				return ELEMENT_SIZE_EDEFAULT == null ? elementSize != null : !ELEMENT_SIZE_EDEFAULT.equals(elementSize);
			case DPIMPackage.STORAGATE_NODE__RESPONDS_TO:
				return respondsTo != null;
			case DPIMPackage.STORAGATE_NODE__CRUD_RATE:
				return CRUD_RATE_EDEFAULT == null ? crudRate != null : !CRUD_RATE_EDEFAULT.equals(crudRate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StorageResource.class) {
			switch (derivedFeatureID) {
				case DPIMPackage.STORAGATE_NODE__ELEMENT_SIZE: return GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StorageResource.class) {
			switch (baseFeatureID) {
				case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE: return DPIMPackage.STORAGATE_NODE__ELEMENT_SIZE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (elementSize: ");
		result.append(elementSize);
		result.append(", crudRate: ");
		result.append(crudRate);
		result.append(')');
		return result.toString();
	}

} //StoragateNodeImpl
