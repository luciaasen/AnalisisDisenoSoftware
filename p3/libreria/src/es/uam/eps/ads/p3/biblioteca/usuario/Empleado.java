package es.uam.eps.ads.p3.biblioteca.usuario;

public class Empleado extends Usuario{

	private double sancion;
	
	/**
	 * Constructor de la clase empleado
	 * @param nombre
	 */
	public Empleado(String nombre){
		super(nombre);
	}
	
	/**
	 * Si es posible, aniade un prestamo al empleadp
	 * @param prestamo
	 */
	public void anyadirPrestamo(Prestamo prestamo){
		if(super.prestamos != null){
			if(super.prestamos.size() >= 20){
				System.out.println("Ya has alcanzado tu limite de prestamos simultaneos");
			}else{
				super.anyadirPrestamo(prestamo);
			}
		}else{
			super.anyadirPrestamo(prestamo);
		}
	}
		
	/**
	 * Aniade a la sancion previa la correspondiente a dias
	 * @param dias
	 */
	public void sancionarPorRetraso(int dias){
		if(dias > 4){
			this.sancion += 2.5 * dias;
		}
	}
	
	/**
	 * Pone el acumulador de sanciones a cero
	 */
	public void eliminarSancion(){
		this.sancion = 0;
	}
	
	/**
	 * Devuelve String con nombre y sancion del empleado
	 */
	@Override
	public String toString(){
			String s = "E: " + super.nombre ;
			if(this.sancion > 0){
				s += ". Sancion acumulada: " + this.sancion;
			}
			return s;
	}
}
