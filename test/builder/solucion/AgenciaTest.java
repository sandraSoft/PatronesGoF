package builder.solucion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AgenciaTest {

	@Test
	void adicionarAutoTest() {
		Map<String,String> datosAuto = new HashMap<>();
		String placa = "KWE-568";
		datosAuto.put("placa", placa);
		datosAuto.put("marca", "Nissan Burbuja");
		datosAuto.put("tipo", "SUV");
		datosAuto.put("largo", "3100");
		
		Agencia agencia = new Agencia();
		agencia.addAuto(datosAuto, null);
		Auto auto = agencia.buscarAuto(placa);
		
		assertEquals(placa,auto.getPlaca());
		assertEquals("Nissan Burbuja",auto.getMarca());
		assertEquals("SUV",auto.getTipo());
		// Ahora sí pasa la siguiente prueba:
		assertEquals(3100,auto.getLargo());
		assertEquals(0,auto.getExtras().size());
	}

	@Test
	void buscarAutoNoExisteTest() {
		Agencia agencia = new Agencia();
		Auto auto = agencia.buscarAuto("ZZZ");
		assertNull(auto);
	}
}
