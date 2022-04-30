package observer.inicial;

/**
 * Muestra un mensaje cuando la velocidad de la bicicleta supera un límite.
 * 
 * @version 1.0
 */
public class Mensaje {
	
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
}
