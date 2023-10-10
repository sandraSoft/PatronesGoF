package adapter.solucion.simplificada;

/**
 * Permite adaptar el comportamiento de una Tarjeta de Crédito a lo que 
 * se tiene en la clase "Cuenta"
 * 
 * CORRESPONDE AL ROL "Adapter" DEL PATRÓN ADAPTER (Adapter de Objeto):
 * Tiene un atributo de tipo "TarjetaCredito".
 * 
 * Al heredar de Cuenta tiene toda la estructura de esa clase,
 * incluso atributos y métodos que no requiere para hacer la adaptación.
 * 
 * @version 1.0-objeto-simple
 */
public class TarjetaCuenta extends Cuenta {
	
	private TarjetaCredito tarjeta;

	public TarjetaCuenta(TarjetaCredito tarjeta) {
		//Debe llamar al constructor de la clase padre
		super(tarjeta.getNumero(), tarjeta.getValor());  
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
