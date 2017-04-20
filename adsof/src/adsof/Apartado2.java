package adsof;

import adsof.*;

//añadir clases nuevas
	public class Apartado2 {
	public static void main(String[] args) {
	VehiculoMotor c1 = new CocheGasolina("Ford Focus 1.9", 5.0);
	CocheGasoil c2 = new CocheGasoil("Toyota Yaris 1.4D", 4.0);
	CocheGasolina c3 = new CocheGasolina("Citroen C3 1.6", 5.2);
	c1.sumarKilometros(30000);
	c1.sumarKilometros(55700);			
	c2.sumarKilometros(49500);
	c3.sumarKilometros(35200);
	
	
	// acumula 85700 km, es decir, más de 75000
	System.out.println(c1); //consumo actual 5.4 = 5.0 + 0.4 (por más de 75000 km)
	System.out.println(c2); //consumo actual 4.36 = 4.0 * (1 + 1% * 9) ver enunciado
	System.out.println(VehiculoMotor.get("Citroen C3 1.6"));
	System.out.println(VehiculoMotor.get("Ford Focus"));
	}
	}