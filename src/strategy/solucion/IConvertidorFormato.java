package strategy.solucion;

import java.util.List;

/**
 * Métodos para "convertir" un texto con datos de carros en 
 * una lista de objetos Carro.
 * 
 * @version 1.0
 */
public interface IConvertidorFormato {

	/**
	 * A partir de un texto, que corresponde datos de varios carros,
	 * se obtienen los datos para crear los objetos "Carro"
	 * y guardarlos en una lista.
	 * 
	 * @param texto  un texto con datos de varios carros, en algún formato
	 * 		(como JSON, CSV u otro).
	 * @return una lista de carros creados con los datos.
	 * 		Retorna una lista vacía	si el texto tenía el formato correcto.
	 */
	public List<Carro> crearListaCarros(String texto);
	
	
	/**
	 * Crea un objeto Carro a partir de los datos de un String.
	 * 
	 * @param datos cadena en un formato concreto con los datos de un Carro.
	 * @return el objeto Carro creado a partir de los datos.
	 */
	public Carro crearCarro(String datos);
}
