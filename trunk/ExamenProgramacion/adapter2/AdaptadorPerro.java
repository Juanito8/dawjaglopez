package adapter2;

public class AdaptadorPerro implements IDomesticar{
	Perro p=new Perro();

	@Override
	public String saludar(String m) {
		String animal;
		animal=p.ladar(m);
		
		return animal;
	}
}
