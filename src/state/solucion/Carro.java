package state.solucion;

/**
 * Carro que compite en una pista de carreras.
 * Solo interesa la velocidad y saber si está apagado, normal o rápido.
 * Se puede acelerar o frenar con estos carros.
 * 
 * COMO EL COMPORTAMIENTO DEL CARRO (acelerar y frenar) CAMBIA DEPENDIENDO DEL ESTADO,
 * SE APLICA EL PATRÓN DE DISEÑO STATE. CORRESPONDE AL ROL: "Context".
 * 
 * @version 2.0
 */
public class Carro {
	private double velocidad;
	private EstadoCarro estado;	//Referencia a la interfaz State
	final double VELOCIDAD_MAXIMA = 40;
	
	public Carro() {
		this.velocidad = 0;
		this.estado = new Apagado();	// Se crea el objeto correspondiente al primer estado
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public char getEstado() {
		return estado.toString().charAt(0);
	}
	
	// Método nuevo, se necesita para los cambios de estado
	void setEstado(EstadoCarro nuevoEstado) {
		estado = nuevoEstado;
	}
	
	void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * El carro aumenta la velocidad en diferente valor, dependiendo del estado en el cual esté.
	 * @throws CarroException	si se trata de exceder la velocidad máxima.
	 *  
	 * SE DELEGA LA RESPONSABILIDAD EN EL ESTADO QUE TENGA EL CARRO, EVITANDO LOS CONDICIONALES.
	 */
	public void acelerar() throws CarroException {
		estado.acelerar(this);
	}
	
	/**
	 * El carro disminuye la velocidad, en diferente valor, dependiendo del estado en el cual esté.
	 * 
	 * SE DELEGA LA RESPONSABILIDAD EN EL ESTADO QUE TENGA EL CARRO, EVITANDO LOS CONDICIONALES.
	 */	
	public void frenar() {
		estado.frenar(this);
	}
}
