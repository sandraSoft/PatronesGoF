package adapter.solucion.deobjeto;

/**
 * Comportamiento de cualquier producto de un banco del cual se pueda retirar dinero,
 * Como por ejemplo Cuentas o Tarjetas.
 * 
 * CORRESPONDE AL ROL "Target" DEL PATRÓN ADAPTER.
 * 
 * @version 1.1
 */
public interface IProductoBancario {
	
	/**
	 * Disminuir el valor o total de dinero del producto.
	 * 
	 * @param cantidad	la cantidad, en pesos, que se desea retirar o sacar
	 * @return	un valor verdadero si pudo sacar (retirar) la cantidad
	 * 		o un valor falso si la cantidad era negativa o mayor
	 * 		al dinero que tenía el producto
	 */
	public boolean retirar(double cantidad);

}
