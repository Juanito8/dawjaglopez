package observer;

public class AlumnoEspanol implements IAlumno{
	private String nombre="";
	
	public void decirNombre(){
		System.out.println("Hola me llamo "+nombre);
	}
	public AlumnoEspanol(String nom){
		this.nombre=nom;
	}
	@Override
	public void nombrate() {
		decirNombre();
	}
}
