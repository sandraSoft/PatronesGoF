package state.inicial;

import java.util.ArrayList;
import java.util.List;

/**
 * Contiene varios carros que compiten.
 * 
 * @version 1.0
 */
public class PistaCarreras {
	
	private List<Carro> carros;

	public PistaCarreras() {
		carros = new ArrayList<>();
	}

	public void adicionarCarro(Carro nuevoCarro) {
		carros.add(nuevoCarro);
	}
	
	public int carrosCompitiendo() {
		return carros.size();
	}
}
