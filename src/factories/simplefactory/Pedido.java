package factories.simplefactory;

/**
 * Permite obtener los datos de un pedido de un juguete,
 * especialmente el precio, necesario para el área de Mercadeo.
 * 
 * ESTA CLASE NO TIENE QUE CONOCER LAS CLASES HIJAS DE JUGUETE,
 * CUMPLIENDO CON "DEPENDENCY INVERSION"
 * 
 *  CORRESPONDE AL ROL "Client" DEL PATRÓN SIMPLE FACTORY
 * 
 * @version 3.0
 */
public class Pedido {
	
	private Juguete juguete;
	private FabricaJuguetes fabrica;

	public Pedido() {
		this.fabrica = new FabricaJuguetes();
	}
	
	/**
	 * Crea un juguete para calcular el valor del pedido,
	 * USANDO LA FÁBRICA
	 */
	public void adicionarJuguete(double precioBase, double volumen, char tipo) {
		this.juguete = fabrica.crearJuguete(precioBase, volumen, tipo);
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
