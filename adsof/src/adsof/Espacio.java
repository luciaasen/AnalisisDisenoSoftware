package adsof;

public class Espacio {
	String nombre;
	protected int capacidad;
	public Espacio(int c) { capacidad = c; }
	public String reservar(String usuario) { return usuario + " reserva:" + nombre; }
}
