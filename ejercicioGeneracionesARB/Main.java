package ejercicioGeneracionesARB;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Antonio Ruiz Benito
 */
public class Main {

	/*
	 * 
	 * Hacer un programa en JAVA que nos pida diferentes años y nos indique a que generación pertenecen.
	 * 
	 * El programa terminara cuando una de las generaciones tenga más de 10 resultados
	 * 
	 * (Ejemplo: si hemos puesto 10 veces un año entre 1994 y 2010, ya tenemos 10 de generación Z y el programa terminara) 
	 * 
	 * en el programa si introducimos un año fuera del rango, mayor a 2025 o menor a 1930, indicara que no es correcto y pedira de nuevo un año. 
	 * 
	 * El programa finalizara si se introduce un cero en el lugar del año.
	 * 
	 */
	
	public static void main(String[] args) {

		// Variable para controlar el bucle do while
		boolean control = true;
		
		// Variables para contar el numero de veces que se selecciona una generacion
		int contadorGenAlpha = 0;
		int contadorGenZ = 0;
		int contadorGenMil = 0;
		int contadorGenX = 0;
		int contadorGenBoom = 0;
		int contadorGenTradicional = 0;
		
		do {
		
			try {
		
			
				
				System.out.println("\t### Sistema De Generaciones ###\n");
				
				// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
				Scanner sc = new Scanner(System.in);
				
				// Menu 
				System.out.println("Indica en que año naciste:"
						+ "\nSi desea finalizar el programa pulse [0]");
				
				// Recojo el valor introducido por el usuario
				int opcUsuario = sc.nextInt();
				sc.nextLine();
				
				// Compruebo si el usuario ha introducido un 0
				if (opcUsuario == 0) {
					
					System.out.println("\tGracias por utilizar el programa\n"
							+ "\tEjercicio realizado por Antonio Ruiz Benito");
					
					// Cambio el valor de la variable control a false para poder salir del programa
					control = false;
				
				// Compruebo si el usuario ha introducido un valor negativo o superior al permitido
				} else if(opcUsuario < 0 || opcUsuario > 2025) {
					System.out.println("Debes introducir un valor dentro del rango permitido.");
					
					// Continuo a la siguiente iteracion
					continue;
					
				// Compruebo si el usuario ha introducido un valor mayor que 0
				} else if (opcUsuario > 0 ) {
					
					// Compruebo si el año esta entre 1930 y 1949 -> Generacion Silencionsa/Tradicional
					if (opcUsuario >= 1930 && opcUsuario <= 1949) {
						
						// Utilizando el metodo muestro un mensaje personalizado al usuario y sumo 1 a la variable
						contadorGenTradicional = Funciones.genTradicional(contadorGenTradicional);
						
						// Utilizando el metodo contador de la clase Funciones controlo el numero de veces que se utiliza 
						// cada variable contador hasta que una llegue a 10 y cambio el valor de la variable control
						control = Funciones.contador(contadorGenTradicional, control);
					
					// Compruebo si el año esta entre 1950 y 1963 -> Generacion Baby Boomers
					} else if(opcUsuario >= 1950 && opcUsuario <= 1963) {
						// Asigno el nuevo valor a las variables
						contadorGenBoom = Funciones.genBoomers(contadorGenBoom);
						control = Funciones.contador(contadorGenBoom, control);

					// Compruebo si el año esta entre  1964 y 1979 -> Generacion X
					} else if(opcUsuario >= 1964 && opcUsuario <= 1979) {
						
						contadorGenX = Funciones.genX(contadorGenX);
						control = Funciones.contador(contadorGenX, control);
						
					// Compruebo si el año esta entre  1980 y 1993 -> Generacion Millennials
					} else if(opcUsuario >= 1980 && opcUsuario <= 1993) {
						
						contadorGenMil = Funciones.genMillennials(contadorGenMil);
						control = Funciones.contador(contadorGenMil, control);
					
					// Compruebo si el año esta entre  1994 y 2010 -> Generacion Z
					} else if (opcUsuario >= 1994 && opcUsuario <= 2010) {
						
						contadorGenZ = Funciones.genZ(contadorGenZ);
						control = Funciones.contador(contadorGenZ, control);
					
					// Compruebo si el año esta entre 2011 y 2025 -> Generacion Alpha
					} else if (opcUsuario >= 2011 && opcUsuario <= 2025) {
						
						contadorGenAlpha = Funciones.genAlpha(contadorGenAlpha);
						control = Funciones.contador(contadorGenAlpha, control);
						
					}
					
					
					
				}
				
			// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
			} catch(InputMismatchException ime) {
						
				System.out.println("Debes introducir un valor numérico.");
							
			}
			
		} while(control); // Mientras control sea true el bucle seguira iterando

		
		
	}

}
