package ejercicio08;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class ejercicio8 {

	/*
	 *8. Programa que nos pida tres palabras y nos indique el numero de palabras diferentes o cuantas son iguales. 
	 *El proceso se repetirá hasta que una de las palabras sea salir.
	 *
	 *Ejemplo:
	 *
	 *casa, coche, casa -> dos palabras son iguales, 
	 */
	
	public static void main(String[] args) {

		// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
		Scanner sc = new Scanner(System.in);
		
		// Variable de control para controlar el bucle while
		boolean control = true;
		
		System.out.println("### Comparador de palabras ###");
		
		// Mientras la variable control sea true el bucle seguira iterando
		while(control) {
			
			System.out.println("Si desea finalizar el programa introduzca [salir]");
			
			System.out.println("Indica la primera palabra:");
			// Guardo el valor introducido por el usuario
			String palabra1 = sc.nextLine();
			
			System.out.println("Indica la segunda palabra:");
			// Guardo el valor introducido por el usuario
			String palabra2  = sc.nextLine();
			
			System.out.println("Indica la tercera palabra:");
			// Guardo el valor introducido por el usuario
			String palabra3 = sc.nextLine();
			
			// Muestro por consola las palabras introducidas creando un salto de linea '\n' y un tabulado '\t'
			System.out.println("Palabras introducidas:\n"
								+ "\t* " + palabra1
								+ "\n\t* " + palabra2
								+ "\n\t* " + palabra3);
			
			// Compruebo si alguna de las palabras introducidas es "salir" utilizando el metodo equalsIgnoreCase() ignorando si el usuario 
			// ha introducido el texto en mayusculas o minusculas y comparandolo con la palabra introducida
			if (palabra1.equalsIgnoreCase("salir") || palabra2.equalsIgnoreCase("salir") || palabra3.equalsIgnoreCase("salir")) {
				
				System.out.println("Gracias por utilizar el programa!!!");
				
				// Cambio el valor de la variable control a false para poder salir del programa
				control = false;
				
			// En caso contrario
			} else {
				
				// Si palabra1 es igual a palabra2 y palabra1 es igual a palabra3 ignorando myusculas y minusculas
				if (palabra1.equals(palabra2) && palabra1.equalsIgnoreCase(palabra3)) {
					
					System.out.println("Las 3 palabras introducidas son iguales.");
				
				// Si palabra1 es igual a palabra2 o palabra1 es igual a palabra3 ignorando myusculas y minusculas
				} else if(palabra1.equalsIgnoreCase(palabra2) || palabra1.equalsIgnoreCase(palabra3)) {
					
					System.out.println("Hay 2 palabras iguales.");
					
				// Si palabra2 es igual a palabra3 ignorando myusculas y minusculas
				} else if(palabra2.equalsIgnoreCase(palabra3)) {

					System.out.println("Hay 2 palabras iguales.");
				
				// En caso de que ninguna sea igual
				} else {
					
					System.out.println("Ninguna de las 3 palabras es igual.");

				}
				
				
				
			}
			
			
		}
		
	}

}
