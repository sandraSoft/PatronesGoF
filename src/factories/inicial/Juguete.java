package factories.inicial;

/**
 * Juguete para bebé, que tiene un empaque especial.
 * 
 * EL EMPAQUE SE CREA DEPENDIENDO DEL TIPO DE JUGUETE
 * 
 * @version 1.2
 */
public class Juguete {
	private double precioBase;
	private double volumen;
	private char tipo;	// 'p' Peluche, 'b' Balón
	
	private Empaque empaque;  
	
	public Juguete(double precioBase, double volumen, char tipo) {
		this.precioBase = precioBase;
		this.volumen = volumen;
		this.tipo = tipo;		
		crearEmpaque();
	}

	/**
	 * SI APARECE UN NUEVO TIPO DE EMPAQUE O DE JUGUETE
	 * SE DEBE MODIFICAR ESTE MÉTODO
	 */
	private void crearEmpaque() {
		if (this.tipo == 'p') {
			empaque = new BolsaTela(this.volumen + 10);
		}
		else {
			empaque = new Caja(this.volumen +5);
		}
	}
	
	/**
	 * Calcula el precio total del juguete, incluyendo el precio del empaque
	 * @return el precio total, en pesos colombianos. 
	 */
	public double getPrecioTotal() {
		return precioBase + empaque.calcularPrecio();
	}

}
