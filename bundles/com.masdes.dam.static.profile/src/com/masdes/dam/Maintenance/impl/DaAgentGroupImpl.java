/**
 */
package com.masdes.dam.Maintenance.impl;

import com.masdes.dam.Basic_Enumeration_Types.SkillType;

import com.masdes.dam.Maintenance.DaAgentGroup;
import com.masdes.dam.Maintenance.MaintenancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Agent Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaAgentGroupImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaAgentGroupImpl#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaAgentGroupImpl#getAgentNumber <em>Agent Number</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaAgentGroupImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaAgentGroupImpl extends MinimalEObjectImpl.Container implements DaAgentGroup {
	/**
	 * The default value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected static final SkillType SKILL_EDEFAULT = SkillType.HW_TECHNICIAN;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected SkillType skill = SKILL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrectness() <em>Correctness</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectness()
	 * @generated
	 * @ordered
	 */
	protected EList<String> correctness;

	/**
	 * The cached value of the '{@link #getAgentNumber() <em>Agent Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> agentNumber;

	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaAgentGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.DA_AGENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillType getSkill() {
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkill(SkillType newSkill) {
		SkillType oldSkill = skill;
		skill = newSkill == null ? SKILL_EDEFAULT : newSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.DA_AGENT_GROUP__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCorrectness() {
		if (correctness == null) {
			correctness = new EDataTypeUniqueEList<String>(String.class, this, MaintenancePackage.DA_AGENT_GROUP__CORRECTNESS);
		}
		return correctness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAgentNumber() {
		if (agentNumber == null) {
			agentNumber = new EDataTypeUniqueEList<String>(String.class, this, MaintenancePackage.DA_AGENT_GROUP__AGENT_NUMBER);
		}
		return agentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaintenancePackage.DA_AGENT_GROUP__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.DA_AGENT_GROUP__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.DA_AGENT_GROUP__SKILL:
				return getSkill();
			case MaintenancePackage.DA_AGENT_GROUP__CORRECTNESS:
				return getCorrectness();
			case MaintenancePackage.DA_AGENT_GROUP__AGENT_NUMBER:
				return getAgentNumber();
			case MaintenancePackage.DA_AGENT_GROUP__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
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
			case MaintenancePackage.DA_AGENT_GROUP__SKILL:
				setSkill((SkillType)newValue);
				return;
			case MaintenancePackage.DA_AGENT_GROUP__CORRECTNESS:
				getCorrectness().clear();
				getCorrectness().addAll((Collection<? extends String>)newValue);
				return;
			case MaintenancePackage.DA_AGENT_GROUP__AGENT_NUMBER:
				getAgentNumber().clear();
				getAgentNumber().addAll((Collection<? extends String>)newValue);
				return;
			case MaintenancePackage.DA_AGENT_GROUP__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
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
			case MaintenancePackage.DA_AGENT_GROUP__SKILL:
				setSkill(SKILL_EDEFAULT);
				return;
			case MaintenancePackage.DA_AGENT_GROUP__CORRECTNESS:
				getCorrectness().clear();
				return;
			case MaintenancePackage.DA_AGENT_GROUP__AGENT_NUMBER:
				getAgentNumber().clear();
				return;
			case MaintenancePackage.DA_AGENT_GROUP__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
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
			case MaintenancePackage.DA_AGENT_GROUP__SKILL:
				return skill != SKILL_EDEFAULT;
			case MaintenancePackage.DA_AGENT_GROUP__CORRECTNESS:
				return correctness != null && !correctness.isEmpty();
			case MaintenancePackage.DA_AGENT_GROUP__AGENT_NUMBER:
				return agentNumber != null && !agentNumber.isEmpty();
			case MaintenancePackage.DA_AGENT_GROUP__BASE_CLASSIFIER:
				return base_Classifier != null;
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
		result.append(" (skill: ");
		result.append(skill);
		result.append(", correctness: ");
		result.append(correctness);
		result.append(", agentNumber: ");
		result.append(agentNumber);
		result.append(')');
		return result.toString();
	}

} //DaAgentGroupImpl
