package es.uam.eps.ads.p4.physical;

import java.util.ArrayList;
import java.util.Collection;

import es.uam.eps.ads.p4.IPhysicalUnit;

public class ImperialLengthMetricSystem extends ImperialMetricSystem{
	public static final ImperialLengthMetricSystem SYSTEM = new ImperialLengthMetricSystem();

	public static final PhysicalUnit FOOT = new PhysicalUnit("ft", Quantity.LONGITUD, 1, SYSTEM);
	public static final PhysicalUnit THOU = new PhysicalUnit("th", Quantity.LONGITUD, 1/12000, SYSTEM);
	public static final PhysicalUnit FATHOM = new PhysicalUnit("ftm", Quantity.LONGITUD, 6.08, SYSTEM);
	
	@Override
	public PhysicalUnit base(){
		return ImperialLengthMetricSystem.FOOT;
	}
	
	@Override
	public Collection<IPhysicalUnit> units(){
		ArrayList<IPhysicalUnit> c = new ArrayList<IPhysicalUnit> ();
		c.add(ImperialLengthMetricSystem.THOU);
		c.add(ImperialLengthMetricSystem.FATHOM);
		c.add(ImperialLengthMetricSystem.FOOT);
		return c;
	}
}
