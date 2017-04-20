package adsof;

import java.util.*;
class Direccion{
	private String calle;
	private int numero;
	private int	codigoPostal;
	
	public Direccion(String calle, int num, int cp) {
		this.calle = calle; this.numero = num; this.codigoPostal = cp;
	}
	@Override public String toString() {
		return this.calle+" "+this.numero+" ("+this.codigoPostal+")";
	}
	// Completar con métodos, si es necesario
	@Override
	public boolean equals(Object o){
		if(this == o)
			return true;
		if(!( o instanceof Direccion)){
			return false;
		}
		Direccion d = (Direccion) o;
		return (this.calle.equals(d.calle) && this.numero == d.numero && this.codigoPostal == d.codigoPostal);
	}
	
	public int hashCode(){
		return this.numero + this.codigoPostal*100 + this.calle.hashCode()*10000000;
	}
	
	public String getDireccion() {
		return this.calle;
	}
	public int getCodigoPostal() {
		return this.codigoPostal;
	}
	public int getNumero(){
		return this.numero;
	}
}
public class RepartoCorreos {
	public static void main(String ...args) {
		Direccion[] direcciones = { new Direccion("San Vicente Ferrer", 37, 28047),
									new Direccion("Barquillo", 3, 28014),
									new Direccion("Alcala", 45, 28014),
									new Direccion("Alcala", 45, 28014),
									new Direccion("San Vicente Ferrer", 35, 28047)
		};
		
		HashSet<Direccion> calles = new HashSet<Direccion> (Arrays.asList(direcciones)); // Completar
		
		System.out.println("Direcciones distintas:\n "+calles);
		// Sólo sale una Direccion C/ Alcalá
		// Completar el Comparator de más abajo
		Comparator<Direccion> comparaCallesYNumero = new Comparator<Direccion>(){
			@Override
			public int compare(Direccion d1, Direccion d2){
				if(d1.getDireccion().compareTo(d2.getDireccion()) == 0){
					return (d1.getNumero() - d2.getNumero());
				}
				return d1.getDireccion().compareTo(d2.getDireccion());
			}
		};
		
		TreeMap<Integer, TreeSet<Direccion>> ordenados = new TreeMap<Integer, TreeSet<Direccion>>(); // Completar
		for (Direccion d : direcciones) {
			if (!ordenados.containsKey(d.getCodigoPostal()))
				ordenados.put(d.getCodigoPostal(), new TreeSet<Direccion>(comparaCallesYNumero));
			ordenados.get(d.getCodigoPostal()).add(d);
		}
		System.out.println("Direcciones por CP y Calle:\n "+ordenados);
	}
}