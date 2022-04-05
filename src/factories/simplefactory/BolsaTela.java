package factories.simplefactory;

/**
 * Una bolsa de tela para empacar un juguete para bebé.
 * Inicialmente es usada para empacar peluches.
 * 
 * @version 1.2
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
