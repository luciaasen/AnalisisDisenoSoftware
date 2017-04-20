package adsof;
import adsof.*;

public class VisitaMuseo extends ActividadOcio{
	public final static double COSTE_FIJO = 5.0;
	private TipoVisitaMuseo tipo;
	
	public VisitaMuseo(String descripcion, TipoVisitaMuseo tipo){
		this.descripcion = descripcion;
		this.tipo = tipo;
	}
	
	public double extras(){
		switch(tipo){
			case BILINGUE:
				return 8.0;
			case GUIADA:
				return 4.0;
			case ESCOLAR:
				return -1.0;
			default:
				return 0;
		}
	}
	
	public double precio(){
		return VisitaMuseo.COSTE_FIJO + this.extras();
	}
}
