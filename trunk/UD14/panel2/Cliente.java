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
	public int getDni(){
		return this.dni;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
}
