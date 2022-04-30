package observer.solucionapi;

import java.util.Observable;
import java.util.Observer;

/**
/**
 * Simulación de prueba para verificar la velocidad de una bicicleta.
 * Se usa el patrón Observer, con clases del API de Java.
 * 
 * @version 2.5
 */
public class ProgramaSimulador {

	public static void main(String[] args) {
		Observable sensor = new SensorVelocidad();
		Observer ventanaColor = new VentanaColor();
		Observer mensaje = new Mensaje();
		
		// Se "suscriben" los interesados
		// para que les avisen cuando cambie la velocidad
		sensor.addObserver(mensaje);
		sensor.addObserver(ventanaColor);
		
		VentanaSimulaSensor ventanaTexto = 
				new VentanaSimulaSensor((SensorVelocidad)sensor);
		((VentanaColor)ventanaColor).setVisible(true);
		ventanaTexto.setVisible(true);
	}
}
