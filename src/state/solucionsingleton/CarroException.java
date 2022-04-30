package state.solucionsingleton;

/**
 * Excepción para indicar problemas al acelerar o frenar un carro
 * (por ejemplo, que trate de exceder la velocidad máxima).
 * 
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CarroException extends Exception {

	public CarroException(String mensaje) {
		super(mensaje);
	}
}
