package decorator.solucionoriginal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Pruebas para calcular el valor total del catálogo con varios celulares.
 * 
 * @version 1.5
 */
class CatalogoTest {
	
	@Test
	void testCatalogoVacio() {
		Catalogo catalogo = new Catalogo();
		double precioTotal = catalogo.getPrecioTotalCatalogo();
		assertEquals(0,precioTotal);
	}
	
	@Test
	void testCatalogoCelularesBase() {
		Catalogo catalogo = new Catalogo();
		catalogo.adicionarCelular(new CelularBase("LG",256));
		catalogo.adicionarCelular(
				new Usado(new CelularBase("Moto",256)));
		catalogo.adicionarCelular(
				new ConCamara(new CelularBase("Samsung",128)));
		
		double precioTotal = catalogo.getPrecioTotalCatalogo();
		assertEquals(1995120,precioTotal);
	}

}
