package adapter.inicial;

/**
 * Un tarjeta que permite compras a crédito y realiza avances
 *  (parecido a retirar dinero).
 * 
 * @version 1.0
 */
public class TarjetaCredito {
	
	private String numero;
	private double valor;
	
	public TarjetaCredito(String numero, double valor) {
		this.valor = valor;
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public double getValor() {
		return valor;
	}

	/**
	 * Realizar un avance, es decir, retirar dinero.
	 * Eso hace que se disminuya el valor.
	 * @param cantidad	la cantidad que se retira.
	 * @throws Exception	si se envía una cantidad negativa o 
	 * 		mayor al valor de la tarjeta
	 */
	public void realizarAvance(double cantidad) throws Exception {
		if (cantidad <=0 || cantidad > valor) {
			throw new Exception("Cantidad negativa o mayor al valor");
		}
		valor = valor - cantidad;
	}
}
