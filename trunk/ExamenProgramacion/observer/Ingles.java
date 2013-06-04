package observer;

public class Ingles implements IProcedencia{
	private String nombre;
	public Ingles(String b){
		this.nombre=b;
	}
	public void nombre(){
		System.out.println("Hi, i'm from London and my name is "+nombre);
	}
	@Override
	public void saluda() {
		nombre();
	}
}
