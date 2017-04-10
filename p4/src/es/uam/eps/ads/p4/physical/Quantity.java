package es.uam.eps.ads.p4.physical;

public enum Quantity {
	TIEMPO, LONGITUD;
	
	@Override 
	public String toString(){
		 switch(this) {
	      case TIEMPO: return "T";
	      case LONGITUD: return "L";
	      default: throw new IllegalArgumentException();
	    }
	}
}
