
package es.uam.eps.ads.p4.conv;

import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.ImperialLengthMetricSystem;
import es.uam.eps.ads.p4.physical.Magnitude;
import es.uam.eps.ads.p4.physical.SiLengthMetricSystem;

public class Imperial2SiLengthConverter implements IMetricSystemConverter {

	@Override
	public IMetricSystem targetSystem() {
		return new SiLengthMetricSystem();
	}

	@Override
	public IMetricSystem sourceSystem() {
		return new ImperialLengthMetricSystem();
	}

	@Override
	public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws QuantityException {
		
		Magnitude inter = (Magnitude) from.transformTo(ImperialLengthMetricSystem.FOOT);
		double valor = inter.getValue()*(1/3.280839895);
		Magnitude inter2 = new Magnitude(valor,  SiLengthMetricSystem.METER);
		Magnitude fin= (Magnitude) inter2.transformTo(to);
		return (IMagnitude) fin;
	}

	@Override
	public IMetricSystemConverter reverse() {
		return new SiLength2ImperialConverter();
	}

}
