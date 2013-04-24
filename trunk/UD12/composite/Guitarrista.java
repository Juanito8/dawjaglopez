package composite;

public class Guitarrista implements IMusico{
	private String nombre="";
	public void setName(String nombre) {
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println("Pwwwwpwpwpwwpwpwpw");	
	}
}
