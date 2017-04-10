/**
 * 
 */
package es.uam.eps.ads.p4.physical;

import es.uam.eps.ads.p4.IPhysicalUnit;
import java.util.*;
/**
 * @author lucia
 *
 */
public class SiTimeMetricSystem extends SiMetricSystem{

	public static final SiTimeMetricSystem SYSTEM = new SiTimeMetricSystem();
	
	public static final PhysicalUnit SECOND = new PhysicalUnit("s", Quantity.TIEMPO, 1, SYSTEM);
	public static final PhysicalUnit HOUR = new PhysicalUnit("h", Quantity.TIEMPO, 3600, SYSTEM);
	public static final PhysicalUnit MILISECOND =new PhysicalUnit("ms", Quantity.TIEMPO, 0.001, SYSTEM);
	
	@Override
	public PhysicalUnit base(){
		return SiTimeMetricSystem.SECOND;
	}
	
	@Override
	public Collection<IPhysicalUnit> units(){
		ArrayList<IPhysicalUnit> c = new ArrayList<IPhysicalUnit> ();
		c.add(SiTimeMetricSystem.SECOND);
		c.add(SiTimeMetricSystem.MILISECOND);
		c.add(SiTimeMetricSystem.HOUR);
		return c;
	}
}
