package composite.solucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CasaTest {

	@Test
	void duracionSinElementosTest() {
		Casa casa = new Casa(1,1);
		int dias = casa.getDiasConstruir();
		assertEquals(0,dias);
	}

	@Test
	void duracionCasaUnPisoTest() {
		Casa casa = new Casa(1,2);
		casa.addElemento(new Plancha(10,5));
		casa.addElemento(new Pared(5));
		casa.addElemento(new Pared(5));
		casa.addElemento(new Pared(10));
		casa.addElemento(new Pared(10));
		int dias = casa.getDiasConstruir();
		assertEquals(45,dias);
	}
	
	@Test
	void duracionCasaDosPisosTest() {
		Casa casa = new Casa(2,2);
		casa.addElemento(new Plancha(10,5));
		casa.addElemento(new Plancha(10,4));
		casa.addElemento(new Pared(5));
		casa.addElemento(new Pared(5));
		casa.addElemento(new Pared(10));
		casa.addElemento(new Pared(10));
		casa.addElemento(new Pared(4));
		casa.addElemento(new Pared(4));
		casa.addElemento(new Pared(10));
		casa.addElemento(new Pared(10));
		int dias = casa.getDiasConstruir();
		assertEquals(81,dias);
	}
}
