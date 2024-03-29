package observer.solucion;

/**
 * Representa el comportamiento de los OBSERVADORES que son notificados
 * cuando cambie algún dato en un sensor (como velocidad de una bicicleta),
 * para que se actualicen.
 * 
 * Corresponde al rol OBSERVER del patrón del mismo nombre.
 * 
 * @version 1.0
 */
public interface ObservadorSensor {

	/**
	 * Método que se llama cuando cambia el dato del cual se está pendiente
	 * (como la velocidad).
	 * 
	 * @param sensor	un objeto Sensor que tiene el valor que ha cambiado
	 */
	public abstract void actualizar(Sensor sensor);

}
