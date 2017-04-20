package es.uam.eps.ads.p4.tests;

import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.*;

public class MagnitudeTest {
	
	public static void main(String[] args) throws QuantityException{
		IMagnitude m = new Magnitude(12.5, SiLengthMetricSystem.KILOMETER);
		Magnitude m2 = new Magnitude(12.5, SiLengthMetricSystem.METER);
		Magnitude m3 = (Magnitude)m.transformTo(SiLengthMetricSystem.METER);
		Magnitude s1 = new Magnitude(65, SiTimeMetricSystem.SECOND);
		Magnitude s2 = new Magnitude(1, SiTimeMetricSystem.HOUR);
		Magnitude s3 = (Magnitude)s2.transformTo(SiTimeMetricSystem.SECOND);
		
		/*
		 * Realizamos operaciones validas:
		 * 	encadenacion,
		 * 	suma en longitud y en tiempo,
		 * 	resta en longitud y en tiempo,
		 * comprobamos que trannsf ok (magn - magn transformada = 0)
		 *  	
		 */
		System.out.println(m + " " + m2 + " " + m3);
		System.out.println(m2.add(m));
		System.out.println(m.subs(m2).add(m2));		
		System.out.println(m3.subs(m));
		System.out.println(s1.add(s2));
		System.out.println(s3.subs(s2));
		
		
		/*Buscamos fallos:
		 *  transformando entre unidades de diferente sistema
		 *  operando entre unidades del mismo sistema
		 */
		
		try{
			Magnitude s4 = (Magnitude)m.transformTo(SiTimeMetricSystem.SECOND);
		} catch(QuantityException q) {
			System.out.println(q);			
		}
		try {
			System.out.println(s1.add(m));
		} catch (QuantityException q) {
			System.out.println(q);
		}
	}
}