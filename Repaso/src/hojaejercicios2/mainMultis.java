package hojaejercicios2;


/*String titulo;
	String autor;
	int duracion;
	String formato [] = {"wav", "mp3", "wma","avi", "mov", "mp4", "wmv", "swf"};*/

public class mainMultis {
	
	public static void main (String []Args) {
		
		Multimedia obj1 = new Multimedia("Die For You","Joji", 3.25, Args );
		Multimedia obj2 = new Multimedia("Circo Loco","Drake", 3.57, Args );
		Multimedia obj3 = new Multimedia("pikito","Rusowski", 3.03, Args );
		Multimedia obj4 = new Multimedia("Ejercicios MultiHilo","DiscoDuroDeRoer", 25.24, Args );
	
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		
		System.out.println(obj1.equals(obj4));
		System.out.println(obj2.equals(obj2));
		System.out.println(obj3.equals(obj1));
		System.out.println(obj4.equals(obj2));
		
		
		
		
		
		
	}

}
