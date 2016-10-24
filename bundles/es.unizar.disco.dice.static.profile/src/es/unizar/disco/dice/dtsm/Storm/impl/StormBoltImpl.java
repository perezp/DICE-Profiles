/**
 */
package es.unizar.disco.dice.dtsm.Storm.impl;

import com.masdes.dam.Complex_Data_Types.DaFailure;

import es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl;

import es.unizar.disco.dice.dtsm.Storm.StormBolt;
import es.unizar.disco.dice.dtsm.Storm.StormPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bolt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormBoltImpl#getD <em>D</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormBoltImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormBoltImpl#getSigma <em>Sigma</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormBoltImpl#getMinRebootTime <em>Min Reboot Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormBoltImpl#getMaxRebootTime <em>Max Reboot Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormBoltImpl#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormBoltImpl extends CoreDAGNodeImpl implements StormBolt {
	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected String alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma()
	 * @generated
	 * @ordered
	 */
	protected String sigma = SIGMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRebootTime() <em>Min Reboot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRebootTime()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_REBOOT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRebootTime() <em>Min Reboot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRebootTime()
	 * @generated
	 * @ordered
	 */
	protected String minRebootTime = MIN_REBOOT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRebootTime() <em>Max Reboot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRebootTime()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_REBOOT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRebootTime() <em>Max Reboot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRebootTime()
	 * @generated
	 * @ordered
	 */
	protected String maxRebootTime = MAX_REBOOT_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormBoltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.STORM_BOLT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_BOLT__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(String newAlpha) {
		String oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_BOLT__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSigma() {
		return sigma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigma(String newSigma) {
		String oldSigma = sigma;
		sigma = newSigma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_BOLT__SIGMA, oldSigma, sigma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinRebootTime() {
		return minRebootTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRebootTime(String newMinRebootTime) {
		String oldMinRebootTime = minRebootTime;
		minRebootTime = newMinRebootTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_BOLT__MIN_REBOOT_TIME, oldMinRebootTime, minRebootTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxRebootTime() {
		return maxRebootTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRebootTime(String newMaxRebootTime) {
		String oldMaxRebootTime = maxRebootTime;
		maxRebootTime = newMaxRebootTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_BOLT__MAX_REBOOT_TIME, oldMaxRebootTime, maxRebootTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DaFailure> getFailure() {
		if (failure == null) {
			failure = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, StormPackage.STORM_BOLT__FAILURE);
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFailure() {
		return failure != null && !failure.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StormPackage.STORM_BOLT__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
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
			case StormPackage.STORM_BOLT__D:
				return getD();
			case StormPackage.STORM_BOLT__ALPHA:
				return getAlpha();
			case StormPackage.STORM_BOLT__SIGMA:
				return getSigma();
			case StormPackage.STORM_BOLT__MIN_REBOOT_TIME:
				return getMinRebootTime();
			case StormPackage.STORM_BOLT__MAX_REBOOT_TIME:
				return getMaxRebootTime();
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
			case StormPackage.STORM_BOLT__D:
				setD((String)newValue);
				return;
			case StormPackage.STORM_BOLT__ALPHA:
				setAlpha((String)newValue);
				return;
			case StormPackage.STORM_BOLT__SIGMA:
				setSigma((String)newValue);
				return;
			case StormPackage.STORM_BOLT__MIN_REBOOT_TIME:
				setMinRebootTime((String)newValue);
				return;
			case StormPackage.STORM_BOLT__MAX_REBOOT_TIME:
				setMaxRebootTime((String)newValue);
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
			case StormPackage.STORM_BOLT__D:
				setD(D_EDEFAULT);
				return;
			case StormPackage.STORM_BOLT__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case StormPackage.STORM_BOLT__SIGMA:
				setSigma(SIGMA_EDEFAULT);
				return;
			case StormPackage.STORM_BOLT__MIN_REBOOT_TIME:
				setMinRebootTime(MIN_REBOOT_TIME_EDEFAULT);
				return;
			case StormPackage.STORM_BOLT__MAX_REBOOT_TIME:
				setMaxRebootTime(MAX_REBOOT_TIME_EDEFAULT);
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
			case StormPackage.STORM_BOLT__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case StormPackage.STORM_BOLT__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case StormPackage.STORM_BOLT__SIGMA:
				return SIGMA_EDEFAULT == null ? sigma != null : !SIGMA_EDEFAULT.equals(sigma);
			case StormPackage.STORM_BOLT__MIN_REBOOT_TIME:
				return MIN_REBOOT_TIME_EDEFAULT == null ? minRebootTime != null : !MIN_REBOOT_TIME_EDEFAULT.equals(minRebootTime);
			case StormPackage.STORM_BOLT__MAX_REBOOT_TIME:
				return MAX_REBOOT_TIME_EDEFAULT == null ? maxRebootTime != null : !MAX_REBOOT_TIME_EDEFAULT.equals(maxRebootTime);
			case StormPackage.STORM_BOLT__FAILURE:
				return isSetFailure();
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
		result.append(" (d: ");
		result.append(d);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", sigma: ");
		result.append(sigma);
		result.append(", minRebootTime: ");
		result.append(minRebootTime);
		result.append(", maxRebootTime: ");
		result.append(maxRebootTime);
		result.append(')');
		return result.toString();
	}

} //StormBoltImpl
