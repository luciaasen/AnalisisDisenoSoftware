package es.uam.eps.ads.p4.conv;

import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.exc.UnknownUnitException;
import es.uam.eps.ads.p4.physical.ImperialLengthMetricSystem;
import es.uam.eps.ads.p4.physical.Magnitude;
import es.uam.eps.ads.p4.physical.SiLengthMetricSystem;

public class SiLength2ImperialConverter implements IMetricSystemConverter {

	/* (non-Javadoc)
	 * @see es.uam.eps.ads.p4.conv.IMetricSystemConverter#sourceSystem()
	 */
	@Override
	public IMetricSystem sourceSystem() {
				return new SiLengthMetricSystem();
	}

	/* (non-Javadoc)
	 * @see es.uam.eps.ads.p4.conv.IMetricSystemConverter#targetSystem()
	 */
	@Override
	public IMetricSystem targetSystem() {
		// TODO Auto-generated method stub
		return new ImperialLengthMetricSystem();
	}

	/* (non-Javadoc)
	 * @see es.uam.eps.ads.p4.conv.IMetricSystemConverter#transformTo(es.uam.eps.ads.p4.IMagnitude, es.uam.eps.ads.p4.IPhysicalUnit)
	 */
	@Override
	public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException, QuantityException {
		
		
		if(!targetSystem().units().contains(to)){
			throw new UnknownUnitException();
		}
		Magnitude inter = (Magnitude) from.transformTo(SiLengthMetricSystem.METER);
		double valor = inter.getValue()*3.2808;
		Magnitude inter2 = new Magnitude(valor, ImperialLengthMetricSystem.FOOT);
		Magnitude fin= (Magnitude) inter2.transformTo(to);
		return (IMagnitude) fin;
	}

	/* (non-Javadoc)
	 * @see es.uam.eps.ads.p4.conv.IMetricSystemConverter#reverse()
	 */
	@Override
	public IMetricSystemConverter reverse() {

		return new Imperial2SiLengthConverter();
	}

}
