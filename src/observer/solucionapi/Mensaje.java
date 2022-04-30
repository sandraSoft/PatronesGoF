package observer.solucionapi;

import java.util.Observable;
import java.util.Observer;

/**
 * Muestra un mensaje cuando la velocidad de la bicicleta supera un límite.
 * 
 * Implementa la interfaz "Observer" (del API de Java)
 * por lo que tiene el rol de CONCRETE OBSERVER, del patrón Observer.
 * 
 * @version 2.5
 */
public class Mensaje implements Observer {
	
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
	public void update(Observable sensor, Object otroObjeto) {
		if (sensor instanceof SensorVelocidad) {
			double velocidad = ((SensorVelocidad)sensor).getVelocidad();
			this.mostrar(velocidad);
		}		
	}
}
