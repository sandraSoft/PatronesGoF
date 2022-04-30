package state.solucion.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import state.inicial.Carro;
import state.inicial.CarroException;

/**
 * Se realizan pruebas de los métodos acelerar y frenar de la clase Carro,
 * los cuales se comportan diferente dependiendo del estado del Carro.
 * 
 * @version 1.0
 */
class CarroTest {

	@Test
	void testApagado() {
		Carro carro = new Carro();
		
		double velocidadEsperada = 0;
		char estadoEsperado = 'a';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}
	
	@Test
	void testAcelerarHastaNormal() {
		Carro carro = new Carro();
		try {
			carro.acelerar();
		} catch (CarroException errorVelocidad) {
			System.err.println(errorVelocidad);
		}
		
		double velocidadEsperada = 10;
		char estadoEsperado = 'n';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}
	
	@Test
	void testAcelerarHastaRapido() {
		Carro carro = new Carro();
		try {
			carro.acelerar();
			carro.acelerar();
		} catch (CarroException errorVelocidad) {
			System.err.println(errorVelocidad);
		}
		
		double velocidadEsperada = 20;
		char estadoEsperado = 'r';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}
	
	@Test
	void testAcelerarMasRapido() {
		Carro carro = new Carro();
		try {
			carro.acelerar();
			carro.acelerar();
			carro.acelerar();
		} catch (CarroException errorVelocidad) {
			System.err.println(errorVelocidad);
		}
		
		double velocidadEsperada = 40;
		char estadoEsperado = 'r';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}
	
	@Test
	void testAcelerarMasDelMaximo() {
		Carro carro = new Carro();
		try {
			carro.acelerar();
			carro.acelerar();
			carro.acelerar();
		} catch (CarroException errorVelocidad) {
			System.err.println(errorVelocidad);
		}
		
		assertThrows(CarroException.class, ()-> carro.acelerar());
		
		double velocidadEsperada = 40;
		char estadoEsperado = 'r';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}

	@Test
	void testFrenarApagado() {
		Carro carro = new Carro();
		carro.frenar();
		
		double velocidadEsperada = 0;
		char estadoEsperado = 'a';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}

	@Test
	void testFrenarEnNormal() {
		Carro carro = new Carro();
		try {
			carro.acelerar();
			carro.frenar();
		} catch (CarroException errorVelocidad) {
			System.err.println(errorVelocidad);
		}
		
		double velocidadEsperada = 0;
		char estadoEsperado = 'a';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}
	
	@Test
	void testFrenarEnRapido() {
		Carro carro = new Carro();
		try {
			carro.acelerar();
			carro.acelerar();
			carro.frenar();
		} catch (CarroException errorVelocidad) {
			System.err.println(errorVelocidad);
		}
		
		double velocidadEsperada = 10;
		char estadoEsperado = 'n';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}
		
	@Test
	void testFrenarMasRapido() {
		Carro carro = new Carro();
		try {
			carro.acelerar();
			carro.acelerar();
			carro.acelerar();
			carro.frenar();
		} catch (CarroException errorVelocidad) {
			System.err.println(errorVelocidad);
		}
		
		double velocidadEsperada = 30;
		char estadoEsperado = 'r';
		assertEquals(velocidadEsperada, carro.getVelocidad(),0);
		assertEquals(estadoEsperado,carro.getEstado());
	}

}
