/**
 */
package com.masdes.dam.Redundancy.impl;

import com.masdes.dam.Redundancy.*;

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
public class RedundancyFactoryImpl extends EFactoryImpl implements RedundancyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RedundancyFactory init() {
		try {
			RedundancyFactory theRedundancyFactory = (RedundancyFactory)EPackage.Registry.INSTANCE.getEFactory(RedundancyPackage.eNS_URI);
			if (theRedundancyFactory != null) {
				return theRedundancyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RedundancyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancyFactoryImpl() {
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
			case RedundancyPackage.DA_CONTROLLER: return createDaController();
			case RedundancyPackage.DA_VARIANT: return createDaVariant();
			case RedundancyPackage.DA_ADJUDICATOR: return createDaAdjudicator();
			case RedundancyPackage.DA_REDUNDANT_STRUCTURE: return createDaRedundantStructure();
			case RedundancyPackage.DA_SPARE: return createDaSpare();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaController createDaController() {
		DaControllerImpl daController = new DaControllerImpl();
		return daController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaVariant createDaVariant() {
		DaVariantImpl daVariant = new DaVariantImpl();
		return daVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaAdjudicator createDaAdjudicator() {
		DaAdjudicatorImpl daAdjudicator = new DaAdjudicatorImpl();
		return daAdjudicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRedundantStructure createDaRedundantStructure() {
		DaRedundantStructureImpl daRedundantStructure = new DaRedundantStructureImpl();
		return daRedundantStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaSpare createDaSpare() {
		DaSpareImpl daSpare = new DaSpareImpl();
		return daSpare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancyPackage getRedundancyPackage() {
		return (RedundancyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RedundancyPackage getPackage() {
		return RedundancyPackage.eINSTANCE;
	}

} //RedundancyFactoryImpl
