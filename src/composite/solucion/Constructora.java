package composite.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 * Construye casas a partir de elementos básicos
 * como paredes y planchas.
 * 
 * Maneja cada elemento de forma UNIFORME
 * (Es el cliente del patrón COMPOSITE).
 * 
 * @version 2.0
 */
public class Constructora {
	
	private List<Construible> elementos;
	
	public Constructora() {
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Construible elemento) {
		elementos.add(elemento);
	}

	/**
	 * Calcula los días que se demora en construir,
	 * considerando las casas que debe entregar,
	 * las cuales se construyen en paralelo,
	 * más un tiempo de preparación por elemento.
	 * 
	 * @return días que demora la construcción
	 */
	public int calcularDiasConstruccion() {
		int mayorDuracion = 0;
		for (Construible elemento : elementos) {
			// No se necesario, pero se puede puede usar: if (elemento instanceof Casa)
			if (elemento.getDiasConstruir() > mayorDuracion) {
				mayorDuracion = elemento.getDiasConstruir();
			}
		}
		int diasPreparacion = elementos.size();
		return mayorDuracion + diasPreparacion;
	}
}
