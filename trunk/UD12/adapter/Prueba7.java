package adapter;

import java.util.Scanner;

public class Prueba7 {
	public Prueba7(String[] args){ // Para utilizar atributos no estaticos como objeto
			IdiomaAdapterFactory i= IdiomaAdapterFactory.getIdiomaAdapterFactory();
			ITraductor traductor=i.getITraductor();

			System.out.print("Introduce una palabra: ");
			Scanner scan = new Scanner(System.in);
			String palabra = scan.next();
			System.out.println(traductor.traducir(palabra));
	
		}
		public static void main (String[]args) {
			new Prueba7(args);
			
		}
}
