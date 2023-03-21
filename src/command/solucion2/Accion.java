package command.solucion2;

/**
 * Diferentes acciones que se pueden realizar en una aplicación de apuestas.
 * Corresponde al rol "COMMAND" del patrón del mismo nombre.
 * 
 * @version 1.0
 */
public interface Accion {
	
	/**
	 * Se encarga de realizar la acción correspondiente, 
	 * de acuerdo con la lógica del negocio (sobre un "receiver"),
	 * separado así cada acción de quién la solicita y quien la recibe.
	 */
	public void ejecutar();

}
