package adsof;
import adsof.*;

public class PrettyPrinter {

	public static void imprime(ArbolIterable<Elements> j, String indent){
		int i;
		Elements el;
		System.out.println(indent + j);
		for (i = 0; i < (j.numHijos()); i++){
			el = j.getHijo(i);	
			PrettyPrinter.imprime(el, indent + " ");
		}
		
	}
}
