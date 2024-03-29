/**
 * @author lucia asencio
 */
package eps.uam.ads.p2.autoescuela.tester;
import eps.uam.ads.p2.autoescuela.fecha.Fecha;
import eps.uam.ads.p2.autoescuela.Autoescuela;
import eps.uam.ads.p2.autoescuela.persona.Profesor;



/**
 * Clase para testear el ejercicio 4
 * @author lucia
 *
 */
public class Test {
	
	/**
	 * main que imprime la antiguedad de un profesor en diversas autoescuelas
	 * @param args
	 */
	public static void main(String[] args){
		Autoescuela a1 = new Autoescuela(001, "Calle Cuchara nº2, Madrid", "Pepe");
		Autoescuela a2 = new Autoescuela(002, "Calle Tenedor nº2, Madrid", "Luis");
		Autoescuela a3 = new Autoescuela(003, "Calle Cuchillo nº2, Madrid", "Javier");
		Profesor p1 = new Profesor(12345, "Pedro", "Gomez", 675453267, "237856");
		Fecha f1 = new Fecha(5, 5, 2005);
		Fecha f2 = new Fecha(6, 6, 2006);
		Fecha f3 = new Fecha(7, 7, 2007);
		p1.primerTrabajo(a1, f1);
		p1.cambiaAutoescuela(a2, f2);
		p1.cambiaAutoescuela(a3, f3);
		
		p1.printAntiguedad(a1);
		p1.printAntiguedad(a2);
		p1.printAntiguedad(a3);
		
		return;
	}
}
