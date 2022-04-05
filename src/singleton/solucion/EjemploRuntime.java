package singleton.solucion;

/**
 * Muestra el uso del patrón SINGLETON en el API de Java.
 * 
 * @version 1.0
 */
public class EjemploRuntime {

	public static void main(String[] args) {
		// El constructor es privado. Esto es erróneo:
		// Runtime runtime = new Runtime();
		
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		
		if (runtime1 == runtime2) {
			System.out.println("Son el mismo objeto");
		}
		else {
			System.out.println("Son objetos diferentes");
		}
	}
}
