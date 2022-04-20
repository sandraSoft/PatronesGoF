package composite.solucion;

/**
 * Elemento base de una construcción,
 * que sostiene otros elementos.
 * 
 * Es una hoja (leaf) del patrón COMPOSITE.
 * 
 * @version 2.0
 */
public class Plancha implements Construible {
	private double largo;
	private double ancho;
	
	public Plancha(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}
	
	@Override
	public int getDiasConstruir() {
		return (int)(largo*ancho*0.5);
	}
}
