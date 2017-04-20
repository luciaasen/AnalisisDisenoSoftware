package adsof;

import java.util.ArrayList;

import adsof.*;

public class UMLPackage extends Elements{
	private ArrayList<Elements> hijos = new ArrayList<Elements>();
	

	public UMLPackage(String name){
		super(name);
	}
	
	public void add(Elements e){
		this.hijos.add(e);
	}

	@Override
	public int numHijos() {
		return this.hijos.size();
	}

	@Override
	public Elements getHijo(int i) {
		if( i < this.numHijos()){
			return this.hijos.get(i);
		}
		return null;
	}
	
	
	
}
