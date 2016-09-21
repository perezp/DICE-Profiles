/**
 */
package com.masdes.dam.Complex_Data_Types.util;

import com.masdes.dam.Complex_Data_Types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage
 * @generated
 */
public class Complex_Data_TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Complex_Data_TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex_Data_TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Complex_Data_TypesPackage.eINSTANCE;
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
	protected Complex_Data_TypesSwitch<Adapter> modelSwitch =
		new Complex_Data_TypesSwitch<Adapter>() {
			@Override
			public Adapter caseDaError(DaError object) {
				return createDaErrorAdapter();
			}
			@Override
			public Adapter caseDaFault(DaFault object) {
				return createDaFaultAdapter();
			}
			@Override
			public Adapter caseDaFailure(DaFailure object) {
				return createDaFailureAdapter();
			}
			@Override
			public Adapter caseDaHazard(DaHazard object) {
				return createDaHazardAdapter();
			}
			@Override
			public Adapter caseDaErrorPropagation(DaErrorPropagation object) {
				return createDaErrorPropagationAdapter();
			}
			@Override
			public Adapter caseDaRec(DaRec object) {
				return createDaRecAdapter();
			}
			@Override
			public Adapter caseDaRepair(DaRepair object) {
				return createDaRepairAdapter();
			}
			@Override
			public Adapter caseDaSurvivability(DaSurvivability object) {
				return createDaSurvivabilityAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaError <em>Da Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaError
	 * @generated
	 */
	public Adapter createDaErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaFault <em>Da Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault
	 * @generated
	 */
	public Adapter createDaFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaFailure <em>Da Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure
	 * @generated
	 */
	public Adapter createDaFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaHazard <em>Da Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard
	 * @generated
	 */
	public Adapter createDaHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation <em>Da Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaErrorPropagation
	 * @generated
	 */
	public Adapter createDaErrorPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaRec <em>Da Rec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaRec
	 * @generated
	 */
	public Adapter createDaRecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaRepair <em>Da Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaRepair
	 * @generated
	 */
	public Adapter createDaRepairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Complex_Data_Types.DaSurvivability <em>Da Survivability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Complex_Data_Types.DaSurvivability
	 * @generated
	 */
	public Adapter createDaSurvivabilityAdapter() {
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

} //Complex_Data_TypesAdapterFactory
