package fachada;
/**
 * Busca simplificar el sistema, desde el punto de vista del cliente, 
 * proporcionando una interfaz unificada para un conjunto de subsistemas, 
 * definiendo una interfaz de nivel m�s alto. Esto hace que el sistema sea m�s f�cil de usar.
 * 
 * Este patr�n busca reducir al m�nimo la comunicaci�n y dependencias entre subsistemas. 
 * Para ello, utilizaremos una fachada, simplificando la complejidad al cliente. 
 * El cliente deber�a acceder a un subsistema a trav�s del Facade. De esta manera, 
 * se estructura un entorno de programaci�n m�s sencillo, al menos desde 
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
