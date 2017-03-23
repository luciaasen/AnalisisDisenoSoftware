package es.uam.eps.ads.p3.biblioteca.obras;


public class Pelicula extends Obra{
	
	private Genero genero;
	
	
	/**
	 * Constructor de pelicula
	 * @param tit
	 * @param aut
	 * @param anio
	 * @param genero
	 */
	public Pelicula(String tit, String aut, int anio, Genero genero) {
		super(tit, aut, anio);
		this.genero = genero;
	}

	/**
	 * Devuelve el genero de una pelicula
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Cambia el genero de una pelicula
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	/**
	 * Devuelve el plazo de prestamo
	 * @return
	 */
	public int plazoPrestamo(){
		return 2;
	}
	
	/**
	 * Devuelve una cadena con la info de una Pelicula
	 */
	@Override
	public String toString(){
		return "P: " + super.toString();
	}

	
	
}
