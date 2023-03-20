package command.solucion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ApuestaTest {
	private static final String ESTADO_CANCELADA = "Estado = cancelada";
	private static final String ESTADO_ACTIVA = "Estado = activa";
	private static final String DINERO_INICIAL = "Dinero = $0.0"+System.lineSeparator();

	@Test
	void testIncrementarApuesta() {
		Apuesta apuesta = new Apuesta();
		assertEquals(DINERO_INICIAL+ESTADO_ACTIVA,apuesta.toString());
		apuesta.incrementar();
		assertEquals("Dinero = $10000.0"+System.lineSeparator()+ESTADO_ACTIVA,
				apuesta.toString());
	}
	
	@Test
	void testCancelarApuesta() {
		Apuesta apuesta = new Apuesta();
		assertEquals(DINERO_INICIAL+ESTADO_ACTIVA,apuesta.toString());
		apuesta.cancelar();
		assertEquals(DINERO_INICIAL+ESTADO_CANCELADA,
				apuesta.toString());
	}
	
	@Test
	void testIncrementarApuestaCancelada() {
		Apuesta apuesta = new Apuesta();
		assertEquals(DINERO_INICIAL+ESTADO_ACTIVA,apuesta.toString());
		apuesta.cancelar();
		apuesta.incrementar();
		assertEquals(DINERO_INICIAL+ESTADO_CANCELADA,apuesta.toString());
	}
}
