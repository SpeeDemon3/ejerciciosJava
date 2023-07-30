package ejercicio02;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio2 {

	/*
	 * 2. Programa que pida por teclado dos notas y nos retorne por la terminal la suma y el producto de las dos.
	 */
	
	public static void main(String[] args) {
		
		try {
			
			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			// Muestro un mensaje por consola al usuario
			System.out.println("Introduce la primera nota:");
			
			// Recojo el valor introducido por el usuario
			double nota1 = sc.nextDouble();
			
			// Muestro un mensaje por consola al usuario
			System.out.println("Introduce la segunda nota:");
			
			// Recogo el valor introducido por el usuario
			double nota2 = sc.nextDouble();
			
			// Sumo el valor de las 2 variables y lo guardo en una variable
			double suma = nota1 + nota2;
			
			// Muestro por consola el resultado de la suma al usuario
			System.out.println("La suma de " + nota1 + " + " + nota2 + " es " + suma);
			
			// Calculo el producto de las notas
			double producto = nota1 * nota2;
			
			System.out.println("El producto de " + nota1 + " * " + nota2 + " es " + producto);
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch(InputMismatchException ime) {
			
			System.out.println("Debes introducir un valor numérico.");
			
		}

		
	}

}
