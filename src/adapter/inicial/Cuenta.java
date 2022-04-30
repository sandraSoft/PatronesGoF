package adapter.inicial;

/**
 * Una cuenta bancaria de la cual se pueden hacer retiros de dinero.
 * 
 * @version 1.0
 */
public class Cuenta {
	
	private String numero;
	private double saldo;
	
	public Cuenta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Retirar (sacar) dinero de la cuenta, disminuyendo el saldo.
	 * 
	 * @param cantidad la cantidad de dinero que se desea sacar de la cuenta
	 * @return	un valor booleano indicado si se pudo retirar porque la cantidad
	 * 			era menor o igual al saldo de la cuenta. 
	 */
	public boolean retirar(double cantidad) {
		if (cantidad <=0 || cantidad > saldo) {
			return false;
		}
		saldo = saldo - cantidad;
		return true;
	}
}
