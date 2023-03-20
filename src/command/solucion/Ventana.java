package command.solucion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.HashMap;

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
	private JButton btnIncrementar;
	private JButton btnCancelar;
	private JTextArea textArea;
	private JMenuItem menuIncrementar;
	private JMenuItem menuCancelar;

	private HashMap<String, Accion> acciones;

	public void inicializar() {
		
		acciones = new HashMap<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 208);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuOpciones = new JMenu("Opciones");
		menuBar.add(menuOpciones);
		
		menuIncrementar = new JMenuItem("Incrementar");
		accionMenuIncrementar();
		menuOpciones.add(menuIncrementar);
		
		menuCancelar = new JMenuItem("Cancelar");
		accionMenuCancelar();
		menuOpciones.add(menuCancelar);

		JPanel contentPane = new JPanel();
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
		
		this.setTitle("Apuestas");
	}

	private void accionBotonIncrementar() {
		btnIncrementar.addActionListener(listener -> 
			acciones.get(btnIncrementar.getText()).ejecutar());
	}
	
	private void accionMenuIncrementar() {
		menuIncrementar.addActionListener(listener -> 
			acciones.get(menuIncrementar.getText()).ejecutar());
	}

	private void accionBotonCancelar() {
		btnCancelar.addActionListener(listener ->
			acciones.get(btnCancelar.getText()).ejecutar());
	}
	
	private void accionMenuCancelar() {
		menuCancelar.addActionListener(listener ->
			acciones.get(menuCancelar.getText()).ejecutar());
	}

	public void nuevaApuesta(Apuesta apuesta) {
		this.textArea.setText(apuesta.toString());
		
		this.acciones.put("Incrementar", new Incrementar(apuesta,textArea));
		this.acciones.put("Cancelar", new Cancelar(apuesta, textArea));
	}
}
