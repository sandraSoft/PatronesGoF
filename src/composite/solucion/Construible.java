package composite.solucion;

/**
 * Un elemento de construcción, básico o compuesto por otros.
 * Corresponde al Componente del patrón COMPOSITE.
 * 
 * @version 1.0
 */
public interface Construible {

	/**
	 * Calcula los días que se demora en construir,
	 * considerando todos los aspectos necesarios.
	 * 
	 * @return días que demora en construirse
	 */
	public abstract int getDiasConstruir();
}
