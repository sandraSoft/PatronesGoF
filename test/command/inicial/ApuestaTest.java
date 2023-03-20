package command.inicial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApuestaTest {
	private static final String CANCELADA = "cancelada";
	private static final String ACTIVA = "activa";

	@Test
	void testIncrementarApuesta() {
		Apuesta apuesta = new Apuesta();
		assertEquals(0,apuesta.getCantidadDinero());
		assertEquals(ACTIVA,apuesta.getEstado());
		apuesta.incrementar();
		assertEquals(10000,apuesta.getCantidadDinero());
		assertEquals(ACTIVA,apuesta.getEstado());
	}
	
	@Test
	void testCancelarApuesta() {
		Apuesta apuesta = new Apuesta();
		assertEquals(0,apuesta.getCantidadDinero());
		assertEquals(ACTIVA,apuesta.getEstado());
		apuesta.cancelar();
		assertEquals(0,apuesta.getCantidadDinero());
		assertEquals(CANCELADA,apuesta.getEstado());
	}
	
	@Test
	void testIncrementarApuestaCancelada() {
		Apuesta apuesta = new Apuesta();
		assertEquals(0,apuesta.getCantidadDinero());
		assertEquals(ACTIVA,apuesta.getEstado());
		apuesta.cancelar();
		apuesta.incrementar();
		assertEquals(0,apuesta.getCantidadDinero());
		assertEquals(CANCELADA,apuesta.getEstado());
	}
}
