package adapter.solucion.simplificada;

/**
 * Clase que realiza operaciones bancarias, como por ejemplo retirar dinero.
 * 
 * CORRESPONDE AL ROL "Client" DEL PATRÓN ADAPTER
 * 
 * @version 1.0
 */
public class OperacionBancaria {
	
	/**
	 * Realizar el retiro de dinero de una cuenta del banco.
	 * 
	 * @return si se pudo retirar el dinero, por ser una cantidad
	 * 			menor al saldo.
	 */
	public boolean realizarRetiro(Cuenta cuenta, double cantidad) {
		return cuenta.retirar(cantidad);
	}
}
