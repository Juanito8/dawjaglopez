package adapter;

public class Prueba2 {
	public static void main(String[] args) {
		Translator in=new Translator();
		for(int i=0; i < args.length ;i++){
		System.out.println(in.translate(args[i]));
		}
	}
}
