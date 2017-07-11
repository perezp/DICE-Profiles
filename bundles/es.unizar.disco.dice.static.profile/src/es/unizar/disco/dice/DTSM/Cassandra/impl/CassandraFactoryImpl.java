/**
 */
package es.unizar.disco.dice.DTSM.Cassandra.impl;

import es.unizar.disco.dice.DTSM.Cassandra.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CassandraFactoryImpl extends EFactoryImpl implements CassandraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CassandraFactory init() {
		try {
			CassandraFactory theCassandraFactory = (CassandraFactory)EPackage.Registry.INSTANCE.getEFactory(CassandraPackage.eNS_URI);
			if (theCassandraFactory != null) {
				return theCassandraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CassandraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CassandraPackage.CASSANDRA_DB: return createCassandraDB();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraDB createCassandraDB() {
		CassandraDBImpl cassandraDB = new CassandraDBImpl();
		return cassandraDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraPackage getCassandraPackage() {
		return (CassandraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CassandraPackage getPackage() {
		return CassandraPackage.eINSTANCE;
	}

} //CassandraFactoryImpl
