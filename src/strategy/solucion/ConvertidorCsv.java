package strategy.solucion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Permite convertir datos de carros que están en formato CSV
 * a sus correspondientes objetos "Carro" en Java.
 * 
 * @version 1.0
 */
public class ConvertidorCsv implements IConvertidorFormato {

	/**
	 * {@inheritDoc}
	 * 
	 * Se deben tener varias líneas de texto, cada una con los datos de un carro.
	 * No se debe tener una línea de encabezado, desde la primera línea son datos.
	 */
	@Override
	public List<Carro> crearListaCarros(String texto) {
		List<Carro> carros = new ArrayList<>();
		try {
			List<String> datosCarrosEnTexto = Arrays.asList(texto.split(System.lineSeparator()));
			for (String datosCarro : datosCarrosEnTexto) {
				Carro carro = crearCarro(datosCarro);
				carros.add(carro);
			}
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException malFormato) {
			// En blanco a propósito. No se crean carros.
		}
		return carros;
	}

	
	/**
	 * {@inheritDoc}
	 * 
	 * La cadena debe estar con los datos de un Carro separados por comas
	 *  Por ejemplo: QUX-346,2020
	 */
	@Override
	public Carro crearCarro(String datos) {
		String[] datosCarro = datos.split(",");
		String placa = datosCarro[0];
		int modelo = Integer.parseInt(datosCarro[1]);
		return new Carro(placa, modelo);
	}
}
