package ejercicio03;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio3 {

	/*
	 * 3. Programa que nos pida dos números positivos y nos indique si es
	 * múltiplo de dos, de tres o de cinco.
	 */

	public static void main(String[] args) {

		try {
			
			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el primer número positivo:");
			
			// Recojo el valor introducido por el usuario
			int numero1 = sc.nextInt();
			
			// Compruebo si el numero es negativo
			// Mientras el valor sea menor a 0 el bucle seguira iterando
			while(numero1 < 0) {
				// Informo al usuario
				System.out.println("Debes introducir un número positivo:");
				// Vuelvo a recoger el valor
				numero1 = sc.nextInt();
					
			}
				
			
			System.out.println("Introduce el segundo número positivo:");
			
			// Recojo el valor introducido por el usuario
			int numero2 = sc.nextInt();

			// Compruebo si el numero es negativo
			// Mientras el valor sea menor a 0 el bucle seguira iterando
			while(numero2 < 0) {
				// Informo al usuario
				System.out.println("Debes introducir un número positivo:");
				// Vuelvo a recoger el valor			
				numero2 = sc.nextInt();
								
			}
			
			// ### Compruebo si la variable numero1 es multiplo de 2, 3 y 5
			
			// Si la variable numero1 modulo 2 es igual a 0
			if (numero1 % 2 == 0) {
				// Informo por consola
				System.out.println(numero1 + " es múltiplo de 2.");
			
			// En caso contrario
			} else {
				// Informo por consola
				System.out.println(numero1 + " no es múltiplo de 2.");

			}
			
			// Si la variable numero1 modulo 3 es igual a 0
			if (numero1 % 3 == 0) {
				// Informo por consola
				System.out.println(numero1 + " es múltiplo de 3.");
						
			// En caso contrario
			} else {
				// Informo por consola
				System.out.println(numero1 + " no es múltiplo de 3.");

			}
			
			// Si la variable numero1 modulo 5 es igual a 0
			if (numero1 % 5 == 0) {
				// Informo por consola
				System.out.println(numero1 + " es múltiplo de 5.");
									
			// En caso contrario
			} else {
				// Informo por consola
				System.out.println(numero1 + " no es múltiplo de 5.");

			}
			
			
			// ### Compruebo si la variable numero2 es multiplo de 2, 3 y 5
			
			// Si la variable numero1 modulo 2 es igual a 0
			if (numero2 % 2 == 0) {
				// Informo por consola
				System.out.println(numero2 + " es múltiplo de 2.");
						
			// En caso contrario
			} else {
				// Informo por consola
				System.out.println(numero2 + " no es múltiplo de 2.");

			}
						
			// Si la variable numero2 modulo 3 es igual a 0
			if (numero2 % 3 == 0) {
				// Informo por consola
				System.out.println(numero2 + " es múltiplo de 3.");
									
			// En caso contrario
			} else {
				// Informo por consola
				System.out.println(numero2 + " no es múltiplo de 3.");

			}
						
			// Si la variable numero2 modulo 5 es igual a 0
			if (numero2 % 5 == 0) {
				// Informo por consola
				System.out.println(numero2 + " es múltiplo de 5.");
												
			// En caso contrario
			} else {
				// Informo por consola
				System.out.println(numero2 + " no es múltiplo de 5.");

			}
			
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch (InputMismatchException ime) {

			System.out.println("Debes introducir un valor numérico.");

		}

	}

}
