package composite;

public class Cuaderno implements ICuaderno{
	String m="cuaderno";

	@Override
	public void sacar() {
		System.out.println("Soy una "+m);
	}
	
	
}
