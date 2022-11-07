package factories.simplefactorystatic;

/**
 * Juguete para bebé, que tiene un empaque especial.
 * 
 *  CORRESPONDE AL ROL "Product" DEL PATRÓN SIMPLE FACTORY
 * 
 * @version 2.5
 */
public abstract class Juguete {
	private double precioBase;
	private double volumen;
	
	private Empaque empaque;  
	
	public Juguete(double precioBase, double volumen) {
		this.precioBase = precioBase;
		this.volumen = volumen;
		this.empaque = crearEmpaque(); 
	}
	
	public double getVolumen() {
		return volumen;
	}
	
	/**
	 * Calcula el precio total del juguete, incluyendo el precio del empaque
	 * @return el precio total, en pesos colombianos. 
	 */
	public double getPrecioTotal() {
		return precioBase + empaque.calcularPrecio();
	}
	
	/**
	 * Este método debe ser sobreescrito por las hijas,
	 * para que cada una cree el empaque que le corresponde
	 */
	abstract Empaque crearEmpaque();
}
