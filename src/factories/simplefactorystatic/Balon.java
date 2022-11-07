package factories.simplefactorystatic;

/**
 * Balón de colores para bebé, que se empaca en caja
 * 
 *  CORRESPONDE AL ROL "Concrete Product" DEL PATRÓN SIMPLE FACTORY
 *  
 * @version 1.2
 */
public class Balon extends Juguete {

	public Balon(double precioBase, double volumen) {
		super(precioBase, volumen);
	}

	@Override
	public Empaque crearEmpaque() {
		return new Caja(this.getVolumen() + 5);
	}
}
