package adapter;

public class AdaptadorFrances implements ITraductor {
	Traducteur t1 = new Traducteur();
	
	public String traducir(String palabraATraducir) {
		String traducida = palabraATraducir;
		t1.preparez(palabraATraducir);
		t1.traduire();
		traducida = t1.getMotTraduit();		
		return traducida;
	}
}
