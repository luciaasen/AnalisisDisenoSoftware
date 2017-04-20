package adsof;

public class CocheGasoil extends VehiculoMotor {

	public CocheGasoil(String s, double d){
		super(s,d);
	}
	
	
	public double consumoActual(){
		double incremento = 0.01 * (int)(this.km/5000);
		return this.consumoFabrica*(1 + incremento);
	}
	
}
