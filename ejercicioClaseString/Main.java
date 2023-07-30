package ejercicioClaseString;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Antonio Ruiz Benito-SpeedDemoN
 */
public class Main {

	/*
	 * Realiza un programa que mediante funciones manipule los objetos String almacenados en un Array.
	 * El programa debe de solicitar en el arranque el tamaño inicial del mismo.
	 * Luego debemos cumplimentar las siguientes Opciones:
	 * 
	 * System.out.println("Selecciona una opción");
		System.out.println("----------------------");
		System.out.println("1. LLenar el Array");
		System.out.println("2. LLenar el Array sin duplicados");
		System.out.println("3. LLenar el Array uno a uno (inserar un solo nombre, despues del ultimo insertado");
		System.out.println("4. Cambia todas una letra en todo el array por la que le indiquemos.");
		System.out.println("5. Quita todos los espacios que tenga una palabra al principio y/o al final");
		System.out.println("6. Imprimir lista original");
		System.out.println("7. Remplazar un nombre dandole la posición");
		System.out.println("8. Imprimir toda la lista en mayusculas");
		System.out.println("9. Imprimir toda la lista en minusculas");
		System.out.println("10. Cambia un nombre que te doy por otro que tambien te doy");
		System.out.println("11. dame la posición de un nombre que te indico");
		System.out.println("12. Vacia el array poniendo una cadena vacia en cada posición");
		System.out.println("13. Te doy un nombre y una posición y la remplazas en el array");
		System.out.println("14. Escribe una palabra formada de la primera letra de cada una que tenemos en el array");
		System.out.println("15. Cambia el tamaño del array");
		System.out.println("16. Dime el número de caracteres que tiene una palabra si te doy su posición");
		System.out.println("17. Cuantos elementos tengo en el Array");
		System.out.println("0. Salir");
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int longitudArray = 0;
				
			do {
					
				System.out.println("Indica con un número positivo, la longitud del array que deseas crear:");
									
				longitudArray = sc.nextInt();
					
			} while(longitudArray < 1);
			
			// Creo el array con la longitud indicada por el usuario
			String[] arrayUsuario =Function.crearArray(longitudArray);
			
			// Variable de control para controlar el bucle
			boolean control = true;
			
			// Utilizando un bucle do while mostrare el menu hasta que el usuario decida lo contrario
			do {
				// Muestro el menu al usuario
				Function.menu();
				
				// Guardo la opcion escogida por el usuario
				int opc = sc.nextInt();
				
				// Utilizando una estructura de seleccion switch controlare los diferentes casos
				switch(opc) {
				
					// Salir del programa
					case 0: 
						System.out.println("Gracias por utilizar el programa.");
						
						// Cambio el valor de la variable control a false para poder salir del bucle
						control = false;
						
						break;
						
					// Llenar el array
					case 1:
						Function.llenarArray(arrayUsuario);
						break;
						
					// 	LLenar el Array sin duplicados
					case 2:
						Function.llenarArraySinDuplicados(arrayUsuario);
						break;
						
					//	LLenar el Array uno a uno (inserar un solo nombre, despues del ultimo insertado
					case 3:
						Function.rellenarArrayUnoAUno(arrayUsuario);
						break;
						
					// Cambia todas una letra en todo el array por la que le indiquemos
					case 4:
						Function.cambiarLetrasPorUna(arrayUsuario);
						break;
						
					// Quita todos los espacios que tenga una palabra al principio y/o al final
					case 5:
						Function.quitarEspacios(arrayUsuario);
						break;
						
					// Imprimir lista original
					case 6:
						Function.recorrerArray(arrayUsuario);
						break;
						
					// Remplazar un nombre dandole la posición
					case 7:
						Function.remplazarNombrePosicion(arrayUsuario);
						break;
					
					// Imprimir toda la lista en mayusculas
					case 8:
						Function.imprimirEnMayusculas(arrayUsuario);
						break;
						
					// Imprimir toda la lista en minusculas
					case 9:
						Function.imprimirEnMinusculas(arrayUsuario);
						break;
						
					// Cambia un nombre que te doy por otro que tambien te doy
					case 10:
						Function.cambiarNombrePorOtro(arrayUsuario);
						break;
						
					// Dame la posición de un nombre que te indico
					case 11:
						Function.obtenerPosicionElemento(arrayUsuario);
						break;
						
					// Vacia el array poniendo una cadena vacia en cada posición
					case 12:
						Function.vaciarArray(arrayUsuario);
						break;
						
					// Te doy un nombre y una posición y la remplazas en el array
					case 13:
						Function.remplazarElementoPorNombreYPosicion(arrayUsuario);
						break;
						
					// Escribe una palabra formada de la primera letra de cada una que tenemos en el array
					case 14:
						Function.formarPalabraConInicioPalabras(arrayUsuario);
						break;
						
					// Cambia el tamaño del array
					case 15:
						//String[] nuevoArray = Function.cambiarTamanioArray(arrayUsuario);
						//arrayUsuario = nuevoArray;
						arrayUsuario = Function.cambiarTamanioArray(arrayUsuario);
						break;
						
					// Dime el número de caracteres que tiene una palabra si te doy su posición
					case 16:
						Function.obtenerNumeroCaracteres(arrayUsuario);
						break;
						
					// Cuantos elementos tengo en el Array
					case 17:
						Function.obtenerLongitudArray(arrayUsuario);
						break;
				}

				
			} while(control);
			
			
			
		} catch(InputMismatchException ime) {
			
			System.out.println("Debes introducir un número positivo.");
			
		}
		

		
		
	}

}
