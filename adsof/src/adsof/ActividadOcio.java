package adsof;

public abstract class ActividadOcio {
	protected String descripcion;
	
	public abstract double extras();
	public abstract double precio();
	
	public String toString(){
		return this.descripcion;
	}
}
