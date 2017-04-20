package adsof;

import java.util.HashMap;

public abstract class VehiculoMotor {
	private String nombre;
	protected double consumoFabrica;
	protected double km;
	private double consumoActual;
	
	
	public static HashMap<String, VehiculoMotor> lista= new HashMap<String, VehiculoMotor>();
	
	// completar
	public VehiculoMotor(String nombre, double consumoFabrica) { // completar contructor
		this.nombre = nombre;
		this.consumoFabrica = consumoFabrica;
		VehiculoMotor.lista.put(this.nombre, this);
	}
	
	public abstract double consumoActual();

	public String toString() { return nombre + " : " + consumoFabrica + " : " + consumoActual(); }
	// añadir métodos nuevos
	
	public static VehiculoMotor get(String nombre){
		if (VehiculoMotor.lista.containsKey(nombre)){
			return VehiculoMotor.lista.get(nombre);
		}
		return null;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o)
			return true;
		if(! (o instanceof VehiculoMotor))
			return false;
		return this.nombre.equals(((VehiculoMotor)o).nombre);
	}
	
	@Override
	public int hashCode(){
		return this.nombre.hashCode();
	}
	
	public void sumarKilometros(int km){
		this.km += km;
	}
}
	