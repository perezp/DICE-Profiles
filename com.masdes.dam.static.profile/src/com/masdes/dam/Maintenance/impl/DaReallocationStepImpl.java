/**
 */
package com.masdes.dam.Maintenance.impl;

import com.masdes.dam.Basic_Enumeration_Types.StepKind;

import com.masdes.dam.Core.DaComponent;

import com.masdes.dam.Core.impl.DaStepImpl;

import com.masdes.dam.Maintenance.DaReallocationStep;
import com.masdes.dam.Maintenance.MaintenancePackage;

import com.masdes.dam.Maintenance.util.MaintenanceValidator;

import com.masdes.dam.Redundancy.DaSpare;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Reallocation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaReallocationStepImpl#getKindRealS <em>Kind Real S</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaReallocationStepImpl#getMap <em>Map</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaReallocationStepImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaReallocationStepImpl extends DaStepImpl implements DaReallocationStep {
	/**
	 * The default value of the '{@link #getKindRealS() <em>Kind Real S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindRealS()
	 * @generated
	 * @ordered
	 */
	protected static final StepKind KIND_REAL_S_EDEFAULT = StepKind.REALLOCATION;

	/**
	 * The cached value of the '{@link #getKindRealS() <em>Kind Real S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindRealS()
	 * @generated
	 * @ordered
	 */
	protected StepKind kindRealS = KIND_REAL_S_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected EList<DaComponent> map;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<DaSpare> to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaReallocationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.DA_REALLOCATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind getKindRealS() {
		return kindRealS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindRealS(StepKind newKindRealS) {
		StepKind oldKindRealS = kindRealS;
		kindRealS = newKindRealS == null ? KIND_REAL_S_EDEFAULT : newKindRealS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.DA_REALLOCATION_STEP__KIND_REAL_S, oldKindRealS, kindRealS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaComponent> getMap() {
		if (map == null) {
			map = new EObjectResolvingEList<DaComponent>(DaComponent.class, this, MaintenancePackage.DA_REALLOCATION_STEP__MAP);
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaSpare> getTo() {
		if (to == null) {
			to = new EObjectResolvingEList<DaSpare>(DaSpare.class, this, MaintenancePackage.DA_REALLOCATION_STEP__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mapSize(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MaintenanceValidator.DIAGNOSTIC_SOURCE,
						 MaintenanceValidator.DA_REALLOCATION_STEP__MAP_SIZE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "mapSize", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.DA_REALLOCATION_STEP__KIND_REAL_S:
				return getKindRealS();
			case MaintenancePackage.DA_REALLOCATION_STEP__MAP:
				return getMap();
			case MaintenancePackage.DA_REALLOCATION_STEP__TO:
				return getTo();
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
			case MaintenancePackage.DA_REALLOCATION_STEP__KIND_REAL_S:
				setKindRealS((StepKind)newValue);
				return;
			case MaintenancePackage.DA_REALLOCATION_STEP__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends DaComponent>)newValue);
				return;
			case MaintenancePackage.DA_REALLOCATION_STEP__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends DaSpare>)newValue);
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
			case MaintenancePackage.DA_REALLOCATION_STEP__KIND_REAL_S:
				setKindRealS(KIND_REAL_S_EDEFAULT);
				return;
			case MaintenancePackage.DA_REALLOCATION_STEP__MAP:
				getMap().clear();
				return;
			case MaintenancePackage.DA_REALLOCATION_STEP__TO:
				getTo().clear();
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
			case MaintenancePackage.DA_REALLOCATION_STEP__KIND_REAL_S:
				return kindRealS != KIND_REAL_S_EDEFAULT;
			case MaintenancePackage.DA_REALLOCATION_STEP__MAP:
				return map != null && !map.isEmpty();
			case MaintenancePackage.DA_REALLOCATION_STEP__TO:
				return to != null && !to.isEmpty();
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
		result.append(" (kindRealS: ");
		result.append(kindRealS);
		result.append(')');
		return result.toString();
	}

} //DaReallocationStepImpl
