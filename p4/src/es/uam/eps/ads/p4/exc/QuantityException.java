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
	

	public QuantityException(IPhysicalUnit from, IPhysicalUnit to){
		this.from = from;
		this.to = to;
	}
	
	@Override
	public String toString(){
		return "Quantities " + this.from.getQuantity() + " and " + this.to.getQuantity() + " are not compatible";
	}
}
