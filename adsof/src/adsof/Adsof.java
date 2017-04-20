package adsof;

import java.io.IOException;

public class Adsof {
	public int a = 1;
	
	public static void main(String[] args){
		A a = new B();
		B b = new B();
		System.out.println(a.getkk() + " " + a.a);
		System.out.println(((A)a).getkk() + " " +  ((A)a).a);
		System.out.println(((A)b).getkk() + " " +((A)b).a);
		System.out.println(b.getkk() + " " + b.a);
		System.out.println(a instanceof B);
		System.out.println(b instanceof B);
	}
	
	/*public static void main(String[] args) throws IOException {
		Adsof a = new Adsof();
		B b = new B();
		Adsof c = new B();
		System.out.println("A: "+ a.a + " B: "+ b.a + " C:  " +c.a + "C con cast:  "+ ((B)c).a );
		int j = 0;
		for (int i = 0; i < 10; i++){
			j = j++;
		}
		System.out.println(j + " "  + j++ + " " + j);
		int i = 0;
		while (Math.round(i) == i) {
		i++;
		}
		System.out.println("Sorpresa! " + i + " " + Math.round(i) );
		*/
		
		/*i = System.in.read();
		boolean par = i % 2 == 0;
		System.out.println( (par || !par) ? 5 : 2.5 );
		*/
		
		/*int[] valores = {-2, 3, 0, -4, 0, 5};
		boolean hayCeros = false;
		i = 0;
		while (i < valores.length) {
			hayCeros = hayCeros || valores[i++] == 0;
			//System.out.println(hayCeros);
		}
		if (hayCeros)
		System.out.println("Hay algun cero.");*/
		
		/*Misterio misterio = new Misterio();
		System.out.println( misterio.valor() );
	}*/
	
}

class B extends A{
	public int a = 0;
	public int getkk(){
		return 0;
	}
}

class A{
	public int a = 1;
	public int getkk(){
		return 1;
	}
	
	
}

class Misterio {
	private int m;
	public void Misterio() { m = 13; }
	public int valor() { return m; }
}
