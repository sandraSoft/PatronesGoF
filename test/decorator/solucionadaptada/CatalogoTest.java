package decorator.solucionadaptada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Pruebas para calcular el valor total del catálogo con varios celulares.
 * 
 * @version 2.1
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
		catalogo.adicionarCelular(
				new CelularUsado(new Celular("Moto",256)));
		catalogo.adicionarCelular(
				new CelularCamara(new Celular("Samsung",128)));
		
		double precioTotal = catalogo.getPrecioTotalCatalogo();
		assertEquals(1995120,precioTotal);
	}

}
