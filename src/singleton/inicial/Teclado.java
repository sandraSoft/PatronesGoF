package singleton.inicial;

/**
 * Simula un teclado de computador que usa un puerto
 * (lo recibe como parámetro en el constructor).
 * 
 * @version 1.0
 */
public class Teclado {
	
	private PuertoUsb puerto;

	public Teclado(PuertoUsb puerto) {
		this.puerto = puerto;
	}
	
	public void escribir() {
		System.out.print("Escribiendo por: ");
		System.out.println(puerto.getNombre());
	}
}