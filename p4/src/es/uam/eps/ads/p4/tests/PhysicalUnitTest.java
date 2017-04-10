package es.uam.eps.ads.p4.tests;

import es.uam.eps.ads.p4.*;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.*;

public class PhysicalUnitTest {
	public static void main(String[] args) throws QuantityException {
		IPhysicalUnit meter = SiLengthMetricSystem.METER;
		IPhysicalUnit km = SiLengthMetricSystem.KILOMETER;
		IPhysicalUnit sec = SiTimeMetricSystem.SECOND;
		IPhysicalUnit hour = SiTimeMetricSystem.HOUR;
		
		System.out.println(meter);
		System.out.println(km);
		System.out.println(sec);
		System.out.println(hour);
		
		System.out.println(meter.canTransformTo(km));
		System.out.println(meter.canTransformTo(sec));
		System.out.println(hour.canTransformTo(sec));
		System.out.println(km.canTransformTo(sec));
		
		System.out.println("1000 m en km: "+meter.transformTo(1000, km));
		try {
			System.out.println("1000 m en s: "+meter.transformTo(1000, SiTimeMetricSystem.SECOND)); // Exception!
		} catch (QuantityException e) {
			System.out.println(e);
		}
		System.out.println("36 segundos en horas: " + sec.transformTo(36, hour));
		try {
			System.out.println("1 segundo en metros: " + sec.transformTo(1, meter));
		} catch (QuantityException e) {
			System.out.println(e);
		}
				
	}
}
