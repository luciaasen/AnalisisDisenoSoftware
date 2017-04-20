package es.uam.eps.ads.p4.physical;

import java.util.ArrayList;
import java.util.Collection;

import es.uam.eps.ads.p4.IPhysicalUnit;

public class SiLengthMetricSystem extends SiMetricSystem{
	
	public static final SiLengthMetricSystem SYSTEM = new SiLengthMetricSystem();

	public static final PhysicalUnit METER = new PhysicalUnit("m", Quantity.LONGITUD, 1, SYSTEM);
	public static final PhysicalUnit KILOMETER = new PhysicalUnit("km", Quantity.LONGITUD, 1000, SYSTEM);
	public static final PhysicalUnit MILIMETER =new PhysicalUnit("mm", Quantity.LONGITUD, 0.001, SYSTEM);
	
	
	/**
	 * Devuelve la base del sistema metrico internacional de longitud
	 * @return meter, base del si long
	 */
	@Override
	public PhysicalUnit base(){
		return SiLengthMetricSystem.METER;
	}
	

	/**
	 * @return units, una lista con todas las medidas del sistema internacional de longitud
	 */
	@Override
	public Collection<IPhysicalUnit> units(){
		ArrayList<IPhysicalUnit> c = new ArrayList<IPhysicalUnit> ();
		c.add(SiLengthMetricSystem.MILIMETER);
		c.add(SiLengthMetricSystem.KILOMETER);
		c.add(SiLengthMetricSystem.METER);
		return c;
	}
}
