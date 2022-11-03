package RepasoVol1;

import java.util.Scanner;

public class Switch2 {
	public static void main (String[]Args) {
	int mes; 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese el numero de dias que tiene su mes: ");
	
	mes = sc.nextInt();
	
		switch(mes){
	
			case 28:
				System.out.println("Su mes es Febrero");
				break;
			case 30:
				System.out.println("Su mes es Abril");
				break;
			case 31:
				System.out.println("Su mes es Marzo");
				break;
			default:
				System.out.println("Su mes no tiene ese numero de dias ni de coña");
				break;	
		
		}

	
	}
}
