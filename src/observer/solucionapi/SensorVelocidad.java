package observer.solucionapi;

import java.util.Observable;

/**
 * Clase que simula un sensor de velocidad de una bicicleta.
 * 
 * Es hija de Observable (del API de Java), por lo que es
 * un Observable concreto (CONCRETE SUBJECT) del patrón Observer. 
 * 
 * @version 2.5
 */
public class SensorVelocidad extends Observable {
	static final double VELOCIDAD_ALTA = 50;
	static final double VELOCIDAD_MEDIA = 35;
	
	private double velocidad;

	/**
	 * Cambia la velocidad y llama al método "notifyObservers", 
	 * para que los interesados se actualicen (parte del patrón Observer).
	 * 
	 * @param velocidad el nuevo valor de la velocidad (en Km/h)
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
		
		// informar a los observadores
		this.setChanged();
		this.notifyObservers();
	}

	public double getVelocidad() {
		return velocidad;
	}
}
