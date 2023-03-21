package command.solucion2;

import javax.swing.JTextArea;

/**
 * Acción concreta que aumenta una apuesta.
 * Corresponde al rol "CONCRETE COMMAND" del patrón COMMAND.
 * 
 * @version 1.0
 */
public class Incrementar implements Accion {
	private Apuesta apuesta;
	private JTextArea textArea;

	public Incrementar(Apuesta apuesta, JTextArea textArea) {
		this.apuesta = apuesta;
		this.textArea = textArea;
	}

	@Override
	public void ejecutar() {
		apuesta.incrementar();
		textArea.setText(apuesta.toString());
	}

}
