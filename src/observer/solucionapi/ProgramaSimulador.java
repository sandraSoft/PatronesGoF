package observer.solucionapi;

import java.beans.PropertyChangeListener;

/**
/**
 * Simulación de prueba para verificar la velocidad de una bicicleta.
 * Se usa el patrón Observer, con clases del API de Java.
 * 
 * @version 2.5
 */
public class ProgramaSimulador {

	public static void main(String[] args) {
		SensorVelocidad sensor = new SensorVelocidad();
		PropertyChangeListener ventanaColor = new VentanaColor();
		
		// Se "suscriben" los interesados
		// para que les avisen cuando cambie la velocidad
		sensor.adicionarInteresadoSensor(new Mensaje());
		sensor.adicionarInteresadoSensor(ventanaColor);
		
		VentanaSimulaSensor ventanaTexto = new VentanaSimulaSensor(sensor);
		((VentanaColor)ventanaColor).setVisible(true);
		ventanaTexto.setVisible(true);
	}
}
