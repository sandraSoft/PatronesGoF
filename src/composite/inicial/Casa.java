package composite.inicial;

import java.util.ArrayList;
import java.util.List;

/**
 * Construcción con elementos que la conforman,
 * como planchas y paredes.
 * 
 * MANEJA CADA ELEMENTO DE FORMA DIFERENTE
 * (LO QUE HACE COMPLEJA LA GESTIÓN).
 * 
 * @version 1.0
 */
public class Casa {
	
	private int pisos;
	private int habitaciones;
	private List<Pared> paredes;
	private List<Plancha> planchas;
	
	public Casa(int pisos, int habitaciones) {
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.paredes = new ArrayList<>();
		this.planchas = new ArrayList<>();
	}
	
	public void addPared(Pared pared) {
		paredes.add(pared);
	}
	
	public void addPlancha(Plancha plancha) {
		planchas.add(plancha);
	}
	
	/**
	 * Calcula los días que se demora en construir,
	 * considerando los elementos que la conforman
	 * y el tiempo de acabados.
	 * 
	 * @return días que demora en construirse
	 */
	public int calcularDiasConstruir() {
		if (planchas.isEmpty()) {
			return 0;
		}
		
		int dias = 0;
		for (Plancha plancha : planchas) {
			dias+= plancha.getDiasConstruir();
		}
		for (Pared pared : paredes) {
			dias+= pared.getDiasConstruir();
		}		
		return dias + ((habitaciones+pisos)*2);
	}
}
