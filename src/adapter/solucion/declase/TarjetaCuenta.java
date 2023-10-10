package adapter.solucion.declase;

/**
 * Permite adaptar el comportamiento de una Tarjeta de Crédito a lo que 
 * se tiene en la interfaz "ProductoBancario".
 * 
 * CORRESPONDE AL ROL "Adapter" DEL PATRÓN ADAPTER (Adapter de Clase):
 * Hereda de "TarjetaCredito".
 * 
 * Es un poco rígido porque no permite adaptar otros tipos de productos.
 * 
 * @version 1.0-clase
 */
public class TarjetaCuenta extends TarjetaCredito implements IProductoBancario {
	
	public TarjetaCuenta(String numero, double valor) {
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
