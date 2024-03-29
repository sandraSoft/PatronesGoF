package adapter.solucion.deobjeto;

/**
 * Permite adaptar el comportamiento de una Tarjeta de Crédito a lo que 
 * se tiene en la interfaz "ProductoBancario".
 * 
 * CORRESPONDE AL ROL "Adapter" DEL PATRÓN ADAPTER (Adapter de Objeto):
 * Tiene un atributo de tipo "TarjetaCredito".
 * 
 * Es más flexible porque, si es necesario, puede adaptar otros productos.
 * 
 * @version 1.0-objeto
 */
public class TarjetaCuenta implements IProductoBancario {
	
	private TarjetaCredito tarjeta;

	public TarjetaCuenta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}


	// Realiza la "adaptación" del método a realizarAvance
	@Override
	public boolean retirar(double cantidad) {
		try {
			tarjeta.realizarAvance(cantidad);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
