package observer.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un dato que es medido u obtenido por un sensor
 * y es "observado" por otros que están interesados en tomar acciones
 * cuando cambia el valor.
 *
 * Representa el rol SUBJECT (Observable) en el patrón Observer:
 * - Tiene la lista de observadores y los notifica cuando hay un cambio.
 * 
 * @version 1.0
 */
public class Sensor {
	private List<ObservadorSensor> observadores;
	
	public Sensor() {
		this.observadores = new ArrayList<>();
	}
	
	public void adicionarObservador(ObservadorSensor observer) {
		observadores.add(observer);
	}
	
	public void eliminarObservador(ObservadorSensor observer) {
		observadores.remove(observer);
	}
	
	/**
	 * Recorre la lista de observadores para informarles
	 *  que hay un cambio en el valor, 
	 *  para que ellos tomen la acción que corresponda.
	 */
	public void notificar() {
		observadores.forEach(observer->observer.actualizar(this));
	}
}
