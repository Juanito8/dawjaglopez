package recursividad;

import java.util.Scanner;

public class Mcd {
	public static int mcd(int x, int y){
		System.out.println(x+" - "+y);
		if(y==0){
			return x;
		}
		else{
			return mcd(y, x%y);
		}
	}
	public static void main(String[] args) {
		new Mcd();
	}
	public Mcd(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Hacer el Maximo comun divisor: ");
		System.out.print("Numero x: ");
		int x=scan.nextInt();
		System.out.print("Numero y: ");
		int y=scan.nextInt();
		System.out.println(mcd(x, y));
	}
}
