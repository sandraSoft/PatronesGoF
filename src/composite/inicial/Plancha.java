package composite.inicial;

/**
 * Elemento base de una construcción,
 * que sostiene otros elementos.
 * 
 * @version 1.0
 */
public class Plancha {
	private double largo;
	private double ancho;
	
	public Plancha(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}
	
	/**
	 * Calcula los días que se demora en construir,
	 * considerando todas las instalaciones.
	 * 
	 * @return días que demora en construirse
	 */
	public int getDiasConstruir() {
		return (int)(largo*ancho*0.5);
	}
}
