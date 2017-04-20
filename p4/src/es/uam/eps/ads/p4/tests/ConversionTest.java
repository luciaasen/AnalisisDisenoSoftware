package es.uam.eps.ads.p4.tests;

import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.conv.SiLength2ImperialConverter;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.ImperialLengthMetricSystem;
import es.uam.eps.ads.p4.physical.Magnitude;
import es.uam.eps.ads.p4.physical.SiLengthMetricSystem;

public class ConversionTest{
	public static void main(String[] args) throws QuantityException{
		Magnitude m = new Magnitude(10, SiLengthMetricSystem.KILOMETER);
		
		IMagnitude enMillas = null;
		
		try{
			enMillas= m.transformTo(ImperialLengthMetricSystem.MILE);
		} catch (QuantityException e){
			System.out.println(e);
		}
		
		SiLengthMetricSystem.registerConverter(new SiLength2ImperialConverter());
		
		enMillas = m.transformTo(ImperialLengthMetricSystem.MILE);
		
		System.out.println("En millas = "+enMillas);
		System.out.println("En m = "+ enMillas.transformTo(SiLengthMetricSystem.METER)); 
	}
}