package adapter;
import java.util.Scanner;
public class Prueba3 {
	public static void main (String[]args) {
		ITraductor traductor = new AdaptadorFrances();
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una palabra: ");
		String palabra = scan.next();
		System.out.println(traductor.traducir(palabra));
	}
}
