package command.inicial;

/**
 * Una apuesta de dinero que puede aumentar o ser cancelada.
 * 
 * @version 1.0
 */
public class Apuesta {
	
	private double cantidadDinero;
	private String estado;

	public Apuesta() {
		this.cantidadDinero = 0;
		this.estado = "activa";
	}
	
	public void aumentarCantidad() {
		this.cantidadDinero += 10000;
	}
	
	public void cancelarApuesta() {
		this.cantidadDinero = 0;
		this.estado = "cancelada";
	}

	@Override
	public String toString() {
		return "Dinero = $" + cantidadDinero +
				System.lineSeparator()+
				"Estado =" + estado;
	}

}
