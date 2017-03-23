package es.uam.eps.ads.p3.biblioteca.obras;

import java.util.ArrayList;

import es.uam.eps.ads.p3.biblioteca.usuario.Prestamo;
import es.uam.eps.ads.p3.biblioteca.usuario.Usuario;

public class BibliotecaSingleton {
	private static BibliotecaSingleton sBiblioteca;
	private ArrayList<Prestamo> prestamosHistóricos;
	private ArrayList<Usuario> usuarios = new ArrayList();
	private ArrayList<Ejemplar> ejemplares = new ArrayList();
	private ArrayList<Ejemplar> ejemplaresDescatalogados= new ArrayList();
	private ArrayList<Obra> obras= new ArrayList();
	private ArrayList <Obra> obrasDescatalogadas= new ArrayList();
	
	
	/**
	 * Constructor privado, tal y como dicta el patron singleton
	 * @return BibliotecaSingleton
	 */
	private BibliotecaSingleton(){
		
	}
	
	/**
	 * Funcion pública para acceder al singleton
	 * @return el singleton estático
	 */
	public static BibliotecaSingleton getBiblioteca(){
		if (BibliotecaSingleton.sBiblioteca==null){
			sBiblioteca = new BibliotecaSingleton();
			sBiblioteca.prestamosHistóricos = new ArrayList<Prestamo> ();
		}
		
		return sBiblioteca;
	
	}

	/**
	 * Retira de circulacion un ejemplar. Devuele true si la descatalogacion
	 * se ha realizado con éxito y false en caso contrario 
	 * @param ejemplar a descatalogar
	 */
	public boolean retirarEjemplar(Ejemplar ej){
		Ejemplar ejRemove = null;
		
		//Comprobar si esta en ejemplares
		for (Ejemplar e: this.ejemplares){
			if(e.equals(ej)){
				ejRemove=e;
			}
		}
		
		//Comprobar que no este prestado
		if(ejRemove != null){
			for(Prestamo p: Prestamo.getTodosPrestamos()){
				if(p.getEjemplar().equals(ejRemove)){
					ejRemove = null;
					return false;
				}
			}
		}
		
		//Eliminarlo de la lista de ejemplares y descatalogarlo
		if(ejRemove != null){
			this.ejemplares.remove(ejRemove);
			this.ejemplaresDescatalogados.add(ejRemove);
			return true;
		}
		
		return false;
	}
	/**
	 * Retira de circulacion una obra si todos sus ejemplares se encuentran no
	 * prestados y devuelve true. En caso contrario, no realiza descatalogaciones 
	 * y devuelve false
	 * @param obra a retirar
	 * @return
	 */
	public boolean retirarObra(Obra obra){
		boolean bool= true;
		for (Ejemplar ej: obra.getEjemplares()){
			for(Prestamo p: Prestamo.getTodosPrestamos()){
				if(p.getEjemplar().equals(ej)){
					bool=false;
				}
			}
		}
		
		if(bool){
			for (Ejemplar j: obra.getEjemplares()){
				retirarEjemplar(j);
			}
			
			this.obras.remove(obra);
			this.getObrasDescatalogadas().add(obra);
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Prestamo> getPrestamosHistóricos() {
		return prestamosHistóricos;
	}

	public void addPrestamosHistóricos(Prestamo prestamoHistórico) {
		this.prestamosHistóricos.add(prestamoHistórico);
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void addUsuarios (Usuario usuarios) {
		this.usuarios.add(usuarios);
	}

	public ArrayList<Ejemplar> getEjemplares() {
		return ejemplares;
	}

	public void addEjemplares(Ejemplar ejemplares) {
		this.ejemplares.add(ejemplares);
	}

	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void addObras(Obra obras) {
		this.obras.add(obras);
	}

	public ArrayList<Ejemplar> getEjemplaresDescatalogados() {
		return ejemplaresDescatalogados;
	}

	public ArrayList <Obra> getObrasDescatalogadas() {
		return obrasDescatalogadas;
	}



	
	
	

}
