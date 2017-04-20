package es.uam.eps.ads.p4.conv;

import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;

public interface IMetricSystemConverter {
	IMetricSystem sourceSystem();
	IMetricSystem targetSystem();
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws QuantityException;
	IMetricSystemConverter reverse();

}
