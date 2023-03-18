package fluentbuilder.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 * Un vehículo que tiene varias características,
 * algunas opcionales, por lo que define una clase interna
 * que será el constructor (patrón FLUENT BUILDER).
 * 
 * @version 2.0
 */
public class Auto {
	private String placa;
	private String marca;
	private String tipo;
	private String tipoBateria;
	private int asientos;
	private int potenciaMotor;
	private int largo;
	private int ancho;
	private List<String> extras;
	
	// El constructor solo puede ser usado por el Builder, por ser privado
	private Auto(String placa, String marca) {
		this.placa = placa;
		this.marca = marca;
		this.extras = new ArrayList<>();
	}
	
	public static AutoBuilder constructor(String placa, String marca) {
		return new AutoBuilder(placa, marca);
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	public String getPlaca() {
		return this.placa;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTipoBateria() {
		return tipoBateria;
	}

	public int getAsientos() {
		return asientos;
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public int getLargo() {
		return largo;
	}

	public int getAncho() {
		return ancho;
	}

	public List<String> getExtras() {
		return extras;
	}
	
	/**
	 * Constructor de autos, usando el patrón FLUENT BUILDER. 
	 * @version 2.0
	 */
	public static class AutoBuilder {
		private Auto auto;
		
		public AutoBuilder(String placa, String marca) {
			auto = new Auto(placa,marca);
		}
		
		public AutoBuilder tipo(String tipo) {
			auto.tipo = tipo;
			return this;
		}
		
		public AutoBuilder tipoBateria(String tipoBateria) {
			auto.tipoBateria = tipoBateria;
			return this;
		}
		
		public AutoBuilder asientos(int asientos) {
			auto.asientos = asientos;
			return this;
		}
		
		public AutoBuilder potenciaMotor(int potenciaMotor) {
			auto.potenciaMotor = potenciaMotor;
			return this;
		}
		
		public AutoBuilder largo(int largo) {
			auto.largo = largo;
			return this;
		}
		
		public AutoBuilder ancho(int ancho) {
			auto.ancho = ancho;
			return this;
		}
		
        public AutoBuilder extra(String extra) {
            auto.extras.add(extra);
            return this;
        }
        
        public Auto crear() {
        	return auto;
        }
	}
}
