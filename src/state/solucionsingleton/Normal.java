package state.solucionsingleton;

/**
 * Es un estado concreto que puede tener el carro. 
 * Representa un carro en movimiento, pero no tan rápido.
 * 
 * Corresponde al rol "ConcreteState" en el patrón de diseño STATE.
 * 
 * APLICA EL PATRÓN SINGLETON, PARA TENER UNA SOLA INSTANCIA.
 * 
 * @version 2.0
 */
public class Normal implements EstadoCarro {
	
	/**
	 * Atributo estático con la única instancia de la clase.
	 */
	private static Normal instanciaNormal;
	
	/**
	 * Método correspondiente al patrón Singleton, para obtener la única instancia de la clase
	 */
	public static Normal getInstancia() {
		if (instanciaNormal == null) {
			instanciaNormal = new Normal();
		}
		return instanciaNormal;
	}
	
	/**
	 * El constructor es privado para que solo se pueda obtener
	 * el objeto con el método estático "getInstancia" 
	 */
	private Normal() {
	}

	@Override
	public void acelerar(Carro carro) throws CarroException {
		carro.setVelocidad(carro.getVelocidad()+10);
		if (carro.getVelocidad() >= (Carro.VELOCIDAD_MAXIMA / 2)) {
			carro.setEstado(Rapido.getInstancia());
		}
	}

	@Override
	public void frenar(Carro carro) {
		carro.setVelocidad(carro.getVelocidad()-20);
		if (carro.getVelocidad() <= 0) {
			carro.setVelocidad(0);
			carro.setEstado(Apagado.getInstancia());
		}
	}

	@Override
	public String toString() {
		return "n";
	}
}
