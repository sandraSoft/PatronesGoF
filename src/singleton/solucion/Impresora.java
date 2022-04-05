package singleton.solucion;

/**
 * Simula una impresora que usa un puerto
 * (lo obtiene a través del método del patrón Singleton).
 * 
 * @version 2.0
 */
public class Impresora {
	
	// ya no se necesita el parámetro
	public void imprimir() {
		System.out.print("Imprimiendo por: ");
		System.out.println(PuertoUsb.getPuerto().getNombre());
	}
}
