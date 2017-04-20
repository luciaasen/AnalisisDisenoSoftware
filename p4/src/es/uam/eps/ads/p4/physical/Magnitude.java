package es.uam.eps.ads.p4.physical;

import es.uam.eps.ads.p4.*;
import es.uam.eps.ads.p4.exc.QuantityException;

public class Magnitude implements IMagnitude {
	private IPhysicalUnit unit;
	private double value;
	
	/**
	 * Constructor de una magnitud
	 * @param value numero de la magnitud
	 * @param unit unidad de la magnitud
	 */
	public Magnitude(double value, IPhysicalUnit unit){
		this.value = value;
		this.unit = unit;
	}

	/**
	 * Si es posible, suma dos magnitudes y las devuelve en la misma magnitud que this
	 * @param m magnitud a sumar con this
	 * @return magnitud con la suma 
	 * @throws QuantityException si el cambio no es posible
	 */
	@Override
	public IMagnitude add(IMagnitude m) throws QuantityException {
		if(this.getUnit().canTransformTo(m.getUnit())){
			return new Magnitude(this.getValue() + m.transformTo(this.getUnit()).getValue(), this.getUnit());
		}else{
			throw new QuantityException(this.getUnit(), m.getUnit());
		}
	}

	/**
	 * Si es posible, resta dos magnitudes y las devuelve en la misma magnitud que this
	 * @param m magnitud a restar a this
	 * @return magnitud con la resta
	 * @throws QuantityException si el cambio no es posible
	 */
	@Override
	public IMagnitude subs(IMagnitude m) throws QuantityException {
		if(this.getUnit().canTransformTo(m.getUnit())){
			return new Magnitude(this.getValue() - m.transformTo(this.getUnit()).getValue(), this.getUnit());
		}else{
			throw new QuantityException(this.getUnit(), m.getUnit());
		}
	}

	/**
	 * Getter del valor de una magnitud
	 * @return value double
	 */
	@Override
	public double getValue() {
		return this.value;
	}
	
	/**
	 * Transforma una magnitud entre dos unidades
	 * @param c unidad a la que transformar
	 * @return magnitud transformada si fue posible
	 * @throws QuantityException si el cambio no es posible
	 */
	@Override
	public IMagnitude transformTo(IPhysicalUnit c) throws QuantityException{
		if(this.getUnit().canTransformTo(c)){
			return new Magnitude( this.getUnit().transformTo(this.getValue(), c), c);
		}
		else{
			throw new QuantityException(this.getUnit(), c);
		}
	}
	
	/**
	 * Getter de la unidad
	 * @return unidad fisica de la magnitud
	 */
	@Override
	public IPhysicalUnit getUnit(){
		return this.unit;
	}

	@Override
	public String toString(){
		return this.value + " [" + this.unit + "]";
	}
}
