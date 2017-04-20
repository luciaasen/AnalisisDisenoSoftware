package adsof;
import adsof.*;

public abstract class Elements implements ArbolIterable{
	private String nombre;
	
	public Elements(String nombre){
		this.nombre = nombre;
	}
	public String toString(){
		return this.nombre;
	}
}
