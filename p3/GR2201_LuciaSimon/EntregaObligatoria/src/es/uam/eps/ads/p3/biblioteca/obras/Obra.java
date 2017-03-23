package es.uam.eps.ads.p3.biblioteca.obras;

import java.util.ArrayList;
//import es.uam.eps.ads.p3.biblioteca.obras.*;
//import es.uam.eps.ads.p3.biblioteca.usuario.*;

public abstract class Obra {
	private String titulo;
	private String autor;
	private int anio;
	private ArrayList<Ejemplar> ejemplares = new ArrayList<Ejemplar>();
	protected int numPrestamos;
	
	
	
	/**
	 * Constructor de la clase obra
	 * @param tit
	 * @param aut
	 * @param anio
	 */
	public Obra(String tit, String aut, int anio){
		this.titulo = tit;
		this.autor = aut;
		this.anio = anio;
	}
	/**
	 * Getter del titulo de una obra
	 * @return
	 */
	public String getTitulo(){
		return this.titulo;		
	}	
	/**
	 * Getter del autor de una obra
	 * @return
	 */
	public String getAutor(){
		return this.autor;
	}	
	/**
	 * Getter del anio de una obra
	 * @return
	 */
	public int getAnio(){
		return this.anio;
	}	
	/**
	 * Calcula el plazo de una forma
	 * @return
	 */
	public abstract int plazoPrestamo();
	/**
	 * @return the numPrestamos
	 */
	public int getNumPrestamos() {
		return numPrestamos;
	}
	/**
	 * @param numPrestamos the numPrestamos to set
	 */
	public void setNumPrestamos(int numPrestamos) {
		this.numPrestamos = numPrestamos;
	}	
	/**
	 * Aniade un ejemplar a la obra
	 * @param e
	 */
	public void addEjemplar(Ejemplar e){
		this.ejemplares.add(e);
	}
	/**
	 * Devuelve una cadena con la info de una Obra
	 */
	@Override
	public String toString(){
		return this.titulo + ", de " + this.autor + " (" + this.anio + ") plazo: " + this.plazoPrestamo();
	}
	/* Dos obras iguales si mismo autor y titulo
	 * @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Obra other = (Obra) obj;
		if (autor == null) {
			if (other.autor != null) {
				return false;
			}
		} else if (!autor.equals(other.autor)) {
			return false;
		}
		if (titulo == null) {
			if (other.titulo != null) {
				return false;
			}
		} else if (!titulo.equals(other.titulo)) {
			return false;
		}
		return true;
	}
	
	

}


