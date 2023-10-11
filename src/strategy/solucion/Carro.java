
package strategy.solucion;

/**
 * Información básica de un vehículo, que puede estar originalmente
 * en diferentes formatos (por venir de diferentes fuentes).
 * 
 * @version 1.0
 */
public class Carro {
	
	private String placa;
	private int modelo;
	
	public Carro(String placa, int modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public int getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "[placa=" + placa + ", modelo=" + modelo + "]";
	}
}
