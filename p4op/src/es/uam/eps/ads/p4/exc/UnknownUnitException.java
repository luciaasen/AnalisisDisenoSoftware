package es.uam.eps.ads.p4.exc;

public class UnknownUnitException extends Exception {

	public String toString(){
		return "Unit is not saved or does not exist";
	}
}
