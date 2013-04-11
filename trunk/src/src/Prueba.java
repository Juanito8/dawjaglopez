import java.util.Scanner;


public class Prueba {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("¿Pilota?");
		System.out.println(pilotas(scan.next()));
	}
	public static String pilotas(String nom){
		String nom1= "";
		if (nom.equals("Jesus") || nom.equals("Ruben") || nom.equals("Jonay")){
			nom1 = "no";
		}
		else{
			nom1 = "si";
		}
		return nom1;
	}
}
