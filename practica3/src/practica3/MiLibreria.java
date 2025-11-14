package practica3;

public class MiLibreria {

	
	/*
	 * a) Método al que pasándole un número nos devuelva un valor lógico, el cual indicará si el número es primo o no
	 */
	public static boolean EsPrimo(int num) {
		boolean check=true;
		for(int i=2;i<=num/2&&check==true;i++) {
			if(num%i==0)check=false;}		
		if(num==1)check=false;
		return check;
	}
	
	/*
	 * b) Método que calcule el factorial de un número, en caso de números negativos debe devolver -1.
	 */
	public static int Factorial(int num) {
		if (num<0)return -1;
		int facto=1;
		for(int i = 1;i<=num;i++) {
			facto*=i;
		}
		return facto;
	}
	/*
	 * c) Método que calcule el combinatorio de dos números dados, se debe tener en cuenta que para poder
	 * calcular el combinatorio de dos números se debe cumplir que a ≥ b, a ≥ 0 y b ≥ 0.
	 */
	public static double Combinatorio(int a,int b) {

		if(a<b && b<0)return -1;
		
		return Factorial(a)/(Factorial(b)*Factorial(a-b));
	}
	
	/*
	 * d) Método para comprobar si un número es perfecto. Un número es perfecto
	 * cuando la suma de sus divisores excepto él mismo es igual al propio número.
	 * Por ejemplo, son números perfectos 6, 28, 496, …
	 * Os aconsejo que hagáis un método privado, que calcule la suma de los divisores de un número, sin contar
	 * el propio número, este método os servirá tanto para comprobar si un número es perfecto como para los números amigos.
	 */
	
	private static int SumaDivisores(int num) {
		int suma=0;
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)suma+=i;}
		
		return suma;
	}
	
	
	public static boolean Perfecto(int numA) {		
		return numA==SumaDivisores(numA);
	}
	
	/*
	 * e) Método que compruebe si dos números son amigos, debe devolver un valor boolean. Dos números son
	 * amigos si la suma de los divisores del primero, excepto él mismo, es igual al segundo número y viceversa.
	 * Por ejemplo, son números amigos 6 y 6, 28 y 28, 220 y 284,…
	 */
	public static boolean Amigos(int numA,int numB) {		
		return (SumaDivisores(numA)==numB && SumaDivisores(numB)==numA);
	}
	
	
	/*
	 * f) Método al que se le pasen dos números enteros y nos devuelva el valor verdadero, si ambos números son
	 * primos entre sí, y el valor falso en caso contrario. Dos números son primos entre si cuando el único
	 * divisor común de los dos es la unidad. Por ejemplo, son primos entre sí, el 5 y 18, 20 y 9, etc…
	 */
	
	public static boolean PrimosEntreSi(int num1, int num2) {
		boolean check=true;
		int aux;
		if(num2>num1) {
			aux=num2;
			num2=num1;
			num1=aux;
			}
		for(int i=2;i<=num2&&check==true;i++) {
			if(num1%i==num2%i && num1%i==0)check=false;
		}
		return check;	
	}
	
	/*
	 * g) Método que calcule la función de Euler. La función de euler es el número de enteros positivos inferiores
	 * a dicho número y que son primos con él. Por ejemplo, el euler de 6 es 2, ya que los únicos números
	 * inferiores a él y primos con el son el 1 y el 5; euler(4)=2, euler(8)=4, euler(19)=18, euler(20)=8, …
	 */
	
	public static int Euler(int num) {
		int suma=1;
		
		for(int i=2;i<num;i++) {
			if(PrimosEntreSi(num, i))++suma;}
		
		return suma;
	}
	
	
	
	/*
	 * h) Construir un método que calcule el máximo común divisor (MCD) de dos números a y b de tipo entero.
	 * 	MCD (a, b) = a si a = b
	 *	MCD (a, b) = MCD (a-b, b) si a > b
	 *	MCD (a, b) = MCD (a, b-a) si b > a
	 */
	
	public static int MaximoComunDivisor(int a, int b) {		
		while(a!=b) {
			if(a>b)a-=b;
			else b-=a;
			}
		return a;
	}
	
	
	/*
	 * i) Hacer otro método que calcule el MCD pero de forma recursiva.
	 */
	public static int RecursivoMaximoComunDivisor(int a, int b) {		
		if(a==b)return a;
		if(a>b)return RecursivoMaximoComunDivisor(a-b, b);
		return  RecursivoMaximoComunDivisor(a, b-a);
	}
	
	/*
	 * j) Escribir dos métodos, uno iterativo y otro recursivo para calcular la serie de Fibonacci para un término n,
	 * sabiendo que:
	 * Fib(0)= 1
	 * Fib(1)= 1
	 * Fib(N)= Fib(N-1) + Fib(N-2)	
	 */
	
	
	public static int Fibonaci (int n) {
		int fib1=1,fib2=1,aux;
		for(int i=2;i<=n;i++) {
			aux=fib1;
			fib1=fib2+aux;
			fib2=aux;
		}		
		return fib1;
	}
	
	
	public static int RecursivoFibonaci (int n) {
		if(n==1||n==0)return 1;
		return RecursivoFibonaci(n-1)+RecursivoFibonaci(n-2);
	}
	
	
	/*
	 * k) Método recursivo que calcula la potencia de un número A elevado a n, se deben tener en cuenta los
	 * exponentes negativos.
	 */
	
	public static double RecursivoPotencia (int numA, int n) {
		if(n>0)return numA*RecursivoPotencia(numA, n-1);
		if(n==0)return 1;
		return 1/(numA*RecursivoPotencia(numA,(n*-1)-1));
	}
	
	/*
	 * l) Método que calcular la suma de la serie de Fibonacci para un término n de forma recursiva.
	 */
	
	public static int SumaRecursivoFibonaci (int n) {
		int fibn,suma=0;
		if(n==1||n==0)return 1;
		for(int i=n;i>=0;i--) {
			fibn= SumaRecursivoFibonaci(i-1)+SumaRecursivoFibonaci(i-2);
			suma+=fibn;
		}
		return suma;
	}
	
	
	
	
}
