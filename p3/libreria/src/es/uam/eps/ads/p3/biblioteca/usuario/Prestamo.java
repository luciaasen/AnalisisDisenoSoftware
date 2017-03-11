package es.uam.eps.ads.p3.biblioteca.usuario;

import es.uam.eps.ads.p3.biblioteca.obras.*;
import es.uam.eps.ads.p3.biblioteca.fechasimulada.*;
import java.time.LocalDate;

public class Prestamo {
	
	

	private Usuario usuario;
	private Ejemplar ejemplar;
	private LocalDate vencimiento;
	
	public Prestamo(Ejemplar ejemplar, Usuario usuario){
		this.ejemplar = ejemplar;
		this.usuario = usuario;
		FechaSimulada.avanzar(ejemplar.getObra().getPlazo());
		this.vencimiento = FechaSimulada.getHoy();
		
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
	
}
