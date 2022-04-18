package builder.solucion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Sitio que tiene varios autos para los clientes.
 * 
 * @version 2.0
 */
public class Agencia {

	private List<Auto> autos;

	public Agencia() {
		this.autos = new ArrayList<>();
	}


	/**
	 * Adiciona un auto, pero primero debe crearlo usando el constructor (Builder).
	 * 
	 * @param datosAuto un map con los valores para los atributos del auto
	 * 			(la clave es el nombre del atributo).
	 * @param extras una lista de cadenas con los elementos extra del auto.
	 */
	public void addAuto(Map<String, String> datosAuto, List<String> extras) {
		String placa = datosAuto.get("placa");
		String marca = datosAuto.get("marca");
		
		Auto.Builder constructor = Auto.constructor(placa, marca);
		
		// Adiciona solo los atributos de los que se tenga valor.
		if (datosAuto.containsKey("tipo")) {
			constructor.tipo(datosAuto.get("tipo"));
		}
		if (datosAuto.containsKey("tipoBateria")) {
			constructor.tipo(datosAuto.get("tipoBateria"));
		}
		if (datosAuto.containsKey("asientos")) {
			constructor.asientos(Integer.parseInt(datosAuto.get("asientos")));
		}
		if (datosAuto.containsKey("potenciaMotor")) {
			constructor.potenciaMotor(Integer.parseInt(datosAuto.get("potenciaMotor")));
		}
		if (datosAuto.containsKey("largo")) {
			constructor.largo(Integer.parseInt(datosAuto.get("largo")));
		}
		if (datosAuto.containsKey("ancho")) {
			constructor.ancho(Integer.parseInt(datosAuto.get("ancho")));
		}
		if (extras != null) {
			for (String extra : extras) {
				constructor.extra(extra);
			}
		}

		autos.add(constructor.crear());
	}
	

	public Auto buscarAuto(String placa) {
		return autos.stream().filter(auto -> placa.equals(auto.getPlaca()))
				.findFirst().orElse(null);
	}
}
