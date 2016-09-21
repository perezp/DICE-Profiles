/**
 */
package com.masdes.dam.Redundancy.impl;

import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaHazard;

import com.masdes.dam.Redundancy.DaRedundantStructure;
import com.masdes.dam.Redundancy.RedundancyPackage;

import com.masdes.dam.Redundancy.util.RedundancyValidator;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Redundant Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl#getCommonModeFailure <em>Common Mode Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl#getCommonModeHazard <em>Common Mode Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl#getFTlevel <em>FTlevel</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaRedundantStructureImpl extends MinimalEObjectImpl.Container implements DaRedundantStructure {
	/**
	 * The cached value of the '{@link #getCommonModeFailure() <em>Common Mode Failure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonModeFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFailure> commonModeFailure;

	/**
	 * The cached value of the '{@link #getCommonModeHazard() <em>Common Mode Hazard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonModeHazard()
	 * @generated
	 * @ordered
	 */
	protected EList<DaHazard> commonModeHazard;

	/**
	 * The default value of the '{@link #getFTlevel() <em>FTlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTlevel()
	 * @generated
	 * @ordered
	 */
	protected static final int FTLEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFTlevel() <em>FTlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTlevel()
	 * @generated
	 * @ordered
	 */
	protected int fTlevel = FTLEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaRedundantStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedundancyPackage.Literals.DA_REDUNDANT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFailure> getCommonModeFailure() {
		if (commonModeFailure == null) {
			commonModeFailure = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE);
		}
		return commonModeFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaHazard> getCommonModeHazard() {
		if (commonModeHazard == null) {
			commonModeHazard = new EObjectContainmentEList<DaHazard>(DaHazard.class, this, RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD);
		}
		return commonModeHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFTlevel() {
		return fTlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFTlevel(int newFTlevel) {
		int oldFTlevel = fTlevel;
		fTlevel = newFTlevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedundancyPackage.DA_REDUNDANT_STRUCTURE__FTLEVEL, oldFTlevel, fTlevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedundancyPackage.DA_REDUNDANT_STRUCTURE__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedundancyPackage.DA_REDUNDANT_STRUCTURE__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean packageSize(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 RedundancyValidator.DA_REDUNDANT_STRUCTURE__PACKAGE_SIZE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "packageSize", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE:
				return ((InternalEList<?>)getCommonModeFailure()).basicRemove(otherEnd, msgs);
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD:
				return ((InternalEList<?>)getCommonModeHazard()).basicRemove(otherEnd, msgs);
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
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE:
				return getCommonModeFailure();
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD:
				return getCommonModeHazard();
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__FTLEVEL:
				return getFTlevel();
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
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
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE:
				getCommonModeFailure().clear();
				getCommonModeFailure().addAll((Collection<? extends DaFailure>)newValue);
				return;
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD:
				getCommonModeHazard().clear();
				getCommonModeHazard().addAll((Collection<? extends DaHazard>)newValue);
				return;
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__FTLEVEL:
				setFTlevel((Integer)newValue);
				return;
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
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
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE:
				getCommonModeFailure().clear();
				return;
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD:
				getCommonModeHazard().clear();
				return;
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__FTLEVEL:
				setFTlevel(FTLEVEL_EDEFAULT);
				return;
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
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
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE:
				return commonModeFailure != null && !commonModeFailure.isEmpty();
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD:
				return commonModeHazard != null && !commonModeHazard.isEmpty();
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__FTLEVEL:
				return fTlevel != FTLEVEL_EDEFAULT;
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE__BASE_PACKAGE:
				return base_Package != null;
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
		result.append(" (FTlevel: ");
		result.append(fTlevel);
		result.append(')');
		return result.toString();
	}

} //DaRedundantStructureImpl
