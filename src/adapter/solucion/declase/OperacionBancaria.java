package adapter.solucion.declase;

/**
 * Clase que realiza operaciones bancarias, como por ejemplo retirar dinero.
 * 
 * AHORA USA LA INTERFAZ "ProductoBancario" Y DE ESA FORMA FACILITA LOS CAMBIOS.
 * CORRESPONDE AL ROL "Client" DEL PATRÓN ADAPTER
 * 
 * @version 2.0
 */
public class OperacionBancaria {
	
	/**
	 * Realiza un retiro de dinero de un producto bancario (cuenta, tarjeta u otro).
	 * 
	 * @return si se pudo realizar la operación 
	 * 		(por que la cantidad era mayor a cero y menor al saldo).
	 */
	public boolean realizarRetiro(IProductoBancario producto, double cantidad) {
		return producto.retirar(cantidad);
	}
}
