package observer;

public class Espa�ol implements IProcedencia{
	private String nombre;
	public Espa�ol(String b){
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
