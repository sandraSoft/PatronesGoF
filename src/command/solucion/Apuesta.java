package command.solucion;

/**
 * Una apuesta de dinero que puede aumentar o ser cancelada.
 * Corresponde al rol "RECEIVER" del patrón COMMAND
 * 
 * @version 1.1
 */
public class Apuesta {
	private double cantidadDinero;
	private String estado;

	public Apuesta() {
		this.cantidadDinero = 0;
		this.estado = "activa";
	}
	
	/**
	 * En el modo básico, una apuesta se incrementa en un valor fijo.
	 */
	public void incrementar() {
		if (!this.estado.equals("cancelada")) {
			this.cantidadDinero += 10000;
		}
	}
	
	/**
	 * Al cancelar una apuesta se le reintegra el valor al apostador,
	 * y ya no se puede seguir incrementando.
	 */
	public void cancelar() {
		this.cantidadDinero = 0;
		this.estado = "cancelada";
	}
	
	public double getCantidadDinero() {
		return cantidadDinero;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Dinero = $" + cantidadDinero +
				System.lineSeparator()+
				"Estado = " + estado;
	}

}

