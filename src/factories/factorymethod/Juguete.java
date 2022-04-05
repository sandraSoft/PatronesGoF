package factories.factorymethod;

/**
 * Juguete para bebé, que tiene un empaque especial.
 * 
 *  CORRESPONDE AL ROL "Creator" DEL PATRÓN FACTORY METHOD
 *  
 *  Ya no hay que cambiar esta clase si aparecen nuevos
 *  juguetes o empaques
 * 
 * @version 2.0
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
	 * FACTORY METHOD
	 * Este método debe ser sobreescrito por las hijas,
	 * para que cada una cree el empaque que le corresponde.
	 */
	abstract Empaque crearEmpaque();
}
