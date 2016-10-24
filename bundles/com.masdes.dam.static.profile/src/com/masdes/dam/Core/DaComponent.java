/**
 */
package com.masdes.dam.Core;

import com.masdes.dam.Basic_Enumeration_Types.Origin;

import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaFault;
import com.masdes.dam.Complex_Data_Types.DaHazard;
import com.masdes.dam.Complex_Data_Types.DaRepair;

import com.masdes.dam.Redundancy.DaSpare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaComponent#isStateful <em>Stateful</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getOrigin <em>Origin</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getFailureCoverage <em>Failure Coverage</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getPercPermFault <em>Perc Perm Fault</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getSsAvail <em>Ss Avail</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getUnreliability <em>Unreliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getReliability <em>Reliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getMissionTime <em>Mission Time</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getAvailLevel <em>Avail Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getReliabilityLevel <em>Reliability Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getSafetyLevel <em>Safety Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getFault <em>Fault</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getError <em>Error</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getHazard <em>Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getRepair <em>Repair</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaComponent#getSubstitutedBy <em>Substituted By</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaComponent()
 * @model
 * @generated
 */
public interface DaComponent extends Resource {
	/**
	 * Returns the value of the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateful</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateful</em>' attribute.
	 * @see #setStateful(boolean)
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Stateful()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isStateful();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaComponent#isStateful <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateful</em>' attribute.
	 * @see #isStateful()
	 * @generated
	 */
	void setStateful(boolean value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Origin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Origin
	 * @see #setOrigin(Origin)
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Origin()
	 * @model ordered="false"
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaComponent#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Origin
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Origin value);

	/**
	 * Returns the value of the '<em><b>Failure Coverage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Coverage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Coverage</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_FailureCoverage()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Percentage" ordered="false"
	 * @generated
	 */
	EList<String> getFailureCoverage();

	/**
	 * Returns the value of the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perc Perm Fault</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perc Perm Fault</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_PercPermFault()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Percentage" ordered="false"
	 * @generated
	 */
	EList<String> getPercPermFault();

	/**
	 * Returns the value of the '<em><b>Ss Avail</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Avail</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Avail</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_SsAvail()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Percentage" ordered="false"
	 * @generated
	 */
	EList<String> getSsAvail();

	/**
	 * Returns the value of the '<em><b>Unreliability</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreliability</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreliability</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Unreliability()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getUnreliability();

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Reliability()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getReliability();

	/**
	 * Returns the value of the '<em><b>Mission Time</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Time</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Time</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_MissionTime()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getMissionTime();

	/**
	 * Returns the value of the '<em><b>Avail Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avail Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avail Level</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_AvailLevel()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLevel" ordered="false"
	 * @generated
	 */
	EList<String> getAvailLevel();

	/**
	 * Returns the value of the '<em><b>Reliability Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Level</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_ReliabilityLevel()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLevel" ordered="false"
	 * @generated
	 */
	EList<String> getReliabilityLevel();

	/**
	 * Returns the value of the '<em><b>Safety Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Level</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_SafetyLevel()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLevel" ordered="false"
	 * @generated
	 */
	EList<String> getSafetyLevel();

	/**
	 * Returns the value of the '<em><b>Complexity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complexity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complexity</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Complexity()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getComplexity();

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Fault()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFault> getFault();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Error()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaError> getError();

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Failure()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFailure> getFailure();

	/**
	 * Returns the value of the '<em><b>Hazard</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Hazard()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaHazard> getHazard();

	/**
	 * Returns the value of the '<em><b>Repair</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaRepair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repair</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_Repair()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaRepair> getRepair();

	/**
	 * Returns the value of the '<em><b>Substituted By</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Redundancy.DaSpare}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substituted By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substituted By</em>' reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaComponent_SubstitutedBy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DaSpare> getSubstitutedBy();

} // DaComponent
