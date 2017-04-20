/**
 * 
 */
package es.uam.eps.ads.p4.exc;

import es.uam.eps.ads.p4.IPhysicalUnit;

/**
 * @author lucia
 *
 */
public class QuantityException extends Exception {
	private IPhysicalUnit from;
	private IPhysicalUnit to;
	

	/**
	 * Constructor de QuantityException
	 * @param from unidad desde la que se intenta convertr
	 * @param to unidad a la que se intenta convertir
	 */
	public QuantityException(IPhysicalUnit from, IPhysicalUnit to){
		this.from = from;
		this.to = to;
	}
	
	@Override
	public String toString(){
		if(from.getQuantity().equals(to.getQuantity())){
			return "Cannot convert " +from.abbrev() + " " + from.getQuantity() + " to " + to.abbrev() + " "+ to.getQuantity();
		}
		return "Quantities " + this.from.getQuantity() + " and " + this.to.getQuantity() + " are not compatible";
	}
}
