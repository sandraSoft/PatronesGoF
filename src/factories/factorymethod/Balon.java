package factories.factorymethod;

/**
 * Balón de colores para bebé, que se empaca en caja
 * 
 *  CORRESPONDE AL ROL "Concrete Creator" DEL PATRÓN FACTORY METHOD
 *  
 * @version 1.0
 */
public class Balon extends Juguete {

	public Balon(double precioBase, double volumen) {
		super(precioBase, volumen);
	}

	/**
	 * Sobreescribe el FACTORY METHOD
	 * Y crea un empaque concreto: Una "Caja"
	 */
	@Override
	Empaque crearEmpaque() {
		return new Caja(this.getVolumen() + 5);
	}
}
