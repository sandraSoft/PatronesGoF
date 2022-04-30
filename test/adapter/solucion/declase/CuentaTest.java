package adapter.solucion.declase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se prueba el método retirar de una Cuenta bancaria,
 * verificando que valide valores negativos o mayores al saldo. 
 * 
 * @version 1.0
 */
class CuentaTest {

	@Test
	void testRetirarMenosDelSaldo() {
		Cuenta cuenta = new Cuenta("123",800000);
		boolean resultadoEsperado = true;
		double saldoEsperado = 200000;
		
		boolean resultadoRetiro = cuenta.retirar(600000);
		assertEquals(resultadoEsperado, resultadoRetiro);
		assertEquals(saldoEsperado,cuenta.getSaldo(),0);
	}

	@Test
	void testRetirarNegativo() {
		Cuenta cuenta = new Cuenta("456",300000);
		boolean resultadoEsperado = false;
		double saldoEsperado = 300000;
		
		boolean resultadoRetiro = cuenta.retirar(-400000);
		assertEquals(resultadoEsperado, resultadoRetiro);
		assertEquals(saldoEsperado,cuenta.getSaldo(),0);
	}
	
	@Test
	void testRetirarMasDelSaldo() {
		Cuenta cuenta = new Cuenta("789",500000);
		boolean resultadoEsperado = false;
		double saldoEsperado = 500000;
		
		boolean resultadoRetiro = cuenta.retirar(700000);
		assertEquals(resultadoEsperado, resultadoRetiro);
		assertEquals(saldoEsperado,cuenta.getSaldo(),0);
	}
}
