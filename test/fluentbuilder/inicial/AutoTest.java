package fluentbuilder.inicial;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;


class AutoTest {

	@Test
	void crearAutoCompletoTest() {
		Auto auto = new Auto("QWE-123","Renault Sandero","SUV","Litio",
				5,250,3000,1200,Arrays.asList("GPS", "Bloqueo central"));
		
        assertEquals("QWE-123", auto.getPlaca());
        assertEquals("Renault Sandero", auto.getMarca());
        assertEquals("SUV", auto.getTipo());
        assertEquals("Litio", auto.getTipoBateria());
        assertEquals(5, auto.getAsientos());
        assertEquals(250, auto.getPotenciaMotor());
        assertEquals(3000, auto.getLargo());
        assertEquals(1200, auto.getAncho());
        assertEquals(2, auto.getExtras().size());
	}
	
	@Test
	void crearAutoSoloObligatoriosTest() {
		Auto auto = new Auto("THW-489","KIA Sport");
		
        assertEquals("THW-489", auto.getPlaca());
        assertEquals("KIA Sport", auto.getMarca());
        assertNull(auto.getTipo());
        assertNull(auto.getTipoBateria());
        assertEquals(0, auto.getAsientos());
        assertEquals(0, auto.getPotenciaMotor());
        assertEquals(0, auto.getLargo());
        assertEquals(0, auto.getAncho());
        assertEquals(0, auto.getExtras().size());
	}
	
	@Test
	void crearAutoPocosValoresTest() {
		Auto auto = new Auto("RNY-829","Subaru Max","Hatchback",5,200);
		
        assertEquals("RNY-829", auto.getPlaca());
        assertEquals("Subaru Max", auto.getMarca());
        assertEquals("Hatchback",auto.getTipo());
        assertNull(auto.getTipoBateria());
        assertEquals(5, auto.getAsientos());
        assertEquals(200, auto.getPotenciaMotor());
        assertEquals(0, auto.getLargo());
        assertEquals(0, auto.getAncho());
        assertEquals(0, auto.getExtras().size());
	}

}
