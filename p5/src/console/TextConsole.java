package console;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import p5.interf.Function;


/**
 * 
 * @author simon
 *
 */
public class TextConsole {
	Map<String, Function> map = new HashMap<String, Function>();
	
	/**
	 * Permite añadir comandos a la Consola
	 * @param str el literal del comando
	 * @param fun Una implementacion Lambda de la interfaz Function
	 */
	public void addCommand(String str, Function fun){
		map.put(str, fun);
	}
	
	/**
	 * Imprime por pantalla una lista de los literales de los comandos
	 */
	public void displayCommands(){
		
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry mEntry = (Map.Entry) iter.next();
		    System.out.println(mEntry.getKey());
		}
	}
	
	/**
	 * Ejecuta la Consola. 
	 * Un enter en blanco finaliza la ejecucion
	 * Si no se encuentra el comando, se imprimen todos los comandos disponibles
	 * Si se encuentra el comando, se imprime el literal, los argumentos dados, y se ejecuta el comando
	 */
	public void run(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Bienvenido a la Shell.\n ");
		System.out.println("Los comandos disponibles son los siguientes: ");
		
		displayCommands();
		
		while(true){
			
			//Read input
			String in = keyboard.nextLine();
			
			//Console finish
			if(in.equals("")){
				break;
			}
					
			//Search for command
			Boolean found= false;
			Iterator search = map.entrySet().iterator();
			StringTokenizer st = new StringTokenizer(in);
			String name = st.nextToken();
			
			while (search.hasNext()) {
			    Map.Entry mEntry = (Map.Entry) search.next();
			    
			    //Command found
			    if(mEntry.getKey().equals(name)){
			    	System.out.println("Encontrada funcion "+ mEntry.getKey());
			    	found= true;
			    	
			    	ArrayList<String> args = new ArrayList<String>(); 
			    	while (st.hasMoreTokens()){
			    		args.add(st.nextToken());
			    	}
			    	
			    	System.out.println("Argumentos:" + args + "\n"  );
			    	
			    	String[] argsArray = args.toArray(new String[0]);
			    	((Function) mEntry.getValue()).execute(argsArray);
			    	
			    	break;
			    }
			
		}
			
			//Command not found message
			if(found== false){
				System.out.println("Comando no encontrado. Los comandos disponibles son: ");
				displayCommands();
			}
			
			//Execute Command
			
		
		
		}

		keyboard.close();
	}
	
}
