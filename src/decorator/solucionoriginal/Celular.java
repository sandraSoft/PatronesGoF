package decorator.solucionoriginal;

/**
 * Dispositivo para comunicación y manejo de aplicaciones.
 * 
 * La forma de calcular el precio puede cambiar si se adicionan
 * condiciones o características al celular, para lo cual se usará
 * el patrón DECORATOR (esta interfaz corresponde al "Component").
 * 
 * @version 2.0
 */
public interface Celular {
	
	/**
	 * El precio depende de varios factores, pues las 
	 * características adicionales pueden cambiarlo.
	 * 
	 * @return el precio en pesos.
	 */
	public abstract double calcularPrecio();

}
