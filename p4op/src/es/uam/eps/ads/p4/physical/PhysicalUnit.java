/**
 * 
 */
package es.uam.eps.ads.p4.physical;

import es.uam.eps.ads.p4.*;
import es.uam.eps.ads.p4.physical.Quantity;
import es.uam.eps.ads.p4.exc.QuantityException;

/**
 * @author lucia
 *
 */
public class PhysicalUnit  implements IPhysicalUnit{
	String abbrev;
	Quantity quantity;
	double cambio;
	private IMetricSystem system;
	
	/**
	 * Constructor de physical unit
	 * @param abbrev abreviatura de ña unidad
	 * @param quantity tipo de la unidad
	 * @param cambio cambio a la base
	 * @param s sistema metrico al que pertenece
	 */
	public PhysicalUnit(String abbrev, Quantity quantity, double cambio, IMetricSystem s){
		this.abbrev = abbrev;
		this.quantity = quantity;
		this.cambio = cambio;
		this.system = s;
	}
	
	/**
	 * Indica si una unidad se puede transformar a otra
	 * @return true sis e puede transformar, else false
	 */
	public boolean canTransformTo(IPhysicalUnit u){
		return this.getMetricSystem() == u.getMetricSystem();
	}
	
	/**
	 * Transforma d unidades de tipo this al tipo u
	 * @param d cantidad a tranformar
	 * @param u unidad a la que transformar
	 * @return cantidad transformada si ha sido posible
	 */
	public double transformTo(double d, IPhysicalUnit u) throws QuantityException{
		if (this.canTransformTo(u) == false){
			throw new QuantityException(this, u);
		}
		
		return d*this.cambio/u.getCambio();
	}
	
	/**
	 * Getter del sistema metrico
	 * @return sistema metrico de la unidad
	 */
	public IMetricSystem getMetricSystem(){
		return this.system;
	}

	/**
	 * Getter de la quantity
	 * @return tipo de quantity de la unidad
	 */
	public Quantity getQuantity(){
		return this.quantity;
	}
	
	/**
	 * Getter de la abreviatura
	 * @return abreviatura de la unidad
	 */
	public String abbrev(){
		return this.abbrev;
	}
	
	/**
	 * Getter del cambio a la base
	 * return double el cambio a la base
	 */
	public double getCambio(){
		return this.cambio;
	}
	
	@Override
	public String toString(){
		return this.abbrev + " " + this.quantity;
	}

}
