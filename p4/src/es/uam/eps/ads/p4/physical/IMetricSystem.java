/**
 * 
 */
package es.uam.eps.ads.p4.physical;

import java.util.*;
import es.uam.eps.ads.p4.IPhysicalUnit;

/**
 * @author lucia
 *
 */
public interface IMetricSystem {
	IPhysicalUnit base();
	Collection<IPhysicalUnit> units();
}
