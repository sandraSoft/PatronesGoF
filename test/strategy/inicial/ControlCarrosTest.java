package strategy.inicial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ControlCarrosTest {

	@Test
	void testArchivoInexistente_CreaListaVacia() {
		ControlCarros control = new ControlCarros();
		control.obtenerDatosCarros("INEXISTENTE");
		List<Carro> carros = control.getCarros();
		assertEquals(0, carros.size());
	}
	
	@Test
	void testArchivoJson_CreaListaCarros() {
		ControlCarros control = new ControlCarros();
		control.obtenerDatosCarros("Carros.json");
		List<Carro> carros = control.getCarros();
		String resultadoEsperado = "[[placa=QUX-346, modelo=2020], [placa=HFY-974, modelo=2019]]";
		
		assertEquals(2, carros.size());
		assertEquals(resultadoEsperado, carros.toString());
	}
}
