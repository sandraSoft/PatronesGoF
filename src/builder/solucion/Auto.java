package builder.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 * Un vehículo que tiene varias características,
 * algunas opcionales, por lo que define una clase interna
 * que será el constructor (patrón BUILDER).
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
	
	public Auto(String placa, String marca) {
		this.placa = placa;
		this.marca = marca;
		this.extras = new ArrayList<>();
	}
	
	public static Builder constructor(String placa, String marca) {
		return new Builder(placa, marca);
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
	
	public static class Builder {
		private Auto auto;
		
		public Builder(String placa, String marca) {
			auto = new Auto(placa,marca);
		}
		
		public Builder tipo(String tipo) {
			auto.setTipo(tipo);
			return this;
		}
		
		public Builder tipoBateria(String tipoBateria) {
			auto.setTipoBateria(tipoBateria);
			return this;
		}
		
		public Builder asientos(int asientos) {
			auto.setAsientos(asientos);
			return this;
		}
		
		public Builder potenciaMotor(int potenciaMotor) {
			auto.setPotenciaMotor(potenciaMotor);
			return this;
		}
		
		public Builder largo(int largo) {
			auto.setLargo(largo);
			return this;
		}
		
		public Builder ancho(int ancho) {
			auto.setAncho(ancho);
			return this;
		}
		
        public Builder extra(String extra) {
            auto.extras.add(extra);
            return this;
        }
        
        public Auto crear() {
        	return auto;
        }
	}
	
}
