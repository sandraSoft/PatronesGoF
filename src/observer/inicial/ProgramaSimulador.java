package observer.inicial;

/**
 * Simulación de prueba para verificar la velocidad de una bicicleta.
 * 
 * @version 1.0
 */
public class ProgramaSimulador {

	public static void main(String[] args) {
		SensorVelocidad sensor = new SensorVelocidad();
		VentanaColor ventanaColor = new VentanaColor();		
		
		// Los objetos mensaje y ventanaColor se pasan al objeto velocidad
		// para que los llamen cuando el valor de la velocidad cambie.
		// Esto crea ALTO ACOPLAMIENTO.
		sensor.setMensaje(new Mensaje());
		sensor.setVentanaColor(ventanaColor);
		
		VentanaSimulaSensor ventanaPruebas = new VentanaSimulaSensor(sensor);
		ventanaColor.setVisible(true);
		ventanaPruebas.setVisible(true);
	}
}
