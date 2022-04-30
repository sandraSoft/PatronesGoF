package observer.inicial;

/**
 * Clase que simula un sensor de velocidad de una bicicleta.
 * 
 * AVISA a las clases Mensaje y VentanaColor cuando la velocidad cambia,
 * lo cual la hace dependiente de estas clases y poco flexible
 * (en caso de cambiar la forma de informar).
 * 
 * @version 1.0
 */
public class SensorVelocidad {
	static final double VELOCIDAD_ALTA = 50;
	static final double VELOCIDAD_MEDIA = 35;

	private double velocidad;
	private Mensaje mensaje;
	private VentanaColor ventanaColor;

	public double getVelocidad() {
		return velocidad;
	}
	
	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public void setVentanaColor(VentanaColor ventanaColor) {
		this.ventanaColor = ventanaColor;
	}

	/**
	 * Cambia la velocidad y llama a los métodos correspondientes
	 * de Mensaje y VentanaColor para que se actualicen.
	 * 
	 * @param velocidad el nuevo valor de la velocidad (en Km/h)
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
		mensaje.mostrar(velocidad);
		ventanaColor.actualizarColor(this);
	}
}
