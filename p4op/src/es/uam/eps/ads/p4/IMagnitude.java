package es.uam.eps.ads.p4;

import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.Quantity;

public interface IMagnitude {
	
	/**
	 * Si es posible,suma dos implementaciones de IMagnitude y las devuelve en la misma magnitud que this
	 * @param m IMagnitude a sumar con this
	 * @return IMagnitude con la suma 
	 * @throws QuantityException si el cambio no es posible
	 */
	IMagnitude add (IMagnitude m) throws QuantityException;
	/**
	 * Si es posible, resta dos implementaciones de IMagnitude y las devuelve en la misma magnitud que this
	 * @param m IMagnitude a restar a this
	 * @return IMagnitude con la resta
	 * @throws QuantityException si el cambio no es posible
	 */
	IMagnitude subs(IMagnitude m) throws QuantityException;
	/**
	 * Transforma una implementacion de IMagnitude entre dos unidades
	 * @param c unidad a la que transformar
	 * @return IMagnitude transformada si fue posible
	 * @throws QuantityException si el cambio no es posible
	 */
	IMagnitude transformTo(IPhysicalUnit c) throws QuantityException;
	/**
	 * Getter de la unidad
	 * @return unidad fisica de la implementacion de IMagnitude
	 */
	IPhysicalUnit getUnit();
	/**
	 * Getter del valor de una implementacion de IMagnitude
	 * @return value double
	 */
	double getValue();
}
