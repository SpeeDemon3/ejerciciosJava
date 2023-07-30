package ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author -> Antonio Ruiz Benito
 */
public class Ejercicio11 {

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

		try {
			
			System.out.println("\t### Sistema De Generaciones ###\n");
			
			// Creo una variable de la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			// Creo una variable para controlar el bucle
			boolean control = true;
			
			// Variables para contar el numero de veces que se selecciona una generacion
			int contadorGenAlpha = 0;
			int contadorGenZ = 0;
			int contadorGenMil = 0;
			int contadorGenX = 0;
			int contadorGenBoom = 0;
			int contadorGenTradicional = 0;
			
			// Utilizando un bucle for controlare hasta cuando debe seguir ejecutandose el programa
			while(control){
				
				// Menu 
				System.out.println("Indica en que año naciste:"
						+ "\nSi desea finalizar el programa pulse [0]");
				
				// Guardo el valor introducido por el usuario
				int anioNacimiento = sc.nextInt();
				
				// Compruebo si la fecha es un valor negativo
				if (anioNacimiento < 0) {
					

				}
				
				// Compruebo si el usuario desea finalizar el programa
				if (anioNacimiento == 0) {
					
					System.out.println("Gracias por utilizar el programa.");
					
					// Cambio el valor de la variable a false para finalizar el bucle
					control = false;
					
				}
	
				
				// Utilizando una estructura de seleccion switch controlo los diferentes casos
				switch(anioNacimiento) {
				
					// Casos entre 1930 y 1949 -> Generacion Silencionsa/Tradicional
					case 1930:
					case 1931:
					case 1932:
					case 1933:
					case 1934:
					case 1935:
					case 1936:
					case 1937:
					case 1938:
					case 1939:
					case 1940:
					case 1941:
					case 1942:
					case 1943:
					case 1944:
					case 1945:
					case 1946:
					case 1947:
					case 1948:
					case 1949:
						
						// Muestro informacion de la generacion por consola
						System.out.println("\tEcho importante: Guerra entre paises.\n");
						
						System.out.println("\tSon saludables y enérgicos. Leales con superiores\n"
								+ "\ty buscan más allá de ser reconocidos con el trabajo duro.\n");
						
						// Sumo uno al contador
						contadorGenTradicional++;
						
						// Salgo de la estructura de control
						break;
				
					// Casos entre 1950 y 1963 -> Generacion Baby Boomers
					case 1950:
					case 1951:
					case 1952:
					case 1953:
					case 1954:
					case 1955:
					case 1956:
					case 1957:
					case 1958:
					case 1959:
					case 1960:
					case 1961:
					case 1962:
					case 1963:
						
						// Muestro informacion de la generacion por consola
						System.out.println("\tÉpoca de paz y libertad.\n");
						
						System.out.println("\tSon ambiciosos, motivados a los logros personales y\n"
								+ "\tlaborales.");
				
						// Sumo uno al contador
						contadorGenBoom++;
						
						// Salgo de la estructura de control
						break;
						
					// Casos entre 1964 y 1979 -> Generacion X
					case 1964:
					case 1965:
					case 1966:
					case 1967:
					case 1968:
					case 1969:
					case 1970:
					case 1971:
					case 1972:
					case 1973:
					case 1974:
					case 1975:
					case 1976:
					case 1977:
					case 1978:
					case 1979:
						
						// Muestro informacion de la generacion por consola
						System.out.println("\tTecnología análoga y evolución a la\n"
								+ "\tdigitalización.\n");
						
						System.out.println("\tSon inconformistas y van más allá\n"
								+ "\tpor la obsesión del éxito.");
						
						// Sumo uno al contador
						contadorGenX++;
						
						// Salgo de la estructura de control
						break;
						
					// Casos entre 1980 y 1993 -> Generacion Millennials
					case 1980:
					case 1981:
					case 1982:
					case 1983:
					case 1984:
					case 1985:
					case 1986:
					case 1987:
					case 1988:
					case 1989:
					case 1990:
					case 1991:
					case 1992:
					case 1993:
						
						// Muestro informacion de la generacion por consola
						System.out.println("\tInicio de internet y digitalización.\n");
				
						System.out.println("\tSon intransigentes. Hijos de padres Baby boomers\n"
								+ "\t y generación X más veteranos.");
						
						// Sumo uno al contador
						contadorGenMil++;
						
						// Salgo de la estructura de control
						break;
						
					// Casos entre 1994 y 2010 -> Generacion Z
					case 1994:
					case 1995:
					case 1996:
					case 1997:
					case 1998:
					case 1999:
					case 2000:
					case 2001:
					case 2002:
					case 2003:
					case 2004:
					case 2005:
					case 2006:
					case 2007:
					case 2008:
					case 2009:
					case 2010:
						
						// Muestro informacion de la generacion por consola
						System.out.println("\tInfancia directa a internet.\n");
						
						System.out.println("\tSon irreverentes. Hijos de padres Baby boomers\n"
								+ "\t y generación X.");
						
						// Sumo uno al contador
						contadorGenZ++;
						
						// Salgo de la estructura de control
						break;
						
					// Casos entre 2011 y 2025 -> Generacion Alpha
					case 2011:
					case 2012:
					case 2013:
					case 2014:
					case 2015:
					case 2016:
					case 2017:
					case 2018:
					case 2019:
					case 2020:
					case 2021:
					case 2022:
					case 2023:
					case 2024:
					case 2025:
						
						// Muestro informacion de la generacion por consola
						System.out.println("\tNativos digitales al 100% (Smartphone y Tablet)\n");
						
						System.out.println("\tSon predilectos. Hijos de padres Millennials y\n"
								+ "\tCentennials más veteranos (no planeados).");
						// Sumo uno al contador
						contadorGenAlpha++;
						
						// Salgo de la estructura de control
						break;
					
					// Si el usuario introduce un año fuera del rango permitido 
					default:
						// Informo por consola
						System.out.println("Debes introducir desde el año 1930 hasta el año 2025.");
						break;
						
				}
				
				
				// Compruebo el numero de veces que se ha introducido esta generacion
				if (contadorGenTradicional == 10) {
					
					System.out.println("Gracias por utilizar el programa.");
					
					// Cambio el valor de la variable a false para finalizar el bucle
					control = false;
					
				}
				
				// Compruebo el numero de veces que se ha introducido esta generacion
				if (contadorGenBoom == 10) {
					
					System.out.println("Gracias por utilizar el programa.");
					
					// Cambio el valor de la variable a false para finalizar el bucle
					control = false;
					
				}
				
				// Compruebo el numero de veces que se ha introducido esta generacion
				if (contadorGenX == 10) {
					
					System.out.println("Gracias por utilizar el programa.");
					
					// Cambio el valor de la variable a false para finalizar el bucle
					control = false;
					
				}
				
				// Compruebo el numero de veces que se ha introducido esta generacion
				if (contadorGenMil == 10) {
					
					System.out.println("Gracias por utilizar el programa.");
					
					// Cambio el valor de la variable a false para finalizar el bucle
					control = false;
					
				}
				
				// Compruebo el numero de veces que se ha introducido esta generacion
				if (contadorGenZ == 10) {
					
					System.out.println("Gracias por utilizar el programa.");
					
					// Cambio el valor de la variable a false para finalizar el bucle
					control = false;
					
				}
				
				// Compruebo el numero de veces que se ha introducido esta generacion
				if (contadorGenAlpha == 10) {
					
					System.out.println("Gracias por utilizar el programa.");
					
					// Cambio el valor de la variable a false para finalizar el bucle
					control = false;
					
				}
				
			}
			
		// Controlo la excepcion que pudiera ocurrir si el usuario introduce no introduce un valor numerico
		} catch(InputMismatchException ime) {
			
			System.out.println("Debes introducir un valor numérico.");
			
		}
		
	}

}
