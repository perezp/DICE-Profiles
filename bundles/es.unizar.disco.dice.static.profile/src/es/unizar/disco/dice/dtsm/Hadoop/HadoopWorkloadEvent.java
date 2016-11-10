/**
 */
package es.unizar.disco.dice.DTSM.Hadoop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent#getHadoopPopulation <em>Hadoop Population</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent#getHadoopExtDelay <em>Hadoop Ext Delay</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopWorkloadEvent()
 * @model
 * @generated
 */
public interface HadoopWorkloadEvent extends GaWorkloadEvent {
	/**
	 * Returns the value of the '<em><b>Hadoop Population</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hadoop Population</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hadoop Population</em>' attribute list.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopWorkloadEvent_HadoopPopulation()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getHadoopPopulation();

	/**
	 * Returns the value of the '<em><b>Hadoop Ext Delay</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hadoop Ext Delay</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hadoop Ext Delay</em>' attribute list.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopWorkloadEvent_HadoopExtDelay()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getHadoopExtDelay();

} // HadoopWorkloadEvent
