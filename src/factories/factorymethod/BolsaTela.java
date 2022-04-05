package factories.factorymethod;

/**
 * Una bolsa de tela para empacar un juguete para bebé.
 * Inicialmente es usada para empacar peluches.
 * 
 *  CORRESPONDE AL ROL "Concrete Product" DEL PATRÓN FACTORY METHOD
 * 
 * @version 1.1
 */
public class BolsaTela extends Empaque {

	public BolsaTela(double capacidad) {
		super(capacidad);
	}

	@Override
	public double calcularPrecio() {
		final double VALOR_BOLSA_PEQUENA=5000;
		final double VALOR_BOLSA_GRANDE=10000;
		
		if (getCapacidad() <= 100) {
			return VALOR_BOLSA_PEQUENA;
		}
		else {
			return VALOR_BOLSA_GRANDE;
		}
	}
}
