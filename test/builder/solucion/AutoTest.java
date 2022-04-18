package builder.solucion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AutoTest {

	@Test
	void crearAutoCompletotest() {
		Auto auto = Auto.constructor("QWE-123","Renault Sandero").
				tipo("SUV").tipoBateria("Litio").asientos(5).
				potenciaMotor(250).largo(3000).ancho(1200).
				extra("GPS").extra("Bloqueo central").crear();
		
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
	void crearAutoPocosValorestest() {
		Auto auto = Auto.constructor("THW-489","KIA Sport").crear();
		
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
	
}
