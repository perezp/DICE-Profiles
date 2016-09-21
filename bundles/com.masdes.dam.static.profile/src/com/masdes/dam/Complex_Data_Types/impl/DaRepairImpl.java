/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaRepair;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Repair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaRepairImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaRepairImpl#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaRepairImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaRepairImpl extends MinimalEObjectImpl.Container implements DaRepair {
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
	 * The cached value of the '{@link #getMTTR() <em>MTTR</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mttr;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaRepairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DA_REPAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRate() {
		if (rate == null) {
			rate = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_REPAIR__RATE);
		}
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMTTR() {
		if (mttr == null) {
			mttr = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_REPAIR__MTTR);
		}
		return mttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDistribution() {
		if (distribution == null) {
			distribution = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_REPAIR__DISTRIBUTION);
		}
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DA_REPAIR__RATE:
				return getRate();
			case Complex_Data_TypesPackage.DA_REPAIR__MTTR:
				return getMTTR();
			case Complex_Data_TypesPackage.DA_REPAIR__DISTRIBUTION:
				return getDistribution();
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
			case Complex_Data_TypesPackage.DA_REPAIR__RATE:
				getRate().clear();
				getRate().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_REPAIR__MTTR:
				getMTTR().clear();
				getMTTR().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_REPAIR__DISTRIBUTION:
				getDistribution().clear();
				getDistribution().addAll((Collection<? extends String>)newValue);
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
			case Complex_Data_TypesPackage.DA_REPAIR__RATE:
				getRate().clear();
				return;
			case Complex_Data_TypesPackage.DA_REPAIR__MTTR:
				getMTTR().clear();
				return;
			case Complex_Data_TypesPackage.DA_REPAIR__DISTRIBUTION:
				getDistribution().clear();
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
			case Complex_Data_TypesPackage.DA_REPAIR__RATE:
				return rate != null && !rate.isEmpty();
			case Complex_Data_TypesPackage.DA_REPAIR__MTTR:
				return mttr != null && !mttr.isEmpty();
			case Complex_Data_TypesPackage.DA_REPAIR__DISTRIBUTION:
				return distribution != null && !distribution.isEmpty();
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
		result.append(", MTTR: ");
		result.append(mttr);
		result.append(", distribution: ");
		result.append(distribution);
		result.append(')');
		return result.toString();
	}

} //DaRepairImpl
