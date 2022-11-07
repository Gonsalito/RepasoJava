package hojasejercicios;

public class Camion extends Vehiculo {

	 private int numEjes;
	
	public Camion(int numRuedas, int cilindrada, int potencia, int numEjes) {
		super(numRuedas, cilindrada, potencia);
		
		this.numEjes = numEjes;
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	
	
}
