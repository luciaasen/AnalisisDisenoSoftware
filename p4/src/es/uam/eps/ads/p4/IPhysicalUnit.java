/**
 * 
 */
package es.uam.eps.ads.p4;

import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.IMetricSystem;
import es.uam.eps.ads.p4.physical.Quantity;

/**
 * @author lucia
 *
 */
public interface IPhysicalUnit {
	boolean canTransformTo(IPhysicalUnit u);
	double	transformTo(double d, IPhysicalUnit u) throws QuantityException;
	Quantity getQuantity();
	double getCambio();
	String abbrev();
	IMetricSystem getMetricSystem(); // No implementar de momento en este apartado
}
