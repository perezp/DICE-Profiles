/**
 */
package es.unizar.disco.dice.DDSM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Storm Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster()
 * @model
 * @generated
 */
public interface DdsmStormCluster extends DdsmInternalComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentType = DDSMcomponentType::MasterSlavePlatform
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean StormClusterTypeMasterSlavePlatform(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DdsmStormCluster
