package observer.solucionapi;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Muestra un mensaje cuando la velocidad de la bicicleta supera un límite.
 * 
 * Implementa la interfaz "PropertyChangeListener" (del API de Java)
 * por lo que tiene el rol de CONCRETE OBSERVER (o Concrete Listener), del patrón Observer.
 * 
 * @version 3.0
 */
public class Mensaje implements PropertyChangeListener {
	
	/**
	 * Muestra un mensaje si se supera el límite establecido.
	 * 
	 * @param valorVelocidad	el valor de la velocidad (en KM/h)
	 *  que se evaluará para saber si supera el límite
	 */
	public void mostrar(double valorVelocidad) {
		if (valorVelocidad > SensorVelocidad.VELOCIDAD_ALTA) {
			System.out.println("Velocidad: "+valorVelocidad);
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evento) {
		double velocidad = (double)evento.getNewValue();
		this.mostrar(velocidad);
	}	
		
}
