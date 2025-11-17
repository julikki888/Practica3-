package practica3;

import java.util.Scanner;

public class TestLibreria1 {

	public static void main(String[] args) {

		/*
		 * b) Otra nueva clase que muestre un menú con diferentes opciones, que van a ir
		 * comprobando también el buen funcionamiento de los métodos desarrollados en la
		 * librería matemática. Añade al menú las siguientes opciones, así como
		 * cualquier otra que veas interesante: 
		 * • Calcular el factorial de un número. 
		 * • Mostrar el combinatorio de dos números dados. 
		 * • Visualizar los números primos entre dos números dados. 
		 * 4. Visualizar por pantalla los de números perfectos que hay entre 2 números dados. 
		 * • Visualizar por pantalla las parejas de números amigos que hay entre 2 números dados. 
		 * 5 Comprobar si dos números son primos entre sí. 
		 * 7. Calcular la función de Euler de un número. 
		 * • Salir
		 */
		int menu;
		boolean sw = true;
		try (Scanner sc = new Scanner(System.in)) {
			
		while (sw) {
			try(sc){
				
				Menu();//muestra las opciones
				menu = sc.nextInt();
				switch (menu) {
				case 1 -> CalcularFactorial(sc);
				case 2 -> CalcularCombinatorio(sc);
				case 3 -> PrimosComprendidos(sc);				
				case 4 -> PerfectosComprendidos(sc);
				case 5 -> AmigosComprendidos(sc);
				case 6 -> SonPrimosEntreSi(sc);
				case 7 -> CalculaEuler(sc);
				case 8 -> sw=false;
				default ->
				throw new IllegalArgumentException("Unexpected value: " + menu);
				}
				sc.nextLine();
			}catch (Exception e) {
					// TODO: handle exception
				}
			}
		System.out.println("\nFIN DEL PROGRAMA");
		}

	}
	
	public static void Menu() {
		System.out.println();
		System.out.println("\n<----------Elige una opcion (1..8)---------->: "
				+ "\n1. Calcular el Factorial."
				+ "\n2. Mostrar el combinatorio de dos números dados."
				+ "\n3. Visualizar los números primos entre dos números dados."
				+ "\n4. Visualizar por pantalla los de números perfectos que hay entre 2 números dados."
				+ "\n5. Visualizar por pantalla las parejas de números amigos que hay entre 2 números dados."
				+ "\n6. Comprobar si dos números son primos entre sí."
				+ "\n7. Calcular la función de Euler de un número."
				+ "\n8. Salir."
				+ "\n<---------------------------------------->");
	}
	
	
	public static void CalcularFactorial(Scanner sc) {
		int num, fact;
		System.out.println("Introduce el numero a factorizar: ");
		num = sc.nextInt();			
		fact=MiLibreria.Factorial(num);
		if (fact<0)System.out.println("Numero negativos no validos");
		else System.out.println("El factorial de "+num+" es: "+fact);
		
	}
	
	
	public static void CalcularCombinatorio(Scanner sc) {
		int num1,num2;
		System.out.println("Introduce el primer numero combinatorio: ");
		num1 = sc.nextInt();	
		System.out.println("Introduce el segundo numero combinatorio: ");
		num2 = sc.nextInt();
		
		System.out.println("El calculo de combinatorios es: "+MiLibreria.Combinatorio(num1, num2));
		
	}
	
	
	public static void PrimosComprendidos(Scanner sc) {
		int num1,num2,aux;
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();	
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			aux=num1;
			num1=num2;
			num2=aux;
		}
		System.out.println("Primos comprendidos entre "+num1+" y "+num2+":\n");
		for(int i=num2+1;i<num1;i++) {
			if(MiLibreria.EsPrimo(i))System.out.println(i+"\t");	
		}
	}
	
	
	public static void PerfectosComprendidos(Scanner sc) {
		int num1,num2,aux;
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();	
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			aux=num1;
			num1=num2;
			num2=aux;
		}
		System.out.println("Perfectos comprendidos entre "+num1+" y "+num2+":\n");
		for(int i=num2+1;i<num1;i++) {
			if(MiLibreria.Perfecto(i))System.out.println(i+"\t");	
		}
	}
	
	
	public static void AmigosComprendidos(Scanner sc) {
		int num1,num2,aux;
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();	
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			aux=num1;
			num1=num2;
			num2=aux;
		}
		System.out.println("Amigos comprendidos entre "+num1+" y "+num2+":\n");
		for(int i=num2+1;i<num1;i++) {
			for(int j=num2+1;j<num1;j++)
			if(MiLibreria.Amigos(i,j))System.out.println("Son amigos: "+i+"  "+j);	
		}
	}
	
	public static void SonPrimosEntreSi(Scanner sc) {
		int num1,num2;
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();	
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		if(MiLibreria.PrimosEntreSi(num1, num2))System.out.println("¡¡Son primos Entre si!!");
		else System.out.println("No son primos entre si ;(");
	}
	
	public static void CalculaEuler(Scanner sc) {
		int num;
		System.out.println("Introduce el numero a calcular Euler: ");
		num = sc.nextInt();	
		System.out.println("Euler de "+num+" es: "+MiLibreria.Euler(num));
		}
	
}
