package es.uam.eps.ads.p4.physical;

public enum Quantity {
	TIEMPO, LONGITUD;
	
	/**
	 * Devuelve la abreviatura escogida para cada quantity
	 * @return String abreviatura
	 */
	@Override 
	public String toString(){
		 switch(this) {
	      case TIEMPO: return "T";
	      case LONGITUD: return "L";
	      default: throw new IllegalArgumentException();
	    }
	}
}
