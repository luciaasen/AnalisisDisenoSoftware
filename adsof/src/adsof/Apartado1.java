package adsof;

import adsof.*;

public class Apartado1 {
	public static void main(String[] args) {
		ActividadOcio[] actividades = { new VisitaMuseo("Reina Sofia", TipoVisitaMuseo.BILINGUE),
										new VisitaMuseo("Arqueológico", TipoVisitaMuseo.ESCOLAR),
										new Deportiva("Cañada Real Bicicleta", 20.0, 0.1),
										new Deportiva("Descenso Rapido Sella", 50.0, 0.25)
										};
		System.out.println("Precio base fijo para museos: " + VisitaMuseo.COSTE_FIJO);
		for (ActividadOcio a : actividades)
			System.out.println(a + ": precio " + a.precio() + " incluye " + a.extras() +" de complementos");
		System.out.println("Suma de precios de actividades deportivas " + Deportiva.total());
	}
}