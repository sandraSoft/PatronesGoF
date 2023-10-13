package simplefactory.inicial;

/**
 * Juguete que puede ser de diferentes tipos.
 * 
 * @version 2.0
 */
public abstract class Juguete {
	private String nombre;
	private double precioBase;
	private double volumen;
	
	public Juguete(String nombre, double precioBase, double volumen) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.volumen = volumen;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getVolumen() {
		return volumen;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	/**
	 * Calcula el precio total del juguete, con cargos e impuestos.
	 * @return el precio total, en pesos colombianos. 
	 */
	public abstract double getPrecioTotal();
}
