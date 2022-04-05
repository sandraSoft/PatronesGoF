package singleton.solucion;

/**
 * Muestra cómo se usa un puerto en diferentes clases,
 * usando el patrón Singleton.
 * 
 * @version 2.0
 */
public class ControlDispositivos {

	public static void main(String[] args) {
	
		// No es necesario pasar el puerto como parámetro a las clases.	
		Impresora impresora = new Impresora();
		impresora.imprimir();
		Teclado teclado = new Teclado();
		teclado.escribir();
		Mouse mouse = new Mouse();
		mouse.mover();
	}
}
