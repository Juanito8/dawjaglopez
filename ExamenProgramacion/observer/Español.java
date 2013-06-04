package observer;

public class Español implements IProcedencia{
	private String nombre;
	public Español(String b){
		this.nombre=b;
	}
	public void nombre(){
		System.out.println("Hola soy de Murcia y me llamo "+nombre);
	}
	@Override
	public void saluda() {
		nombre();
	}
}
