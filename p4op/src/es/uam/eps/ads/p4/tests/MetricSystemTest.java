package es.uam.eps.ads.p4.tests;

import es.uam.eps.ads.p4.*;
import es.uam.eps.ads.p4.physical.*;

public class MetricSystemTest {
	public static void main(String[] args) {
		IMetricSystem ms = SiLengthMetricSystem.SYSTEM;
		IMetricSystem  imp = ImperialLengthMetricSystem.SYSTEM;
		IMetricSystem  time = SiTimeMetricSystem.SYSTEM;

		System.out.println(ms.units());
		System.out.println("Base = "+ms.base());
		System.out.println(imp.units());
		System.out.println("Base = "+imp.base());
		System.out.println(time.units());
		System.out.println("Base = "+time.base());
		
		System.out.println(SiLengthMetricSystem.METER.canTransformTo(ImperialLengthMetricSystem.FOOT));
		// No: different metric systems
		}
}
