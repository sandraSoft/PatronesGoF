package factories.inicial;

/**
 * Permite obtener los datos de un pedido de un juguete,
 * especialmente el precio, necesario para el área de Mercadeo.
 * 
 * @version 1.0
 */
public class Pedido {
	
	private Juguete juguete;

	/**
	 * Crea un juguete para calcular el valor del pedido
	 */
	public void adicionarJuguete(double precioBase, double volumen, char tipo) {
		Juguete juguete = new Juguete(precioBase,volumen, tipo);
		this.juguete = juguete;
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
