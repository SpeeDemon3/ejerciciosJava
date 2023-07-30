package ejercicioClaseString;

import java.util.Scanner;

/**
 * @author Antonio Ruiz Benito-SpeedDemoN
 */
public class Function {
	// Creo un objeto estatico de la clase Scanner para poder utilizarlo en las funciones
	static Scanner sc = new Scanner(System.in);
	
	
	/**
	 * Metodo para crear un array de tipo String
	 * @param longitud -> Numero de elementos que contendra
	 * @return -> Array creado
	 */
	public static String[] crearArray(int longitud) {
		// Creo	el array con la longitud indicada por el parametro
		String[] array = new String[longitud];		

		System.out.println("Array creado correctamente.");
		// Retorno el array
		return array;
		
	}
	
	/**
	 * Menu con las diferentes opciones
	 */
	public static void menu() {
		System.out.println("\n\t#########################################################################################");
		System.out.println("\tSelecciona una opción");
		System.out.println("\t----------------------");
		System.out.println("\t1. LLenar el Array");
		System.out.println("\t2. LLenar el Array sin duplicados");
		System.out.println("\t3. LLenar el Array uno a uno (inserar un solo nombre, despues del ultimo insertado");
		System.out.println("\t4. Cambia todas una letra en todo el array por la que le indiquemos.");
		System.out.println("\t5. Quita todos los espacios que tenga una palabra al principio y/o al final");
		System.out.println("\t6. Imprimir lista original");
		System.out.println("\t7. Remplazar un nombre dandole la posición");
		System.out.println("\t8. Imprimir toda la lista en mayusculas");
		System.out.println("\t9. Imprimir toda la lista en minusculas");
		System.out.println("\t10. Cambia un nombre que te doy por otro que tambien te doy");
		System.out.println("\t11. Dame la posición de un nombre que te indico");
		System.out.println("\t12. Vacia el array poniendo una cadena vacia en cada posición");
		System.out.println("\t13. Te doy un nombre y una posición y la remplazas en el array");
		System.out.println("\t14. Escribe una palabra formada de la primera letra de cada una que tenemos en el array");
		System.out.println("\t15. Cambia el tamaño del array");
		System.out.println("\t16. Dime el número de caracteres que tiene una palabra si te doy su posición");
		System.out.println("\t17. Cuantos elementos tengo en el Array");
		System.out.println("\t0. Salir");
		System.out.println("\t#########################################################################################\n");

	}
	
	/**
	 * Metodo para rellenar un array de tipo String dinamicamente
	 * @param array -> Array que se desea rellenar de tipo String
	 */
	public static void llenarArray(String[] array) {
		
		for(int i = 0; i < array.length; i++) {
			// Sumo 1 a la variable i para que sea mas facil para el usuario
			System.out.println("Introduce el elemento número " + i + ":");
			// Asigno en cada posicion del array el valor introducido por el usuario
			array[i] = sc.nextLine();
		}
		
		System.out.println("Array llenado correctamente.");
		
		recorrerArray(array);
	
	}
	
	/**
	 * Metodo para comprobar si los valores que se van introduciendo en un array estan duplicados
	 * @param array -> Array de tipo String para rellenar
	 */
	public static void llenarArraySinDuplicados(String[] array) {
		// Recorro el array
		for(int i = 0; i < array.length; i++) {
			// Sumo 1 a la variable i para que sea mas facil para el usuario
			System.out.println("Introduce el elemento número " + i + ":");
			// Guardo el valor introducido por el usuario
			String valor = sc.nextLine();
			
			// Utilizando un bucle while compruebo si el valor ya existe dentro del arra
			// haciendo uso del metodo comprobarDuplicados()
			// Donde si el metodo retorna true el bucle seguira iterando
			while(comprobarDuplicados(array, valor, i)) {
				
				System.out.println("Has introducido un valor duplicado\t" + valor);
				
				System.out.println("Por favor vuelva a introducir un nuevo valor:");
				// Vuelvo a guardar el valor introducido
				valor = sc.nextLine();
					
				}
			// Asigno el valor a la posicion dentro del array
			array[i] = valor;
				
			}
			
		System.out.println("Array llenado correctamente.");
		
		recorrerArray(array);
	
		}
		

