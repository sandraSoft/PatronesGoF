package state.solucionsingleton;

/**
 * Carro que compite en una pista de carreras.
 * Solo interesa la velocidad y saber si está apagado, normal o rápido.
 * Se puede acelerar o frenar con estos carros.
 * 
 * Como el comportamiento del Carro (acelerar y frenar) cambia dependiendo del estado,
 * se aplica el patrón de diseño STATE. Corresponde al rol: "Context".
 * 
 * @version 2.2
 */
public class Carro {
	private double velocidad;
	private EstadoCarro estado;	
	static final double VELOCIDAD_MAXIMA = 40;
	
	/**
	 * Usa el método estático "getInstancia" de la clase Apagado para obtener
	 * un objeto de este estado.
	 */
	public Carro() {
		this.velocidad = 0;
		this.estado = Apagado.getInstancia();	
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public char getEstado() {
		return estado.toString().charAt(0);
	}
	
	void setEstado(EstadoCarro nuevoEstado) {
		estado = nuevoEstado;
	}
	
	void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * El carro aumenta la velocidad en diferente valor, dependiendo del estado en el cual esté.
	 * @throws CarroException	si se trata de exceder la velocidad máxima.
	 */
	public void acelerar() throws CarroException {
		estado.acelerar(this);
	}
	
	/**
	 * El carro disminuye la velocidad, en diferente valor, dependiendo del estado en el cual esté.
	 */	
	public void frenar() {
		estado.frenar(this);
	}
}
