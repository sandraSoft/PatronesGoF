package adapter.solucion.declase;

/**
 * Permite adaptar el comportamiento de una Tarjeta de Crédito a lo que 
 * se tiene en la interfaz "ProductoBancario".
 * 
 * CORRESPONDE AL ROL "Adapter" DEL PATRÓN ADAPTER (Adapter de Clase):
 * Hereda de "TarjetaCredito".
 * 
 * @version 1.0-clase
 */
public class TarjetaAdapter extends TarjetaCredito implements ProductoBancario {
	
	public TarjetaAdapter(String numero, double valor) {
		super(numero, valor);
	}

	// Realiza la adaptación del método "realizarAvance"
	@Override
	public boolean retirar(double cantidad) {
		try {
			this.realizarAvance(cantidad);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