	/**
	 * Metodo para comprobar si un elemento dentro de un array esta duplicado
	 * 
	 * @param array -> Array que contiene el elemento
	 * @param valor -> Valor a comparar con los elementos que contiene el array
	 * @param contador -> Indice hasta el que se tendra que recorrer el array
	 * @return -> True si encuentra un duplicado || False si No encuentra ningun duplicado
	 */
	public static boolean comprobarDuplicados(String[] array, String valor, int contador) {
		
		for(int i = 0; i < contador; i++) {
			// Si el elemento dentro del array es igual a la variable valor
			// Utilizando el metodo equals compruebo si los valores son iguales 
			if(array[i].equalsIgnoreCase(valor)) {
				
				return true;
				
			}
		}

		return false;
		
	}
	
	/**
	 * Metodo que permite cambiar todas las letras de las palabras que contiene un array
	 * por una letra en concreto
	 * @param array -> Array de tipo String
	 */
	public static void cambiarLetrasPorUna(String[] array) {
		
		System.out.println("Indica que letra es la que deseas, para cambiar todo el array a esa letra.");
		System.out.println("Solo se guardara el primer caracter si introduce más de uno.");
		
		// Guardo el valor introducido por el usuario
		String letra = sc.nextLine();
		
		// Guardo la primera letra introducida por el usuario 
		letra.charAt(0);
		
		
		for(int i = 0; i < array.length; i++) {

			String palabra = array[i];
			
			// Utilizando el metodo replaceAll("." -> Representa cualquier caracter, String.valueOf(realiza un cast a String))
			// remplazo todas las letras de la cadena que contiene cada elemento del array por el caracter que contenga la variable letra
			palabra = palabra.replaceAll(".", String.valueOf(letra));
			
			// Modifico el array
			array[i] = palabra;
			
		}
		
		System.out.println("Operación realizada con exito!!!");
		
		// Recorro el array para mostrar los cambios realizados
		for(String palabra : array) {
			System.out.println(palabra);
		}
		
		System.out.println("Pulse [Enter] para continuar.");

		// Obligo al usuario a pulsar una tecla para continuar utilizando un nextLine()
		sc.nextLine();
		
	}
	
	/**
	 * Metodo para quitar los espacios en blanco del principio y final de cada elemento 
	 * @param array -> Array de tipo String
	 */
	public static void quitarEspacios(String[] array) {
		
		String palabra = "";
		
		for(int i = 0; i < array.length; i++) {
			// Asigno a la variable palabra el valor del array en la posicion i
			palabra = array[i];
			// Utilizando el metodo trim() elimino los espacios en blanco
			array[i] = palabra.trim();
			
		}
		
		System.out.println("Operación realizada con exito!!!");
		// Muestro el array modificado
		recorrerArray(array);
		
	}		
	
	/**
	 * Metodo para recorrer ye imprimir por consola los valores de un array
	 * @param array
	 */
	public static void recorrerArray(String[] array) {
		
		// Recorro el array para mostrar los cambios realizados
		for(String valor : array) {
			System.out.println(valor);
		}
		
		System.out.println("Pulse [Enter] para continuar.");

		// Obligo al usuario a pulsar una tecla para continuar utilizando un nextLine()
		sc.nextLine();
		
	}
	
	/**
	 * Metodo para rellanar un array posicion a posicion
	 * @param array
	 */
	public static void rellenarArrayUnoAUno(String[] array) {
		// Recorro el array
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("Introduce el valor en la posicion " + i + ":");
			// Asigo no el valor introducido dentro del array
			array[i] = sc.nextLine();
		}
		
