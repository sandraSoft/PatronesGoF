package observer.solucionapi;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

/**
 * Ventana sencilla para mostrar un color,
 *  dependiendo de la velocidad de la bicicleta.
 * 
 * Implementa la interfaz "Observer" (del API de Java), por lo que tiene
 * el rol de CONCRETE OBSERVER, del patrón Observer
 * 
 * @version 2.5
 */
public class VentanaColor extends JFrame implements Observer {
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

	/**
	 * Método que es llamado cuando el observable cambia
	 * (en este caso, cuando la velocidad cambia)
	 */
	@Override
	public void update(Observable sensor, Object otroObjeto) {
		if (sensor instanceof SensorVelocidad) {
			this.actualizarColor((SensorVelocidad)sensor);
		}
	}
}
