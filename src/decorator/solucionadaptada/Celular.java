package decorator.solucionadaptada;

/**
 * Dispositivo para comunicación y manejo de aplicaciones.
 * 
 * La forma de calcular el precio puede cambiar si se adicionan
 * condiciones o características al celular, para lo cual se usará
 * el patrón DECORATOR (con una adaptación, para que esta clase
 * sea a la vez el componente y el componente concreto).
 * 
 * @version 1.1
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
