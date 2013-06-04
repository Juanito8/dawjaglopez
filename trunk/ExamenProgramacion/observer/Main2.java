package observer;

public class Main2 {
	public static void main(String[] args) {
		Publicidad n=new Publicidad();
		
		Español a1=new Español("Jose");
		Ingles b1=new Ingles("Mery");
		
		n.inscribirse(a1);
		n.inscribirse(b1);
		
		n.lista();
	}
}
