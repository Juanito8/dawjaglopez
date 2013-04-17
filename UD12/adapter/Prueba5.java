package adapter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Prueba5 {
	public static void main (String[]args) {
		

		FileReader fr = null;
		BufferedReader  br = null;		
		String linea = "";
		
		try {
			fr = new FileReader("UD12/adapter/adaptador.txt");
			br = new BufferedReader(fr);
			
			linea = br.readLine();
				
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}
			catch (Exception e) {
				System.out.println("Error de cierre");
			}
		}
		
		String nombreAdaptador = linea;
		
		ITraductor traductor = null;
		try {
			traductor = ((ITraductor)Class.forName(nombreAdaptador).newInstance());
		} 
		catch (Exception e) {
			
		}
		
		System.out.print("Introduce una palabra: ");
		Scanner scan = new Scanner(System.in);
		String palabra = scan.next();
		System.out.println(traductor.traducir(palabra));
		
	}
}
