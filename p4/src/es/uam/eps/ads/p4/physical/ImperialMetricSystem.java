/**
 * 
 */
package es.uam.eps.ads.p4.physical;

import java.util.Collection;

import es.uam.eps.ads.p4.IPhysicalUnit;

/**
 * @author lucia
 *
 */
public abstract class ImperialMetricSystem extends MetricSystem{

	@Override
	public abstract IPhysicalUnit base();
	
	@Override
	public abstract Collection<IPhysicalUnit> units();

}
