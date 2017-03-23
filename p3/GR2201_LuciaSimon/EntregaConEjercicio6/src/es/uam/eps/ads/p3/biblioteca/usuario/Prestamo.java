package es.uam.eps.ads.p3.biblioteca.usuario;

import es.uam.eps.ads.p3.biblioteca.obras.*;
import es.uam.eps.ads.p3.biblioteca.fechasimulada.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Prestamo {
	
	

	private Usuario usuario;
	private Ejemplar ejemplar;
	private LocalDate vencimiento;
	
	private static int numPrestamosHistoricos=0;
	private static int numPrestamosPendientes =0;
	
	private static ArrayList<Prestamo> todosPrestamos = new ArrayList<Prestamo>();
	
	/**
	 * Constructor del objeto prestamo
	 * @param ejemplar
	 * @param usuario
	 */
	public Prestamo(Ejemplar ejemplar, Usuario usuario){
		this.ejemplar = ejemplar;
		this.usuario = usuario;
		FechaSimulada.avanzar(ejemplar.getObra().plazoPrestamo());
		this.vencimiento = FechaSimulada.getHoy();
		FechaSimulada.avanzar(-ejemplar.getObra().plazoPrestamo());
		
	}
	
	/**
	 * Getter del usuario del prestamo
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return this.usuario;
	}

	/**
	 * Getter del ejemplar de prestamo
	 * @return the ejemplar
	 */
	public Ejemplar getEjemplar() {
		return ejemplar;
	}


	/**
	 * Getter de la fecha de vencimiento
	 * @return the vencimiento
	 */
	public LocalDate getVencimiento() {
		return vencimiento;
	}

	/**
	 * Devuelve el est�tico numero de prestamos historicos
	 * @return
	 */
	public static int numPrestamosHistoricos() {
		return numPrestamosHistoricos;
	}

	/**
	 * Permite modificar el numero estatico de prestamos historicos
	 * @param numPrestamosHistoricos
	 */
	public static void setNumPrestamosHistoricos(int numPrestamosHistoricos) {
		Prestamo.numPrestamosHistoricos = numPrestamosHistoricos;
	}

	
	/**
	 * Devuelve el est�tico numero de prestamos pendientes
	 * @return
	 */
	public static int numPrestamosPendientes() {
		return numPrestamosPendientes;
	}

	/**
	 * Permite modificar el  est�tico numero de prestamos historicos
	 * @param numPrestamosPendientes
	 */
	public static void setNumPrestamosPendientes(int numPrestamosPendientes) {
		Prestamo.numPrestamosPendientes = numPrestamosPendientes;
	}
	/**
	 * Metodo para pasar un prestamo a String
	 * @return String 
	 */
	public String toString(){
		String str = ejemplar.toString() + "prestado a "+ "["+ usuario.toString() + "]" + " hasta " + vencimiento ;
		return str;
	}
	/**
	 * Devuelve la variable estatica de todos los prestamos
	 * @return Lista de prestamos
	 */
	public static ArrayList<Prestamo> getTodosPrestamos() {
		return todosPrestamos;
	}
	
	/**
	 * Premite quitar un prestamo de la lista estatica de prestamos
	 */
	public static void quitarPrestamo(Prestamo p ){
		Prestamo.todosPrestamos.remove(p);
	}

	/**
	 * Devuelve una lista con todos los prestamos cuya fecha de vencimiento coincide con la actual
	 * @return Lista de Prestamos
	 */
	public static ArrayList <Prestamo> conVencimientoHoy(){
		ArrayList<Prestamo> pHoy = new ArrayList<Prestamo>();
		for (Prestamo p : Prestamo.todosPrestamos){
			if(p.getVencimiento().equals(FechaSimulada.getHoy())) {
				pHoy.add(p);
			}
		}
		return pHoy;
	}
	
	/**
	 * Devuelve una lista con todos los prestamos cuya fecha de vencimiento ya ha pasado
	 * @return Lista de Prestamos
	 */
	public static ArrayList<Prestamo> pasadosDeVencimiento(){
		ArrayList<Prestamo> pHoy = new ArrayList<Prestamo>();
		for (Prestamo p : Prestamo.todosPrestamos){
			if(p.getVencimiento().isBefore(FechaSimulada.getHoy())) {
				pHoy.add(p);
			}
		}
		return pHoy;
	}
		
	/**
	 * M�todo an�logo al "devolver" de la clase ejemplar, s�lo que en esta ocasion, se llama desde el prestamo.
	 * Realiza las mismas operaciones: Elimina el prestamo de la lista est�tica de prestamos y de la lista
	 * particular del usuario
	 * @return
	 */
	public boolean devolver(){
		usuario.eliminarPrestamo(this);
		Prestamo.todosPrestamos.remove(this);
		return true;
	}
		
	}
	

