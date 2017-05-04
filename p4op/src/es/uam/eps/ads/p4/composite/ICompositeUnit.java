package es.uam.eps.ads.p4.composite;

import es.uam.eps.ads.p4.IPhysicalUnit;

public interface ICompositeUnit {
	Operator getOperator();
	IPhysicalUnit getLeftUnit();
	IPhysicalUnit getRightUnit();
}
