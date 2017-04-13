package es.uam.eps.ads.p4.physical;

import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import java.util.*;

public abstract class MetricSystem implements IMetricSystem {

	public abstract IPhysicalUnit base();
	public abstract Collection<IPhysicalUnit> units();

}
