package ejercicio10;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio10 {

	/*
	 * 10. Sistema de delegados. Programa que pida tres nombres diferentes por la terminal. Una vez introducidos los tres, 
	 * nos pide que puntuemos en diferentes rondas de forma acumulativa diferentes puntos a cada uno.
	 * 
	 * El programa finalizara cuando se introduzca un numero negativo en cualquiera de los nombres y nos dará el resultado final, 
	 * ordenando la impresión de los nombres de mayor a menor e indicando el número de rondas.
	 * 
	 * La ronda en la que se ponga el numero negativo no sumara puntos a ningún participante.
	 * 
	 * Ejemplo:
	 * 
	 * 
	 * Ronda 1.
	 * 
	 * Puntos para Juan: 5
	 * 
	 * Puntos para Luís: 6
	 * 
	 * Puntos para Pepe:20
	 * 
	 * 
	 * Ronda 2:
	 * 
	 * Puntos para Juan: 10
	 * 
	 * Puntos para Luís: 8
	 * 
	 * Puntos para Pepe:3
	 * 
	 * 
	 * Ronda 3
	 * 
	 * Puntos para Juan: 5
	 * 
	 * Puntos para Luís: 6
	 * 
	 * Puntos para Pepe:-5
	 * 
	 * 
	 * RESULTADOS:
	 * 
	 * Se han realizado 2 rondas y los resultados son:
	 * 
	 * Pepe: 23 puntos.
	 * 
	 * Juan: 15 puntos.
	 * 
	 * Luis 14 puntos.
	 * 
	 */
	
	public static void main(String[] args) {

		try {
			
			System.out.println("### Sistema de delegados ###");
			
			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el nombre del primer delegado:");
			// Guardo el valor introducido por el usuario
			String nombreDelegado1 = sc.nextLine();
			
			System.out.println("Introduce el nombre del segundo delegado:");
			// Guardo el valor introducido por el usuario
			String nombreDelegado2 = sc.nextLine();
			
			System.out.println("Introduce el nombre del tercer delegado:");
			// Guardo el valor introducido por el usuario
			String nombreDelegado3 = sc.nextLine();
			
			// Variables acumulativas puntos
			int puntosDelegado1 = 0;
			int puntosDelegado2 = 0;
			int puntosDelegado3 = 0;
			
			// Variables para guardar los puntos en cada ronda
			int puntosDelegado1Ronda = 0;
			int puntosDelegado2Ronda = 0;
			int puntosDelegado3Ronda = 0;

			// Creo un array bidimensional de tipo String para guardar la informacion
			// Agregando el nombre de cada delegado y un string vacio donde guardare la puntiacion
			String[][] delegados = {
					{nombreDelegado1, ""},
					{nombreDelegado2, ""},
					{nombreDelegado3, ""}
			};
			
			
			// Variable para controlar el bucle
			boolean control = true;
			
			// Variable para contar el numero de rondas
			int numRondas = 0;
			
			// Mientras la variable control valga true el bucle seguira iterando
			while(control) {
				
				// En cada iteracion sumo 1 a la variable numRondas
				numRondas++;
				
				// Muestro por consola en que ronda se esta en cada iteracion
				System.out.println("RONDA: " + numRondas);
				
				// Pido y guardor la puntuacion de cada ronda
				System.out.println("Introduce la puntuación del primer delegado:");
				puntosDelegado1Ronda = sc.nextInt();
				
				System.out.println("Introduce la puntuación del segundo delegado:");
				puntosDelegado2Ronda = sc.nextInt();
				
				System.out.println("Introduce la puntuación del tercer delegado:");
				puntosDelegado3Ronda = sc.nextInt();
				
				// Compruebo si se ha introducido un numero positivo
				if(puntosDelegado1Ronda >= 0 && puntosDelegado2Ronda >= 0 && puntosDelegado3Ronda >= 0) {

					// Sumo el valor de la variable puntosDelegado1Ronda ha puntosDelegado1
					puntosDelegado1 += puntosDelegado1Ronda;
					
					// Sumo el valor de la variable puntosDelegado1Ronda ha puntosDelegado1
					puntosDelegado2 += puntosDelegado2Ronda;
					
					// Sumo el valor de la variable puntosDelegado1Ronda ha puntosDelegado1
					puntosDelegado3 += puntosDelegado3Ronda;
					
					// Asigno el valor de la variable puntosDelegadoRonda 1,2,3 a a cada posicion dentro del array para poder imprimir los valores
					delegados[0][1] = puntosDelegado1Ronda + "";
					delegados[1][1] = puntosDelegado2Ronda + "";
					delegados[2][1] = puntosDelegado3Ronda + "";
					
					// Utilizando 2 bucles for recorro el array bidimensional
					for (int i = 0; i < delegados.length; i++) {
						
						System.out.print("Puntos para ");
						
						for(int j = 0; j < delegados[0].length; j++) {
							// Concateno un string vacio para separar los 2 elementos del array
							System.out.print(delegados[i][j] + " ");
							
						}
					
						System.out.println();
						
					}

				// En caso de que el numero sea negativo
				} else {
					
					
					// Cambio el valor de la variable control ha false para salir del bucle
					control = false;
										
					// Muestro por consola el numero de rondas jugadas
					System.out.println("Número de rondas -> " + numRondas);
					
					System.out.println("\nRESULTADOS:\n");
					
					// Asigno la puntuacion final a cada delegado concatenandolo con un string para convertirlo a String
					delegados[0][1] = puntosDelegado1 + "";
					delegados[1][1] = puntosDelegado2 + "";
					delegados[2][1] = puntosDelegado3 + "";
					
					
				    // Variables auxiliares que utilizaré para intercambiar las puntuaciones y nombres
				    String temporalPuntuacion;
				    String temporalNombre;
					
					
					// Si la puntuacion del delegado 1 es menor a la del delegado 2
				    if (puntosDelegado1 < puntosDelegado2) {
				    	
				    	// Guardo en las variable temporales los valores originales para no perderlos en el intercambio
				        temporalPuntuacion = delegados[0][1];
				        temporalNombre = delegados[0][0];
				        
				        // Asigno los nuevos valores en cada posicion
				        delegados[0][1] = delegados[1][1];
				        delegados[0][0] = delegados[1][0];
				        
				        delegados[1][1] = temporalPuntuacion;
				        delegados[1][0] = temporalNombre;
				        
				    }
				    
				    // Si la puntuacion del delegado 1 es menor a la del delegado 3
				    if (puntosDelegado1 < puntosDelegado3) {
				    	
				    	// Guardo en las variable temporales los valores originales para no perderlos en el intercambio
				        temporalPuntuacion = delegados[0][1];
				        temporalNombre = delegados[0][0];
				        
				        // Asigno los nuevos valores en cada posicion
				        delegados[0][1] = delegados[2][1];
				        delegados[0][0] = delegados[2][0];
				        
				        delegados[2][1] = temporalPuntuacion;
				        delegados[2][0] = temporalNombre;
				    }
				    
				    // Si la puntuacion del delegado 2 es menor a la del delegado 3
				    if (puntosDelegado2 < puntosDelegado3) {
				    	
				    	// Guardo en las variable temporales los valores originales para no perderlos en el intercambio
				        temporalPuntuacion = delegados[1][1];
				        temporalNombre = delegados[1][0];
				        
				        // Asigno los nuevos valores en cada posicion
				        delegados[1][1] = delegados[2][1];
				        delegados[1][0] = delegados[2][0];
				        
				        delegados[2][1] = temporalPuntuacion;
				        delegados[2][0] = temporalNombre;
				    }
					
					
					// Utilizando 2 bucles for recorro el array bidimensional
					for (int i = 0; i < delegados.length; i++) {
												
						for(int j = 0; j < delegados[0].length; j++) {
							// Concateno un string vacio para separar los 2 elementos del array
							System.out.print(delegados[i][j] + " ");
							
						}

						System.out.println("puntos.");
					
				}

				
				
			}
			
			}
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch (InputMismatchException ime) {
				
			System.out.println("Debes introducir un valor numérico.");

		}
		
	}

}
