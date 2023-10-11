package strategy.inicial;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Clase que obtiene datos de un archivo para
 * crear una lista de carros.
 * 
 * @version 1.0
 */
public class ControlCarros {
	private List<Carro> carros;
	
	public ControlCarros() {
		carros = new ArrayList<>();
	}
	
	List<Carro> getCarros() {
		return carros;
	}
	
	/**
	 * Crea un lector para obtener los datos de un archivo,
	 * a partir de su ruta, y obtener los datos de los carros que tiene.
	 * 
	 * @param rutaArchivo la ruta completa del archivo, 
	 * 		con su nombre y extensión. Por ejemplo:
	 *      C:\\UCaldas\\IngSw\\Patrones\\Carros.json
	 */
	public void obtenerDatosCarros(String rutaArchivo) {
		LectorArchivo lector = new LectorArchivo(rutaArchivo);
		String textoArchivo = lector.leerTextoArchivo();
		if (textoArchivo != null) {
			this.crearListaCarros(textoArchivo);
		}
	}
	
	/**
	 * A partir de un texto, que corresponde a un arreglo de objetos JSON,
	 * se obtienen los datos de carros para crearlos
	 * y guardarlos en la colección.
	 * Si el texto no tiene el formato correcto, no se realiza ninguna acción.
	 * 
	 * @param texto  un arreglo JSON con datos de varios carros.
	 */
	private void crearListaCarros(String texto) {
		try {
			JSONArray arregloJson = new JSONArray(texto);
			for (int i = 0; i < arregloJson.length(); i++) {
				JSONObject objetoJson = arregloJson.getJSONObject(i);
				Carro carro = crearCarro(objetoJson.toString());
				carros.add(carro);
			}
		} catch (JSONException formatoIncorrecto) {
			// En blanco a propósito. No se crean carros.
		}
	}
	
	/**
	 * Crea un objeto Carro a partir de los datos de un String.
	 * 
	 * @param datos cadena en formato JSON con los datos de un Carro.
	 *  Por ejemplo: {"placa":"QUX-346","modelo":2020}
	 * @return el objeto Carro creado a partir de los datos
	 *  	del texto Json.
	 */
	private Carro crearCarro(String datos) {
		JSONObject objetoJson = new JSONObject(datos);
		String placa = objetoJson.getString("placa");
		int modelo = objetoJson.getInt("modelo");
		return new Carro(placa, modelo);
	}
}
