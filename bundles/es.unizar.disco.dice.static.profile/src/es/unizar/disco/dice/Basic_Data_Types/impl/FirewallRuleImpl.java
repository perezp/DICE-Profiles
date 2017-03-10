/**
 */
package es.unizar.disco.dice.Basic_Data_Types.impl;

import es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage;
import es.unizar.disco.dice.Basic_Data_Types.FirewallRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firewall Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.impl.FirewallRuleImpl#getAllowedIpPrefix <em>Allowed Ip Prefix</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.impl.FirewallRuleImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirewallRuleImpl extends MinimalEObjectImpl.Container implements FirewallRule {
	/**
	 * The default value of the '{@link #getAllowedIpPrefix() <em>Allowed Ip Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedIpPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_IP_PREFIX_EDEFAULT = "0.0.0.0/0";

	/**
	 * The cached value of the '{@link #getAllowedIpPrefix() <em>Allowed Ip Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedIpPrefix()
	 * @generated
	 * @ordered
	 */
	protected String allowedIpPrefix = ALLOWED_IP_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirewallRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Basic_Data_TypesPackage.Literals.FIREWALL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedIpPrefix() {
		return allowedIpPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedIpPrefix(String newAllowedIpPrefix) {
		String oldAllowedIpPrefix = allowedIpPrefix;
		allowedIpPrefix = newAllowedIpPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Basic_Data_TypesPackage.FIREWALL_RULE__ALLOWED_IP_PREFIX, oldAllowedIpPrefix, allowedIpPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Basic_Data_TypesPackage.FIREWALL_RULE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Basic_Data_TypesPackage.FIREWALL_RULE__ALLOWED_IP_PREFIX:
				return getAllowedIpPrefix();
			case Basic_Data_TypesPackage.FIREWALL_RULE__PORT:
				return getPort();
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
			case Basic_Data_TypesPackage.FIREWALL_RULE__ALLOWED_IP_PREFIX:
				setAllowedIpPrefix((String)newValue);
				return;
			case Basic_Data_TypesPackage.FIREWALL_RULE__PORT:
				setPort((Integer)newValue);
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
			case Basic_Data_TypesPackage.FIREWALL_RULE__ALLOWED_IP_PREFIX:
				setAllowedIpPrefix(ALLOWED_IP_PREFIX_EDEFAULT);
				return;
			case Basic_Data_TypesPackage.FIREWALL_RULE__PORT:
				setPort(PORT_EDEFAULT);
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
			case Basic_Data_TypesPackage.FIREWALL_RULE__ALLOWED_IP_PREFIX:
				return ALLOWED_IP_PREFIX_EDEFAULT == null ? allowedIpPrefix != null : !ALLOWED_IP_PREFIX_EDEFAULT.equals(allowedIpPrefix);
			case Basic_Data_TypesPackage.FIREWALL_RULE__PORT:
				return port != PORT_EDEFAULT;
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
		result.append(" (allowedIpPrefix: ");
		result.append(allowedIpPrefix);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //FirewallRuleImpl
