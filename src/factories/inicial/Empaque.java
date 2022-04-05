package factories.inicial;

/**
 * Un empaque de un juguete para bebé.
 * Se crea dependiendo del tipo de juguete que se desee empacar.
 * 
 * @version 1.0
 */
public abstract class Empaque {
	private double capacidad;
	
	public Empaque(double capacidad) {
		this.capacidad = capacidad;
	}
	
	protected double getCapacidad() {
		return capacidad;
	}
	
	/**
	 * Calcula el precio del empaque.
	 * @return	el precio, en pesos, del empaque
	 */
	public abstract double calcularPrecio();
}
