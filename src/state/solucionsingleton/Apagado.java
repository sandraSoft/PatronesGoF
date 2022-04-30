package state.solucionsingleton;

/**
 * Es un estado concreto que puede tener el carro. Es el estado inicial,
 * cuando el carro no está en movimiento.
 * 
 * Corresponde al rol "ConcreteState" en el patrón de diseño STATE.
 * 
 * APLICA EL PATRÓN SINGLETON, PARA TENER UNA SOLA INSTANCIA.
 * 
 * @version 2.0
 */
public class Apagado implements EstadoCarro {

	/**
	 * Atributo estático con la única instancia de la clase.
	 */
	private static Apagado instanciaApagado;
	
	/**
	 * Método correspondiente al patrón Singleton, para obtener la única instancia de la clase
	 */
	public static Apagado getInstancia() {
		if (instanciaApagado == null) {
			instanciaApagado = new Apagado();
		}
		return instanciaApagado;
	}
	
	/**
	 * El constructor es privado para que solo se pueda obtener
	 * el objeto con el método estático "getInstancia" 
	 */
	private Apagado() {
	}

	@Override
	public void acelerar(Carro carro) throws CarroException {
		carro.setVelocidad(10);
		carro.setEstado(Normal.getInstancia());
	}

	@Override
	public void frenar(Carro carro){
		// No se realiza ninguna acción cuando frena
	}
	
	@Override
	public String toString() {
		return "a";
	}
}
