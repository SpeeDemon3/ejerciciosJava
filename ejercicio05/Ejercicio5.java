package ejercicio05;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio5 {
	
	/*
	 * 5. Modifica el programa anterior para que solo deje de pedir números hasta que pongamos un 0, 
	 * y en ese caso se termine el programa imprimiendo la suma de todos los números.
	 */
	
	public static void main(String[] args) {


		try {

			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce 10 números enteros:");
			
			// Creo un array dinamico para guardar los valores introducidos por el usuario
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			
			// Creo una variable de control para controlar el bucle while
			boolean control = true;
			
			// Creo una variable que utilizare como indice
			int contador = 1;
			
			// Utilizando un bucle while voy solicitando los valores al usuario
			while(control) {
				// Muestro por consola el valor que debe ir introduciendo el usuario haciendo uso de la variable temporal i
				System.out.println("Introduce el valor " + contador + ":");
				
				// Sumo uno a la variable contador en cada iteracion
				contador ++;
				
				// Guardo el valor introducido por el usuario
				int valorNum = sc.nextInt();
				
				// Si el valor introducido por el usuario es 0 
				if (valorNum == 0) {
					// Cambio el valor de la variable control a false para poder salir del bucle
					control = false;
				}
				
				// Utilizando el metodo add() los voy añadiendo al ArrayList
				numeros.add(valorNum);
				
			}
			
			System.out.println("\nValores introducidos:");
			
			// Creo una variable donde ire acumulando el resultado de la suma de todos los numeros
			int sumaTotal = 0;
			
			// Muestro los valores introducidos por el usuario utilizando un bucle for-each
			for (Integer numero: numeros) {
				System.out.println(numero);
				
				// Voy acumulando la suma de cada numero en cada iteracion
				sumaTotal += numero;
			}
			
			// Muestro el resultado final de la suma de todos los numeros acumulado en la variable sumaTotal
			System.out.println("\nLa suma total de todos los números introducidos es " + sumaTotal + ".");
			
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch (InputMismatchException ime) {

			System.out.println("Debes introducir un valor numérico.");

		}
		
	}

}
