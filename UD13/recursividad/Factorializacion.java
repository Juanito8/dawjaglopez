package recursividad;

import java.util.Scanner;

public class Factorializacion {
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		else{
			//System.out.println(n+"! ="+n+"x"+factorial(n-1));
			return (n=factorial(n-1)*n);
		}
	}
	public static void main(String[] args) {
		new Factorializacion();
	}
	public Factorializacion(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Numero para Factorizar: ");
		int num=scan.nextInt();
		System.out.println(factorial(num));
		for(int i=num;i>=0;i--){
			if(i==0){
				System.out.println(i+"! ="+factorial(i));
			}
			else{
				System.out.println(i+"! ="+i+"x"+factorial(i-1)+" = "+factorial(i));
			}
		}
	}
}
