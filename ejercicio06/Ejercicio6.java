package ejercicio06;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio6 {

	/*
	 * 6. Programa que nos pida números hasta que introduzcamos un 0, y nos muestre
	 * al final el número mas alto, el más pequeño y la media de todos los números
	 * introducidos.
	 */

	public static void main(String[] args) {

		try {

			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			// Creo un ArrayList para poder guardar los valores introducidos por el usuario de forma dinamica
			ArrayList<Integer> valores = new ArrayList<Integer>();
			
			// Creo una variable de control para controlar el bucle do while
			boolean control = false;
			
			do {
				// Muestro un mensaje por consola al usuario
				System.out.println("Introduzca un valor numérico, si desea dejar de introducir valores pulse [0]:");
				
				// Guardo el valor introducido por el usuario
				int valor = sc.nextInt();
				
				// Compruebo si el valor introducido es igual a 0
				if(valor == 0) {
					// Cambio el valor de la variable control a true para salir del bucle
					control = true;
				// En caso de que el valor introducido sea distinto de 0
				} else {
					// Utilizando el metodo add() añado el valor al ArrayList dinamico
					valores.add(valor);
				}
				
			// Mientras la variable control no sea distinta de false el bucle seguira iterando
			} while(!control);
			
			
			// Creo una variable donde guardare el valor maximo que contiene el ArrayList valores
			int max = 0;
			
			// Utilizando un bucle for-each recorro el ArrayList para encontrar el numero maximo
			for (Integer valor : valores) {
				// Si la variable max es menor a la variable valor
				if(max < valor) {
					// Asigno el valor de la variable valor a la variable max
					max = valor;
				}
				
			}
			
			// Imprimo por consola el valor maximo
			System.out.println("El valor maximo es: " + max);
			
			
			// Creo una variable donde guardare el valor minimo que contiene el ArrayList valores
			// Accediendo a la primer elemento del ArrayList con el metodo get(posicion)
			int min = valores.get(0);
			
			// Utilizando un bucle for-each recorro el ArrayList para encontrar el numero minimo
			for (Integer valor : valores) {
				// Si la variable min es mayor a la variable valor
				if(min > valor) {
					// Asigno el valor de la variable valor a la variable min
					min = valor;
				}
				
			}
			
			// Imprimo por consola el valor minimo
			System.out.println("El valor minimo es: " + min);
			
			
			// Creo una variable donde guardare el valor total de los numeros que contiene el ArrayList valores
			int valorTotal = 0;
			
			// Utilizando un bucle for-each recorro el ArrayList para acumular la suma total de los numeros dentro del ArrayList
			for (Integer valor : valores) {
				// En cada iteracion voy sumando a la variable valorTotal el valor de la variable valor
				valorTotal += valor;
				
			}
			
			// Dentro de una varaiable calculo la media de todos los numeros
			// Utilizando el metodo size() obtengo el numero de elementos que contiene el ArrayList
			double media = valorTotal / valores.size();
			
			// Imprimo por consola la media de la suma de todos los numeros
			System.out.println("El valor de la media es: " + media);
			
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch (InputMismatchException ime) {

			System.out.println("Debes introducir un valor numérico.");

		}

	}

}
