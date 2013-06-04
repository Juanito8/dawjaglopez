package fachada;

public class Main {
	public static void main(String[] args) {
		A a=new A();
		
		Facade f=new Facade();
		f.atencion(a);
		f.llamarse();
	}
}
