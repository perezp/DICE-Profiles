/**
 */
package es.unizar.disco.dice.DTSM.Tez.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.DataMovementType;

import es.unizar.disco.dice.DTSM.Tez.TezEdge;
import es.unizar.disco.dice.DTSM.Tez.TezPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezEdgeImpl#getDataMovementType <em>Data Movement Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TezEdgeImpl extends GaStepImpl implements TezEdge {
	/**
	 * The default value of the '{@link #getDataMovementType() <em>Data Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMovementType()
	 * @generated
	 * @ordered
	 */
	protected static final DataMovementType DATA_MOVEMENT_TYPE_EDEFAULT = DataMovementType.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getDataMovementType() <em>Data Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMovementType()
	 * @generated
	 * @ordered
	 */
	protected DataMovementType dataMovementType = DATA_MOVEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TezEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TezPackage.Literals.TEZ_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMovementType getDataMovementType() {
		return dataMovementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataMovementType(DataMovementType newDataMovementType) {
		DataMovementType oldDataMovementType = dataMovementType;
		dataMovementType = newDataMovementType == null ? DATA_MOVEMENT_TYPE_EDEFAULT : newDataMovementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_EDGE__DATA_MOVEMENT_TYPE, oldDataMovementType, dataMovementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TezPackage.TEZ_EDGE__DATA_MOVEMENT_TYPE:
				return getDataMovementType();
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
			case TezPackage.TEZ_EDGE__DATA_MOVEMENT_TYPE:
				setDataMovementType((DataMovementType)newValue);
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
			case TezPackage.TEZ_EDGE__DATA_MOVEMENT_TYPE:
				setDataMovementType(DATA_MOVEMENT_TYPE_EDEFAULT);
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
			case TezPackage.TEZ_EDGE__DATA_MOVEMENT_TYPE:
				return dataMovementType != DATA_MOVEMENT_TYPE_EDEFAULT;
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
		result.append(" (dataMovementType: ");
		result.append(dataMovementType);
		result.append(')');
		return result.toString();
	}

} //TezEdgeImpl
