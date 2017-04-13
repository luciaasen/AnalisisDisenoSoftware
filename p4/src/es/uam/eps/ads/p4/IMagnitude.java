package es.uam.eps.ads.p4;

import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;

public interface IMagnitude {
	IMagnitude add (IMagnitude m) throws QuantityException;
	IMagnitude subs(IMagnitude m) throws QuantityException;
	IMagnitude transformTo(IPhysicalUnit c) throws QuantityException;
	IPhysicalUnit getUnit();
	double getValue();
}
