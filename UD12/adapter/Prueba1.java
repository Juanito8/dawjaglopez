package adapter;

public class Prueba1 {
	public static void main(String[] args) {
		Traducteur f= new Traducteur();
		for(int i=0; i < args.length ;i++){
		f.preparez(args[i]);
		f.traduire();
		System.out.println(f.getMotTraduit());
		}
	}
}
