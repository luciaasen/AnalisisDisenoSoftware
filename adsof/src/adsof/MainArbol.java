package adsof;

import adsof.*;

public class MainArbol {
	public static void main(String[] args) {
		UMLPackage j = new UMLPackage("uam");
		UMLPackage u = new UMLPackage("docencia");
		UMLClass al = new UMLClass("Profesor", Privacidad.PUBLIC);
		UMLClass ve = new UMLClass("Asignatura", Privacidad.PUBLIC);
		UMLClass rt = new UMLClass("Utilidades", Privacidad.PACKAGE);
		j.add(u);
		u.add(al);
		u.add(ve);
		u.add(rt);
		PrettyPrinter.imprime(j, " ");
	}
}