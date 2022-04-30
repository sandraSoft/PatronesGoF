package state.solucionsingleton;


/**
 * Es un estado concreto que puede tener el carro. 
 * Representa un carro moviéndose muy rápido.
 * 
 * Corresponde al rol "ConcreteState" en el patrón de diseño STATE.
 * 
 * APLICA EL PATRÓN SINGLETON, PARA TENER UNA SOLA INSTANCIA.
 * 
 * @version 2.0
 */
public class Rapido implements EstadoCarro {

	/**
	 * Atributo estático con la única instancia de la clase.
	 */
	private static Rapido instanciaRapido;
	
	/**
	 * Método correspondiente al patrón Singleton, para obtener la única instancia de la clase
	 */
	public static Rapido getInstancia() {
		if (instanciaRapido == null) {
			instanciaRapido = new Rapido();
		}
		return instanciaRapido;
	}
	
	/**
	 * El constructor es privado para que solo se pueda obtener
	 * el objeto con el método estático "getInstancia" 
	 */
	private Rapido() {
	}
	
	@Override
	public void acelerar(Carro carro) throws CarroException {
		if ((carro.getVelocidad()+20) > Carro.VELOCIDAD_MAXIMA) {
			throw new CarroException("No puede exceder la velocidad máxima");
		}
		carro.setVelocidad(carro.getVelocidad()+20);
	}

	@Override
	public void frenar(Carro carro)  {
		carro.setVelocidad(carro.getVelocidad()-10);
		if (carro.getVelocidad() <= (Carro.VELOCIDAD_MAXIMA / 2)) {
			carro.setEstado(Normal.getInstancia());
		}
	}
	
	@Override
	public String toString() {
		return "r";
	}
}
