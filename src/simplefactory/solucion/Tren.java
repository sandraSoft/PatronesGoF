package simplefactory.solucion;

/**
 * Tren de juguete de madera.
 *
 *  CORRESPONDE AL ROL CONCRETE PRODUCT (EN SIMPLE FACTORY).
 * @version 1.0
 */
public class Tren extends Juguete {
	public Tren(String nombre, double precioBase, double volumen) {
		super(nombre, precioBase, volumen);
	}

	@Override
	public double getPrecioTotal() {
		return getPrecioBase()*2 + getVolumen()*100;
	}
}
