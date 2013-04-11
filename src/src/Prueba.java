import java.util.Scanner;


public class Prueba {
	public static void main(String[] args) {
		System.out.println("Pilotas?");
		System.out.println("En absoluto");
		Scanner scan= new Scanner(System.in);
		System.out.println("¿Pilota?");
		pilotas(scan.next());
	}
	public static String pilotas(String nom){
		String nom1= "";
		if (nom.equals("Jesus")){
			nom1 = "no";
	}
		else{
			nom1 = "si";
		}
		return nom1;
	}
}
