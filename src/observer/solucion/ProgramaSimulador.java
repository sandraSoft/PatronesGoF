package observer.solucion;

/**
 * Simulación de prueba para verificar la velocidad de una bicicleta.
 * Se usa el patrón Observer.
 * 
 * @version 2.0
 */
public class ProgramaSimulador {

	public static void main(String[] args) {
		Sensor sensor = new SensorVelocidad();
		ObservadorSensor ventanaColor = new VentanaColor();
		ObservadorSensor mensaje = new Mensaje();
		
		// Se "suscriben" los interesados
		// para que les avisen cuando cambie la velocidad
		sensor.adicionarObservador(mensaje);
		sensor.adicionarObservador(ventanaColor);

		VentanaSimulaSensor ventanaTexto = 
				new VentanaSimulaSensor((SensorVelocidad)sensor);
		((VentanaColor)ventanaColor).setVisible(true);
		ventanaTexto.setVisible(true);
	}
}
