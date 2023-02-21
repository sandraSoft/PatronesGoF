package simplefactory.inicial;

/**
 * Juguete de peluche para bebé.
 *  
 * @version 1.0
 */
public class Peluche extends Juguete {
	
	public Peluche(double precioBase, double volumen) {
		super(precioBase, volumen);
	}

	@Override
	public double getPrecioTotal() {
		return getPrecioBase() + getVolumen()*100;
	}
}
