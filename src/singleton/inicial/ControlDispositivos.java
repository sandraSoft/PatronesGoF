package singleton.inicial;

/**
 * Muestra cómo se crea un puerto y se usa en diferentes clases.
 * 
 * @version 1.0
 */
public class ControlDispositivos {

	public static void main(String[] args) {
		
		PuertoUsb puerto = new PuertoUsb();
		
		// Se debe pasar el puerto como parámetro. 
		// Puede hacer difícil el control.
		
		Impresora impresora = new Impresora();
		impresora.imprimir(puerto);
		Teclado teclado = new Teclado(puerto);
		teclado.escribir();
		Mouse mouse = new Mouse(puerto);
		mouse.mover();
	}
}
