package builder.inicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Sitio que tiene varios autos para los clientes.
 * 
 * @version 1.0
 */
public class Agencia {

	private List<Auto> autos;

	public Agencia() {
		this.autos = new ArrayList<>();
	}


	/**
	 * Adiciona un auto, pero primero debe crearlo con alguno de los constructores.
	 * 
	 * @param datosAuto un map con los valores para los atributos del auto
	 * 			(la clave es el nombre del atributo).
	 * @param extras una lista de cadenas con los elementos extra del auto.
	 */
	public void adicionarAuto(Map<String, String> datosAuto, List<String> extras) {
		Auto autoNuevo;
		String placa = datosAuto.get("placa");
		String marca = datosAuto.get("marca");
		
		// Tiene que seleccionar un constructor, incluso con datos que no se conocen.
		if (datosAuto.containsKey("tipoBateria")) {
			autoNuevo = new Auto(placa, marca, datosAuto.get("tipo"),
					datosAuto.get("tipoBateria"), Integer.parseInt(datosAuto.get("asientos")),
					Integer.parseInt(datosAuto.get("potenciaMotor")),
					Integer.parseInt(datosAuto.get("largo")), 
					Integer.parseInt(datosAuto.get("ancho")), extras);
		}
		else if (datosAuto.containsKey("potenciaMotor")) {
			autoNuevo = new Auto(placa, marca, datosAuto.get("tipo"),
					Integer.parseInt(datosAuto.get("asientos")),
					Integer.parseInt(datosAuto.get("potenciaMotor")));
			if (extras != null) {
				autoNuevo.setExtras(extras);
			}
		}
		else if (datosAuto.containsKey("tipo")) {
			autoNuevo = new Auto(placa, marca, datosAuto.get("tipo"));
			if (extras != null) {
				autoNuevo.setExtras(extras);
			}
		}
		else {
			autoNuevo = new Auto(placa, marca);
			if (extras != null) {
				autoNuevo.setExtras(extras);
			}
		}
		autos.add(autoNuevo);
	}
	

	public Auto buscarAuto(String placa) {
		return autos.stream().filter(auto -> placa.equals(auto.getPlaca()))
				.findFirst().orElse(null);
	}
}
