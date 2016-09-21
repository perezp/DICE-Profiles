/**
 */
package es.unizar.disco.dice.dtsm.Hadoop;

import es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Hadoop.HadoopScenario#getJobSchedule <em>Job Schedule</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage#getHadoopScenario()
 * @model
 * @generated
 */
public interface HadoopScenario extends GaScenario {
	/**
	 * Returns the value of the '<em><b>Job Schedule</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Schedule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Schedule</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling
	 * @see #setJobSchedule(Scheduling)
	 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage#getHadoopScenario_JobSchedule()
	 * @model ordered="false"
	 * @generated
	 */
	Scheduling getJobSchedule();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Hadoop.HadoopScenario#getJobSchedule <em>Job Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Schedule</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling
	 * @see #getJobSchedule()
	 * @generated
	 */
	void setJobSchedule(Scheduling value);

} // HadoopScenario
