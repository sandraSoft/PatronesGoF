package adapter.solucion.deobjeto;

/**
 * Permite adaptar el comportamiento de una Tarjeta de Crédito a lo que 
 * se tiene en la interfaz "ProductoBancario".
 * 
 * CORRESPONDE AL ROL "Adapter" DEL PATRÓN ADAPTER (Adapter de Objeto):
 * Tiene un atributo de tipo "TarjetaCredito"
 * 
 * @version 1.0-objeto
 */
public class TarjetaAdapter implements ProductoBancario {
	
	private TarjetaCredito tarjeta;

	public TarjetaAdapter(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
		
		// Otra opción es que no reciba como parámetro un objeto tarjeta,
		// sino que reciba número y valor
		// y con esos valores crear el objeto TarjetaCredito.
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
