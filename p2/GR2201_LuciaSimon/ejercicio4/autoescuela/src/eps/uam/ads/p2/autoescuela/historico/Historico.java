/**
 * @author lucia asencio
 */
package eps.uam.ads.p2.autoescuela.historico;
import eps.uam.ads.p2.autoescuela.fecha.Fecha;
import eps.uam.ads.p2.autoescuela.Autoescuela;

/**
 * Clase para guardar la historia de un profesor en cada autoescuela en la que trabajo
 * @author lucia
 *
 */

public class Historico {
	private Autoescuela autoescuela;
	private Fecha fechaIni;
	private Fecha fechaEnd;
	
	/**
	 * constructor de la clase historico
	 * @param a
	 * @param ini
	 */
	public Historico(Autoescuela a, Fecha ini){
		this.autoescuela = a;
		this.fechaIni = ini;
		this.fechaEnd = null;
	}
	
	/**
	 * getter de la fecha inicial del historico de profesor
	 * @return fechaIni
	 */
	public Fecha getIni(){
		return this.fechaIni;
	}
	
	/**
	 * getter de la fecha final del historico del profesor
	 * @return fechaEnd
	 */
	public Fecha getEnd(){
		return this.fechaEnd;
	}
	
	/**
	 * setter de la fecha ini 
	 * @param ini
	 */
	public void setIni(Fecha ini){
		this.fechaIni = ini;
		return;
	}
	
	/**
	 * setter de la fecha final 
	 * @param end
	 */
	public void setEnd(Fecha end){
		this.fechaEnd = end;
		return;
	}
	
	/**
	 * getter de la autoescuela del historico del profesor
	 * @return autoescuela
	 */
	public Autoescuela getAutoescuela(){
		return this.autoescuela;
	}
	
	/**
	 * funcion que comprueba si las fechas ini y end son validas (ini < end)
	 * @return boolean
	 */
	public boolean AreFechasValidas(){
		return fechaIni.masAntiguaQue(fechaEnd);
	}
	
}
