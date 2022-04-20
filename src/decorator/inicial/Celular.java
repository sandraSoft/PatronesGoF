package decorator.inicial;

/**
 * Dispositivo para comunicación y manejo de aplicaciones.
 * 
 * La forma de calcular el precio puede cambiar si se adicionan
 * condiciones o características al celular, pero no se desea
 * que el programa quede con condicionales complejos o con
 * una jerarquía de herencia muy extensa.
 * 
 * @version 1.0
 */
public class Celular {
	
	private String modelo;
	private int memoria;
	
	public Celular(String modelo, int memoria) {
		this.modelo = modelo;
		this.memoria = memoria;
	}

	public String getModelo() {
		return modelo;
	}

	public int getMemoria() {
		return memoria;
	}
	
	/**
	 * El precio depende de varios factores, pues las 
	 * características adicionales pueden cambiarlo.
	 * 
	 * @return el precio en pesos.
	 */
	public double calcularPrecio() {
		double precio = 500000;
		precio += memoria*1200;
		return precio;
	}
}
