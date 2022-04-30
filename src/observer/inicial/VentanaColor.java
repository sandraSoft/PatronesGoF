package observer.inicial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Color;

/**
 * Ventana sencilla para mostrar un color,
 *  dependiendo de la velocidad de la bicicleta.
 * 
 * @version 1.0
 */
public class VentanaColor extends JFrame {
	private JLabel recuadroColor; 
	
	public VentanaColor() {
		setTitle("Velocidad bicicleta:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 250, 445, 131);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		recuadroColor = new JLabel("");
		recuadroColor.setEnabled(false);
		recuadroColor.setBounds(138, 25, 148, 39);
		recuadroColor.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
		recuadroColor.setOpaque(true);
		recuadroColor.setBackground(Color.WHITE);
		contentPane.add(recuadroColor);
	}
	
	/**
	 * Muestra un color en el recuadro, dependiendo de la velocidad de la bicicleta
	 * para advertir si el valor está dentro de unos rangos aceptables o no.
	 * Verde: velocidad baja, Amarillo: aceptable (medio), Rojo: muy rápido 
	 * 
	 * @param sensor el sensor de velocidad de la bicicleta,
	 *		para poder obtener la velocidad y cambiar de color.
	 */
	public void actualizarColor(SensorVelocidad sensor) {
		double velocidadBicicleta = sensor.getVelocidad();
		if (velocidadBicicleta < SensorVelocidad.VELOCIDAD_MEDIA) {
			recuadroColor.setBackground(Color.GREEN);
			return;
		}
		if (velocidadBicicleta <= SensorVelocidad.VELOCIDAD_ALTA) {
			recuadroColor.setBackground(Color.YELLOW);
			return;
		}
		recuadroColor.setBackground(Color.RED);
	}
}
