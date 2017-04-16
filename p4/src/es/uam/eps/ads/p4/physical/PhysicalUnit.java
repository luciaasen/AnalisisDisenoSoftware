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
	
	public PhysicalUnit(String abbrev, Quantity quantity, double cambio, IMetricSystem s){
		this.abbrev = abbrev;
		this.quantity = quantity;
		this.cambio = cambio;
		this.system = s;
	}
	
	public boolean canTransformTo(IPhysicalUnit u){
		return this.getMetricSystem() == u.getMetricSystem();
	}
	
	public double transformTo(double d, IPhysicalUnit u) throws QuantityException{
		if (this.canTransformTo(u) == false){
			throw new QuantityException(this, u);
		}
		
		return d*this.cambio/u.getCambio();
	}
	
	public IMetricSystem getMetricSystem(){
		return this.system;
	}

	public Quantity getQuantity(){
		return this.quantity;
	}
	
	public String abbrev(){
		return this.abbrev;
	}
	
	public double getCambio(){
		return this.cambio;
	}
	
	@Override
	public String toString(){
		return this.abbrev + " " + this.quantity;
	}

}
