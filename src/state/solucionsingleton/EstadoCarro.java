package state.solucionsingleton;

/**
 * Representa los diferentes estados que puede tener un carro,
 * incluyendo el comportamiento que cambia en cada uno: acelerar y frenar.
 * 
 * Corresponde al rol "State" en el patrón de diseño del mismo nombre.
 * 
 * @version 1.0
 */
public interface EstadoCarro {

	/**
	 * Aumenta la velocidad del carro. Cada estado puede aumentar en diferente valor.
	 * @param carro	el carro que desea acelerar (es posible que cambie de estado al acelerar)
	 * @throws CarroException	si se trata de exceder la velocidad máxima.
	 */
	public abstract void acelerar(Carro carro) throws CarroException;
	
	/**
	 * Disminuye la velocidad del carro. Cada estado puede disminuir en diferente valor.
	 * @param carro	el carro que se desea frenar (es posible que cambie de estado al frenar)
	 */
	public abstract void frenar(Carro carro);
	
}
