package state.inicial;

/**
 * Carro que compite en una pista de carreras.
 * Solo interesa la velocidad y saber si está apagado, normal o rápido.
 * Se puede acelerar o frenar con estos carros.
 * 
 * @version 1.1
 */
public class Carro {
	private double velocidad;
	private char estado;	//'a' apagado, 'n' normal, 'r' rapido
	final double VELOCIDAD_MAXIMA = 40;
	
	public Carro() {
		this.velocidad = 0;
		this.estado = 'a';  //Inicia apagado
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public char getEstado() {
		return estado;
	}
	
	/**
	 * El carro aumenta la velocidad en diferente valor, dependiendo del estado en el cual esté.
	 * @throws CarroException si se trata de exceder la velocidad máxima
	 *  
	 * NO ES FÁCIL HACER CAMBIOS EN ESTE MÉTODO PORQUE USA MUCHOS CONDICIONALES.
	 */
	public void acelerar() throws CarroException {
		if (estado == 'r') {
			if ((velocidad+20) > VELOCIDAD_MAXIMA) {
				throw new CarroException("No puede exceder la velocidad máxima");
			}
			velocidad = velocidad+20;
			return;
		}
		
		if (estado == 'n') {
			velocidad = velocidad + 10;
			if (velocidad >= (VELOCIDAD_MAXIMA / 2)) {
				estado = 'r';
			}
			return;
		}
		
		if (estado == 'a') {
			velocidad = 10;
			estado = 'n';
		}
	}
	
	/**
	 * El carro disminuye la velocidad, en diferente valor, dependiendo del estado en el cual esté.
	 * 
	 * NO ES FÁCIL HACER CAMBIOS EN ESTE MÉTODO PORQUE USA MUCHOS CONDICIONALES.
	 */
	public void frenar() {
		if (estado == 'r') {
			velocidad = velocidad - 10;
			if (velocidad <= (VELOCIDAD_MAXIMA / 2)) {
				estado = 'n';
			}
			return;
		}
		
		if (estado == 'n') {
			velocidad = velocidad - 20;
			if (velocidad <= 0) {
				velocidad = 0;
				estado = 'a';
			}
		}
	}
}
