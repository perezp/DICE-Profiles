/**
 */
package es.unizar.disco.dice.DPIM.impl;

import com.masdes.dam.Core.impl.DaConnectorImpl;

import es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification;

import es.unizar.disco.dice.DPIM.Channel;
import es.unizar.disco.dice.DPIM.DPIMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.ChannelImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.ChannelImpl#getMessageBroker <em>Message Broker</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.ChannelImpl#getChannelDescription <em>Channel Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends DaConnectorImpl implements Channel {
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
	 * The default value of the '{@link #getMessageBroker() <em>Message Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBroker()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_BROKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageBroker() <em>Message Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBroker()
	 * @generated
	 * @ordered
	 */
	protected String messageBroker = MESSAGE_BROKER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannelDescription() <em>Channel Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelDescription()
	 * @generated
	 * @ordered
	 */
	protected DiceChannelSpecification channelDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPIMPackage.Literals.CHANNEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.CHANNEL__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageBroker() {
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageBroker(String newMessageBroker) {
		String oldMessageBroker = messageBroker;
		messageBroker = newMessageBroker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.CHANNEL__MESSAGE_BROKER, oldMessageBroker, messageBroker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceChannelSpecification getChannelDescription() {
		return channelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelDescription(DiceChannelSpecification newChannelDescription, NotificationChain msgs) {
		DiceChannelSpecification oldChannelDescription = channelDescription;
		channelDescription = newChannelDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION, oldChannelDescription, newChannelDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelDescription(DiceChannelSpecification newChannelDescription) {
		if (newChannelDescription != channelDescription) {
			NotificationChain msgs = null;
			if (channelDescription != null)
				msgs = ((InternalEObject)channelDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION, null, msgs);
			if (newChannelDescription != null)
				msgs = ((InternalEObject)newChannelDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION, null, msgs);
			msgs = basicSetChannelDescription(newChannelDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION, newChannelDescription, newChannelDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION:
				return basicSetChannelDescription(null, msgs);
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
			case DPIMPackage.CHANNEL__RATE:
				return getRate();
			case DPIMPackage.CHANNEL__MESSAGE_BROKER:
				return getMessageBroker();
			case DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION:
				return getChannelDescription();
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
			case DPIMPackage.CHANNEL__RATE:
				setRate((String)newValue);
				return;
			case DPIMPackage.CHANNEL__MESSAGE_BROKER:
				setMessageBroker((String)newValue);
				return;
			case DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION:
				setChannelDescription((DiceChannelSpecification)newValue);
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
			case DPIMPackage.CHANNEL__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case DPIMPackage.CHANNEL__MESSAGE_BROKER:
				setMessageBroker(MESSAGE_BROKER_EDEFAULT);
				return;
			case DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION:
				setChannelDescription((DiceChannelSpecification)null);
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
			case DPIMPackage.CHANNEL__RATE:
				return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
			case DPIMPackage.CHANNEL__MESSAGE_BROKER:
				return MESSAGE_BROKER_EDEFAULT == null ? messageBroker != null : !MESSAGE_BROKER_EDEFAULT.equals(messageBroker);
			case DPIMPackage.CHANNEL__CHANNEL_DESCRIPTION:
				return channelDescription != null;
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
		result.append(" (rate: ");
		result.append(rate);
		result.append(", messageBroker: ");
		result.append(messageBroker);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
