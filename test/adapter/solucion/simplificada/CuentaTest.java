package adapter.solucion.simplificada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se prueba el método retirar de una Cuenta bancaria,
 * verificando que valide valores negativos o mayores al saldo 
 * 
 * @version 1.0
 */
class CuentaTest {

	@Test
	void testRetirarMenosDelSaldo() {
		Cuenta cuenta = new Cuenta("123",800000);
		double saldoEsperado = 200000;
		
		boolean resultadoRetiro = cuenta.retirar(600000);
		assertTrue(resultadoRetiro);
		assertEquals(saldoEsperado,cuenta.getSaldo());
	}

	@Test
	void testRetirarNegativo() {
		Cuenta cuenta = new Cuenta("456",300000);
		double saldoEsperado = 300000;
		
		boolean resultadoRetiro = cuenta.retirar(-400000);
		assertFalse(resultadoRetiro);
		assertEquals(saldoEsperado,cuenta.getSaldo());
	}
	
	@Test
	void testRetirarMasDelSaldo() {
		Cuenta cuenta = new Cuenta("789",500000);
		double saldoEsperado = 500000;
		
		boolean resultadoRetiro = cuenta.retirar(700000);
		assertFalse(resultadoRetiro);
		assertEquals(saldoEsperado,cuenta.getSaldo());
	}
}
