package decorator.inicial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se realizan pruebas del cálculo del precio de un celular,
 * considerando varias características que puede tener.
 * 
 * TODAVÍA NO SE PUEDE PROBAR PARA CELULARES USADOS O CON CÁMARAS ESPECIALES
 * (entre otras posibilidades)
 * 
 * @version 1.0
 */
class CelularTest {

	@Test
	void testCelularBase() {
		Celular celular = new Celular("moto",256);
		double precioEsperado = 807200;
		assertEquals(precioEsperado,celular.calcularPrecio());
	}
	
//	@Test
//	void testCelularUsado() {
//		Celular celularBase = new Celular("moto",256);
//		CelularUsado celularUsado = new CelularUsado(celularBase);
//		double precioEsperado = 403600;
//		assertEquals(precioEsperado,celularUsado.calcularPrecio(),0.001);
//	}
//	
//	@Test
//	void testCelularConCamara() {
//		Celular celularBase = new Celular("moto",256);
//		CelularCamara celularCamara = new CelularCamara(celularBase);
//		double precioEsperado = 968640;
//		assertEquals(precioEsperado,celularCamara.calcularPrecio());
//	}
//	
//	@Test
//	void testCelularUsadoConCamara() {
//		Celular celularBase = new Celular("moto",256);
//		CelularUsado celularUsado = new CelularUsado(celularBase);
//		CelularCamara celularCamara = new CelularCamara(celularUsado);
//		double precioEsperado = 484320;
//		assertEquals(precioEsperado,celularCamara.calcularPrecio());
//	}
	
}
