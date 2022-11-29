package command.inicial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * Parte visual de una aplicación, con botones y menús para
 * que el usuario seleccione la opción deseada.
 * 
 * @version 1.0
 */
public class Ventana extends JFrame {

	private JPanel contentPane;
	private JButton btnIncrementar;
	private JButton btnCancelar;
	private JTextArea textArea;
	
	private Apuesta apuesta;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 208);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuOpciones = new JMenu("Opciones");
		menuBar.add(menuOpciones);
		
		JMenuItem menuIncrementar = new JMenuItem("Incrementar");
		menuOpciones.add(menuIncrementar);
		
		JMenuItem menuCancelar = new JMenuItem("Cancelar");
		menuOpciones.add(menuCancelar);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIncrementar = new JButton("Incrementar");
		accionBotonIncrementar();
		btnIncrementar.setBounds(27, 54, 114, 23);
		contentPane.add(btnIncrementar);
		
		btnCancelar = new JButton("Cancelar");
		accionBotonCancelar();
		btnCancelar.setBounds(27, 87, 114, 23);
		contentPane.add(btnCancelar);
		
		textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBounds(199, 64, 190, 37);
		contentPane.add(textArea);
	}

	private void accionBotonIncrementar() {
		btnIncrementar.addActionListener(listener -> {
			apuesta.aumentarCantidad();
			String datosApuesta = apuesta.toString(); 
			textArea.setText(datosApuesta);
		});
	}

	private void accionBotonCancelar() {
		btnCancelar.addActionListener(listener ->{
			apuesta.cancelarApuesta();
			String datosApuesta = apuesta.toString(); 
			textArea.setText(datosApuesta);
		});
	}

	public void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}
}
