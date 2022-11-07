package hojasejercicios;

public class Motocicleta extends Vehiculo {

	private int numPlazas;
	
	public Motocicleta(int numRuedas, int cilindrada, int potencia, int numPlazas) {
		super(numRuedas, cilindrada, potencia);
		
		this.numPlazas = numPlazas;
		
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	
	
}
