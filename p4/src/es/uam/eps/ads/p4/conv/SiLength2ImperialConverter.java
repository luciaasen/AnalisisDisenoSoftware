package es.uam.eps.ads.p4.conv;

import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.ImperialLengthMetricSystem;
import es.uam.eps.ads.p4.physical.Magnitude;
import es.uam.eps.ads.p4.physical.SiLengthMetricSystem;

public class SiLength2ImperialConverter implements IMetricSystemConverter {

	@Override
	public IMetricSystem sourceSystem() {
				return new SiLengthMetricSystem();
	}

	@Override
	public IMetricSystem targetSystem() {
		// TODO Auto-generated method stub
		return new ImperialLengthMetricSystem();
	}

	@Override
	public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws QuantityException {
		
		Magnitude inter = (Magnitude) from.transformTo(SiLengthMetricSystem.METER);
		double valor = inter.getValue()*3.2808;
		Magnitude inter2 = new Magnitude(valor, ImperialLengthMetricSystem.FOOT);
		Magnitude fin= (Magnitude) inter2.transformTo(to);
		return (IMagnitude) fin;
	}

	@Override
	public IMetricSystemConverter reverse() {

		return new Imperial2SiLengthConverter();
	}

}
