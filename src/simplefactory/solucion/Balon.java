package simplefactory.solucion;

/**
 * Balón de colores y exterior suave.
 *  
 * CORRESPONDE AL ROL CONCRETE PRODUCT (EN SIMPLE FACTORY).
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
