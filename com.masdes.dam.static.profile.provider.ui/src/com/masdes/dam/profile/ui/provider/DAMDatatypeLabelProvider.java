package com.masdes.dam.profile.ui.provider;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.services.labelprovider.service.IFilteredLabelProvider;
import org.eclipse.papyrus.uml.tools.providers.GenericDataTypeLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.edit.providers.DataTypeItemProvider;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

public class DAMDatatypeLabelProvider extends GenericDataTypeLabelProvider implements IFilteredLabelProvider {

	// The image of the UML datatypes
	private static final Image DATATYPE_IMAGE = ExtendedImageRegistry.getInstance().getImage(new DataTypeItemProvider(
			new UMLItemProviderAdapterFactory()).getImage(UMLFactory.eINSTANCE.createDataType()));

	@Override
	public String getText(Object element) {
		EObject dataTypeInstance = EMFHelper.getEObject(element);
		if (dataTypeInstance != null) {
			EClass dataTypeDefinition = dataTypeInstance.eClass();
			StringBuilder builder = new StringBuilder();
			builder.append(dataTypeDefinition.getName());
			builder.append(" (");
			boolean notEmpty = false;
			for (EAttribute eAttribute : dataTypeDefinition.getEAllAttributes()) {
				if (dataTypeInstance.eIsSet(eAttribute)) {
					notEmpty = true;
					builder.append(eAttribute.getName());
					builder.append("=");
					builder.append(dataTypeInstance.eGet(eAttribute).toString());
					builder.append(",");
				}
			}
			if (notEmpty) {
				builder.setLength(builder.length() - 1);
			} else {
				builder.append("<empty>");
			}
			builder.append(")");
			return builder.toString();
		}
		return super.getText(element);
	}
	
	@Override
	public boolean accept(Object element) {
		// Accept elements of the Complex Data Types package of the DAM profile only
		EObject eObject = EMFHelper.getEObject(element);
		if (eObject != null) {
			return Complex_Data_TypesPackage.eNS_URI.equals(eObject.eClass().getEPackage().getNsURI());
		}
		return false;
	}
	
	@Override
	public Image getImage(Object element) {
		return DATATYPE_IMAGE;
	}
}
