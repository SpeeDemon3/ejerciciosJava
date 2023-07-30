package ejercicioGeneracionesARB;
/**
 * @author Antonio Ruiz Benito
 */
public class Funciones {
	
	/**
	 * 
	 * Metodo para controlar una variable contador hasta llegar
	 * a 10 y poner el valor de la variable control a true o false segun proceda
	 * @param contador -> Variable de tipo int 
	 * @param control -> Variable de tipo boolean 
	 * @return -> true false segun preceda
	 */
	public static boolean contador(int contador, boolean control) {
		// Si contador es igual a 10
		if(contador == 10) {
			
			System.out.println("Fin del programa\n"
				+"\tGracias por utilizar el programa\n"
				+ "\tEjercicio realizado por Antonio Ruiz Benito");
			
			// La variable control sera igual a false
			control = false;
			
		// En caso contrario 
		} else {
			control = true;	
		}
		
		// Retorno la variable control
		return control;
		
	}
	
	/**
	 * Metodo para mostrar un mensaje por consola 
	 * y sumar 1 a la variable contador
	 * @param contador -> Variable de tipo int
	 * @return -> Variable contador + 1
	 */
	public static int genTradicional(int contador) {
		
		// Muestro informacion de la generacion por consola
		System.out.println("\tEcho importante: Guerra entre paises.\n");
		
		System.out.println("\tSon saludables y enérgicos. Leales con superiores\n"
				+ "\ty buscan más allá de ser reconocidos con el trabajo duro.\n");
		
		// Sumo uno al contador
		return ++contador;
		
	}
	
	/**
	 * Metodo para mostrar un mensaje por consola 
	 * y sumar 1 a la variable contador
	 * @param contador -> Variable de tipo int
	 * @return -> Variable contador + 1
	 */
	public static int genBoomers(int contador) {
		
		// Muestro informacion de la generacion por consola
		System.out.println("\tÉpoca de paz y libertad.\n");
		
		System.out.println("\tSon ambiciosos, motivados a los logros personales y\n"
				+ "\tlaborales.");
		
		// Sumo uno al contador
		return ++contador;
		
	}
	
	/**
	 * Metodo para mostrar un mensaje por consola 
	 * y sumar 1 a la variable contador
	 * @param contador -> Variable de tipo int
	 * @return -> Variable contador + 1
	 */
	public static int genX(int contador) {
		// Muestro informacion de la generacion por consola
		System.out.println("\tTecnología análoga y evolución a la\n"
				+ "\tdigitalización.\n"
				+"\tSon inconformistas y van más allá\n"
				+ "\tpor la obsesión del éxito.");
		
		// Sumo uno al contador
		return ++contador;
	}
	
	/**
	 * Metodo para mostrar un mensaje por consola 
	 * y sumar 1 a la variable contador
	 * @param contador -> Variable de tipo int
	 * @return -> Variable contador + 1
	 */
	public static int genMillennials(int contador) {
		// Muestro informacion de la generacion por consola
		System.out.println("\tInicio de internet y digitalización.\n"
				+ "\tSon intransigentes. Hijos de padres Baby boomers\n"
				+ "\t y generación X más veteranos.");
		
		// Sumo uno al contador
		return ++contador;
	}
	
	/**
	 * Metodo para mostrar un mensaje por consola 
	 * y sumar 1 a la variable contador
	 * @param contador -> Variable de tipo int
	 * @return -> Variable contador + 1
	 */
	public static int genZ(int contador) {
		// Muestro informacion de la generacion por consola
		System.out.println("\tInfancia directa a internet.\n"
				+ "\tSon irreverentes. Hijos de padres Baby boomers\n"
				+ "\t y generación X.");
		
		// Sumo uno al contador
		return ++contador;
	}
	
	/**
	 * Metodo para mostrar un mensaje por consola 
	 * y sumar 1 a la variable contador
	 * @param contador -> Variable de tipo int
	 * @return -> Variable contador + 1
	 */
	public static int genAlpha(int contador) {
		// Muestro informacion de la generacion por consola
		System.out.println("\tNativos digitales al 100% (Smartphone y Tablet)\n"
				+"\tSon predilectos. Hijos de padres Millennials y\n"
				+ "\tCentennials más veteranos (no planeados).");
		
		// Sumo uno al contador
		return ++contador;
	}

}
