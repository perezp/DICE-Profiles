/**
 */
package com.masdes.dam.Complex_Data_Types;

import com.masdes.dam.Basic_Enumeration_Types.FactorOrigin;
import com.masdes.dam.Basic_Enumeration_Types.Guideword;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getOrigin <em>Origin</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getSeverity <em>Severity</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getOccurrenceProb <em>Occurrence Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getLevel <em>Level</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getLatency <em>Latency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getAccidentLikelihood <em>Accident Likelihood</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getRisk <em>Risk</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getCost <em>Cost</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getGuideword <em>Guideword</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getAccident <em>Accident</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getCauseF <em>Cause F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getCauseE <em>Cause E</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaHazard#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard()
 * @model
 * @generated
 */
public interface DaHazard extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.FactorOrigin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.FactorOrigin
	 * @see #setOrigin(FactorOrigin)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Origin()
	 * @model ordered="false"
	 * @generated
	 */
	FactorOrigin getOrigin();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.FactorOrigin
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(FactorOrigin value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Severity()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaCriticalLevel" ordered="false"
	 * @generated
	 */
	EList<String> getSeverity();

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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_OccurrenceProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getOccurrenceProb();

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Likelihood</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Likelihood()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLikelihood" ordered="false"
	 * @generated
	 */
	EList<String> getLikelihood();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Level()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getLevel();

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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Latency()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getLatency();

	/**
	 * Returns the value of the '<em><b>Accident Likelihood</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident Likelihood</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident Likelihood</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_AccidentLikelihood()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLikelihood" ordered="false"
	 * @generated
	 */
	EList<String> getAccidentLikelihood();

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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Risk()
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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Cost()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaCurrency" ordered="false"
	 * @generated
	 */
	EList<String> getCost();

	/**
	 * Returns the value of the '<em><b>Guideword</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.Guideword}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guideword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guideword</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Guideword
	 * @see #setGuideword(Guideword)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Guideword()
	 * @model ordered="false"
	 * @generated
	 */
	Guideword getGuideword();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getGuideword <em>Guideword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guideword</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.Guideword
	 * @see #getGuideword()
	 * @generated
	 */
	void setGuideword(Guideword value);

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident</em>' attribute.
	 * @see #setAccident(String)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Accident()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAccident();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getAccident <em>Accident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' attribute.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(String value);

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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_CauseF()
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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_CauseE()
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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaHazard_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // DaHazard
