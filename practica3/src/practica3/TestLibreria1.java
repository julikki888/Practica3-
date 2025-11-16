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
		 * • Visualizar por pantalla los de números perfectos que hay entre 2 números dados. 
		 * • Visualizar por pantalla las parejas de números amigos que hay entre 2 números dados. 
		 * • Comprobar si dos números son primos entre sí. 
		 * • Calcular la función de Euler de un número. 
		 * • Salir
		 */
		int menu;
		boolean sw = true;

		while (sw) {
			try (Scanner sc = new Scanner(System.in)) {

				System.out.println("\nElige una opcion (1..8): ");
				Menu();
				sc.nextLine();
				menu = sc.nextInt();
				
				
				switch (menu) {
				case 1 -> CalcularFactorial(sc);
				
				
				
				default ->
				throw new IllegalArgumentException("Unexpected value: " + menu);
				}

			}
		}

	}
	
	public static void Menu() {
		System.out.println("1. Calcular el Factorial.");
	}
	
	
	public static void CalcularFactorial(Scanner sc) {
		sc.nextLine();
		int num;
		System.out.println("Introduce el numero a factorizar: ");
		num = sc.nextInt();
				
		System.out.println("El factorial de "+num+" es: "+MiLibreria.Factorial(num));
		
	}
	
}
