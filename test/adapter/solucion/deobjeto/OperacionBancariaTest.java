package adapter.solucion.deobjeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se prueba la funcionalidad de realizarRetiro, para productos bancarios.
 * 
 * PARA HACER PRUEBAS DE TARJETAS DE CRÉDITO DEBE USAR EL ADAPTER.
 * 
 * @version 1.5
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
	
	// Usa el Adapter
	@Test
	void testRetirarTarjetaMenosDelSaldo() {
		OperacionBancaria banco = new OperacionBancaria();
		TarjetaAdapter tarjeta = new TarjetaAdapter(new TarjetaCredito("123",800000));
		boolean resultadoEsperado = true;
		
		boolean resultadoRetiro = banco.realizarRetiro(tarjeta, 600000);
		assertEquals(resultadoEsperado, resultadoRetiro);
	}

	// Usa el Adapter
	@Test
	void testRetirarTarjetaNegativo() {
		OperacionBancaria banco = new OperacionBancaria();
		TarjetaAdapter tarjeta = new TarjetaAdapter(new TarjetaCredito("456",300000));
		boolean resultadoEsperado = false;
		
		boolean resultadoRetiro = banco.realizarRetiro(tarjeta, -40000);
		assertEquals(resultadoEsperado, resultadoRetiro);
	}

	// Usa el Adapter
	@Test
	void testRetirarTarjetaMasDelSaldo() {
		OperacionBancaria banco = new OperacionBancaria();
		TarjetaAdapter tarjeta = new TarjetaAdapter(new TarjetaCredito("789",500000));
		boolean resultadoEsperado = false;
		
		boolean resultadoRetiro = banco.realizarRetiro(tarjeta,700000);
		assertEquals(resultadoEsperado, resultadoRetiro);
	}
}
