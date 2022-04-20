package composite.solucion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConstructoraTest {
	@Test
	void duracionSinCasasTest() {
		Constructora constructora = new Constructora();
		int dias = constructora.calcularDiasConstruccion();
		assertEquals(0,dias);
	}

	@Test
	void duracionUnaCasaTest() {
		Constructora constructora = new Constructora();
		Casa casa = new Casa(1,2);
		constructora.addElemento(casa);
		Plancha plancha = new Plancha(10,5);
		constructora.addElemento(plancha);
		casa.addElemento(plancha);
		Pared pared1 = new Pared(5);
		constructora.addElemento(pared1);
		casa.addElemento(pared1);
		Pared pared2 = new Pared(5);
		constructora.addElemento(pared2);
		casa.addElemento(pared2);
		Pared pared3 = new Pared(10);
		constructora.addElemento(pared3);
		casa.addElemento(pared3);
		Pared pared4 = new Pared(10);
		constructora.addElemento(pared4);
		casa.addElemento(pared4);
		int dias = constructora.calcularDiasConstruccion();
		assertEquals(51,dias);
	}

	@Test
	void duracionDosCasasTest() {
		Constructora constructora = new Constructora();
		Casa casa1 = new Casa(1,2);
		constructora.addElemento(casa1);
		Plancha plancha = new Plancha(10,5);
		constructora.addElemento(plancha);
		casa1.addElemento(plancha);
		Pared pared1 = new Pared(5);
		constructora.addElemento(pared1);
		casa1.addElemento(pared1);
		Pared pared2 = new Pared(5);
		constructora.addElemento(pared2);
		casa1.addElemento(pared2);
		Pared pared3 = new Pared(10);
		constructora.addElemento(pared3);
		casa1.addElemento(pared3);
		Pared pared4 = new Pared(10);
		constructora.addElemento(pared4);
		casa1.addElemento(pared4);
		
		Casa casa2 = new Casa(2,2);
		constructora.addElemento(casa2);
		Plancha plancha1 = new Plancha(10,5);
		constructora.addElemento(plancha1);
		casa2.addElemento(plancha1);
		Pared pared5 = new Pared(5);
		constructora.addElemento(pared5);
		casa2.addElemento(pared5);
		Pared pared6 = new Pared(5);
		constructora.addElemento(pared6);
		casa2.addElemento(pared6);
		Pared pared7 = new Pared(10);
		constructora.addElemento(pared7);
		casa2.addElemento(pared7);
		Pared pared8 = new Pared(10);
		constructora.addElemento(pared8);
		casa2.addElemento(pared8);
		Plancha plancha2 = new Plancha(10,4);
		constructora.addElemento(plancha2);
		casa2.addElemento(plancha2);
		Pared pared9 = new Pared(4);
		constructora.addElemento(pared9);
		casa2.addElemento(pared9);
		Pared pared10 = new Pared(4);
		constructora.addElemento(pared10);
		casa2.addElemento(pared10);
		Pared pared11 = new Pared(10);
		constructora.addElemento(pared11);
		casa2.addElemento(pared11);
		Pared pared12 = new Pared(10);
		constructora.addElemento(pared12);
		casa2.addElemento(pared12);
		
		int dias = constructora.calcularDiasConstruccion();
		assertEquals(98,dias);
	}
}
