/**
    * Clase para crear un filtro de numeros primos
    * 
    * @author Lucia Asencio lucia.asencio@estudiante.uam.es
*/

public class primos {
    /** 
        * Funcion que comprueba si un determinado numero es o no primo
        * @params args: numero a comprobar
        * @return void
    */
    public static void main (String[] args){
        int num;
        int i;
        if(args.length < 1){
            System.out.println("Se espera un numero int >= 0 como argumento");
            return;
        }
       
        num = Integer.parseInt(args[0]);
        if(num < 0){
            System.out.println("Se espera un numero int >= 0 como argumento");
            return;
        }
        
        if (num == 0 || num == 1){
            System.out.println("El numero no es primo");
            return;
        }
        for(i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println("El numero no es primo");
                return;
            }
        }
        System.out.println("El numero es primo");
        return;
    }

}
