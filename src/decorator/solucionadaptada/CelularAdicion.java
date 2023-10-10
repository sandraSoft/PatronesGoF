package decorator.solucionadaptada;

/**
 * Permite extender las características de un celular base.
 * Corresponde al patrón DECORATOR.
 * 
 * @version 1.0
 */
public class CelularAdicion extends Celular {
	
	private Celular base;
	
	public CelularAdicion(Celular base) {
		// Debe llamar al constructor de la clase padre
		super(base.getModelo(), base.getMemoria());
		this.base = base;
	}
	
	@Override
	public double calcularPrecio() {
		return base.calcularPrecio();
	}
}
