package panel2;

public class Cliente {
	private int dni;
	private String nombre;
	private String apellido;
	public Cliente(int dni, String nombre, String apellido){
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public String toString(){
		return " "+dni+" "+nombre+" "+apellido;
	}
}