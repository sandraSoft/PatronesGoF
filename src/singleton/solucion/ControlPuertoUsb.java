package singleton.solucion;

/**
 * Verifica la creación de un puerto USB
 * (debería ser solo uno).
 * 
 * @version 2.0
 */
public class ControlPuertoUsb {

	public static void main(String[] args) {
		
		// Ya no puede usar el constructor, por ser privado.
		// ESTO SERÍA ERROR:
		// PuertoUsb puerto = new PuertoUsb();
		
		// Usa el método estático, que retorna siempre la misma instancia
		PuertoUsb puerto1 = PuertoUsb.getPuerto();
		PuertoUsb puerto2 = PuertoUsb.getPuerto();
		PuertoUsb puerto3 = PuertoUsb.getPuerto();
		
		if ((puerto1 == puerto2) && (puerto2 == puerto3)) {
			System.out.println("Son el mismo puerto - solo uno creado ");
			System.out.println(puerto1);
			System.out.println(puerto2);
			System.out.println(puerto3);
		}
		else {
			System.out.println("Son puertos diferentes");
			System.out.println(puerto1);
			System.out.println(puerto2);
			System.out.println(puerto3);
		}
	}
}
