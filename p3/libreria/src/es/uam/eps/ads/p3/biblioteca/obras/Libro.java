package es.uam.eps.ads.p3.biblioteca.obras;
import es.uam.eps.ads.p3.biblioteca.obras.Obra;

public class Libro extends Obra{
	
	private String editorial;
	private int edicion;
	
	/**
	 * Constructor de Libro cuando se omiten editorial y edicion
	 * @param tit
	 * @param aut
	 * @param anio
	 */
	public Libro(String tit, String aut, int anio){
		super(tit, aut, anio);
	}
	
	/**
	 * Constructor de Libro que configura editorial y edicion
	 * @param tit
	 * @param aut
	 * @param anio
	 * @param edit
	 * @param edic
	 */
	public Libro(String tit, String aut, int anio, String edit, int edic){
		super(tit, aut, anio);
		this.setEdicion(edic);
		this.setEditorial(edit); 
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	/**
	 * @return the edicion
	 */
	public int getEdicion() {
		return edicion;
	}

	/**
	 * @param edicion the edicion to set
	 */
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	/**
	 * Calcula el plazo segun el enunciado
	 * @return
	 */
	public int getPlazo(){
		
		/*TODO Controla que la div es realmente el entero que buscas: 3/10 = 0, 11/20 = 1*/
		int plazo = 25 - (super.numPrestamos/10);
		if(plazo < 7){
			plazo = 7;
		}
		return plazo;
	}
	
	/**
	 * Devuelve String con la informacion del Libro
	 */
	@Override
	public String toString(){
		return "L: " + super.toString();
	}

}
