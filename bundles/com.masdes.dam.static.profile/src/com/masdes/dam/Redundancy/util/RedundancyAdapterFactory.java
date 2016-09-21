/**
 */
package com.masdes.dam.Redundancy.util;

import com.masdes.dam.Core.DaComponent;

import com.masdes.dam.Redundancy.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Redundancy.RedundancyPackage
 * @generated
 */
public class RedundancyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RedundancyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RedundancyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedundancySwitch<Adapter> modelSwitch =
		new RedundancySwitch<Adapter>() {
			@Override
			public Adapter caseDaController(DaController object) {
				return createDaControllerAdapter();
			}
			@Override
			public Adapter caseDaVariant(DaVariant object) {
				return createDaVariantAdapter();
			}
			@Override
			public Adapter caseDaAdjudicator(DaAdjudicator object) {
				return createDaAdjudicatorAdapter();
			}
			@Override
			public Adapter caseDaRedundantStructure(DaRedundantStructure object) {
				return createDaRedundantStructureAdapter();
			}
			@Override
			public Adapter caseDaSpare(DaSpare object) {
				return createDaSpareAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseDaComponent(DaComponent object) {
				return createDaComponentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Redundancy.DaController <em>Da Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Redundancy.DaController
	 * @generated
	 */
	public Adapter createDaControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Redundancy.DaVariant <em>Da Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Redundancy.DaVariant
	 * @generated
	 */
	public Adapter createDaVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Redundancy.DaAdjudicator <em>Da Adjudicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Redundancy.DaAdjudicator
	 * @generated
	 */
	public Adapter createDaAdjudicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Redundancy.DaRedundantStructure <em>Da Redundant Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Redundancy.DaRedundantStructure
	 * @generated
	 */
	public Adapter createDaRedundantStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Redundancy.DaSpare <em>Da Spare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Redundancy.DaSpare
	 * @generated
	 */
	public Adapter createDaSpareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaComponent <em>Da Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaComponent
	 * @generated
	 */
	public Adapter createDaComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RedundancyAdapterFactory
