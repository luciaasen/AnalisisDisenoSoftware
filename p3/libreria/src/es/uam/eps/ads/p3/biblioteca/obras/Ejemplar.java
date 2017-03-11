package es.uam.eps.ads.p3.biblioteca.obras;

public class Ejemplar {
	private Obra obra;
	
	/**
	 * Constructor del Ejemplar
	 * @param ob
	 */
	public Ejemplar(Obra ob){
		this.obra = ob;
	}
	
	/**
	 * Getter de la obra del ejemplar
	 * @return
	 */
	public Obra getObra(){
		return this.obra;
	}
	
	/**
	 * Setter de la obra del ejemplar
	 * @param ob
	 */
	public void setObra(Obra ob){
		this.obra = ob;
	}
	
}
