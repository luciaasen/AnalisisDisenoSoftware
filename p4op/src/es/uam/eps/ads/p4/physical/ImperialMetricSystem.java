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

	/**
	 * Devuelve la base del sistema metrico imperial de la quantity de la clase hija
	 * @return base base del sistema metrico imperial
	 */
	@Override
	public  abstract IPhysicalUnit base();
	

	/**
	 * @return units, una lista con todas las medidas del sistema imperial de la quantity de la clase hija
	 */
	@Override
	public abstract Collection<IPhysicalUnit> units();

}
