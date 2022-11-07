package factories.simplefactorystatic;

/**
 * Juguete de peluche para bebé, que se empaca en bolsa.
 * 
 *  CORRESPONDE AL ROL "Concrete Product" DEL PATRÓN SIMPLE FACTORY
 *  
 * @version 1.2
 */
public class Peluche extends Juguete {
	
	public Peluche(double precioBase, double volumen) {
		super(precioBase, volumen);
	}

	@Override
	public Empaque crearEmpaque() {
		return new BolsaTela(this.getVolumen() + 10);
	}
}
