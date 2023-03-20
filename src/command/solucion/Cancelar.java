package command.solucion;

import javax.swing.JTextArea;

/**
 * Acción concreta que cancela una apuesta.
 * Corresponde al rol "CONCRETE COMMAND" del patrón COMMAND.
 * 
 * @version 1.0
 */
public class Cancelar implements Accion {
	private Apuesta apuesta;
	private JTextArea textArea;

	public Cancelar(Apuesta apuesta, JTextArea textArea) {
		this.apuesta = apuesta;
		this.textArea = textArea;
	}

	@Override
	public void ejecutar() {
		apuesta.cancelarApuesta();
		textArea.setText(apuesta.toString());
	}

}
