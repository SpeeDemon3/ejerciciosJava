package ejercicio07;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio7 {

	/*
	 * 	7. Programa que nos pida un numero de asteriscos horizontales y los verticales y los represente en 
	 * 	la terminal
	 * 	
	 * 	Ejemplo: 5, 3
	 * 	
	 * 	*****
	 * 	*****
	 * 	*****
	 */
	
	public static void main(String[] args) {
		


		try {

			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			// Pido el primer valor
			System.out.println("Indica el número de asteriscos hotizontales:");
			// Guardo el primer valor
			int asteriscosHorizontales = sc.nextInt();
			
			// Pido el segundo valor
			System.out.println("Indica el número de asteriscos verticales:");
			// Guardo el segundo valor
			int asteriscosVerticales = sc.nextInt();
			
			// Creo un salto de linea
			System.out.println("");
			
			// Creo un array de tipo char donde paso como filas la variable asteriscosHorizontales y como columnas la varible asteriscosVerticales
			char[][] asteriscos = new char[asteriscosHorizontales][asteriscosVerticales];

			// Utilizando 2 bucles for recorro el array bidimensional
			for(int i = 0; i < asteriscos.length; i++) {
				
				for(int j = 0; j < asteriscos[0].length; j++) {
					// Dentro de cada posicion agrego el valor '*'
					asteriscos[i][j] = '*';
					
				}
				
				
			}
			
			// Utilizando 2 bucles for recorro las 2 dimensiones del array
			for (int i = 0; i < asteriscos.length; i++) {
				
				for (int k = 0; k < asteriscos[0].length; k++) {
					// Imprimo sus valores utilizando print para que me los imprima en una sola linea cada fila
					System.out.print(asteriscos[i][k]);

				}
				
				// Creo un salto de linea
				System.out.println("");
				
			}
			
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch (InputMismatchException ime) {

			System.out.println("Debes introducir un valor numérico.");

		}
		
	}

}
