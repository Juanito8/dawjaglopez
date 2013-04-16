package adapter;

public class AdaptadorIngles implements ITraductor {
	Translator t1 = new Translator();	
	
	public String traducir(String palabraATraducir) {
		String traducida = t1.translate(palabraATraducir);	
		return traducida;
	}
}
