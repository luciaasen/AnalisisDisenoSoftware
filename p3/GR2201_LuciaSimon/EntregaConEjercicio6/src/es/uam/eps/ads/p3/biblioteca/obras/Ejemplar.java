package es.uam.eps.ads.p3.biblioteca.obras;

import java.util.ArrayList;

import es.uam.eps.ads.p3.biblioteca.usuario.Prestamo;
import es.uam.eps.ads.p3.biblioteca.usuario.Usuario;

public class Ejemplar {
	private Obra obra;
	private static int nextId =1;
	private int Id;

	
	/**
	 * Constructor del Ejemplar
	 * @param ob
	 */
	public Ejemplar(Obra ob){
		this.obra = ob;
		this.Id= Ejemplar.nextId;
		Ejemplar.nextId++;
		BibliotecaSingleton.getBiblioteca().addEjemplares(this);
		ob.addEjemplar(this);
	}
	
	public int getId(){
		return this.Id;
	}
	
	/**
	 * Getter de la obra del ejemplar
	 * @return
	 */
	public Obra getObra(){
		return this.obra;
	}
	
	/**
	 * Setter de la obra del ejemplar
	 * @param ob
	 */
	public void setObra(Obra ob){
		this.obra = ob;
	}
	
	
	/**
	 * Presta el ejemplar en cuestion a un usuario, generando y devolviendo un objeto prestamo
	 * que vincula el usuario, el ejemplar y la fecha de vencimiento.
	 * Adicionalmente, el objeto prestmo se a�ade al usuario
	 * 
	 *No realiza el prestamo si el usuario ya tiene el cupo de prestamos cubierto,
	 *o si elejemplar esta prestado por otro usuario
	 * @param usr
	 * @return Prestamo 
	 */
	public Prestamo prestar(Usuario usr){
		//Check if I can do the  lending
		
		//FAILURE 1: usr has maxed out lending
		if(usr.getPs()==usr.getPrestamos().size()){
			return null;
		}
		
		//FAILURE 2: Book is in possesion of somebody else
		for (Prestamo p : Prestamo.getTodosPrestamos()){
			if(p.getEjemplar().equals(this)){
				return null;
			}
		}
		
		
		
		//FAILURE 3: usr already has a copy
		for (Prestamo p : Prestamo.getTodosPrestamos()){
			if(p.getUsuario().equals(usr) && p.getEjemplar().getObra().equals(this.getObra())){
				return null;
			}
		}
		
		//SUCCESS 1: Do the lending
		Prestamo p = new Prestamo(this, usr);
		usr.anyadirPrestamo(p);
		Prestamo.setNumPrestamosPendientes(Prestamo.numPrestamosPendientes()+1);
		Prestamo.setNumPrestamosHistoricos(Prestamo.numPrestamosHistoricos()+1);
		
		
		
		return p;
		
	}
	
	/** 
	 * Devuelve un ejemplar, buscando el prestamo correspondiente y eliminandolo tanto de la 
	 * Lista est�tica de todos los prestamoc como de la lista del usuario en cuestion
	 */
	public void devolver(){
		ArrayList<Prestamo> prest = Prestamo.getTodosPrestamos();
		Prestamo pRemove= null;
		for (Prestamo p : prest ){
			if(p.getEjemplar().equals(this)){
				pRemove=p;
			}
		}
		if(pRemove != null){
			pRemove.getUsuario().eliminarPrestamo(pRemove);
			Prestamo.quitarPrestamo(pRemove);
			Prestamo.setNumPrestamosPendientes(Prestamo.numPrestamosPendientes()-1);
		}
		BibliotecaSingleton.getBiblioteca().addPrestamosHistóricos(pRemove);
		
		return;
		
	}
	
	/**
	 * Metodo para pasar un ejemplar a String
	 * @return String
	 */
	public String toString(){
		String str = "{" + this.getId()+ "["+ obra.toString()+ "]" ;
		int prestado=0;
		
		for (Prestamo p : Prestamo.getTodosPrestamos()){
			if(p.getEjemplar().equals(this)){
				prestado=1;
			}
		}
		
		if(prestado==1){
			str += "(Prestado)} ";
		}else{
			str+= "(disponible)} ";
		}
		
		return str;
	}
	
}
