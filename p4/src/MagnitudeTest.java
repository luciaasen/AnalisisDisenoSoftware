import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.*;

public class MagnitudeTest {
	
	public static void main(String[] args) throws QuantityException{
		IMagnitude m = new Magnitude(12.5, SiLengthMetricSystem.KILOMETER);
		Magnitude m2 = new Magnitude(12.5, SiLengthMetricSystem.METER);
		System.out.println(m2.add(m));
		// m converted to meters and added to m2
		System.out.println(m.subs(m2).add(m2));
		// operations can be chained
		System.out.println(m.transformTo(SiLengthMetricSystem.METER));
		Magnitude s1 = new Magnitude(65, SiTimeMetricSystem.SECOND);
		try {
			System.out.println(s1.add(m));
		} catch (QuantityException q) {
			System.out.println(q);
		}
	}
}