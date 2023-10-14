package simplefactory.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 * Guarda los datos de un pedido de juguetes,
 * especialmente el precio, necesario para el área de Mercadeo.
 * 
 * ESTA CLASE NO TIENE QUE CONOCER LAS CLASES HIJAS DE JUGUETE,
 * CUMPLIENDO ASÍ CON VARIOS PRINCIPIOS DE DISEÑO.
 * 
 * @version 2.5
 */
public class Pedido {
	private List<Juguete> juguetes;

	public Pedido() {
		this.juguetes = new ArrayList<>();
	}
	
	/**
	 * Crea un juguete para adicionarlo al pedido, USANDO LA FÁBRICA.
	 * 
	 * Debe verificar primero que no se tenga otro juguete con el 
	 * mismo nombre.
	 */
	public void adicionarJuguete(
			String nombre, double precioBase, double volumen, char tipo) {
		
		for (Juguete juguete : juguetes) {
			if (juguete.getNombre().equals(nombre)) {
				throw new IllegalArgumentException("Juguete con nombre repetido");
			}
		}
	
		Juguete nuevoJuguete = 
				FabricaJuguetes.crearJuguete(nombre,precioBase, volumen, tipo);
		juguetes.add(nuevoJuguete);
	}
	
	/**
	 * Calcula el precio del pedido, sumando el precio de
	 * los juguetes y unos gastos administrativos.
	 * 
	 * @return el precio total del pedido, en pesos colombianos.
	 */
	public double calcularPrecio() {
		final double GASTOS_ADMINISTRATIVO=2000;
		double precioJuguetes = 0;
		for (Juguete juguete : juguetes) {
			precioJuguetes += juguete.getPrecioTotal();
		}
		return precioJuguetes + GASTOS_ADMINISTRATIVO;
	}
}
