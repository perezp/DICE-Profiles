/**
 */
package es.unizar.disco.dice.Basic_Data_Types.impl;

import es.unizar.disco.dice.Basic_Data_Types.*;

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
public class Basic_Data_TypesFactoryImpl extends EFactoryImpl implements Basic_Data_TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Basic_Data_TypesFactory init() {
		try {
			Basic_Data_TypesFactory theBasic_Data_TypesFactory = (Basic_Data_TypesFactory)EPackage.Registry.INSTANCE.getEFactory(Basic_Data_TypesPackage.eNS_URI);
			if (theBasic_Data_TypesFactory != null) {
				return theBasic_Data_TypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Basic_Data_TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Data_TypesFactoryImpl() {
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
			case Basic_Data_TypesPackage.NFP_PRIVACY: return createNFP_Privacy();
			case Basic_Data_TypesPackage.SCRIPT_TYPE: return createScriptType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Privacy createNFP_Privacy() {
		NFP_PrivacyImpl nfP_Privacy = new NFP_PrivacyImpl();
		return nfP_Privacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptType() {
		ScriptTypeImpl scriptType = new ScriptTypeImpl();
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Data_TypesPackage getBasic_Data_TypesPackage() {
		return (Basic_Data_TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Basic_Data_TypesPackage getPackage() {
		return Basic_Data_TypesPackage.eINSTANCE;
	}

} //Basic_Data_TypesFactoryImpl
