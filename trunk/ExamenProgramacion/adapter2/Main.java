package adapter2;

import java.util.Scanner;

public class Main {
	public Main(){
		IDomesticar m=new AdaptadorPerro(); // elegir el adaptador para cada animal
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Habla con la mascota:");
		String n=scan.next();
		System.out.println(m.saludar(n));
		
	}
	public static void main(String[] args) {
		new Main();
	}
}