		System.out.println("Operación realizada con exito!!!");
		// Muestro el array modificado
		recorrerArray(array);
		
	}
		
	/**
	 * Metodo para remplazar un elemento por otro dentro de un array indicandole la posicion
	 * del elemento a remplazar
	 * @param array -> Array de tipo String 
	 */
	public static void remplazarNombrePosicion(String[] array) {
		System.out.println("Posicion -> Valor");
		
		for(int i = 0; i < array.length; i++) {
			// Sumo uno para que el usuario tenga un indice de posiciones empezando en 1
			System.out.println("Posición " + (i + 1) + " -> Valor: " + array[i]);
			
		}
		
		System.out.println("Introduce la posicion que deseas modificar:");
		
		// Guardo y resto 1 al valor introducido por el usuario para que cuadre con las posiciones reales del array
		int posicionUser = sc.nextInt() - 1;
		
		// Vacio el buffer
		sc.nextLine();
		
		System.out.println("Introduce el nuevo valor:");
		
		// Asigno el nuevo valor en la posicion indicada
		array[posicionUser] = sc.nextLine();
		
		
		System.out.println("Posición modificada con exito.");
		
		// Muestro la modificacion sumando uno a la posicion para que cuadre con el indice que mostre al usuario del usuario
		System.out.println("Posición " + (posicionUser + 1) + " -> Valor: " +array[posicionUser]);
		
		
	}
	
	/**
	 * Metodo para convertir todos los elementos de tipo String de una array a mayuscula
	 * @param array -> Array de tipo String
	 */
	public static void imprimirEnMayusculas(String[] array) {
		
		for(String dato : array) {
			// Si la variable dato es igual a null continua a la siguiente iteracion
			if (dato == null) {
				continue;
			}
			
			// Utilizando el metodo toUpperCase() convierto todo a mayusculas
			System.out.println(dato.toUpperCase());
		}
		
		System.out.println("Pulse [Enter] para continuar.");
		
		// Obligo al usuario a pulsar una tecla para continuar utilizando un nextLine()
		sc.nextLine();

	}
	
	/**
	 * Metodo para convertir todos los elementos de tipo String de una array a minusculas
	 * @param array -> Array de tipo String
	 */
	public static void imprimirEnMinusculas(String[] array) {
		
		for(String dato : array) {
			// Si la variable dato es igual a null continua a la siguiente iteracion
			if (dato == null) {
				continue;
			}
			
			// Utilizando el metodo toLowererCase() convierto todo a minusculas
			System.out.println(dato.toLowerCase());
		}
		
		System.out.println("Pulse [Enter] para continuar.");
		
		// Obligo al usuario a pulsar una tecla para continuar utilizando un nextLine()
		sc.nextLine();
		
	}
	
	/**
	 * Metodo para cambiar el valor de un elemento dentro del array por otro
	 * @param array -> Array de tipo String
	 */
	public static void cambiarNombrePorOtro(String[] array) {
		
		System.out.println("Indica el nombre del valor que deseas cambiar:");
		// Obtengo el valor que desea cambiar
		String nombreOriginal = sc.nextLine();
		
		System.out.println("Indica el nuevo nombre que dedias asignar:");
		// Obtengo el nuevo valor que desea asignar
		String nuevoNombre = sc.nextLine();
		
		for (int i = 0; i < array.length; i++) {
			// Compruebo si cada elemento del array es igual al valor introducido por el usuario
			if(array[i].equalsIgnoreCase(nombreOriginal)) {
				// Asigno el nuevo nombre dentro del array
				array[i] = nuevoNombre;
				
				System.out.println("El elemento en la posición " + i + " ha sido renombrado con exito -> " + array[i]);
				
				// Muestro el array modificado
				recorrerArray(array);
				
				System.out.println("Pulse [Enter] para continuar.");
			
				// Obligo al usuario a pulsar una tecla para continuar utilizando un nextLine()
				sc.nextLine();
			
			// Si ningun elemento es igual al valor introducido por el usuario informo por consola
			} else if(!array[i].equals(nombreOriginal)) {
				System.out.println("El nombre introducido no existe dentro de la posicion " + i + " dentro de este array.");
			}
			
		}
		
		
	}
	
	/**
	 * Metodo para obtener la posicion de un elemento, indicando el elemento a buscar por consola
	 * @param array -> Array de tipo String
	 */
	public static void obtenerPosicionElemento(String[] array) {
		
		System.out.println("Elementos disponibles dentro del array:");

		// Muestro los elementos diponibles dentro del array
		recorrerArray(array);
		
		System.out.println("Indica el nombre del elemento para obtener su posicion dentro del array:");
		
		// Obtengo el elemento introducido por el usuario
		String elemento = sc.nextLine();
		
		// Recorro el array
		for (int i = 0; i < array.length; i++) {
			
			// Si el valor del array en la posicion i es iagual a la variable elemento ignorando mayusculas o minusculas
			if (array[i].equalsIgnoreCase(elemento)) {
				
				System.out.println("El elemento " + elemento
						+ "\n\tEsta en la posición " + i);
				
			// En caso contrario
			} else {
				// Si la variable i llega hasta el final del array
				// Siendo igual el valor de i que el de la longitud del array menos 1
				if (i == (array.length - 1)) {
					
					System.out.println("El elemento identificado con " + elemento + " no existe.");
						
				}
				
				
			}
			
		}
		
	}
		
	/**
	 * Metodo para llenar el array con cadenas vacias
	 * simulando que este vacio
	 * @param array -> Array de tipo String
	 */
	public static void vaciarArray(String[] array) {
		
		for(int i = 0; i < array.length; i++) {
			// Asigno en cada posicion del array una cadena vacia
			array[i] = "";
			
		}
		
		System.out.println("Operación de realizada con exito.");
		
		
		// Muestro el array por consola al usuario
		recorrerArray(array);
		
	}
	
	/**
	 * Metodo para remplazar el nombre de un elemento dentro del array obligando al
	 * usuario a indicar el nombre y la posicion del elemento que desea modificar
	 * no permitiendo que cualquiera de los 2 campos sea incorrecto
	 * 
	 * @param array -> Array de tipo String
	 * 
	 */
	public static void remplazarElementoPorNombreYPosicion(String[] array) {
		
		System.out.println("Contenido del array:\n");
		// Muestro los elementos 
		for (int i = 0; i < array.length; i++) {
			// Sumo uno a la variable i para que el usuario piense que el indice empieza en 1
			System.out.println("Posición -> " + (i + 1) + " Elemento -> " + array[i]);
			
		}
	
		String nombreElemento ;
		
		// Variable para controlar el bucle for
		boolean control = false;
		
		// Utilizando un bucle do while obligo al usuario a no dejar el campo con el nombre del elemento vacio
		do {
		
			System.out.println("Indica el nombre del elemento que deseas modificar:");
			// Obtengo el nombre del elemento
			nombreElemento = sc.nextLine();
			
			// Compruevo si a introducido algun valor el usuario
			if (nombreElemento.isEmpty()) {
				
				System.out.println("No puedes dejar campo del nombre vacio.\n");
				
				
			} else {
				// Cambio el valor de la variable control a true para poder salir del bucle
				control = true;
				
			}
			
		} while(!control); // Mientras la variable control no sea distinta de false el bucle seguira iterando
		
		
		
		System.out.println("Indica su posición dentro del array:");
		// Resto uno al valor de la variable para que cuadre con el indice del array
		int posicionElemento = sc.nextInt() - 1;
		
		// Vacio el buffer
		sc.nextLine();

		// Variable para comprobar si hay coincidendias o no entre los datos introducidos por 
		// el usuario y los que contiene el array
		boolean encontrado = false;
		
		for (int i = 0; i < array.length; i++) {
			
			
			// Si el nombre del elemento es igual al del array Y la posicion coincide
			if (array[i].equalsIgnoreCase(nombreElemento) && posicionElemento == i) {
				
				System.out.println("Indica el nuevo nombre del elemento:");
				// Guardo el nuevo valor
				String nuevoNombre = sc.nextLine();
				// Asigno el nuevo valor en la posicion del array
				array[i] = nuevoNombre;
				
				System.out.println("Operación realizada con exito.");
				// Muestro el resultado por consola
				System.out.println("Posición -> " + (i + 1) + " Elemento -> " + array[i]);
		
				// Cambio el valor de la variable a true
				encontrado = true;
				
			} 
				
		}
		
		// Si la variable encontrado no es distinta de false 
		// significara que no se ha introducido bien los campos 
		if (!encontrado) {
			// Informo por consola al usuario
			System.out.println("Has introducido mal el nombre del elemento o la posición.");
			
		}
		
		
	}
	
	/**
	 * Metodo para formar una nueva palabra utilizando la letra inicial de cada
	 * elemento dentro del array
	 * 
	 * @param array -> Array de tipo String
	 * 
	 */
	public static void formarPalabraConInicioPalabras(String[] array) {
		
		// Variable con una cadena vacia donde se añadira la nueva palabra
		String nuevaPalabra = "";
		
		for (String palabra : array) {
			
			// Guardo en una nueva variable la letra inicial de cada palabra obtenida en cada iteracion
			// utilizando el metodo substring(indice inicial, indice final sin incluir) para obtener solo la primera letra de cada palabra
			String letraInicial = palabra.substring(0, 1);
			
			// Concateno dentro de la variable la letra obtenida en cada iterancion
			nuevaPalabra += letraInicial;
			
		}
		
		// Muestro la nueva palabra
		System.out.println("La nueva palabra es " + nuevaPalabra + ".");
		
	}
	
	/**
	 * Metodo para cambiar la longitud de un array
	 * sin perder el contenido que tuviera antes de ser 
	 * modificado
	 * @param array -> Array que se desea modificar
	 * @return -> Nuevo array con nueva longitud
	 */
	public static String[] cambiarTamanioArray(String[] array) {
		
		System.out.println("Indica el tamaño con el que deseas actualizar el array:");
		
		int nuevaCapacidad = sc.nextInt();
		
		// Creo un nuevo array asignandole la nueva capacidad indicada por el usuario
		String[] nuevoArray = new String[nuevaCapacidad];
		
		// Copio el array original en el nuevo array
		// arraycopy(arrayOrigen, posicionDesdeLaQueEmpiezaCopiar, arrayDestino, posicionDondeEmpiezaCopiar, numeroElementosHaCopiar)
		System.arraycopy(array, 0, nuevoArray, 0, array.length);
		
		System.out.println("Operación realizada con exito.");
		
		// Muestro el tamaño del nuevo array
		System.out.println("Tamaño del nuevo array -> " + nuevoArray.length);
		
		// Muestro el contenido del nuevo array
		recorrerArray(nuevoArray);
		
		// Retorno el nuevo array
		return nuevoArray;
		
	}
	
	/**
	 * Metodo para rrecorrer un array mostrando la
	 * posición el valor de cada elemento
	 * 
	 * @param array
	 */
	public static void leerArrayConPosicion(String[] array) {
		
		// Muestro los elementos 
		for (int i = 0; i < array.length; i++) {
			// Sumo uno a la variable i para que el usuario piense que el indice empieza en 1
			System.out.println("Posición -> " + i + " Elemento -> " + array[i]);
			
		}
		
	}
	
	/**
	 * Metodo para obtener el numero de caracteres de un elemento dentro
	 * de un array
	 * 
	 * @param array -> Tipo String
	 */
	public static void obtenerNumeroCaracteres(String[] array) {
		// Variable para controlar el bucle while
		boolean control = true;
		
		int posicionElemento = -1;
		
		// Mientras la variable control sea true el bucle seguira iterando
		while(control) {
		
			System.out.println("Indica la posición del elemento para obtener su número de caracteres:");
			// Obtengo la posicion del elemento
			posicionElemento = sc.nextInt();
			
			// Compruebo si la posicion indicada es menor que 0 o mayor que el numero de elementos que contienen el array
			if (posicionElemento < 0 || posicionElemento > array.length - 1) {
				
				System.out.println("Debes introducir una posición valida dentro del array.");
				
			} else {
				// Cambio el valor de la variable control a false para poder salir del bucle
				control = false;
				
			}
			
			
		}
		
		// Obtengo el numero de caracteres utilizando el metodo length()  de la clase String
		int caracteres = array[posicionElemento].length();
		
		System.out.println("El elemento en la posición: " + posicionElemento + " con valor : " + array[posicionElemento] 
				+ "\ntiene " + caracteres + " caracteres.");
		
	}
	
	/**
	 * Metodo para obtener el numero de elementos que 
	 * contiene un array
	 * @param array -> Tipo String
	 */
	public static void obtenerLongitudArray(String[] array) {
		
		System.out.println("Este array tiene " + array.length + " elementos.");
		
	}

}
