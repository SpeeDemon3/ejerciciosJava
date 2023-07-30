package ejercicio09;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio9 {

	/*
	 * 9. Escriba un programa que simule una hucha. El programa solicitará primero una cantidad, 
	 * que será la cantidad de dinero que queremos ahorrar. A continuación, el programa solicitará 
	 * una y otra vez las cantidades que se irán ahorrando, hasta que el total ahorrado iguale o 
	 * supere al objetivo. No permitiendo que se escriban cantidades negativas.
	 */
	
	public static void main(String[] args) {

		try {
			
			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			// Variable de control para controlar el bucle while
			boolean control = true;
			
			// Variable donde guardare la cantidad que se desea ahorrar
			double cantidadDeseada = 0;
			
			System.out.println("### Cuenta de ahorros ###");
			
			// Mientras la variable control sea true el bucle seguira iterando
			while(control) {
				
				System.out.println("Indica la cantidad de dinero que desea ahorar en su cuenta:");
				
				// Guardo el valor introducido por el usuario
				cantidadDeseada = sc.nextDouble();
				
				// Si la cantidad introducida es menor a 1
				if (cantidadDeseada < 1) {
					
					// Informo por consola
					System.out.println("Debes introducir una cantidad de dinero valida");
					
				// Si la cantidad es valida
				} else {
					
					// Cambio el valor de la variable control a false y salgo del bucle
					control = false;
					
				}	
				
			}
			
			
			// Variable de control para controlar el bucle while
			boolean control2 = true;
			
			// Variable donde guardare la cantidad ahorrada
			double cantidadAhorrada = 0;
			
			// Mientras la variable control2 valga true el bucle seguira iterando
			while(control2) {
				
				System.out.println("Introduzca la cantidad de dinero que desea ingresar en su cuenta de ahorros:");
				
				// Guardo el valor introducido por el usuario
				double ingreso = sc.nextDouble();
				
				// Si la cantidad es menor o igual a 0
				if(ingreso <= 0) {
					
					System.out.println("Debes introducir dinero en la cuenta");
					// Continuo a la siguiente iteracion
					continue;
					
				// En caso contrario
				} else {
					
					// Sumo la cantidad ingresada a la variable cantidadAhorrada
					cantidadAhorrada += ingreso;
					
					// Informo por consola del dinero ahorrado actualmente
					System.out.println("Tienes ahorrado " + cantidadAhorrada + "€.");
					
				}
				
				// Si la cantidad ahorrada es mayor o igual a la cantidad deseada
				if (cantidadAhorrada >= cantidadDeseada) {
					
					System.out.println("Enhorabuena has conseguida alcanzar tu objetivo!!!");
					// Cambio el valor de la variable control a false para poder salir del bucle
					control2 = false;
				}
				
				
			}
			
		
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch (InputMismatchException ime) {
			
			System.out.println("Debes introducir un valor numérico.");

		}
		
		
	}

}
