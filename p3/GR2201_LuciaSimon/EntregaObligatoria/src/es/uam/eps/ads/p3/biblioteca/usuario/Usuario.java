package es.uam.eps.ads.p3.biblioteca.usuario;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public abstract class Usuario {
	protected String nombre;
	protected ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	/*prestamos simultaneos permitidos actualmente*/
	protected int ps;
	
	/**
	 * Getter de los prestamos que puede obtener un usuario
	 * @return
	 */
	public int getPs(){
		return ps;
	}
	
	/**
	 * Constructor de usuario
	 * @param nombre
	 */
	public Usuario(String nombre){
		this.nombre = nombre;
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
	public List<Prestamo> getPrestamos(){
		List<Prestamo> prest=  prestamos;
        List<Prestamo> prest2=  Collections.unmodifiableList(prest);
        return prest2;

		
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

	/**
	 * Metodo abstracto para sancionar a usuario
	 * @param dias
	 */
	public abstract void sancionarPorRetraso(int dias);
	
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
