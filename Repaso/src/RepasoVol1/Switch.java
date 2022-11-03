package RepasoVol1;

import java.util.Scanner;

public class Switch {
	public static void main (String [] Args) {
	char variable ;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese su letra: ");
	
	variable = sc.next().charAt(0);
	
		switch(variable) {
	
			case 'i': 
				System.out.println("Ingles");
				break;
			case 'd':
				System.out.println("Diamante");
				break;
			case 'f':
				System.out.println("Fatema");
				break;
			case 'z':
				System.out.println("Zarigüella");
				break;
				
			default:
				System.out.println("No has escrito ninguna de las letras que se necesitan");
				break;
			}

	}
}
