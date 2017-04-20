package adsof;
import adsof.Espacio;


class Aula extends Espacio {
	private boolean audiovisuales;
	public Aula(String nombre, int capacidad) {
	super(capacidad);
	audiovisuales = true;
	}
	public void anular() {
		System.out.println(super.nombre + " con capacidad " + capacidad);
	}
	protected boolean reservar() { return true; }
}
public class Examen2 {
	public static void main(String[] args) {
		Espacio e1, e2;
		e1 = new Espacio(2);
		e2 = new Aula("Aula2", 26);
		//System.out.println(e2.audiovisuales);
		System.out.println(e1.reservar("Jose"));
		//e1.anular();
		System.out.println(((Aula) e2).reservar());
	}
}