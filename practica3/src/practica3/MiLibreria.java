package practica3;

public class MiLibreria {

	
	/*
	 * a) Método al que pasándole un número nos devuelva un valor lógico, el cual indicará si el número es primo o no
	 */
	public boolean EsPrimo(int num) {
		boolean check=true;
		for(int i=2;i<=num/2&&check==true;i++) {
			if(num%i==0)check=false;}		
		if(num==1)check=false;
		return check;
	}
	
	
}
