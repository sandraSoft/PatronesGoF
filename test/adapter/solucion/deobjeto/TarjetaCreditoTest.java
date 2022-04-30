package adapter.solucion.deobjeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se prueba el método realizarAvance de una Tarjeta de crédito,
 * verificando que valide cantidades negativas o mayores al saldo 
 * 
 * @version 1.0
 */
class TarjetaCreditoTest {

	@Test
	void testRetirarMenosDelSaldo() throws Exception {
		TarjetaCredito tarjeta = new TarjetaCredito("123",800000);
		double saldoEsperado = 200000;
		
		tarjeta.realizarAvance(600000);
		assertEquals(saldoEsperado,tarjeta.getValor(),0);
	}

	@Test
	void testRetirarNegativo() throws Exception {
		TarjetaCredito tarjeta = new TarjetaCredito("456",300000);
		double saldoEsperado = 300000;
		
		assertThrows(Exception.class, ()->tarjeta.realizarAvance(-40000));
		assertEquals(saldoEsperado,tarjeta.getValor(),0);
	}
	
	@Test
	void testRetirarMasDelSaldo() throws Exception {
		TarjetaCredito tarjeta = new TarjetaCredito("789",500000);
		double saldoEsperado = 500000;
		
		assertThrows(Exception.class, ()->tarjeta.realizarAvance(700000));
		assertEquals(saldoEsperado,tarjeta.getValor(),0);
	}
}
