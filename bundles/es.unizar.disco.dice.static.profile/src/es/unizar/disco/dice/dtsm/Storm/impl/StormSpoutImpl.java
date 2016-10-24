/**
 */
package es.unizar.disco.dice.dtsm.Storm.impl;

import es.unizar.disco.dice.dtsm.Core.impl.CoreDAGSourceNodeImpl;

import es.unizar.disco.dice.dtsm.Storm.StormPackage;
import es.unizar.disco.dice.dtsm.Storm.StormSpout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSpoutImpl#getAvgEmitRate <em>Avg Emit Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormSpoutImpl extends CoreDAGSourceNodeImpl implements StormSpout {
	/**
	 * The default value of the '{@link #getAvgEmitRate() <em>Avg Emit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgEmitRate()
	 * @generated
	 * @ordered
	 */
	protected static final String AVG_EMIT_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvgEmitRate() <em>Avg Emit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgEmitRate()
	 * @generated
	 * @ordered
	 */
	protected String avgEmitRate = AVG_EMIT_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormSpoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.STORM_SPOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvgEmitRate() {
		return avgEmitRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgEmitRate(String newAvgEmitRate) {
		String oldAvgEmitRate = avgEmitRate;
		avgEmitRate = newAvgEmitRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SPOUT__AVG_EMIT_RATE, oldAvgEmitRate, avgEmitRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StormPackage.STORM_SPOUT__AVG_EMIT_RATE:
				return getAvgEmitRate();
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
			case StormPackage.STORM_SPOUT__AVG_EMIT_RATE:
				setAvgEmitRate((String)newValue);
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
			case StormPackage.STORM_SPOUT__AVG_EMIT_RATE:
				setAvgEmitRate(AVG_EMIT_RATE_EDEFAULT);
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
			case StormPackage.STORM_SPOUT__AVG_EMIT_RATE:
				return AVG_EMIT_RATE_EDEFAULT == null ? avgEmitRate != null : !AVG_EMIT_RATE_EDEFAULT.equals(avgEmitRate);
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
		result.append(" (avgEmitRate: ");
		result.append(avgEmitRate);
		result.append(')');
		return result.toString();
	}

} //StormSpoutImpl
