package factoria;

import java.util.Scanner;

public class Main {
	public Main(){
		AdaptadorFactoria n=new AdaptadorFactoria(); // Deberia ser singleton
		IDomesticar m=n.getITDomesticar(); // El documento de la factoria elige que animal habl
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Habla con la mascota:");
		String palabra=scan.next();
		System.out.println(m.saludar(palabra));
		
	}
	public static void main(String[] args) {
		new Main();
	}
}
