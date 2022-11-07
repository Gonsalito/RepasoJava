package hojasejercicios;

import java.awt.Color;

public class Vehiculo {
	
	protected int numRuedas; // >0 es un vehiculo, >6 es un camion  =2 es una moto
	protected int cilindrada;
	protected int potencia;
	protected Color color;
	
	public Vehiculo(int numRuedas, int cilindrada, int potencia) {
		super();
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	public Vehiculo(Color color) {
		numRuedas = 1;
		cilindrada = 50;
		potencia = 70;
		this.color = color;
		
		
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [numRuedas=" + numRuedas + ", cilindrada= " + cilindrada + " cc"+ ", potencia=" + potencia + " cv" + ", color="
				+ color + "]";
	}

	
	
}
