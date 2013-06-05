package fachada;
/**
 * Busca simplificar el sistema, desde el punto de vista del cliente, 
 * proporcionando una interfaz unificada para un conjunto de subsistemas, 
 * definiendo una interfaz de nivel más alto. Esto hace que el sistema sea más fácil de usar.
 * 
 * Este patrón busca reducir al mínimo la comunicación y dependencias entre subsistemas. 
 * Para ello, utilizaremos una fachada, simplificando la complejidad al cliente. 
 * El cliente debería acceder a un subsistema a través del Facade. De esta manera, 
 * se estructura un entorno de programación más sencillo, al menos desde 
 * el punto de vista del cliente (por ello se llama "fachada").
 * 
 *
 */
public class Facade {
	private B b;
	private A a;
	public Facade(){
		b=new B();
		a=new A();
	}
	
	public void llamarseA(){
		System.out.println(a.llamarseA());
	}
	public void llamarse(){
		b.llamarse();
	}
	
}
