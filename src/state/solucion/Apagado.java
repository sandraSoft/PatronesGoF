package state.solucion;

/**
 * Es un estado concreto que puede tener el carro. Es el estado inicial,
 * cuando el carro no está en movimiento.
 * 
 * CORRESPONDE AL ROL: "ConcreteState" EN EL PATRÓN DE DISEÑO STATE.
 * 
 * @version 1.0
 */
public class Apagado extends EstadoCarro {

	@Override
	public void acelerar(Carro carro) throws CarroException {
		carro.setVelocidad(10);
		carro.setEstado(new Normal());
	}

	@Override
	public void frenar(Carro carro){
		//No se realiza ninguna acción cuando esá apagado y frena
	}
	
	@Override
	public String toString() {
		return "a";
	}
}
