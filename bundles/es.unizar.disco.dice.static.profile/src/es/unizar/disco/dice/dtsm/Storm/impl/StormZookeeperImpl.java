/**
 */
package es.unizar.disco.dice.DTSM.Storm.impl;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;
import es.unizar.disco.dice.DTSM.Storm.StormZookeeper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zookeeper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl#getRetryTime <em>Retry Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl#getUser <em>User</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormZookeeperImpl extends MinimalEObjectImpl.Container implements StormZookeeper {
	/**
	 * The default value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int SESSION_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected int sessionTimeout = SESSION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTION_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected int connectionTimeout = CONNECTION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryTime() <em>Retry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTime()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryTime() <em>Retry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTime()
	 * @generated
	 * @ordered
	 */
	protected int retryTime = RETRY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected int retryInterval = RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormZookeeperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.STORM_ZOOKEEPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSessionTimeout() {
		return sessionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionTimeout(int newSessionTimeout) {
		int oldSessionTimeout = sessionTimeout;
		sessionTimeout = newSessionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_ZOOKEEPER__SESSION_TIMEOUT, oldSessionTimeout, sessionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionTimeout(int newConnectionTimeout) {
		int oldConnectionTimeout = connectionTimeout;
		connectionTimeout = newConnectionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_ZOOKEEPER__CONNECTION_TIMEOUT, oldConnectionTimeout, connectionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryTime() {
		return retryTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryTime(int newRetryTime) {
		int oldRetryTime = retryTime;
		retryTime = newRetryTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_ZOOKEEPER__RETRY_TIME, oldRetryTime, retryTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryInterval() {
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryInterval(int newRetryInterval) {
		int oldRetryInterval = retryInterval;
		retryInterval = newRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_ZOOKEEPER__RETRY_INTERVAL, oldRetryInterval, retryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_ZOOKEEPER__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_ZOOKEEPER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StormPackage.STORM_ZOOKEEPER__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_ZOOKEEPER__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StormPackage.STORM_ZOOKEEPER__SESSION_TIMEOUT:
				return getSessionTimeout();
			case StormPackage.STORM_ZOOKEEPER__CONNECTION_TIMEOUT:
				return getConnectionTimeout();
			case StormPackage.STORM_ZOOKEEPER__RETRY_TIME:
				return getRetryTime();
			case StormPackage.STORM_ZOOKEEPER__RETRY_INTERVAL:
				return getRetryInterval();
			case StormPackage.STORM_ZOOKEEPER__USER:
				return getUser();
			case StormPackage.STORM_ZOOKEEPER__PASSWORD:
				return getPassword();
			case StormPackage.STORM_ZOOKEEPER__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
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
			case StormPackage.STORM_ZOOKEEPER__SESSION_TIMEOUT:
				setSessionTimeout((Integer)newValue);
				return;
			case StormPackage.STORM_ZOOKEEPER__CONNECTION_TIMEOUT:
				setConnectionTimeout((Integer)newValue);
				return;
			case StormPackage.STORM_ZOOKEEPER__RETRY_TIME:
				setRetryTime((Integer)newValue);
				return;
			case StormPackage.STORM_ZOOKEEPER__RETRY_INTERVAL:
				setRetryInterval((Integer)newValue);
				return;
			case StormPackage.STORM_ZOOKEEPER__USER:
				setUser((String)newValue);
				return;
			case StormPackage.STORM_ZOOKEEPER__PASSWORD:
				setPassword((String)newValue);
				return;
			case StormPackage.STORM_ZOOKEEPER__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
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
			case StormPackage.STORM_ZOOKEEPER__SESSION_TIMEOUT:
				setSessionTimeout(SESSION_TIMEOUT_EDEFAULT);
				return;
			case StormPackage.STORM_ZOOKEEPER__CONNECTION_TIMEOUT:
				setConnectionTimeout(CONNECTION_TIMEOUT_EDEFAULT);
				return;
			case StormPackage.STORM_ZOOKEEPER__RETRY_TIME:
				setRetryTime(RETRY_TIME_EDEFAULT);
				return;
			case StormPackage.STORM_ZOOKEEPER__RETRY_INTERVAL:
				setRetryInterval(RETRY_INTERVAL_EDEFAULT);
				return;
			case StormPackage.STORM_ZOOKEEPER__USER:
				setUser(USER_EDEFAULT);
				return;
			case StormPackage.STORM_ZOOKEEPER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case StormPackage.STORM_ZOOKEEPER__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
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
			case StormPackage.STORM_ZOOKEEPER__SESSION_TIMEOUT:
				return sessionTimeout != SESSION_TIMEOUT_EDEFAULT;
			case StormPackage.STORM_ZOOKEEPER__CONNECTION_TIMEOUT:
				return connectionTimeout != CONNECTION_TIMEOUT_EDEFAULT;
			case StormPackage.STORM_ZOOKEEPER__RETRY_TIME:
				return retryTime != RETRY_TIME_EDEFAULT;
			case StormPackage.STORM_ZOOKEEPER__RETRY_INTERVAL:
				return retryInterval != RETRY_INTERVAL_EDEFAULT;
			case StormPackage.STORM_ZOOKEEPER__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case StormPackage.STORM_ZOOKEEPER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case StormPackage.STORM_ZOOKEEPER__BASE_CLASSIFIER:
				return base_Classifier != null;
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
		result.append(" (sessionTimeout: ");
		result.append(sessionTimeout);
		result.append(", connectionTimeout: ");
		result.append(connectionTimeout);
		result.append(", retryTime: ");
		result.append(retryTime);
		result.append(", retryInterval: ");
		result.append(retryInterval);
		result.append(", user: ");
		result.append(user);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //StormZookeeperImpl
