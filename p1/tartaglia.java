/**
	* Clase necesaria para construir el triangulo de Tartaglia
	*
	* @auhor Lucia Asencio lucia.asencio@estudiante.uam.es
*/

import java.util.Arrays;
public class tartaglia {
	
	/**
		* Calcula un determinado numero de filas del triangulo de
		* Tartaglia
		* @param args : numero de filas que queremos producir - 1  
		* @return void
	*/	
	public static void main	(String[] args) {
	
		if( args.length < 1 || Double.parseDouble(args[0]) < 0){
			System.out.println("Se espera un n >= 0 como parametro.");
			return;
		}
		
		int i;
		int j;
		int tam;
		int filas = 1 + Integer.parseInt(args[0]);
		int[][] tart = new int[filas][];
		
		
		for (i = 0, tam = 1; i < filas; tam++, i++){
		    tam = 1 + i;
			tart[i] = new int[tam];
			tart[i][0] = 1;
			tart[i][tam-1] = 1;
			for(j = 1; j < tam - 1; j++){
				tart[i][j] = tart[i - 1][j] + tart[i - 1][j - 1];
			}
			
            System.out.println(Arrays.toString(tart[i]));
		}
		return;
	}
}
