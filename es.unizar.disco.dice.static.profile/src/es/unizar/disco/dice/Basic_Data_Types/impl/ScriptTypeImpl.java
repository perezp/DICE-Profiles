/**
 */
package es.unizar.disco.dice.Basic_Data_Types.impl;

import es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage;
import es.unizar.disco.dice.Basic_Data_Types.ScriptType;

import es.unizar.disco.dice.Basic_Enumeration_Types.LifeCycleElementType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.impl.ScriptTypeImpl#getScriptId <em>Script Id</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.impl.ScriptTypeImpl#getScriptUri <em>Script Uri</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.impl.ScriptTypeImpl#getScriptKind <em>Script Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptTypeImpl extends MinimalEObjectImpl.Container implements ScriptType {
	/**
	 * The default value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptId()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptId()
	 * @generated
	 * @ordered
	 */
	protected String scriptId = SCRIPT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptUri() <em>Script Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptUri() <em>Script Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptUri()
	 * @generated
	 * @ordered
	 */
	protected String scriptUri = SCRIPT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptKind() <em>Script Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptKind()
	 * @generated
	 * @ordered
	 */
	protected static final LifeCycleElementType SCRIPT_KIND_EDEFAULT = LifeCycleElementType.START;

	/**
	 * The cached value of the '{@link #getScriptKind() <em>Script Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptKind()
	 * @generated
	 * @ordered
	 */
	protected LifeCycleElementType scriptKind = SCRIPT_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Basic_Data_TypesPackage.Literals.SCRIPT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptId() {
		return scriptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptId(String newScriptId) {
		String oldScriptId = scriptId;
		scriptId = newScriptId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_ID, oldScriptId, scriptId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptUri() {
		return scriptUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptUri(String newScriptUri) {
		String oldScriptUri = scriptUri;
		scriptUri = newScriptUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_URI, oldScriptUri, scriptUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleElementType getScriptKind() {
		return scriptKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptKind(LifeCycleElementType newScriptKind) {
		LifeCycleElementType oldScriptKind = scriptKind;
		scriptKind = newScriptKind == null ? SCRIPT_KIND_EDEFAULT : newScriptKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_KIND, oldScriptKind, scriptKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_ID:
				return getScriptId();
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_URI:
				return getScriptUri();
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_KIND:
				return getScriptKind();
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
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_ID:
				setScriptId((String)newValue);
				return;
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_URI:
				setScriptUri((String)newValue);
				return;
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_KIND:
				setScriptKind((LifeCycleElementType)newValue);
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
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_ID:
				setScriptId(SCRIPT_ID_EDEFAULT);
				return;
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_URI:
				setScriptUri(SCRIPT_URI_EDEFAULT);
				return;
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_KIND:
				setScriptKind(SCRIPT_KIND_EDEFAULT);
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
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_ID:
				return SCRIPT_ID_EDEFAULT == null ? scriptId != null : !SCRIPT_ID_EDEFAULT.equals(scriptId);
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_URI:
				return SCRIPT_URI_EDEFAULT == null ? scriptUri != null : !SCRIPT_URI_EDEFAULT.equals(scriptUri);
			case Basic_Data_TypesPackage.SCRIPT_TYPE__SCRIPT_KIND:
				return scriptKind != SCRIPT_KIND_EDEFAULT;
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
		result.append(" (scriptId: ");
		result.append(scriptId);
		result.append(", scriptUri: ");
		result.append(scriptUri);
		result.append(", scriptKind: ");
		result.append(scriptKind);
		result.append(')');
		return result.toString();
	}

} //ScriptTypeImpl
