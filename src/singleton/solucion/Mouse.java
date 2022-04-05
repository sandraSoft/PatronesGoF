package singleton.solucion;

/**
 * Simula un mouse de computador que usa un puerto.
 * 
 * @version 2.0
 */
public class Mouse {
	
	// Ya no necesita un atributo para el puerto
	public void mover() {
		System.out.print("Moviendo mouse por: ");
		System.out.println(PuertoUsb.getPuerto().getNombre());
	}
}
