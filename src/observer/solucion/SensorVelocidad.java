package observer.solucion;

/**
 * Clase que simula un sensor de velocidad de una bicicleta.
 * 
 * Es hija de Sensor, por lo que es un Observable concreto
 * (CONCRETE SUBJECT) en el patrón Observer. 
 * No necesita tener referencias a cada clase interesada
 * en la velocidad, eso lo hace la clase padre Sensor.
 * 
 * @version 2.0
 */
public class SensorVelocidad extends Sensor {
	public static final double VELOCIDAD_ALTA = 50;
	public static final double VELOCIDAD_MEDIA = 35;
	
	private double velocidad;
	
	public SensorVelocidad() {
		this.velocidad = 0;
	}

	/**
	 * Cambia la velocidad y llama al método "notificar", 
	 * para que los interesados se actualicen (parte del patrón Observer).
	 * 
	 * @param velocidad el nuevo valor de la velocidad (en Km/h)
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
		
		// informar a los observadores
		this.notificar();
	}

	public double getVelocidad() {
		return velocidad;
	}
}
