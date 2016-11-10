/**
 */
package es.unizar.disco.dice.DTSM.Hadoop;

import es.unizar.disco.dice.DTSM.Core.CoreData;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Reduce Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasMap <em>Has Map</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasReduce <em>Has Reduce</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getOutput <em>Output</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReducePhase()
 * @model
 * @generated
 */
public interface HadoopMapReducePhase extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Map</em>' reference.
	 * @see #setHasMap(HadoopMap)
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReducePhase_HasMap()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HadoopMap getHasMap();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasMap <em>Has Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Map</em>' reference.
	 * @see #getHasMap()
	 * @generated
	 */
	void setHasMap(HadoopMap value);

	/**
	 * Returns the value of the '<em><b>Has Reduce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Reduce</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Reduce</em>' reference.
	 * @see #setHasReduce(HadoopReduce)
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReducePhase_HasReduce()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HadoopReduce getHasReduce();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasReduce <em>Has Reduce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Reduce</em>' reference.
	 * @see #getHasReduce()
	 * @generated
	 */
	void setHasReduce(HadoopReduce value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(CoreData)
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReducePhase_Output()
	 * @model ordered="false"
	 * @generated
	 */
	CoreData getOutput();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(CoreData value);

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
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMapReducePhase_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

} // HadoopMapReducePhase
