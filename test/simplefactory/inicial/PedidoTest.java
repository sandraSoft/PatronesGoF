package simplefactory.inicial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Realiza pruebas del método "calcularPrecio" de la clase Pedido
 *  (para esto debe primero adicionar juguetes)
 * 
 * @version 1.0
 */
class PedidoTest {
	@Test
	void calcularPrecioBalonTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete("Balón de baloncesto", 20000, 20, 'b');
		double valorEsperado = 23000; // 20000 + (20*50) + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void calcularPrecioMunecoTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete("Linterna verde", 30000, 50, 'm');
		double valorEsperado = 37000; // 30000 + (50*100) + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	void calcularPrecioTrenTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete("Tren de animales", 30000, 50, 't');
		double valorEsperado = 67000; // 30000*2 + (50*100) + 2000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	void calcularPrecioVariosJuguetesTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete("Tren de animales", 30000, 50, 't');
		pedido.adicionarJuguete("Linterna verde", 30000, 50, 'm');
		pedido.adicionarJuguete("Balón de baloncesto", 20000, 20, 'b');
		double valorEsperado = 123000;
		double valorObtenido = pedido.calcularPrecio();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	void adicionarJugueteRepetidoTest() {
		Pedido pedido = new Pedido();
		pedido.adicionarJuguete("Gallo Claudio", 12000, 50, 'm');
		assertThrows(IllegalArgumentException.class,
				()-> pedido.adicionarJuguete("Gallo Claudio", 10000, 50, 'm'));
	}

	@Test
	void adicionarJugueteTipoIncorrectoTest() {
		Pedido pedido = new Pedido();
		assertThrows(IllegalArgumentException.class,
				()-> pedido.adicionarJuguete("Balón de fútbol", 12000, 20, 'z'));
	}
}
