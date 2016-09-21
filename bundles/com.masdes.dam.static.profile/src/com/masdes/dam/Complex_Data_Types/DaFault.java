/**
 */
package com.masdes.dam.Complex_Data_Types;

import com.masdes.dam.Basic_Enumeration_Types.Capability;
import com.masdes.dam.Basic_Enumeration_Types.Intent;
import com.masdes.dam.Basic_Enumeration_Types.Objective;
import com.masdes.dam.Basic_Enumeration_Types.Origin;
import com.masdes.dam.Basic_Enumeration_Types.Persistency;
import com.masdes.dam.Basic_Enumeration_Types.PhaseCreation;
import com.masdes.dam.Basic_Enumeration_Types.PhenomCause;
import com.masdes.dam.Basic_Enumeration_Types.SysBoundaries;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceRate <em>Occurrence Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getLatency <em>Latency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceProb <em>Occurrence Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceDist <em>Occurrence Dist</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getEffectE <em>Effect E</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getEffectF <em>Effect F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getEffectH <em>Effect H</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getPhaseCreation <em>Phase Creation</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getSysBoundaries <em>Sys Boundaries</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getPhenomCause <em>Phenom Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getDimension <em>Dimension</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getObjective <em>Objective</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getIntent <em>Intent</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFault#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault()
 * @model
 * @generated
 */
public interface DaFault extends EObject {
	/**
	 * Returns the value of the '<em><b>Occurrence Rate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Rate</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Rate</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_OccurrenceRate()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaFrequency" ordered="false"
	 * @generated
	 */
	EList<String> getOccurrenceRate();

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_Latency()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getLatency();

	/**
	 * Returns the value of the '<em><b>Occurrence Prob</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Prob</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Prob</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_OccurrenceProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getOccurrenceProb();

	/**
	 * Returns the value of the '<em><b>Occurrence Dist</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Dist</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Dist</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_OccurrenceDist()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getOccurrenceDist();

	/**
	 * Returns the value of the '<em><b>Persistency</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Persistency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistency</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Persistency
	 * @see #setPersistency(Persistency)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_Persistency()
	 * @model ordered="false"
	 * @generated
	 */
	Persistency getPersistency();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaFault#getPersistency <em>Persistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistency</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Persistency
	 * @see #getPersistency()
	 * @generated
	 */
	void setPersistency(Persistency value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_Duration()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getDuration();

	/**
	 * Returns the value of the '<em><b>Effect E</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect E</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect E</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_EffectE()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaError> getEffectE();

	/**
	 * Returns the value of the '<em><b>Effect F</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect F</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect F</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_EffectF()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFailure> getEffectF();

	/**
	 * Returns the value of the '<em><b>Effect H</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect H</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_EffectH()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaHazard> getEffectH();

	/**
	 * Returns the value of the '<em><b>Phase Creation</b></em>' attribute list.
	 * The list contents are of type {@link com.masdes.dam.Basic_Enumeration_Types.PhaseCreation}.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.PhaseCreation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Creation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Creation</em>' attribute list.
	 * @see com.masdes.dam.Basic_Enumeration_Types.PhaseCreation
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_PhaseCreation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PhaseCreation> getPhaseCreation();

	/**
	 * Returns the value of the '<em><b>Sys Boundaries</b></em>' attribute list.
	 * The list contents are of type {@link com.masdes.dam.Basic_Enumeration_Types.SysBoundaries}.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.SysBoundaries}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys Boundaries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys Boundaries</em>' attribute list.
	 * @see com.masdes.dam.Basic_Enumeration_Types.SysBoundaries
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_SysBoundaries()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SysBoundaries> getSysBoundaries();

	/**
	 * Returns the value of the '<em><b>Phenom Cause</b></em>' attribute list.
	 * The list contents are of type {@link com.masdes.dam.Basic_Enumeration_Types.PhenomCause}.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.PhenomCause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phenom Cause</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phenom Cause</em>' attribute list.
	 * @see com.masdes.dam.Basic_Enumeration_Types.PhenomCause
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_PhenomCause()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PhenomCause> getPhenomCause();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute list.
	 * The list contents are of type {@link com.masdes.dam.Basic_Enumeration_Types.Origin}.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Origin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute list.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Origin
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_Dimension()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Origin> getDimension();

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute list.
	 * The list contents are of type {@link com.masdes.dam.Basic_Enumeration_Types.Objective}.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' attribute list.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Objective
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_Objective()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Objective> getObjective();

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' attribute list.
	 * The list contents are of type {@link com.masdes.dam.Basic_Enumeration_Types.Intent}.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' attribute list.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Intent
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_Intent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Intent> getIntent();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' attribute list.
	 * The list contents are of type {@link com.masdes.dam.Basic_Enumeration_Types.Capability}.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' attribute list.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Capability
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFault_Capability()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Capability> getCapability();

} // DaFault
