package ejercicio01;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio1 {

	/*
	 * 1. Programa que pida por teclado la base y la altura de un cuadrado y 
	 * 	  nos retorne el área por la terminal.
	 */
	
	public static void main(String[] args) {

		try {
			
			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			// Muestro un mensaje por consola al usuario
			System.out.println("Introduce la base del cuadrado:");
			
			// Recojo el valor introducido por el usuario
			int base = sc.nextInt();
			
			// Muestro un mensaje por consola al usuario
			System.out.println("Introduce la altura del cuadrado:");

			// Recojo el valor introducido por el usuario
			int altura = sc.nextInt();
			
			// Guardo en una variable el resultado de calcular el area del cuadrado(base * altura)
			int area = base * altura;
			
			// Muestro el resultado por consola
			System.out.println("El area del cuadrado de base " + base + " altura " + altura + " es: " + area);
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch(InputMismatchException ime) {
			
			System.out.println("Debes introducir un valor numérico.");
			
		}
		
		
		
	}

}
