package factories.factorymethod;

/**
 * Juguete de peluche para bebé, que se empaca en bolsa.
 * 
 *  CORRESPONDE AL ROL "Concrete Creator" DEL PATRÓN FACTORY METHOD
 *  
 * @version 1.0
 */
public class Peluche extends Juguete {
	
	public Peluche(double precioBase, double volumen) {
		super(precioBase, volumen);
	}

	/**
	 * Sobreescribe el FACTORY METHOD
	 * Y crea un empaque concreto: Una "BolsaTela"
	 */
	@Override
	Empaque crearEmpaque() {
		return new BolsaTela(this.getVolumen() + 10);
	}
}
