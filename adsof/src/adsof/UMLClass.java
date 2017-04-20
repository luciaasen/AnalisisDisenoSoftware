package adsof;

public class UMLClass  extends Elements {

	private Privacidad privacidad;
	
	public UMLClass(String name, Privacidad privacidad){
		super(name);
		this.privacidad = privacidad;
	}
	
	

	@Override
	public int numHijos() {
		return 0;
	}

	@Override
	public Elements getHijo(int i) {
		
		return null;
	}
	
}
