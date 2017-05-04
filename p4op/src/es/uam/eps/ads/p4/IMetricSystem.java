/**
 * 
 */
package es.uam.eps.ads.p4;

import java.util.*;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.conv.IMetricSystemConverter;

/**
 * @author lucia
 *
 */
public interface IMetricSystem {
	/**
	 * Base del sistema metrico en cuestion
	 * @return unidad de la base
	 */
	IPhysicalUnit base();
	/**
	 * @return Coleccion de unidades del sistema metrico
	 */
	Collection<IPhysicalUnit> units();
	
	IMetricSystemConverter getConverter(IMetricSystem to);
}
