package strategy.inicial;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase relacionada con un archivo de texto, 
 * para leer su contenido.
 * 
 * @version 1.0
 */
public class LectorArchivo {
	
	private File archivo;

	public LectorArchivo(String rutaArchivo) {
		this.archivo = new File(rutaArchivo);
	}
	
	public LectorArchivo(File file) {
		this.archivo = file;
	}
	
	/**
	 * En caso de ser un archivo pequeño, se puede leer todo 
	 * en una sola instrucción.
	 * 
	 * @return el texto completo del archivo, como un solo String,
	 * 			o null si no pudo leer el archivo.
	 */
	public String leerTextoArchivo() {
		Path ruta = Paths.get(archivo.toURI());
		try {
			String texto = Files.readString(ruta);
			return texto;
		} catch (IOException e) {
			return null;
		}
	}
}
