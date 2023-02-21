package simplefactory.solucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import simplefactory.inicial.Pedido;

/**
 * Realiza pruebas del método "calcularPrecio" de la clase Pedido
 *  (para esto debe primero adicionar un juguete)
 * 
 * @version 1.0
 */
class PedidoTest {
	@Test
	void calcularPrecioBalonTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete(20000, 20, 'b');
		double valorEsperado = 23000; // 20000 + (20*50) + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void calcularPrecioPeluchePequeTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete(30000, 50, 'p');
		double valorEsperado = 37000; // 30000 + (50*100) + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado, valorObtenido);
	}
}
