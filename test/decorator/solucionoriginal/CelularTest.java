package decorator.solucionoriginal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se realizan pruebas del cálculo del precio de un celular,
 * considerando varias características que puede tener.
 * 
 * @version 1.5
 */
class CelularTest {
	
	@Test
	void testCelularBase() {
		Celular celular = new CelularBase("moto",256);
		double precioEsperado = 807200;
		assertEquals(precioEsperado,celular.calcularPrecio());
	}
	
	@Test
	void testCelularUsado() {
		Celular celularUsado = new Usado(new CelularBase("moto",256));
		double precioEsperado = 403600;
		assertEquals(precioEsperado,celularUsado.calcularPrecio(),0.001);
	}
	
	@Test
	void testCelularConCamara() {
		Celular celularCamara = new ConCamara(new CelularBase("moto",256));
		double precioEsperado = 968640;
		assertEquals(precioEsperado,celularCamara.calcularPrecio());
	}
	
	@Test
	void testCelularUsadoConCamara() {
		Celular celularCamara = new ConCamara(new Usado(new CelularBase("moto",256)));
		double precioEsperado = 484320;
		assertEquals(precioEsperado,celularCamara.calcularPrecio());
	}

}
