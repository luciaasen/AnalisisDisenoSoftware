/**
 * 
 */
package es.uam.eps.ads.p4;

import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.physical.Quantity;

/**
 * @author lucia
 *
 */
public interface IPhysicalUnit {
	
	/**
	 * Comprueba si es posible el paso de una unidad a otra
	 * @param u unidad a la que transformar
	 * @return true si se puede transformar, 0 else
	 */
	boolean canTransformTo(IPhysicalUnit u);
	/**
	 * Transfroam si es posible d unidades de tipo this al tipo u
	 * @param d cantidad que transformar
	 * @param u unidad a la que transformar
	 * @return double con la transformacion
	 * @throws QuantityException si el cambio no es posible
	 */
	double	transformTo(double d, IPhysicalUnit u) throws QuantityException;
	/**
	 * Getter del tipo
	 * @return tipo de la unidad
	 */
	Quantity getQuantity();
	/**
	 * Getter deñ cambio a la base
	 * @return Cambio a la base del sistema metrico
	 */
	double getCambio();
	/**
	 * Getter de la abreviatura
	 * @return abreviatura de la unidad
	 */
	String abbrev();
	/**
	 * Getter del sistema metrico
	 * @return sistema metrico al que pertenece
	 */
	IMetricSystem getMetricSystem(); // No implementar de momento en este apartado
}
