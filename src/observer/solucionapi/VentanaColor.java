package observer.solucionapi;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Ventana sencilla para mostrar un color,
 *  dependiendo de la velocidad de la bicicleta.
 * 
 * Implementa la interfaz "PropertyChangeListener" (del API de Java)
 * por lo que tiene el rol de CONCRETE OBSERVER (o Concrete Listener), del patrón Observer.
 * 
 * @version 3.0
 */
public class VentanaColor extends JFrame implements PropertyChangeListener {
	private JLabel recuadroColor; 

	public VentanaColor() {
		setTitle("Velocidad bicicleta:");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
	 * @param velocidad la velocidad de la bicicleta (en Km/h), 
	 * 					para saber el color que mostrará
	 */
	public void actualizarColor(double velocidad) {
		if (velocidad < SensorVelocidad.VELOCIDAD_MEDIA) {
			recuadroColor.setBackground(Color.GREEN);
			return;
		}
		if (velocidad <= SensorVelocidad.VELOCIDAD_ALTA) {
			recuadroColor.setBackground(Color.YELLOW);
			return;
		}
		recuadroColor.setBackground(Color.RED);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evento) {
		double velocidad = (double)evento.getNewValue();
		this.actualizarColor(velocidad);
	}
}
