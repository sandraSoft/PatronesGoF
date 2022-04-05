package singleton.inicial;

/**
 * Simula una impresora que usa un puerto
 * (lo recibe como parámetro en un método).
 * 
 * @version 1.0
 */
public class Impresora {
	
	public void imprimir(PuertoUsb puerto) {
		System.out.print("Imprimiendo por: ");
		System.out.println(puerto.getNombre());
	}
}
