/**
 */
package es.unizar.disco.dice.DTSM.Core.impl;

import es.unizar.disco.dice.DPIM.impl.DpimStorageNodeImpl;

import es.unizar.disco.dice.DTSM.Core.CoreDataSource;
import es.unizar.disco.dice.DTSM.Core.CorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CoreDataSourceImpl extends DpimStorageNodeImpl implements CoreDataSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_DATA_SOURCE;
	}

} //CoreDataSourceImpl
