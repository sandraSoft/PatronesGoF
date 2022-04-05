package singleton.solucion;

/**
 * Simula un teclado de computador que usa un puerto.
 * 
 * @version 2.0
 */
public class Teclado {
	
	// Ya no necesita un atributo para el puerto
	public void escribir() {
		System.out.print("Escribiendo por: ");
		System.out.println(PuertoUsb.getPuerto().getNombre());
	}
}
