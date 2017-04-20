package es.uam.eps.ads.p4.conv;

import es.uam.eps.ads.p4.IMagnitude;
import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.exc.UnknownUnitException;

/**
 * @author Simon Valcarcel Villarino
 *
 */
public interface IMetricSystemConverter {

	/**Devuelve el Sistema Metrico de oartida
	 * @return IMetricSystem 
	 */
	IMetricSystem sourceSystem();
	
	/** Devuelve el sistema metrico de llegada
	 * @return IMetricSystem 
	 */
	IMetricSystem targetSystem();
	
	
	/**
	 * @param from Magnitud a transformar
	 * @param to Unidad Fisica a la que se quiere llegar
	 * @return IMagnitude: magnitud transformada
	 * @throws UnknownUnitException En caso de que el parametro to no se reconozca
	 * @throws QuantityException En caso de que las cantidades no sean coherentes, ie tiempo y espacio
	 */
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException, QuantityException;
	/**
	 * @return IMetricSystem el reverso del sistema metrico original
	 */
	IMetricSystemConverter  reverse();

}
