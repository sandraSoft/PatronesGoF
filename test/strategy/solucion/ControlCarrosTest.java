package strategy.solucion;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class ControlCarrosTest {

	@Test
	void testArchivoInexistente_CreaListaVacia() {
		ControlCarros control = new ControlCarros(new ConvertidorJson());
		control.obtenerDatosCarros("INEXISTENTE");
		List<Carro> carros = control.getCarros();
		assertEquals(0, carros.size());
	}
	
	@Test
	void testFormatoIncorrectoJson_CreaListaVacia() {
		ControlCarros control = new ControlCarros(new ConvertidorJson());
		control.obtenerDatosCarros("CarrosIncorrecto.json");
		List<Carro> carros = control.getCarros();
		assertEquals(0, carros.size());
	}
	
	@Test
	void testArchivoJson_CreaListaCarros() {
		ControlCarros control = new ControlCarros(new ConvertidorJson());
		control.obtenerDatosCarros("Carros.json");
		List<Carro> carros = control.getCarros();
		String resultadoEsperado = "[[placa=QUX-346, modelo=2020], [placa=HFY-974, modelo=2019]]";
		
		assertEquals(2, carros.size());
		assertEquals(resultadoEsperado, carros.toString());
	}

	@Test
	void testFormatoIncorrectoCsv_CreaListaVacia() {
		ControlCarros control = new ControlCarros(new ConvertidorCsv());
		control.obtenerDatosCarros("CarrosIncorrecto.csv");
		List<Carro> carros = control.getCarros();
		assertEquals(0, carros.size());
	}
	
	@Test
	void testArchivoCsv_CreaListaCarros() {
		ControlCarros control = new ControlCarros(new ConvertidorCsv());
		control.obtenerDatosCarros("Carros.csv");
		List<Carro> carros = control.getCarros();
		String resultadoEsperado = "[[placa=QUX-346, modelo=2020], [placa=HFY-974, modelo=2019]]";
		
		assertEquals(2, carros.size());
		assertEquals(resultadoEsperado, carros.toString());
	}
}
