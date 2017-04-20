package adsof;

public class Deportiva extends ActividadOcio{
	private double base;
	private double riesgo;
	static double total = 0;
	public Deportiva(String descripcion, double base, double riesgo){
		this.base = base;
		this.riesgo = riesgo;
		this.descripcion = descripcion;
		Deportiva.total += this.precio();
	}
	
	public double extras(){
		return this.riesgo*this.base;
	}
	
	public double precio(){
		return (this.base + (this.base*this.riesgo));
	}
	
	public static double total(){
		return Deportiva.total;
	}
}
