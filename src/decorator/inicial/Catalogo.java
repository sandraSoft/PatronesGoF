package decorator.inicial;

import java.util.ArrayList;
import java.util.List;

/**
 * Conjunto de celulares que se tienen para la venta,
 * de diferentes modelos y características.
 * 
 * @version 1.0
 */
public class Catalogo {
	private List<Celular> celulares;
	
	public Catalogo() {
		this.celulares = new ArrayList<>();
	}
	
	public void adicionarCelular(Celular celular) {
		celulares.add(celular);
	}
	
	/**
	 * Calcula el precio de todos los celulares que hay.
	 * @return la suma de los precios de los celulares, en pesos
	 */
	public double getPrecioTotalCatalogo() {
		double precioTotal = 0;
		for (Celular celular : celulares) {
			precioTotal += celular.calcularPrecio();
		}
		return precioTotal;
	}
}
