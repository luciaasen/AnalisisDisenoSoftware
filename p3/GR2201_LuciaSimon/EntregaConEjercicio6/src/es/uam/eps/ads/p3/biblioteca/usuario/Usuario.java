package es.uam.eps.ads.p3.biblioteca.usuario;

/*¿Este import ha aparecido solo o q?*/
//import static es.uam.eps.ads.p3.tester.DatosPruebas.u4;
import java.util.ArrayList;

import es.uam.eps.ads.p3.biblioteca.obras.BibliotecaSingleton;


public abstract class Usuario {
	protected String nombre;
	protected ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	/*prestamos simultaneos permitidos actualmente*/
	protected int ps;
	
	public int getPs(){
		return ps;
	}
	
	/**
	 * Constructor de usuario
	 * @param nombre
	 */
	public Usuario(String nombre){
		this.nombre = nombre;
		BibliotecaSingleton.getBiblioteca().addUsuarios(this);
	}
	
	/**
	 * Getter del username
	 * @return
	 */
	public String getNombre(){
		return this.nombre;
	}
	
	/**
	 * Obtiene la lista de todos los prestamos de un usuario
	 * @return Lista de todos los prestamos de un usuario
	 */
	public ArrayList<Prestamo> getPrestamos(){
		return prestamos;
		
	}
	
	/**
	 * Aniade prestamo a la lista del usuario
	 * @param prestamo
	 */
	public void anyadirPrestamo(Prestamo prestamo){
		this.prestamos.add(prestamo);
		int numP = prestamo.getEjemplar().getObra().getNumPrestamos() + 1;
		prestamo.getEjemplar().getObra().setNumPrestamos(numP);
		Prestamo.getTodosPrestamos().add(prestamo);
	}
	
	
	/**
	 * Devuelve un prestamo, eliminandolo de la lista del usuario
	 * @param prestamo
	 */
	public void eliminarPrestamo(Prestamo prestamo){
		if(this.prestamos != null){
			if(this.prestamos.contains(prestamo)){
				this.prestamos.remove(prestamo);
				Prestamo.getTodosPrestamos().remove(prestamo);
			}
		}else{
			System.out.println("No tenias ese prestamo en tu perfil");
		}
	}

	
	public void sancionarPorRetraso(int dias){
		return;
	}
	
	public void eliminarSancion(){
		return;
	}
	
	/**
	 * Devuelve String con la informacion del usuario
	 */
	@Override
	public String toString(){
		return this.nombre;
	}
}
