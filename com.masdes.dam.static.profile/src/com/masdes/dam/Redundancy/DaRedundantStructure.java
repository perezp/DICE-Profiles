/**
 */
package com.masdes.dam.Redundancy;

import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaHazard;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Redundant Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Redundancy.DaRedundantStructure#getCommonModeFailure <em>Common Mode Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.DaRedundantStructure#getCommonModeHazard <em>Common Mode Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.DaRedundantStructure#getFTlevel <em>FTlevel</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.DaRedundantStructure#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaRedundantStructure()
 * @model
 * @generated
 */
public interface DaRedundantStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Common Mode Failure</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Mode Failure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Mode Failure</em>' containment reference list.
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaRedundantStructure_CommonModeFailure()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFailure> getCommonModeFailure();

	/**
	 * Returns the value of the '<em><b>Common Mode Hazard</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Mode Hazard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Mode Hazard</em>' containment reference list.
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaRedundantStructure_CommonModeHazard()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaHazard> getCommonModeHazard();

	/**
	 * Returns the value of the '<em><b>FTlevel</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FTlevel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTlevel</em>' attribute.
	 * @see #setFTlevel(int)
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaRedundantStructure_FTlevel()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getFTlevel();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Redundancy.DaRedundantStructure#getFTlevel <em>FTlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTlevel</em>' attribute.
	 * @see #getFTlevel()
	 * @generated
	 */
	void setFTlevel(int value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaRedundantStructure_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Redundancy.DaRedundantStructure#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.ownedElements->size() > 2
	 * and
	 * self.ownedElements->size() > self.FTlevel
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean packageSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DaRedundantStructure
