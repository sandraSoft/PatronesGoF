package simplefactory.inicial;

/**
 * Balón de colores para bebé.
 *  
 * @version 1.0
 */
public class Balon extends Juguete {

	public Balon(double precioBase, double volumen) {
		super(precioBase,volumen);
	}

	@Override
	public double getPrecioTotal() {
		return getPrecioBase() + getVolumen()*50;

	}
}
