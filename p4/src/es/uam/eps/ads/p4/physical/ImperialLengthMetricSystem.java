package es.uam.eps.ads.p4.physical;

import java.util.ArrayList;
import java.util.Collection;

import es.uam.eps.ads.p4.*;

public class ImperialLengthMetricSystem extends ImperialMetricSystem{
	public static final ImperialLengthMetricSystem SYSTEM = new ImperialLengthMetricSystem();

	public static final PhysicalUnit FOOT = new PhysicalUnit("ft", Quantity.LONGITUD, 1, SYSTEM);
	public static final PhysicalUnit THOU = new PhysicalUnit("th", Quantity.LONGITUD, 1/12000, SYSTEM);
	public static final PhysicalUnit FATHOM = new PhysicalUnit("ftm", Quantity.LONGITUD, 6.08, SYSTEM);
	
	
	/**
	 * Devuelve la base del sistema metrico imperial de longitud
	 * @return foot, base del sImp long
	 */
	@Override
	public PhysicalUnit base(){
		return ImperialLengthMetricSystem.FOOT;
	}
	
	
	/**
	 * @return units, una lista con todas las medidas del sistema imperial de longitud
	 */
	@Override
	public Collection<IPhysicalUnit> units(){
		ArrayList<IPhysicalUnit> c = new ArrayList<IPhysicalUnit> ();
		c.add(ImperialLengthMetricSystem.THOU);
		c.add(ImperialLengthMetricSystem.FATHOM);
		c.add(ImperialLengthMetricSystem.FOOT);
		return c;
	}
}
