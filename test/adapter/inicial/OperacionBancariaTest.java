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
		
		boolean resultadoRetiro = banco.realizarRetiro(cuenta, 600000);
		assertTrue(resultadoRetiro);
	}

	@Test
	void testRetirarCuentaNegativo() {
		OperacionBancaria banco = new OperacionBancaria();
		Cuenta cuenta = new Cuenta("456",300000);
		
		boolean resultadoRetiro = banco.realizarRetiro(cuenta, -40000);
		assertFalse(resultadoRetiro);
	}

	@Test
	void testRetirarCuentaMasDelSaldo() {
		OperacionBancaria banco = new OperacionBancaria();
		Cuenta cuenta = new Cuenta("789",500000);
		
		boolean resultadoRetiro = banco.realizarRetiro(cuenta,700000);
		assertFalse(resultadoRetiro);
	}
	
	
//	@Test
//	void testRetirarTarjetaMenosDelSaldo() {
//		OperacionBancaria banco = new OperacionBancaria();
//		Tarjeta tarjeta = new Tarjeta("123",800000);
//		
//		boolean resultadoRetiro = banco.realizarRetiro(tarjeta, 600000);
//		assertTrue(resultadoRetiro);
//	}
//
//	@Test
//	void testRetirarTarjetaNegativo() {
//		OperacionBancaria banco = new OperacionBancaria();
//		Tarjeta tarjeta = new Tarjeta("456",300000);
//		
//		boolean resultadoRetiro = banco.realizarRetiro(tarjeta, -40000);
//		assertFalse(resultadoRetiro);
//	}
//
//	@Test
//	void testRetirarTarjetaMasDelSaldo() {
//		OperacionBancaria banco = new OperacionBancaria();
//		Tarjeta tarjeta = new Tarjeta("789",500000);
//		
//		boolean resultadoRetiro = banco.realizarRetiro(tarjeta,700000);
//		assertFalse(resultadoRetiro);
//	}
}
