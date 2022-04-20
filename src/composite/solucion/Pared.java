package composite.solucion;

/**
 * Elemento base de una construcción,
 * usado para luego crear elementos más complejos.
 * 
 * Es una hoja (leaf) del patrón COMPOSITE.
 * 
 * @version 2.0
 */
public class Pared implements Construible {
	private double largo;
	
	public Pared(double largo) {
		this.largo = largo;
	}
	
	@Override
	public int getDiasConstruir() {
		return (int)(largo*0.5);
	}
}
