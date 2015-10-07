# Plugin org.eclipse.uml2.uml - Patched version 

This patched version eases the generation of profiles based on Papyrus MARTE.

Datatypes in MARTE are are handled as `Strings` in the low-level Ecore metamodel.

Using the normal *UML2Ecore* transformation, complex datatypes (such as those defined in MARTE/DAM) are transformed to *EClasses* with *EAttributes*; and UML properties declared with these types are transformed to containment *EReferences*.
However, MARTE overrides this representation.

The *UML2Ecore* transformation requires modifications in the `org.eclipse.uml2.uml` plugin to generate a valid Ecore file (see http://dev.eclipse.org/mhonarc/lists/mdt-papyrus.dev/msg01269.html, http://dev.eclipse.org/mhonarc/lists/mdt-papyrus.dev/msg01253.html)

Specifically, modifications are required in the file `UMLUtil.java`, method `boolean isEDataType(Namespace namespace)`.
We use the following code, that defines that properties of types defined in package `MARTE_Library`, or subtypes of them, are converted into `EAttributes` on the corresponding Ecore file implementing the profile.
Other types of properties are converted into containment `EReferences`:

	@Override
	public Boolean caseDataType(DataType dataType) {
		// MARTE Patch, see:
		// http://dev.eclipse.org/mhonarc/lists/mdt-papyrus.dev/msg01269.html
		// http://dev.eclipse.org/mhonarc/lists/mdt-papyrus.dev/msg01253.html
		// TODO: Consider checking EClass and EDataType prototype information from the Ecore profile
		//
		// Check if the datatype is directly defined by MARTE
		if (isDefinedInMarteLibrary(dataType)) {
			return Boolean.FALSE;
		}
		// Check if the datatype inherits from a datatype defined in MARTE
		for (Classifier classifier : dataType.getGenerals()) {
			if (isDefinedInMarteLibrary(classifier)) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	private boolean isDefinedInMarteLibrary(Classifier classifier) {
		Package pkg = classifier.getNearestPackage();
		while (pkg != null) {
			if ("MARTE_Library".equals(pkg.getQualifiedName())) {
				return true;
			}
			pkg = pkg.getNestingPackage();
		}
		return false;
	}