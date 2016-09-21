# DAM Profile - Generation notes 

The DAM profile relies on MARTE.
As the MARTE profile does, most of the datatypes defined in DAM are handled as `Strings` in the low-level Ecore metamodel.
Datatypes are conceptually defined in the `DAM_Library.uml` model.
The file `DAM_Library.ecore` defines the actual datatypes (i.e., `Strings` or `EClasses` depending on the case).

Using the normal *UML2Ecore* transformation, complex datatypes (such as those defined in MARTE/DAM) are transformed to *EClasses* with *EAttributes*; and UML properties declared with these types are transformed to containment *EReferences*.
However, MARTE overrides this representation.
In this implementation of the DAM profile, basic *DataTypes* (that inherit from MARTE) have been implemented as *PrimitiveTypes* with the prototype *EDataType*. So that, the *instanceClassName* can be set to `java.lang.String`.
This avoids creating the datatypes as `Strings` manually in the `DAM_Library.ecore` file.

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
    
Additionally, for the generation of the classes `com.masdes.dam.DAM.DAMFactory` and `com.masdes.dam.DAM.DAMPackage`, a dummy enumeration has been manually added in `DAM.ecore`.
These classes (`DAMFactory`and `DAMPackage`) are needed to register the DAM profile in the extension points used in `plugin.xml`.

Finally, to avoid compilation errors in the generation of the Java code for the profile it is necessary to disable the generation of *EOperations* (i.e. set `Operation Reflection` to `false` in DAM.genmodel).