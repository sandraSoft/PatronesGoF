package singleton.inicial;

/**
 * Simula un mouse de computador que usa un puerto
 * (lo recibe como parámetro en el constructor).
 * 
 * @version 1.0
 */
public class Mouse {
	
	private PuertoUsb puerto;

	public Mouse(PuertoUsb puerto) {
		this.puerto = puerto;
	}
	
	public void mover() {
		System.out.print("Moviendo mouse por: ");
		System.out.println(puerto.getNombre());
	}
}