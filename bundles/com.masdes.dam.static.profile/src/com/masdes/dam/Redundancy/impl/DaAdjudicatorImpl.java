/**
 */
package com.masdes.dam.Redundancy.impl;

import com.masdes.dam.Core.impl.DaComponentImpl;

import com.masdes.dam.Redundancy.DaAdjudicator;
import com.masdes.dam.Redundancy.RedundancyPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Adjudicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Redundancy.impl.DaAdjudicatorImpl#getErrorDetecCoverage <em>Error Detec Coverage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaAdjudicatorImpl extends DaComponentImpl implements DaAdjudicator {
	/**
	 * The cached value of the '{@link #getErrorDetecCoverage() <em>Error Detec Coverage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDetecCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errorDetecCoverage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaAdjudicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedundancyPackage.Literals.DA_ADJUDICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getErrorDetecCoverage() {
		if (errorDetecCoverage == null) {
			errorDetecCoverage = new EDataTypeUniqueEList<String>(String.class, this, RedundancyPackage.DA_ADJUDICATOR__ERROR_DETEC_COVERAGE);
		}
		return errorDetecCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedundancyPackage.DA_ADJUDICATOR__ERROR_DETEC_COVERAGE:
				return getErrorDetecCoverage();
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
			case RedundancyPackage.DA_ADJUDICATOR__ERROR_DETEC_COVERAGE:
				getErrorDetecCoverage().clear();
				getErrorDetecCoverage().addAll((Collection<? extends String>)newValue);
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
			case RedundancyPackage.DA_ADJUDICATOR__ERROR_DETEC_COVERAGE:
				getErrorDetecCoverage().clear();
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
			case RedundancyPackage.DA_ADJUDICATOR__ERROR_DETEC_COVERAGE:
				return errorDetecCoverage != null && !errorDetecCoverage.isEmpty();
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
		result.append(" (errorDetecCoverage: ");
		result.append(errorDetecCoverage);
		result.append(')');
		return result.toString();
	}

} //DaAdjudicatorImpl
