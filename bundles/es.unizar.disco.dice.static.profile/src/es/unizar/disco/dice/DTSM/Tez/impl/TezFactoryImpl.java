/**
 */
package es.unizar.disco.dice.DTSM.Tez.impl;

import es.unizar.disco.dice.DTSM.Tez.*;

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
public class TezFactoryImpl extends EFactoryImpl implements TezFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TezFactory init() {
		try {
			TezFactory theTezFactory = (TezFactory)EPackage.Registry.INSTANCE.getEFactory(TezPackage.eNS_URI);
			if (theTezFactory != null) {
				return theTezFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TezFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TezFactoryImpl() {
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
			case TezPackage.TEZ_VERTEX: return createTezVertex();
			case TezPackage.TEZ_EDGE: return createTezEdge();
			case TezPackage.TEZ_SCENARIO: return createTezScenario();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TezVertex createTezVertex() {
		TezVertexImpl tezVertex = new TezVertexImpl();
		return tezVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TezEdge createTezEdge() {
		TezEdgeImpl tezEdge = new TezEdgeImpl();
		return tezEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TezScenario createTezScenario() {
		TezScenarioImpl tezScenario = new TezScenarioImpl();
		return tezScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TezPackage getTezPackage() {
		return (TezPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TezPackage getPackage() {
		return TezPackage.eINSTANCE;
	}

} //TezFactoryImpl
