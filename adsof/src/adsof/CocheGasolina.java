package adsof;

public class CocheGasolina  extends VehiculoMotor{
	public CocheGasolina(String s, double d){
		super(s,d);
	}
	
	@Override
	public double consumoActual(){
		if (this.km <= 75000)
			return this.consumoFabrica;
		return this.consumoFabrica + 0.4;
	}
}
