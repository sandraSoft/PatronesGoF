package factories.inicial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Realiza pruebas del método "calcularPrecio" de la clase Pedido
 * (para esto debe primero adicionar un juguete,
 *  el cual a su vez tiene un empaque)
 *  
 * @version 1.0
 */
class PedidoTest {

	@Test
	void calcularPrecioBalonTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete(20000,20,'b');
		double valorEsperado = 24500;   // 20000 + ((20+5)*100) + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void calcularPrecioPeluchePequeTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete(30000,50,'p');
		double valorEsperado = 37000;   // 30000 + 5000 + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void calcularPrecioPelucheGrandeTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete(30000,120,'p');
		double valorEsperado = 42000;   // 30000 + 10000 + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado,valorObtenido);
	}
}
