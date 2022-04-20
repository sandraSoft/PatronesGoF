package composite.inicial;

/**
 * Elemento base de una construcción,
 * usado para luego crear elementos más complejos.
 * 
 * @version 1.0
 */
public class Pared {
	private double largo;
	
	public Pared(double largo) {
		this.largo = largo;
	}
	
	/**
	 * Calcula los días que se demora en construir,
	 * considerando el largo y todas las instalaciones.
	 * 
	 * @return días que demora en construirse
	 */
	public int getDiasConstruir() {
		return (int)(largo*0.5);
	}
}
