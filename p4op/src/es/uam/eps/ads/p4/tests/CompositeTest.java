package es.uam.eps.ads.p4.tests;

import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.composite.CompositeUnit;
import es.uam.eps.ads.p4.composite.Operator;
import es.uam.eps.ads.p4.conv.SiLength2ImperialConverter;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.Magnitude;
import es.uam.eps.ads.p4.physical.SiLengthMetricSystem;
import es.uam.eps.ads.p4.physical.SiTimeMetricSystem;
import es.uam.eps.ads.p4.physical.ImperialLengthMetricSystem;

public class CompositeTest {
	public static void main(String[] args) throws QuantityException{
		SiLengthMetricSystem.registerConverter(new SiLength2ImperialConverter());
		
		Magnitude velocSI= new Magnitude(10, (IPhysicalUnit) new CompositeUnit(Operator.DIV, 
		SiLengthMetricSystem.METER, 
		SiTimeMetricSystem.SECOND));
		
		Magnitude velocImp= new Magnitude(0, new CompositeUnit( Operator.DIV, 
		ImperialLengthMetricSystem.MILE, 
		SiTimeMetricSystem.HOUR));
		
		Magnitude velocSI2= new Magnitude(0, new CompositeUnit(Operator.DIV, 
		SiLengthMetricSystem.KILOMETER, 
		SiTimeMetricSystem.HOUR));
		
		System.out.println(velocSI);
		System.out.println(velocImp);
		
		
	}
}
