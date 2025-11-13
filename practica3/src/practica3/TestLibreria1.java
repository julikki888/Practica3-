package practica3;

public class TestLibreria1 {

	public static void main(String[] args) {
		
		System.out.println(MiLibreria.EsPrimo(1)?"Es primo":"No es primo");
		
		System.out.println(MiLibreria.PrimosEntreSi(5,8)?"Es primo entre si":"No es primo entre si");
		
		System.out.println(MiLibreria.Euler(19));
		
		System.out.println(MiLibreria.MaximoComunDivisor(18,9));

		
	}

}
