package simplefactory.inicial;

/**
 * Tren de juguete de madera.
 * 
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
