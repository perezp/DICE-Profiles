/**
 */
package es.unizar.disco.dice.DDSM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Yarn Resource Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnResourceManager()
 * @model
 * @generated
 */
public interface DdsmYarnResourceManager extends DdsmInternalComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentType = DDSMcomponentType::MasterNode
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean YarnTypeMasterNode(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DdsmYarnResourceManager
