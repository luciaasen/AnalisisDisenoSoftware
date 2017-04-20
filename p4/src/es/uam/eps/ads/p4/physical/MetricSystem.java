package es.uam.eps.ads.p4.physical;

import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import java.util.*;

public abstract class MetricSystem implements IMetricSystem {

	/**
	 * Devuelve la base del sistema metrico de la quantity de la clase hija
	 * @return base del sistema metrico
	 */
	public abstract IPhysicalUnit base();
	
	/**
	 * @return units, una lista con todas las medidas del sistema metrico de la quantity de la clase hija
	 */
	public abstract Collection<IPhysicalUnit> units();

}
