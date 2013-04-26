package composite2;

public class Guitarrista implements IMusico{
	public static String nombre="";
	public void setName(String nombre) {
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println("Pwwwwpwpwpwwpwpwpw");	
	}
}
