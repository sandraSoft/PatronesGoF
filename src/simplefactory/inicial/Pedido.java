package simplefactory.inicial;

/**
 * Permite obtener los datos de un pedido de un juguete,
 * especialmente el precio, necesario para el área de Mercadeo.
 * 
 * ESTA CLASE DEBE CONOCER LAS CLASES HIJAS DE JUGUETE,
 * CREANDO ALTO ACOMPLAMIENTO
 * 
 * @version 2.0
 */
public class Pedido {
	
	private Juguete juguete;

	/**
	 * Crea un juguete para calcular el valor del pedido.
	 * 
	 * SE DEBE MODIFICAR ESTE MÉTODO SI APARECEN
	 * NUEVOS JUGUETES
	 */
	public void adicionarJuguete(double precioBase, double volumen, char tipo) {
		switch (tipo) {
			case 'p': 
				this.juguete = new Peluche(precioBase, volumen);
				break;
			case 'b':
				this.juguete = new Balon(precioBase, volumen);
				break;
		}		
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
