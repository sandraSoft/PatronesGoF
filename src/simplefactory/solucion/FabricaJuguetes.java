package simplefactory.solucion;

/**
 * Se encarga de crear un juguete dependiendo del tipo.
 * 
 *  CORRESPONDE AL ROL "Factory" DEL PATRÓN SIMPLE FACTORY
 *  Con el método de creación estático, para que pueda ser
 *  usado desde cualquier parte del programa.
 *  
 * @version 1.0
 */
public class FabricaJuguetes {
	
	/**
	 * ESTE METODO CAMBIA SI APARECE UN NUEVO JUGUETE,
	 * PERO LA VENTAJA ES QUE ES SU ÚNICA RESPONSABILIDAD
	 * Y ESTA EN UNA CLASE EXCLUSIVA PARA ESTA FUNCIÓN.
	 */
	public static Juguete crearJuguete(
			String nombre, double precioBase, double volumen, char tipo) {
		
		return switch (tipo) {
			case 'm'-> new Muneco(nombre,precioBase, volumen);
			case 'b'-> new Balon(nombre,precioBase, volumen);
			case 't'-> new Tren(nombre,precioBase, volumen);				
			default-> throw new IllegalArgumentException("Tipo de juguete no soportado");
		};
	}
}
