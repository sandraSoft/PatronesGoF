package fluentbuilder.inicial;

import java.util.ArrayList;
import java.util.List;

/**
 * Un vehículo que tiene varias características,
 * algunas opcionales, por lo que tiene varios constructores.
 * 
 * @version 1.0
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
	
	// Este constructor tiene muchos parámetros, lo cual no es recomendado
	public Auto(String placa, String marca, String tipo, String tipoBateria, 
			int asientos, int potenciaMotor, int largo, int ancho, 
			List<String> extras) {
		this(placa, marca);
		this.tipo = tipo;
		this.tipoBateria = tipoBateria;
		this.asientos = asientos;
		this.potenciaMotor = potenciaMotor;
		this.largo = largo;
		this.ancho = ancho;
		this.extras = extras;
	}
	
	public Auto(String placa, String marca, String tipo) {
		this(placa, marca);
		this.tipo = tipo;
		this.extras = new ArrayList<>();
	}

	public Auto(String placa, String marca, String tipo, int asientos, int potenciaMotor) {
		this(placa, marca, tipo, null, asientos, potenciaMotor, 0, 0, new ArrayList<>());
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
	
	public List<String> getExtras() {
		return extras;
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
	
}
