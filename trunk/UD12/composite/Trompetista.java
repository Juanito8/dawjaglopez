package composite;

public class Trompetista implements IMusico{
	private String nombre="";

	public void setName(String nombre) {
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println("Prrprprprprrprr");	
	}
}
