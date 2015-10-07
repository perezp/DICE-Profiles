/**
 */
package com.masdes.dam.Redundancy.impl;

import com.masdes.dam.Core.DaComponent;

import com.masdes.dam.Core.impl.DaComponentImpl;

import com.masdes.dam.Redundancy.DaSpare;
import com.masdes.dam.Redundancy.RedundancyPackage;

import com.masdes.dam.Redundancy.util.RedundancyValidator;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Spare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Redundancy.impl.DaSpareImpl#getDormancyFactor <em>Dormancy Factor</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.impl.DaSpareImpl#getSubstituteFor <em>Substitute For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaSpareImpl extends DaComponentImpl implements DaSpare {
	/**
	 * The cached value of the '{@link #getDormancyFactor() <em>Dormancy Factor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDormancyFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dormancyFactor;

	/**
	 * The cached value of the '{@link #getSubstituteFor() <em>Substitute For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteFor()
	 * @generated
	 * @ordered
	 */
	protected EList<DaComponent> substituteFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaSpareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedundancyPackage.Literals.DA_SPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDormancyFactor() {
		if (dormancyFactor == null) {
			dormancyFactor = new EDataTypeUniqueEList<String>(String.class, this, RedundancyPackage.DA_SPARE__DORMANCY_FACTOR);
		}
		return dormancyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaComponent> getSubstituteFor() {
		if (substituteFor == null) {
			substituteFor = new EObjectResolvingEList<DaComponent>(DaComponent.class, this, RedundancyPackage.DA_SPARE__SUBSTITUTE_FOR);
		}
		return substituteFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean excludeSelfElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RedundancyValidator.DIAGNOSTIC_SOURCE,
						 RedundancyValidator.DA_SPARE__EXCLUDE_SELF_ELEMENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "excludeSelfElement", EObjectValidator.getObjectLabel(this, context) }),
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
			case RedundancyPackage.DA_SPARE__DORMANCY_FACTOR:
				return getDormancyFactor();
			case RedundancyPackage.DA_SPARE__SUBSTITUTE_FOR:
				return getSubstituteFor();
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
			case RedundancyPackage.DA_SPARE__DORMANCY_FACTOR:
				getDormancyFactor().clear();
				getDormancyFactor().addAll((Collection<? extends String>)newValue);
				return;
			case RedundancyPackage.DA_SPARE__SUBSTITUTE_FOR:
				getSubstituteFor().clear();
				getSubstituteFor().addAll((Collection<? extends DaComponent>)newValue);
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
			case RedundancyPackage.DA_SPARE__DORMANCY_FACTOR:
				getDormancyFactor().clear();
				return;
			case RedundancyPackage.DA_SPARE__SUBSTITUTE_FOR:
				getSubstituteFor().clear();
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
			case RedundancyPackage.DA_SPARE__DORMANCY_FACTOR:
				return dormancyFactor != null && !dormancyFactor.isEmpty();
			case RedundancyPackage.DA_SPARE__SUBSTITUTE_FOR:
				return substituteFor != null && !substituteFor.isEmpty();
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
		result.append(" (dormancyFactor: ");
		result.append(dormancyFactor);
		result.append(')');
		return result.toString();
	}

} //DaSpareImpl
