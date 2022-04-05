package singleton.inicial;

/**
 * Simula un puerto USB en un equipo (solo se tiene un puerto,
 * así que solo se debería crear uno en el programa).
 * 
 * @version 1.0
 */
public class PuertoUsb {
	
	private String nombre;

	// Al tener el constructor público no es posible limitar la creación de objetos
	public PuertoUsb() {
		this.nombre = "Puerto USB";
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
