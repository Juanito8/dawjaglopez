package adapter2;

import java.util.Scanner;
/**
 * Para utilizar las mascotas sin estar unidos y poder hablar con ellos necesitamos un adaptador que cuando se hable a un animal
 * para que nos entienda abra k hablarle de un modo distinto por eso cambiamos de forma de hablar a una mascota
 * dentro de una clase elegimos la mascota y la interfaz se encarga de elegirnos la mascota para saludarlos
 * 
 * 
 *
 */
public class Main {
	public static void main(String[] args) {
		HablarMascota hablar=new HablarMascota("perro");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Habla con la mascota:");
		String n=scan.next();
		System.out.println(hablar.saludar(n));
	}
}
