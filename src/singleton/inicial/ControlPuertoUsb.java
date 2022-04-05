package singleton.inicial;

/**
 * Verifica la creación de un puerto USB
 * (debería ser solo uno).
 * 
 * @version 1.0
 */
public class ControlPuertoUsb {

	public static void main(String[] args) {
		
		// Al usar el constructor directamente, se pueden crear muchos objetos
		PuertoUsb puerto1 = new PuertoUsb();
		PuertoUsb puerto2 = new PuertoUsb();
		PuertoUsb puerto3 = new PuertoUsb();
		
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
