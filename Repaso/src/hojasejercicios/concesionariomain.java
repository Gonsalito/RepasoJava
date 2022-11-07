package hojasejercicios;

public class concesionariomain {
	
	public static void main (String[] Args) {
		
		Vehiculo v1 = new Vehiculo(4, 78, 120);
		Vehiculo v2 = new Vehiculo(2, 80, 140);
		Vehiculo v3 = new Vehiculo(6, 120, 180);
		Vehiculo v4 = new Vehiculo(2, 60, 120);
		
		System.out.println(v1.toString());
		if(v1.getNumRuedas() ==2) {
			System.out.println("Es una motocicleta");
		}else if (v1.getNumRuedas()==6) {
			System.out.println("Es un camion");
		}else {
			System.out.println("Es otro vehiculo ");
			
		}
		System.out.println(v2.toString());
		
		if(v2.getNumRuedas() ==2) {
			System.out.println("Es una motocicleta");
		}else if (v2.getNumRuedas()==6) {
			System.out.println("Es un camion");
		}else {
			System.out.println("Es otro vehiculo ");
			
		}
		
		System.out.println(v3.toString());
		
		if(v3.getNumRuedas() ==2) {
			System.out.println("Es una motocicleta");
		}else if (v3.getNumRuedas()==6) {
			System.out.println("Es un camion");
		}else {
			System.out.println("Es otro vehiculo ");
			
		}
		
		System.out.println(v4.toString());
		
		if(v4.getNumRuedas() ==2) {
			System.out.println("Es una motocicleta");
		}else if (v4.getNumRuedas()==6) {
			System.out.println("Es un camion");
		}else {
			System.out.println("Es otro vehiculo ");
			
		}
		
		
	}

}
