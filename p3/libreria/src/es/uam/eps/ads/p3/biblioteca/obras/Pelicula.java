package es.uam.eps.ads.p3.biblioteca.obras;


public class Pelicula extends Obra{
	
	private Genero genero;
	
	public Pelicula(String tit, String aut, int anio, Genero genero) {
		super(tit, aut, anio);
		this.genero = genero;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	/**
	 * Calcula el plazo de una forma
	 * @return
	 */
	public int getPlazo(){
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
