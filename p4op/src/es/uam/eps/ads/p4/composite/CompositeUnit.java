package es.uam.eps.ads.p4.composite;

import es.uam.eps.ads.p4.IMetricSystem;
import es.uam.eps.ads.p4.IPhysicalUnit;
import es.uam.eps.ads.p4.exc.QuantityException;
import es.uam.eps.ads.p4.physical.Quantity;

public class CompositeUnit implements ICompositeUnit, IPhysicalUnit {
	Operator op;
	IPhysicalUnit u1;
	IPhysicalUnit u2;
	
	public CompositeUnit (Operator op, IPhysicalUnit u1, IPhysicalUnit u2 ){
		this.op =op;
		this.u1 = u1;
		this.u2=u2;
	}

	//COMPOSITE
	@Override
	public Operator getOperator() {
		// TODO Auto-generated method stub
		return op;
	}

	@Override
	public IPhysicalUnit getLeftUnit() {
		// TODO Auto-generated method stub
		return u1;
	}

	@Override
	public IPhysicalUnit getRightUnit() {
		// TODO Auto-generated method stub
		return u2;
	}

	//PHYSICAL UNIT
	@Override
	public boolean canTransformTo(IPhysicalUnit u) {
		// TODO Auto-generated method stub
		return u1.canTransformTo(((CompositeUnit)u).getLeftUnit())&& u2.canTransformTo(((CompositeUnit)u).getRightUnit());
	}

	@Override
	public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
		if(op== Operator.DIV){
			double res1= u1.transformTo(d, ((CompositeUnit)u).getLeftUnit());
			double res2 = u2.transformTo(d, ((CompositeUnit)u).getRightUnit());
			
			return res1/res2;
		}else{

			double res1= u1.transformTo(d, ((CompositeUnit)u).getLeftUnit());
			double res2 = u2.transformTo(d, ((CompositeUnit)u).getRightUnit());
			
			return res1*res2;
		}
		
		
	}

	@Override
	public Quantity getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCambio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String abbrev() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMetricSystem getMetricSystem() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString(){
		if(op==Operator.DIV){
			return " "+ u1.abbrev() + " "+ "/" + u2.abbrev() + " ";
		}else{
			return " "+ u1.abbrev() + " "+ "*" + u2.abbrev() + " ";
		}
		
	}
}
