/**
 */
package es.unizar.disco.dice.Complex_Data_Types.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.VMSize;

import es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage;
import es.unizar.disco.dice.Complex_Data_Types.MongoDBShard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mongo DB Shard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.MongoDBShardImpl#getNInstances <em>NInstances</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.MongoDBShardImpl#getHostSize <em>Host Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MongoDBShardImpl extends MinimalEObjectImpl.Container implements MongoDBShard {
	/**
	 * The default value of the '{@link #getNInstances() <em>NInstances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int NINSTANCES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNInstances() <em>NInstances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNInstances()
	 * @generated
	 * @ordered
	 */
	protected int nInstances = NINSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostSize() <em>Host Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostSize()
	 * @generated
	 * @ordered
	 */
	protected static final VMSize HOST_SIZE_EDEFAULT = VMSize.SMALL;

	/**
	 * The cached value of the '{@link #getHostSize() <em>Host Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostSize()
	 * @generated
	 * @ordered
	 */
	protected VMSize hostSize = HOST_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MongoDBShardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.MONGO_DB_SHARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNInstances() {
		return nInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNInstances(int newNInstances) {
		int oldNInstances = nInstances;
		nInstances = newNInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.MONGO_DB_SHARD__NINSTANCES, oldNInstances, nInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMSize getHostSize() {
		return hostSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSize(VMSize newHostSize) {
		VMSize oldHostSize = hostSize;
		hostSize = newHostSize == null ? HOST_SIZE_EDEFAULT : newHostSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.MONGO_DB_SHARD__HOST_SIZE, oldHostSize, hostSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__NINSTANCES:
				return getNInstances();
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__HOST_SIZE:
				return getHostSize();
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
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__NINSTANCES:
				setNInstances((Integer)newValue);
				return;
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__HOST_SIZE:
				setHostSize((VMSize)newValue);
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
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__NINSTANCES:
				setNInstances(NINSTANCES_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__HOST_SIZE:
				setHostSize(HOST_SIZE_EDEFAULT);
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
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__NINSTANCES:
				return nInstances != NINSTANCES_EDEFAULT;
			case Complex_Data_TypesPackage.MONGO_DB_SHARD__HOST_SIZE:
				return hostSize != HOST_SIZE_EDEFAULT;
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
		result.append(" (nInstances: ");
		result.append(nInstances);
		result.append(", hostSize: ");
		result.append(hostSize);
		result.append(')');
		return result.toString();
	}

} //MongoDBShardImpl
