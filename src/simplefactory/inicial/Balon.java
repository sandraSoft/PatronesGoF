package simplefactory.inicial;

/**
 * Balón de colores y exterior suave.
 *  
 * @version 1.5
 */
public class Balon extends Juguete {
	public Balon(String nombre, double precioBase, double volumen) {
		super(nombre, precioBase, volumen);
	}

	@Override
	public double getPrecioTotal() {
		return getPrecioBase() + getVolumen()*50;
	}
}
