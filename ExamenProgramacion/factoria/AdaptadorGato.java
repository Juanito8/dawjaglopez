package factoria;

public class AdaptadorGato implements IDomesticar{
	Gato g=new Gato();

	@Override
	public String saludar(String m) {
		String animal;
		animal=g.hablar(m);
		
		return animal;
	}
	
	
}
