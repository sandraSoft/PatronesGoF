package command.solucion2;

public class AplicacionApuestas {

	public static void main(String[] args) {
		Ventana frame = new Ventana();
		frame.inicializar();
		frame.nuevaApuesta(new Apuesta());
		frame.setVisible(true);
	}
}
