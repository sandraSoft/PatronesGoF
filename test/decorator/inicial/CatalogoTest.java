package decorator.inicial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Pruebas para calcular el valor total del catálogo con varios celulares.
 * 
 * @version 1.1
 */
class CatalogoTest {

	@Test
	void testCatalogoVacio() {
		Catalogo catalogo = new Catalogo();
		double precioTotal = catalogo.getPrecioTotalCatalogo();
		assertEquals(0,precioTotal);
	}
	
	@Test
	void testCatalogoVariosCelulares() {
		Catalogo catalogo = new Catalogo();
		catalogo.adicionarCelular(new Celular("LG",256));
		catalogo.adicionarCelular(new Celular("Moto",256));
		
		double precioTotal = catalogo.getPrecioTotalCatalogo();
		assertEquals(1614400,precioTotal);
	}

}
