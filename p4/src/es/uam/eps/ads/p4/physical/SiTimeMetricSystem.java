/**
 * 
 */
package es.uam.eps.ads.p4.physical;

import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.conv.IMetricSystemConverter;

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
	
	/**
	 * Devuelve la base del sistema metrico internacional de tiempo
	 * @return segundo, base del si de tiempo
	 */
	@Override
	public PhysicalUnit base(){
		return SiTimeMetricSystem.SECOND;
	}
	

	/**
	 * @return units, una lista con todas las medidas del sistema internacional de tiempo
	 */
	@Override
	public ArrayList<IPhysicalUnit> units(){
		ArrayList<IPhysicalUnit> c = new ArrayList<IPhysicalUnit> ();
		c.add(SiTimeMetricSystem.SECOND);
		c.add(SiTimeMetricSystem.MILISECOND);
		c.add(SiTimeMetricSystem.HOUR);
		return c;
	}


	@Override
	public IMetricSystemConverter getConverter(IMetricSystem to) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void registerReverse(IMetricSystemConverter conv) {
		// TODO Auto-generated method stub
		
	}
}
