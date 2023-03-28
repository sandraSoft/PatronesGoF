package observer.solucion;

/**
 * Muestra un mensaje cuando la velocidad de la bicicleta supera un límite.
 * 
 * Implementa la interfaz "ObserverSensor", por lo que tiene el rol de
 * CONCRETE OBSERVER, del patrón Observer
 * 
 * @version 2.0
 */
public class Mensaje implements ObservadorSensor {
	
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
	public void actualizar(Sensor sensor) {
		if (sensor instanceof SensorVelocidad) {
			double velocidad = ((SensorVelocidad)sensor).getVelocidad();
			this.mostrar(velocidad);
		}
	}
}
