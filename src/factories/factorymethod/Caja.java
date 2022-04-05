package factories.factorymethod;

/**
 * Una caja que sirve de empaque de un juguete para bebé.
 * Inicialmente es usada para empacar balones.
 * 
 *  CORRESPONDE AL ROL "Concrete Product" DEL PATRÓN FACTORY METHOD
 * 
 * @version 1.1
 */
public class Caja extends Empaque {

	public Caja(double capacidad) {
		super(capacidad);
	}

	@Override
	public double calcularPrecio() {
		final double VALOR_METRO=100;
		return VALOR_METRO * getCapacidad();
	}
}
