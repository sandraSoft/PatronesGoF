package simplefactory.inicial;

/**
 * Juguete para bebé, que tiene diferentes hijas para los
 * diferentes juguetes que se deseen.
 * 
 * @version 1.0
 */
public abstract class Juguete {
	private double precioBase;
	private double volumen;
	
	public Juguete(double precioBase, double volumen) {
		this.precioBase = precioBase;
		this.volumen = volumen;
	}
	
	public double getVolumen() {
		return volumen;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	/**
	 * Calcula el precio total del juguete, incluyendo el precio del empaque.
	 * @return el precio total, en pesos colombianos. 
	 */
	public abstract double getPrecioTotal();
}
