package es.uam.eps.ads.p3.biblioteca.usuario;

import es.uam.eps.ads.p3.biblioteca.fechasimulada.FechaSimulada;
import java.time.temporal.ChronoUnit;

public class Publico extends Usuario{
	
	/*prestamos simultaneos inicial*/
	private static final int psInicial = 2;
	
	/*prestamos para bonificacion */
	private int ppb;
	
	
	
	/**
	 * Constructor de un usuario publico
	 * @param nombre
	 */
	public Publico(String nombre){
		super(nombre);
		this.ps = Publico.psInicial;
		this.ppb=0;
	}
	
	/**
	 * Aniade un prestamo, si es posible, a los prestamos del usuario. Incrementa ppb
	 * y actualiza ps
	 */
	public void anyadirPrestamo(Prestamo prestamo){
		if(super.prestamos != null){
			if(super.prestamos.size() >= this.ps){
				System.out.println("Ya has alcanzado tu limite de prestamos simultaneos");
			}else{
				this.ppb ++;
				if (this.ppb > this.ps){
					this.ps++;
					/*Yo aqui pondria this.ppb = 0; pero la respuesta esperada implica que es 1*/
					this.ppb = 1;
				}
				super.anyadirPrestamo(prestamo);
				
			}
		}
	}
	
	/**
	 * Elimina prestamo del publico (y de la obra correspondiente)
	 * Si la devolucion se hace a tiempo, se recalcula los ppb y los ps. Si no, se sanciona
	 * @param prestamo
	 */
	
	@Override
	public void eliminarPrestamo(Prestamo prestamo){
		if (FechaSimulada.getHoy().isBefore(prestamo.getVencimiento()) || FechaSimulada.getHoy().isEqual(prestamo.getVencimiento())){
			
		}else{
			long dias = ChronoUnit.DAYS.between(prestamo.getVencimiento(),FechaSimulada.getHoy());
			this.sancionarPorRetraso((int)dias);
		}
		super.eliminarPrestamo(prestamo);
	}

	/**
	 * Decrementa en 'dias' el numero de prestamos para bonificacion del publico, sin dejarlo bajo cero.
	 * Reestablece el numero de prestamos simultaneos al inicial
	 * @param dias
	 */
	public void sancionarPorRetraso(int dias){
		/*Si this.ppb queda por debajo de cero, lo pongo a cero*/
		this.ppb -= dias;
		if (this.ppb < 0){
			this.ppb = 0;
		}
		this.ps = Publico.psInicial;
	}
	
	/**
	 * Devuelve String con nombre y sancion del publico
	 */
	@Override
	public String toString(){
			return "P: " + super.nombre + ", ppb: " + this.ppb + ", ps: " + this.ps;
			
	}
}
