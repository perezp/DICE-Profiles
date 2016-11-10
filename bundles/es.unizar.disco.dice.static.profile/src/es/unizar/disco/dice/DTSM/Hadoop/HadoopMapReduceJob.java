/**
 */
package es.unizar.disco.dice.DTSM.Hadoop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Reduce Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob#getMapResucePhases <em>Map Resuce Phases</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReduceJob()
 * @model
 * @generated
 */
public interface HadoopMapReduceJob extends EObject {
	/**
	 * Returns the value of the '<em><b>Map Resuce Phases</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Resuce Phases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Resuce Phases</em>' reference list.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReduceJob_MapResucePhases()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<HadoopMapReducePhase> getMapResucePhases();

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
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReduceJob_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

} // HadoopMapReduceJob
