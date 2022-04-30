package adapter.solucion.deobjeto;

/**
 * Una cuenta bancaria de la cual se pueden hacer retiros de dinero.
 * 
 * IMPLEMENTA LA INTERFAZ "ProductoBancario", PARA QUE EL BANCO
 * PUEDA USAR TODOS LOS PRODUCTOS DE LA MISMA FORMA
 * 
 * @version 1.2
 */
public class Cuenta implements ProductoBancario {
	
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
	
	@Override
	public boolean retirar(double cantidad) {
		if (cantidad <=0 || cantidad > saldo) {
			return false;
		}
		saldo = saldo - cantidad;
		return true;
	}
}
