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
public abstract class SiMetricSystem extends MetricSystem {
	
	/**
	 * Devuelve la base del sistema metrico internacional de la quantity de la clase hija
	 * @return base del sistema metrico
	 */
	@Override
	public abstract IPhysicalUnit base();
	
	/**
	 * @return units, una lista con todas las medidas del sistema internacional de la quantity de la clase hija
	 */
	@Override
	public abstract Collection<IPhysicalUnit> units();


}
