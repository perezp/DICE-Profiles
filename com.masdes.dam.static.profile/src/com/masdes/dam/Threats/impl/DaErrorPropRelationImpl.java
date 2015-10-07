/**
 */
package com.masdes.dam.Threats.impl;

import com.masdes.dam.Complex_Data_Types.DaErrorPropagation;

import com.masdes.dam.Threats.DaErrorPropRelation;
import com.masdes.dam.Threats.ThreatsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Error Prop Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Threats.impl.DaErrorPropRelationImpl#getPropagationExpr <em>Propagation Expr</em>}</li>
 *   <li>{@link com.masdes.dam.Threats.impl.DaErrorPropRelationImpl#getErrorProp <em>Error Prop</em>}</li>
 *   <li>{@link com.masdes.dam.Threats.impl.DaErrorPropRelationImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaErrorPropRelationImpl extends MinimalEObjectImpl.Container implements DaErrorPropRelation {
	/**
	 * The default value of the '{@link #getPropagationExpr() <em>Propagation Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPAGATION_EXPR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPropagationExpr() <em>Propagation Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationExpr()
	 * @generated
	 * @ordered
	 */
	protected String propagationExpr = PROPAGATION_EXPR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorProp() <em>Error Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorProp()
	 * @generated
	 * @ordered
	 */
	protected EList<DaErrorPropagation> errorProp;

	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaErrorPropRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatsPackage.Literals.DA_ERROR_PROP_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropagationExpr() {
		return propagationExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagationExpr(String newPropagationExpr) {
		String oldPropagationExpr = propagationExpr;
		propagationExpr = newPropagationExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThreatsPackage.DA_ERROR_PROP_RELATION__PROPAGATION_EXPR, oldPropagationExpr, propagationExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaErrorPropagation> getErrorProp() {
		if (errorProp == null) {
			errorProp = new EObjectContainmentEList<DaErrorPropagation>(DaErrorPropagation.class, this, ThreatsPackage.DA_ERROR_PROP_RELATION__ERROR_PROP);
		}
		return errorProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject)base_Constraint;
			base_Constraint = (Constraint)eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThreatsPackage.DA_ERROR_PROP_RELATION__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThreatsPackage.DA_ERROR_PROP_RELATION__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThreatsPackage.DA_ERROR_PROP_RELATION__ERROR_PROP:
				return ((InternalEList<?>)getErrorProp()).basicRemove(otherEnd, msgs);
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
			case ThreatsPackage.DA_ERROR_PROP_RELATION__PROPAGATION_EXPR:
				return getPropagationExpr();
			case ThreatsPackage.DA_ERROR_PROP_RELATION__ERROR_PROP:
				return getErrorProp();
			case ThreatsPackage.DA_ERROR_PROP_RELATION__BASE_CONSTRAINT:
				if (resolve) return getBase_Constraint();
				return basicGetBase_Constraint();
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
			case ThreatsPackage.DA_ERROR_PROP_RELATION__PROPAGATION_EXPR:
				setPropagationExpr((String)newValue);
				return;
			case ThreatsPackage.DA_ERROR_PROP_RELATION__ERROR_PROP:
				getErrorProp().clear();
				getErrorProp().addAll((Collection<? extends DaErrorPropagation>)newValue);
				return;
			case ThreatsPackage.DA_ERROR_PROP_RELATION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)newValue);
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
			case ThreatsPackage.DA_ERROR_PROP_RELATION__PROPAGATION_EXPR:
				setPropagationExpr(PROPAGATION_EXPR_EDEFAULT);
				return;
			case ThreatsPackage.DA_ERROR_PROP_RELATION__ERROR_PROP:
				getErrorProp().clear();
				return;
			case ThreatsPackage.DA_ERROR_PROP_RELATION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)null);
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
			case ThreatsPackage.DA_ERROR_PROP_RELATION__PROPAGATION_EXPR:
				return PROPAGATION_EXPR_EDEFAULT == null ? propagationExpr != null : !PROPAGATION_EXPR_EDEFAULT.equals(propagationExpr);
			case ThreatsPackage.DA_ERROR_PROP_RELATION__ERROR_PROP:
				return errorProp != null && !errorProp.isEmpty();
			case ThreatsPackage.DA_ERROR_PROP_RELATION__BASE_CONSTRAINT:
				return base_Constraint != null;
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
		result.append(" (propagationExpr: ");
		result.append(propagationExpr);
		result.append(')');
		return result.toString();
	}

} //DaErrorPropRelationImpl
