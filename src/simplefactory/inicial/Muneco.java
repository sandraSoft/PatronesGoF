package simplefactory.inicial;

/**
 * Figura de animales, personajes de acción 
 * o personas, para jugar.
 *  
 * @version 1.0
 */
public class Muneco extends Juguete {
	public Muneco(String nombre, double precioBase, double volumen) {
		super(nombre, precioBase, volumen);
	}

	@Override
	public double getPrecioTotal() {
		return getPrecioBase() + getVolumen()*100;
	}
}
