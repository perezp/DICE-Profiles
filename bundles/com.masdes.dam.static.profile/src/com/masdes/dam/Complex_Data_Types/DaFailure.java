/**
 */
package com.masdes.dam.Complex_Data_Types;

import com.masdes.dam.Basic_Enumeration_Types.Consistency;
import com.masdes.dam.Basic_Enumeration_Types.Detectabillity;
import com.masdes.dam.Basic_Enumeration_Types.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceRate <em>Occurrence Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getMTTF <em>MTTF</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getMTBF <em>MTBF</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceProb <em>Occurrence Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceDist <em>Occurrence Dist</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getConsistency <em>Consistency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getRisk <em>Risk</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCost <em>Cost</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCauseF <em>Cause F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCauseE <em>Cause E</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDescription <em>Description</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDetectability <em>Detectability</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure()
 * @model
 * @generated
 */
public interface DaFailure extends EObject {
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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_OccurrenceRate()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaFrequency" ordered="false"
	 * @generated
	 */
	EList<String> getOccurrenceRate();

	/**
	 * Returns the value of the '<em><b>MTTF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTTF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTTF</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_MTTF()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getMTTF();

	/**
	 * Returns the value of the '<em><b>MTBF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTBF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTBF</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_MTBF()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getMTBF();

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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_OccurrenceProb()
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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_OccurrenceDist()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getOccurrenceDist();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Domain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Domain
	 * @see #setDomain(Domain)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Domain()
	 * @model ordered="false"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Domain
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Consistency</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Consistency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consistency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consistency</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Consistency
	 * @see #setConsistency(Consistency)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Consistency()
	 * @model ordered="false"
	 * @generated
	 */
	Consistency getConsistency();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getConsistency <em>Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Consistency
	 * @see #getConsistency()
	 * @generated
	 */
	void setConsistency(Consistency value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Consequence()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaCriticalLevel" ordered="false"
	 * @generated
	 */
	EList<String> getConsequence();

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Risk()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getRisk();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Cost()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaCurrency" ordered="false"
	 * @generated
	 */
	EList<String> getCost();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Condition()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Cause F</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause F</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause F</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_CauseF()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFault> getCauseF();

	/**
	 * Returns the value of the '<em><b>Cause E</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause E</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause E</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_CauseE()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaError> getCauseE();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Detectability</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Detectabillity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detectability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detectability</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Detectabillity
	 * @see #setDetectability(Detectabillity)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaFailure_Detectability()
	 * @model ordered="false"
	 * @generated
	 */
	Detectabillity getDetectability();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDetectability <em>Detectability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detectability</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Detectabillity
	 * @see #getDetectability()
	 * @generated
	 */
	void setDetectability(Detectabillity value);

} // DaFailure
