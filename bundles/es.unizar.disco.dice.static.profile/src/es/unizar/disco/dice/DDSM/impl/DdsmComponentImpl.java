/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmComponent;
import es.unizar.disco.dice.DDSM.DdsmPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl#getProvidedPortsList <em>Provided Ports List</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl#getMonitoringRoles <em>Monitoring Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DdsmComponentImpl extends DdsmCloudElementImpl implements DdsmComponent {
	/**
	 * The cached value of the '{@link #getProvidedPortsList() <em>Provided Ports List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPortsList()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsmPort> providedPortsList;

	/**
	 * The default value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected boolean monitored = MONITORED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitoringRoles() <em>Monitoring Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> monitoringRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsmPort> getProvidedPortsList() {
		if (providedPortsList == null) {
			providedPortsList = new EObjectResolvingEList<DdsmPort>(DdsmPort.class, this, DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST);
		}
		return providedPortsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitored() {
		return monitored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitored(boolean newMonitored) {
		boolean oldMonitored = monitored;
		monitored = newMonitored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_COMPONENT__MONITORED, oldMonitored, monitored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMonitoringRoles() {
		if (monitoringRoles == null) {
			monitoringRoles = new EDataTypeUniqueEList<String>(String.class, this, DDSMPackage.DDSM_COMPONENT__MONITORING_ROLES);
		}
		return monitoringRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				return getProvidedPortsList();
			case DDSMPackage.DDSM_COMPONENT__MONITORED:
				return isMonitored();
			case DDSMPackage.DDSM_COMPONENT__MONITORING_ROLES:
				return getMonitoringRoles();
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
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				getProvidedPortsList().clear();
				getProvidedPortsList().addAll((Collection<? extends DdsmPort>)newValue);
				return;
			case DDSMPackage.DDSM_COMPONENT__MONITORED:
				setMonitored((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_COMPONENT__MONITORING_ROLES:
				getMonitoringRoles().clear();
				getMonitoringRoles().addAll((Collection<? extends String>)newValue);
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
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				getProvidedPortsList().clear();
				return;
			case DDSMPackage.DDSM_COMPONENT__MONITORED:
				setMonitored(MONITORED_EDEFAULT);
				return;
			case DDSMPackage.DDSM_COMPONENT__MONITORING_ROLES:
				getMonitoringRoles().clear();
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
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				return providedPortsList != null && !providedPortsList.isEmpty();
			case DDSMPackage.DDSM_COMPONENT__MONITORED:
				return monitored != MONITORED_EDEFAULT;
			case DDSMPackage.DDSM_COMPONENT__MONITORING_ROLES:
				return monitoringRoles != null && !monitoringRoles.isEmpty();
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
		result.append(" (monitored: ");
		result.append(monitored);
		result.append(", monitoringRoles: ");
		result.append(monitoringRoles);
		result.append(')');
		return result.toString();
	}

} //DdsmComponentImpl
