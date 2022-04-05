package singleton.solucion;

/**
 * Simula un puerto USB en un equipo (solo se tiene un puerto,
 * así que solo se debería crear uno en el programa).
 * 
 * Para controlar la creación de una única instancia
 * usa el patrón SINGLETON
 * 
 * @version 2.0
 */
public class PuertoUsb {
	
	/**
	 * Referencia a la única instancia de PuertoUsb
	 */
	private static PuertoUsb puertoUnico;
	
	private String nombre;
	
	/**
	 * Constructor privado para que no se pueda usar por error
	 * en otras clases (y tengan que usar el método estático)
	 */
	private PuertoUsb() {
		this.nombre = "Puerto USB";
	}
	
	/**
	 * Obtiene la única instancia de la clase
	 */
	public static PuertoUsb getPuerto() {
		if (puertoUnico == null) {
			puertoUnico = new PuertoUsb();
		}
		return puertoUnico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
