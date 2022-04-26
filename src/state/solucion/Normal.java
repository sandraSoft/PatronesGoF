package state.solucion;

/**
 * Es un estado concreto que puede tener el carro. 
 * Representa un carro en movimiento, pero no tan rápido.
 * 
 * CORRESPONDE AL ROL: "ConcreteState" EN EL PATRÓN DE DISEÑO STATE.
 * 
 * @version 1.0
 */
public class Normal extends EstadoCarro {

	@Override
	public void acelerar(Carro carro) throws CarroException {
		carro.setVelocidad(carro.getVelocidad()+10);
		if (carro.getVelocidad() >= (carro.VELOCIDAD_MAXIMA / 2)) {
			carro.setEstado(new Rapido());
		}
	}

	@Override
	public void frenar(Carro carro) {
		carro.setVelocidad(carro.getVelocidad()-20);
		if (carro.getVelocidad() <= 0) {
			carro.setVelocidad(0);
			carro.setEstado(new Apagado());
		}
	}

	@Override
	public String toString() {
		return "n";
	}
}
