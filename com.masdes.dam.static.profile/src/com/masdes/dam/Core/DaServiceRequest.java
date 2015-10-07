/**
 */
package com.masdes.dam.Core;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Service Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaServiceRequest#getAccessProb <em>Access Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceRequest#getServiceProb <em>Service Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceRequest#getRequest <em>Request</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceRequest#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceRequest#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceRequest#getBase_Interaction <em>Base Interaction</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceRequest#getBase_InstanceSpecification <em>Base Instance Specification</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest()
 * @model
 * @generated
 */
public interface DaServiceRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Prob</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Prob</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Prob</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest_AccessProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getAccessProb();

	/**
	 * Returns the value of the '<em><b>Service Prob</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Prob</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Prob</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest_ServiceProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real"
	 * @generated
	 */
	EList<String> getServiceProb();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Core.DaService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest_Request()
	 * @model
	 * @generated
	 */
	EList<DaService> getRequest();

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
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaServiceRequest#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Lifeline</em>' reference.
	 * @see #setBase_Lifeline(Lifeline)
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest_Base_Lifeline()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Lifeline getBase_Lifeline();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaServiceRequest#getBase_Lifeline <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Lifeline</em>' reference.
	 * @see #getBase_Lifeline()
	 * @generated
	 */
	void setBase_Lifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Base Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interaction</em>' reference.
	 * @see #setBase_Interaction(Interaction)
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest_Base_Interaction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interaction getBase_Interaction();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaServiceRequest#getBase_Interaction <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interaction</em>' reference.
	 * @see #getBase_Interaction()
	 * @generated
	 */
	void setBase_Interaction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Instance Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Instance Specification</em>' reference.
	 * @see #setBase_InstanceSpecification(InstanceSpecification)
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceRequest_Base_InstanceSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstanceSpecification getBase_InstanceSpecification();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaServiceRequest#getBase_InstanceSpecification <em>Base Instance Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Instance Specification</em>' reference.
	 * @see #getBase_InstanceSpecification()
	 * @generated
	 */
	void setBase_InstanceSpecification(InstanceSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.serviceProb->size() = self.request->size()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean requestSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DaServiceRequest
