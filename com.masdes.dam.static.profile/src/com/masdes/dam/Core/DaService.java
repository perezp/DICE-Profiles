/**
 */
package com.masdes.dam.Core;

import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaHazard;
import com.masdes.dam.Complex_Data_Types.DaRec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaService#getExecProb <em>Exec Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getSsAvail <em>Ss Avail</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getInstAvail <em>Inst Avail</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getUnreliability <em>Unreliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getReliability <em>Reliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getMissionTime <em>Mission Time</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getAvailLevel <em>Avail Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getReliabLevel <em>Reliab Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getSafetyLevel <em>Safety Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getHazard <em>Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getRecovery <em>Recovery</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getConfLevel <em>Conf Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaService#getIntegLevel <em>Integ Level</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaService()
 * @model
 * @generated
 */
public interface DaService extends GaScenario {
	/**
	 * Returns the value of the '<em><b>Exec Prob</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec Prob</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Prob</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaService_ExecProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getExecProb();

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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_SsAvail()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Percentage" ordered="false"
	 * @generated
	 */
	EList<String> getSsAvail();

	/**
	 * Returns the value of the '<em><b>Inst Avail</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Avail</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Avail</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaService_InstAvail()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getInstAvail();

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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_Unreliability()
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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_Reliability()
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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_MissionTime()
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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_AvailLevel()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLevel" ordered="false"
	 * @generated
	 */
	EList<String> getAvailLevel();

	/**
	 * Returns the value of the '<em><b>Reliab Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliab Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliab Level</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaService_ReliabLevel()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLevel" ordered="false"
	 * @generated
	 */
	EList<String> getReliabLevel();

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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_SafetyLevel()
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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_Complexity()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getComplexity();

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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_Failure()
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
	 * @see com.masdes.dam.Core.CorePackage#getDaService_Hazard()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaHazard> getHazard();

	/**
	 * Returns the value of the '<em><b>Recovery</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaRec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaService_Recovery()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaRec> getRecovery();

	/**
	 * Returns the value of the '<em><b>Conf Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Level</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaService_ConfLevel()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLevel" ordered="false"
	 * @generated
	 */
	EList<String> getConfLevel();

	/**
	 * Returns the value of the '<em><b>Integ Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integ Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integ Level</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaService_IntegLevel()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaLevel" ordered="false"
	 * @generated
	 */
	EList<String> getIntegLevel();

} // DaService
