package composite2;

public class Trompetista implements IMusico{
	public static String nombre="";

	public void setName(String nombre) {
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println("Prrprprprprrprr");	
	}
}
