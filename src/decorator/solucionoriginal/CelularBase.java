package decorator.solucionoriginal;

/**
 * Corresponde al celular base (que era el que estaba originalmente),
 * al cual se le pueden adicionar características extra.
 * Se usa el patrón DECORATOR (esta clase corresponde al "Concrete Component").
 * 
 * @version 1.5
 */
public class CelularBase implements Celular {
	
	private String modelo;
	private int memoria;
	
	public CelularBase(String modelo, int memoria) {
		this.modelo = modelo;
		this.memoria = memoria;
	}

	public String getModelo() {
		return modelo;
	}

	public int getMemoria() {
		return memoria;
	}
	
	@Override
	public double calcularPrecio() {
		double precio = 500000;
		precio += memoria*1200;
		return precio;
	}
}
