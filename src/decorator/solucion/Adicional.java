package decorator.solucion;

/**
 * Permite extender las características de un celular base.
 * Corresponde al patrón DECORATOR (rol "Decorator").
 * 
 * @version 1.0
 */
public abstract class Adicional implements ICelular {
	
	private ICelular base;
	
	public Adicional(ICelular base) {
		this.base = base;
	}
	
	@Override
	public double calcularPrecio() {
		return base.calcularPrecio();
	}
}
