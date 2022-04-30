package adapter.inicial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se prueba la funcionalidad de realizarRetiro, para productos bancarios.
 * 
 * POR AHORA SOLO FUNCIONA PARA CUENTAS.
 * TODAVÍA NO SE PUEDEN HACER "RETIROS" DE TARJETAS DE CRÉDITO
 * 
 * @version 1.0
 */
class OperacionBancariaTest {

	@Test
	void testRetirarCuentaMenosDelSaldo() {
		OperacionBancaria banco = new OperacionBancaria();
		Cuenta cuenta = new Cuenta("123",800000);
		boolean resultadoEsperado = true;
		
		boolean resultadoRetiro = banco.realizarRetiro(cuenta, 600000);
		assertEquals(resultadoEsperado, resultadoRetiro);
	}

	@Test
	void testRetirarCuentaNegativo() {
		OperacionBancaria banco = new OperacionBancaria();
		Cuenta cuenta = new Cuenta("456",300000);
		boolean resultadoEsperado = false;
		
		boolean resultadoRetiro = banco.realizarRetiro(cuenta, -40000);
		assertEquals(resultadoEsperado, resultadoRetiro);
	}

	@Test
	void testRetirarCuentaMasDelSaldo() {
		OperacionBancaria banco = new OperacionBancaria();
		Cuenta cuenta = new Cuenta("789",500000);
		boolean resultadoEsperado = false;
		
		boolean resultadoRetiro = banco.realizarRetiro(cuenta,700000);
		assertEquals(resultadoEsperado, resultadoRetiro);
	}
	
	
//	@Test
//	void testRetirarTarjetaMenosDelSaldo() {
//		OperacionBancaria banco = new OperacionBancaria();
//		TarjetaCredito tarjeta = new TarjetaCredito("123",800000);
//		boolean resultadoEsperado = true;
//		
//		boolean resultadoRetiro = banco.realizarRetiro(tarjeta, 600000);
//		assertEquals(resultadoEsperado, resultadoRetiro);
//	}
//
//	@Test
//	void testRetirarTarjetaNegativo() {
//		OperacionBancaria banco = new OperacionBancaria();
//		TarjetaCredito tarjeta = new TarjetaCredito("456",300000);
//		boolean resultadoEsperado = false;
//		
//		boolean resultadoRetiro = banco.realizarRetiro(tarjeta, -40000);
//		assertEquals(resultadoEsperado, resultadoRetiro);
//	}
//
//	@Test
//	void testRetirarTarjetaMasDelSaldo() {
//		OperacionBancaria banco = new OperacionBancaria();
//		TarjetaCredito tarjeta = new TarjetaCredito("789",500000);
//		boolean resultadoEsperado = false;
//		
//		boolean resultadoRetiro = banco.realizarRetiro(tarjeta,700000);
//		assertEquals(resultadoEsperado, resultadoRetiro);
//	}
}
