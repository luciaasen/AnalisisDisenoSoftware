package es.uam.eps.ads.p4.physical;

import java.util.ArrayList;
import java.util.Collection;

import es.uam.eps.ads.p4.*;
import es.uam.eps.ads.p4.conv.IMetricSystemConverter;

public class ImperialLengthMetricSystem extends ImperialMetricSystem{
	public static final ImperialLengthMetricSystem SYSTEM = new ImperialLengthMetricSystem();

	public static final PhysicalUnit MILE = new PhysicalUnit("ml", Quantity.LONGITUD, 5280, SYSTEM);
	public static final PhysicalUnit FOOT = new PhysicalUnit("ft", Quantity.LONGITUD, 1, SYSTEM);
	public static final PhysicalUnit THOU = new PhysicalUnit("th", Quantity.LONGITUD, 1/12000, SYSTEM);
	public static final PhysicalUnit FATHOM = new PhysicalUnit("ftm", Quantity.LONGITUD, 6.08, SYSTEM);
	
	static ArrayList<IMetricSystemConverter> converters= new ArrayList<>();
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
	public ArrayList<IPhysicalUnit> units(){
		ArrayList<IPhysicalUnit> c = new ArrayList<IPhysicalUnit> ();
		c.add(ImperialLengthMetricSystem.THOU);
		c.add(ImperialLengthMetricSystem.FATHOM);
		c.add(ImperialLengthMetricSystem.FOOT);
		c.add(ImperialLengthMetricSystem.MILE);
		return c;
	}


	@Override
	public IMetricSystemConverter getConverter(IMetricSystem to) {
		for(IMetricSystemConverter conv: SiLengthMetricSystem.converters ){
			if(to.base().equals(conv.targetSystem().base())){
				return conv;
			}
		}
		return null;
	}
	
	public static void registerConverter(IMetricSystemConverter conv){
		SiLengthMetricSystem.converters.add(conv);
		((MetricSystem)conv.targetSystem()).registerReverse(conv.reverse());
	}
	
	public void registerReverse(IMetricSystemConverter conv){
		SiLengthMetricSystem.converters.add(conv);
	}
}
