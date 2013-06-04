package singleton;

public class ASingleton {
	private static ASingleton a;
	private ASingleton(){
		
	}
	public static ASingleton getASingleton(){
		if(a==null){
			a=new ASingleton();
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println("Clase Singleton");
	}
}
