package simplefactory.inicial;

import java.util.ArrayList;
import java.util.List;

/**
 * Permite obtener los datos de un pedido de un juguete,
 * especialmente el precio, necesario para el área de Mercadeo.
 * 
 * ESTA CLASE DEBE CREAR CADA JUGUETE (más responsabilidad),
 * Y DEBE CONOCER LAS CLASES HIJAS DE JUGUETE,
 * CREANDO ALTO ACOMPLAMIENTO.
 * 
 * @version 2.0
 */
public class Pedido {
	private List<Juguete> juguetes;

	public Pedido() {
		this.juguetes = new ArrayList<>();
	}
	
	/**
	 * Crea un juguete para adicionarlo al pedido.
	 * Debe verificar primero que no se tenga otro juguete con el 
	 * mismo nombre.
	 * 
	 * SE DEBE MODIFICAR ESTE MÉTODO SI APARECEN
	 * NUEVOS JUGUETES.
	 */
	public void adicionarJuguete(
			String nombre, double precioBase, double volumen, char tipo) {
		
		for (Juguete juguete : juguetes) {
			if (juguete.getNombre().equals(nombre)) {
				throw new IllegalArgumentException("Juguete con nombre repetido");
			}
		}
	
		Juguete nuevoJuguete;
		switch (tipo) {
			case 'm': 
				nuevoJuguete = new Muneco(nombre, precioBase, volumen);
				break;
			case 'b':
				nuevoJuguete = new Balon(nombre, precioBase, volumen);
				break;
			case 't':
				nuevoJuguete = new Tren(nombre, precioBase, volumen);
				break;
			default:
				throw new IllegalArgumentException();
		}	
		
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
