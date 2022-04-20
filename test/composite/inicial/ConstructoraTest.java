package composite.inicial;

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
		constructora.addCasa(casa);
		Plancha plancha = new Plancha(10,5);
		constructora.addPlancha(plancha);
		casa.addPlancha(plancha);
		Pared pared1 = new Pared(5);
		constructora.addPared(pared1);
		casa.addPared(pared1);
		Pared pared2 = new Pared(5);
		constructora.addPared(pared2);
		casa.addPared(pared2);
		Pared pared3 = new Pared(10);
		constructora.addPared(pared3);
		casa.addPared(pared3);
		Pared pared4 = new Pared(10);
		constructora.addPared(pared4);
		casa.addPared(pared4);
		int dias = constructora.calcularDiasConstruccion();
		assertEquals(51,dias);
	}

	@Test
	void duracionDosCasasTest() {
		Constructora constructora = new Constructora();
		Casa casa1 = new Casa(1,2);
		constructora.addCasa(casa1);
		Plancha plancha = new Plancha(10,5);
		constructora.addPlancha(plancha);
		casa1.addPlancha(plancha);
		Pared pared1 = new Pared(5);
		constructora.addPared(pared1);
		casa1.addPared(pared1);
		Pared pared2 = new Pared(5);
		constructora.addPared(pared2);
		casa1.addPared(pared2);
		Pared pared3 = new Pared(10);
		constructora.addPared(pared3);
		casa1.addPared(pared3);
		Pared pared4 = new Pared(10);
		constructora.addPared(pared4);
		casa1.addPared(pared4);
		
		Casa casa2 = new Casa(2,2);
		constructora.addCasa(casa2);
		Plancha plancha1 = new Plancha(10,5);
		constructora.addPlancha(plancha1);
		casa2.addPlancha(plancha1);
		Pared pared5 = new Pared(5);
		constructora.addPared(pared5);
		casa2.addPared(pared5);
		Pared pared6 = new Pared(5);
		constructora.addPared(pared6);
		casa2.addPared(pared6);
		Pared pared7 = new Pared(10);
		constructora.addPared(pared7);
		casa2.addPared(pared7);
		Pared pared8 = new Pared(10);
		constructora.addPared(pared8);
		casa2.addPared(pared8);
		Plancha plancha2 = new Plancha(10,4);
		constructora.addPlancha(plancha2);
		casa2.addPlancha(plancha2);
		Pared pared9 = new Pared(4);
		constructora.addPared(pared9);
		casa2.addPared(pared9);
		Pared pared10 = new Pared(4);
		constructora.addPared(pared10);
		casa2.addPared(pared10);
		Pared pared11 = new Pared(10);
		constructora.addPared(pared11);
		casa2.addPared(pared11);
		Pared pared12 = new Pared(10);
		constructora.addPared(pared12);
		casa2.addPared(pared12);
		
		int dias = constructora.calcularDiasConstruccion();
		assertEquals(98,dias);
	}
}
