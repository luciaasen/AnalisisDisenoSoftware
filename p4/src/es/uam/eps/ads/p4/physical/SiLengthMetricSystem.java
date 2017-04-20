package es.uam.eps.ads.p4.physical;

import java.util.ArrayList;
import java.util.Collection;

import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.conv.IMetricSystemConverter;

public class SiLengthMetricSystem extends SiMetricSystem{
	
	static ArrayList<IMetricSystemConverter> converters= new ArrayList<>();
	
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
	public ArrayList<IPhysicalUnit> units(){
		ArrayList<IPhysicalUnit> c = new ArrayList<IPhysicalUnit> ();
		c.add(SiLengthMetricSystem.MILIMETER);
		c.add(SiLengthMetricSystem.KILOMETER);
		c.add(SiLengthMetricSystem.METER);
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


	@Override
	public void registerReverse(IMetricSystemConverter conv) {
		SiLengthMetricSystem.converters.add(conv);
		
	}
}
