package observer.solucionapi;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JButton;

/**
 * Ventana sencilla para ingresar un valor para la velocidad
 * de la bicicleta (para hacer pruebas).
 *
 * @version 1.0
 */
public class VentanaSimulaSensor extends JFrame {
	
	private JTextField campoVelocidad;
	private transient SensorVelocidad sensor;
	
	public VentanaSimulaSensor(SensorVelocidad velocidad) {
		this.sensor = velocidad;
		
		setTitle("Velocidad bicicleta");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 133);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVelocidad = new JLabel("Velocidad:");
		lblVelocidad.setBounds(29, 44, 89, 14);
		contentPane.add(lblVelocidad);
		
		campoVelocidad = new JTextField();
		campoVelocidad.setBounds(148, 41, 86, 20);
		contentPane.add(campoVelocidad);
		campoVelocidad.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(
				listener ->	cambiarVelocidad());
		btnOk.setBounds(282, 40, 89, 23);
		contentPane.add(btnOk);
	}
	
	/**
	 * Obtiene la velocidad ingresada por el usuario y la guarda en el sensor
	 */
	public void cambiarVelocidad() {
		double valorVelocidad = Double.parseDouble(campoVelocidad.getText());
		sensor.setVelocidad(valorVelocidad);
		campoVelocidad.setText("");	
	}
}
