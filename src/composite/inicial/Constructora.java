package composite.inicial;

import java.util.ArrayList;
import java.util.List;

/**
 * Construye casas a partir de elementos básicos
 * como paredes y planchas.
 * 
 * MANEJA CADA ELEMENTO DE FORMA DIFERENTE
 * (LO QUE HACE COMPLEJA LA GESTIÓN).
 * 
 * @version 1.0
 */
public class Constructora {
	
	private List<Pared> paredes;
	private List<Plancha> planchas;
	private List<Casa> casas;
	
	public Constructora() {
		this.paredes = new ArrayList<>();
		this.planchas = new ArrayList<>();
		this.casas = new ArrayList<>();
	}
	
	public void addPared(Pared pared) {
		paredes.add(pared);
	}
	
	public void addPlancha(Plancha plancha) {
		planchas.add(plancha);
	}
	
	public void addCasa(Casa casa) {
		casas.add(casa);
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
		for (Casa casa : casas) {
			if (casa.calcularDiasConstruir() > mayorDuracion) {
				mayorDuracion = casa.calcularDiasConstruir();
			}
		}
		int diasPreparacion = planchas.size() + paredes.size() + casas.size();
		return mayorDuracion + diasPreparacion;
	}
}
