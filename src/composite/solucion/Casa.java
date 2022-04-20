package composite.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 * Construcción con elementos que la conforman,
 * como planchas y paredes.
 * 
 * Es un elemento compuesto de otros elementos.
 * (Patrón COMPOSITE).
 * 
 * @version 2.0
 */
public class Casa implements Construible {
	
	private int pisos;
	private int habitaciones;
	private List<Construible> elementos;
	
	public Casa(int pisos, int habitaciones) {
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Construible elemento) {
		elementos.add(elemento);
	}
	
	@Override
	public int getDiasConstruir() {
		if (elementos.isEmpty()) {
			return 0;
		}
		
		int dias = 0;
		for (Construible elemento : elementos) {
			dias+= elemento.getDiasConstruir();
		}
	
		return dias + ((habitaciones+pisos)*2);
	}
}
