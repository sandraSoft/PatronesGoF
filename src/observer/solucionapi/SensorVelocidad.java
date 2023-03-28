package observer.solucionapi;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Clase que simula un sensor de velocidad de una bicicleta.
 * 
 * Usa un "PropertyChangeSupport" (del API de Java), para notificar.
 * Tiene el rol de SUBJECT (o Concrete Subject) del patrón Observer. 
 * 
 * @version 3.0
 */
public class SensorVelocidad {
	public static final double VELOCIDAD_ALTA = 50;
	public static final double VELOCIDAD_MEDIA = 35;
	
	private double velocidad;
	
	private PropertyChangeSupport publicador;
	
	public SensorVelocidad() {
		this.velocidad = 0 ;
		publicador = new PropertyChangeSupport(this);
	}
	
	public void adicionarInteresadoSensor(PropertyChangeListener interesado) {
		publicador.addPropertyChangeListener(interesado);
	}
	
	public void eliminarInteresadoSensor(PropertyChangeListener interesado) {
		publicador.removePropertyChangeListener(interesado);
	}

	/**
	 * Cambia la velocidad y llama al método "firePropertyChange", 
	 * para que los interesados se actualicen (parte del patrón Observer).
	 * 
	 * @param velocidad el nuevo valor de la velocidad (en Km/h)
	 */
	public void setVelocidad(double velocidad) {		
		// informar a los observadores
		publicador.firePropertyChange("velocidad",this.velocidad, velocidad);
		
		this.velocidad = velocidad;
	}

	public double getVelocidad() {
		return velocidad;
	}
}
