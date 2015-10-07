/**
 */
package com.masdes.dam.Maintenance;

import com.masdes.dam.Basic_Enumeration_Types.SkillType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Agent Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.DaAgentGroup#getSkill <em>Skill</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaAgentGroup#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaAgentGroup#getAgentNumber <em>Agent Number</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaAgentGroup#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaAgentGroup()
 * @model
 * @generated
 */
public interface DaAgentGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Skill</b></em>' attribute.
	 * The default value is <code>"hwTechnician"</code>.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.SkillType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.SkillType
	 * @see #setSkill(SkillType)
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaAgentGroup_Skill()
	 * @model default="hwTechnician" required="true" ordered="false"
	 * @generated
	 */
	SkillType getSkill();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Maintenance.DaAgentGroup#getSkill <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.SkillType
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(SkillType value);

	/**
	 * Returns the value of the '<em><b>Correctness</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correctness</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctness</em>' attribute list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaAgentGroup_Correctness()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getCorrectness();

	/**
	 * Returns the value of the '<em><b>Agent Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Number</em>' attribute list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaAgentGroup_AgentNumber()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getAgentNumber();

	/**
	 * Returns the value of the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Classifier</em>' reference.
	 * @see #setBase_Classifier(Classifier)
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaAgentGroup_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Maintenance.DaAgentGroup#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

} // DaAgentGroup
