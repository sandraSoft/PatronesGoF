package state.solucion;

/**
 * Es un estado concreto que puede tener el carro. 
 * Representa un carro moviéndose muy rápido.
 * 
 * CORRESPONDE AL ROL: "ConcreteState" EN EL PATRÓN DE DISEÑO STATE.
 * 
 * @version 1.0
 */
public class Rapido extends EstadoCarro {

	@Override
	public void acelerar(Carro carro) throws CarroException {
		if ((carro.getVelocidad()+20) > carro.VELOCIDAD_MAXIMA) {
			throw new CarroException("No puede exceder la velocidad máxima");
		}
		carro.setVelocidad(carro.getVelocidad()+20);
	}

	@Override
	public void frenar(Carro carro)  {
		carro.setVelocidad(carro.getVelocidad()-10);
		if (carro.getVelocidad() <= (carro.VELOCIDAD_MAXIMA / 2)) {
			carro.setEstado(new Normal());
		}
	}
	
	@Override
	public String toString() {
		return "r";
	}
}
