package factories.simplefactorystatic;

/**
 * Permite obtener los datos de un pedido de un juguete,
 * especialmente el precio, necesario para el área de Mercadeo.
 * 
 * ESTA CLASE NO TIENE QUE CONOCER LAS CLASES HIJAS DE JUGUETE,
 * CUMPLIENDO CON "DEPENDENCY INVERSION"
 * 
 * @version 3.0
 */
public class Pedido {
	
	private Juguete juguete;

	/**
	 * Crea un juguete para calcular el valor del pedido,
	 * USANDO LA FÁBRICA (el método estático).
	 */
	public void adicionarJuguete(double precioBase, double volumen, char tipo) {
		this.juguete = FabricaJuguetes.crearJuguete(precioBase, volumen, tipo);
	}
	
	/**
	 * Calcula el precio del pedido, sumando el precio del juguete 
	 * y los gastos administrativos.
	 * @return el precio total del pedido, en pesos colombianos.
	 */
	public double calcularPrecio() {
		final double GASTOS_ADMINISTRATIVO=2000;
		return juguete.getPrecioTotal()+GASTOS_ADMINISTRATIVO;
	}
}
