/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaRec;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Rec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaRecImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaRecImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaRecImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaRecImpl#getCoverageFactor <em>Coverage Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaRecImpl extends MinimalEObjectImpl.Container implements DaRec {
	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rate;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected EList<String> duration;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<String> distribution;

	/**
	 * The cached value of the '{@link #getCoverageFactor() <em>Coverage Factor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> coverageFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaRecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DA_REC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRate() {
		if (rate == null) {
			rate = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_REC__RATE);
		}
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDuration() {
		if (duration == null) {
			duration = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_REC__DURATION);
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDistribution() {
		if (distribution == null) {
			distribution = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_REC__DISTRIBUTION);
		}
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCoverageFactor() {
		if (coverageFactor == null) {
			coverageFactor = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_REC__COVERAGE_FACTOR);
		}
		return coverageFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DA_REC__RATE:
				return getRate();
			case Complex_Data_TypesPackage.DA_REC__DURATION:
				return getDuration();
			case Complex_Data_TypesPackage.DA_REC__DISTRIBUTION:
				return getDistribution();
			case Complex_Data_TypesPackage.DA_REC__COVERAGE_FACTOR:
				return getCoverageFactor();
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
			case Complex_Data_TypesPackage.DA_REC__RATE:
				getRate().clear();
				getRate().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_REC__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_REC__DISTRIBUTION:
				getDistribution().clear();
				getDistribution().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_REC__COVERAGE_FACTOR:
				getCoverageFactor().clear();
				getCoverageFactor().addAll((Collection<? extends String>)newValue);
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
			case Complex_Data_TypesPackage.DA_REC__RATE:
				getRate().clear();
				return;
			case Complex_Data_TypesPackage.DA_REC__DURATION:
				getDuration().clear();
				return;
			case Complex_Data_TypesPackage.DA_REC__DISTRIBUTION:
				getDistribution().clear();
				return;
			case Complex_Data_TypesPackage.DA_REC__COVERAGE_FACTOR:
				getCoverageFactor().clear();
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
			case Complex_Data_TypesPackage.DA_REC__RATE:
				return rate != null && !rate.isEmpty();
			case Complex_Data_TypesPackage.DA_REC__DURATION:
				return duration != null && !duration.isEmpty();
			case Complex_Data_TypesPackage.DA_REC__DISTRIBUTION:
				return distribution != null && !distribution.isEmpty();
			case Complex_Data_TypesPackage.DA_REC__COVERAGE_FACTOR:
				return coverageFactor != null && !coverageFactor.isEmpty();
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
		result.append(", duration: ");
		result.append(duration);
		result.append(", distribution: ");
		result.append(distribution);
		result.append(", coverageFactor: ");
		result.append(coverageFactor);
		result.append(')');
		return result.toString();
	}

} //DaRecImpl
