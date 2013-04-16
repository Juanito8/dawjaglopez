package adapter;
import java.util.Scanner;

public class Prueba4 {
	
	public static void main (String[]args) {
		ITraductor traductor = new AdaptadorIngles();
		System.out.println("Introduce un numero: ");
		Scanner scan = new Scanner(System.in);
		String palabra = scan.next();
		System.out.println(traductor.traducir(palabra));
		
	}
}
