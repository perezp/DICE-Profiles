/**
 */
package com.masdes.dam.Maintenance.impl;

import com.masdes.dam.Basic_Enumeration_Types.StepKind;

import com.masdes.dam.Core.DaComponent;

import com.masdes.dam.Core.impl.DaStepImpl;

import com.masdes.dam.Maintenance.DaReplacementStep;
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
 * An implementation of the model object '<em><b>Da Replacement Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaReplacementStepImpl#getKindRepS <em>Kind Rep S</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaReplacementStepImpl#getReplace <em>Replace</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaReplacementStepImpl#getWith <em>With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaReplacementStepImpl extends DaStepImpl implements DaReplacementStep {
	/**
	 * The default value of the '{@link #getKindRepS() <em>Kind Rep S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindRepS()
	 * @generated
	 * @ordered
	 */
	protected static final StepKind KIND_REP_S_EDEFAULT = StepKind.REPLACEMENT;

	/**
	 * The cached value of the '{@link #getKindRepS() <em>Kind Rep S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindRepS()
	 * @generated
	 * @ordered
	 */
	protected StepKind kindRepS = KIND_REP_S_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplace() <em>Replace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected EList<DaComponent> replace;

	/**
	 * The cached value of the '{@link #getWith() <em>With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected EList<DaSpare> with;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaReplacementStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.DA_REPLACEMENT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind getKindRepS() {
		return kindRepS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindRepS(StepKind newKindRepS) {
		StepKind oldKindRepS = kindRepS;
		kindRepS = newKindRepS == null ? KIND_REP_S_EDEFAULT : newKindRepS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.DA_REPLACEMENT_STEP__KIND_REP_S, oldKindRepS, kindRepS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaComponent> getReplace() {
		if (replace == null) {
			replace = new EObjectResolvingEList<DaComponent>(DaComponent.class, this, MaintenancePackage.DA_REPLACEMENT_STEP__REPLACE);
		}
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaSpare> getWith() {
		if (with == null) {
			with = new EObjectResolvingEList<DaSpare>(DaSpare.class, this, MaintenancePackage.DA_REPLACEMENT_STEP__WITH);
		}
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean replaceSize(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 MaintenanceValidator.DA_REPLACEMENT_STEP__REPLACE_SIZE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "replaceSize", EObjectValidator.getObjectLabel(this, context) }),
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
			case MaintenancePackage.DA_REPLACEMENT_STEP__KIND_REP_S:
				return getKindRepS();
			case MaintenancePackage.DA_REPLACEMENT_STEP__REPLACE:
				return getReplace();
			case MaintenancePackage.DA_REPLACEMENT_STEP__WITH:
				return getWith();
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
			case MaintenancePackage.DA_REPLACEMENT_STEP__KIND_REP_S:
				setKindRepS((StepKind)newValue);
				return;
			case MaintenancePackage.DA_REPLACEMENT_STEP__REPLACE:
				getReplace().clear();
				getReplace().addAll((Collection<? extends DaComponent>)newValue);
				return;
			case MaintenancePackage.DA_REPLACEMENT_STEP__WITH:
				getWith().clear();
				getWith().addAll((Collection<? extends DaSpare>)newValue);
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
			case MaintenancePackage.DA_REPLACEMENT_STEP__KIND_REP_S:
				setKindRepS(KIND_REP_S_EDEFAULT);
				return;
			case MaintenancePackage.DA_REPLACEMENT_STEP__REPLACE:
				getReplace().clear();
				return;
			case MaintenancePackage.DA_REPLACEMENT_STEP__WITH:
				getWith().clear();
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
			case MaintenancePackage.DA_REPLACEMENT_STEP__KIND_REP_S:
				return kindRepS != KIND_REP_S_EDEFAULT;
			case MaintenancePackage.DA_REPLACEMENT_STEP__REPLACE:
				return replace != null && !replace.isEmpty();
			case MaintenancePackage.DA_REPLACEMENT_STEP__WITH:
				return with != null && !with.isEmpty();
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
		result.append(" (kindRepS: ");
		result.append(kindRepS);
		result.append(')');
		return result.toString();
	}

} //DaReplacementStepImpl
