package strategy.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que obtiene datos de un archivo para
 * crear una lista de carros.
 * 
 * Corresponde al rol CONTEXT en el patrón Strategy.
 * 
 * @version 2.0
 */
public class ControlCarros {
	private List<Carro> carros;
	private IConvertidorFormato convertidor;
	
	public ControlCarros(IConvertidorFormato convertidor) {
		this.carros = new ArrayList<>();
		this.convertidor = convertidor;
	}
	
	List<Carro> getCarros() {
		return carros;
	}
	
	public void setConvertidor(IConvertidorFormato convertidor) {
		this.convertidor = convertidor;
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
			this.carros = convertidor.crearListaCarros(textoArchivo);
		}
	}
}
