package decorator.solucion;

/**
 * Un tipo de adición o característica de un celular.
 * Cambiar la forma de calcular el valor, a partir del precio base.
 * Es un decorador concreto (patrón DECORATOR).
 * 
 * @version 1.0
 */
public class Usado extends Adicional {

	public Usado(ICelular base) {
		super(base);
	}
	
	@Override
	public double calcularPrecio() {
		return (super.calcularPrecio() * 0.5);
	}
}
