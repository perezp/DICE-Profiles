/**
 */
package es.unizar.disco.dice.dtsm.Hadoop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Hadoop.HadoopOperation#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Hadoop.HadoopOperation#getNTasks <em>NTasks</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage#getHadoopOperation()
 * @model
 * @generated
 */
public interface HadoopOperation extends GaStep {
	/**
	 * Returns the value of the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallelism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallelism</em>' attribute.
	 * @see #setParallelism(String)
	 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage#getHadoopOperation_Parallelism()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	String getParallelism();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Hadoop.HadoopOperation#getParallelism <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallelism</em>' attribute.
	 * @see #getParallelism()
	 * @generated
	 */
	void setParallelism(String value);

	/**
	 * Returns the value of the '<em><b>NTasks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTasks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTasks</em>' attribute list.
	 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage#getHadoopOperation_NTasks()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getNTasks();

} // HadoopOperation
