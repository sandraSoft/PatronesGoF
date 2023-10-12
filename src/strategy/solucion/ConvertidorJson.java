package strategy.solucion;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Permite convertir datos de carros que están en formato JSON
 * a sus correspondientes objetos "Carro" en Java.
 * 
 * Corresponde al rol CONCRETE STRATEGY.
 * 
 * @version 1.0
 */
public class ConvertidorJson implements IConvertidorFormato {

	/**
	 * {@inheritDoc}
	 * 
	 * Los datos deben corresponder a un arreglo JSON.
	 * Por ejemplo: [{"placa":"QUX-346","modelo":2020},{"placa":"HFY-974","modelo":2019}]
	 */
	@Override
	public List<Carro> crearListaCarros(String texto) {
		List<Carro> carros = new ArrayList<>();
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
		return carros;
	}

	
	/**
	 * {@inheritDoc}
	 * 
	 * La cadena debe estar en formato JSON con los datos de un Carro.
	 *  Por ejemplo: {"placa":"QUX-346","modelo":2020}
	 */
	@Override
	public Carro crearCarro(String datos) {
		JSONObject objetoJson = new JSONObject(datos);
		String placa = objetoJson.getString("placa");
		int modelo = objetoJson.getInt("modelo");
		return new Carro(placa, modelo);
	}

}
