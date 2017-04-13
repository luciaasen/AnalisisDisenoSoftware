package es.uam.eps.ads.p4.physical;

import es.uam.eps.ads.p4.*;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.*;

public class Magnitude implements IMagnitude {
	private IPhysicalUnit unit;
	private double value;
	
	public Magnitude(double value, IPhysicalUnit unit){
		this.value = value;
		this.unit = unit;
	}

	@Override
	public IMagnitude add(IMagnitude m) throws QuantityException {
		if(this.getUnit().canTransformTo(m.getUnit())){
			
		}else{
			throw new QuantityException(this.getUnit(), m.getUnit());
		}
	}

	@Override
	public IMagnitude subs(IMagnitude m) throws QuantityException {
		if(this.getUnit().canTransformTo(m.getUnit())){
			
		}else{
			throw new QuantityException(this.getUnit(), m.getUnit());
		}
	}

	@Override
	public double getValue() {
		return this.value;
	}
	
	@Override
	public IMagnitude transformTo(IPhysicalUnit c) throws QuantityException{
		if(this.getUnit().canTransformTo(c)){
			return new Magnitude( this.getUnit().transformTo(this.getValue(), c), c);
		}
		else{
			throw new QuantityException(this.getUnit(), c);
		}
	}
	
	@Override
	public IPhysicalUnit getUnit(){
		return this.unit;
	}

}
