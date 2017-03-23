package es.uam.eps.ads.p3.tester;

import static es.uam.eps.ads.p3.tester.DatosPruebas.*;

import es.uam.eps.ads.p3.biblioteca.usuario.Prestamo;
/**
 * Tester Apartado 1 de la practica 3
 * @author Profesores ADS
 */
public class TesterApartado1 {
  public static void main(String[] args) {
		 
     // veamos el contenido de algunos objetos
	 System.out.println( u1 );    System.out.println( u4 );
	 System.out.println( obra1 ); System.out.println( obra2 ); 	 // con plazos de prestamo iniciales 

	// en el constructor Prestamo se debe usar  FechaSimulada.getHoy() para obtener fecha "simulada" de hoy
	 Prestamo pf = new Prestamo(e11, u1); // prestamo ficticio reutilizado para simular multiples prestamos
	 // veamos como un usuario Publico gana privilegios segun se le hace prestamos (ver enunciado)
    System.out.println(u1); 
    for (int i = 1; i <= 4; i++) { 
    	 u1.anyadirPrestamo(pf);  u1.eliminarPrestamo(pf);  System.out.println(u1);
    }
    

    // el plazo de prestamo de la obra 1 sigue siendo el inicial, pero BAJA tras 20 prestamos mas
    System.out.println(obra1); 
    for (int i = 1; i <= 20; i++) { 
    	 u1.anyadirPrestamo(pf);  u1.eliminarPrestamo(pf); 
    }
    System.out.println(obra1);
    
    // sanciones por retraso a un usuario Publico
    u1.sancionarPorRetraso(2);  // pierde parte de los privilegios ganados arriba
    System.out.println(u1);
    
    // sanciones por retraso a un Empleado
    System.out.println(u4); 
    u4.sancionarPorRetraso(10);     System.out.println(u4); // suma 25
    u4.sancionarPorRetraso(3);      System.out.println(u4); // perdonado, menos de 4 dias
    u4.sancionarPorRetraso(5);      System.out.println(u4); // suma 5 x 2.5 = 12.75
    u4.eliminarSancion();           System.out.println(u4); // paga sus sancion, a cero.                     	
  }
}