package command.inicial;

/**
 * Aplicación principal de apuestas,
 * encargada de crear la parte visual y la parte de la lógica.
 * 
 * @version 1.0
 */
public class AplicacionApuestas {

	public static void main(String[] args) {
		Ventana frame = new Ventana();
		frame.setTitle("Apuestas");
		frame.setApuesta(new Apuesta());
		frame.setVisible(true);
	}
}
