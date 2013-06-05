package Patrones.observer;

	/**
	 * 
	 * En este caso lo que tenemos es un camaleon que quiere cambiar de color cada vez que lo haga el suelo.
	 * Por lo tanto, nuestro camaleon va a tener que estar observando al suelo para cambiar de color cuando este lo haga.
	 * La clase Suelo, que es la observada, tiene una coleccion de objetos, y todos los objetos que se añadan a esa coleccion
	 * podrán observarlo. Para observar al suelo, la clase Suelo tiene un metodo que es "suscribirse(Observador o)", gracias al cual 
	 * se pueden añadir a la coleccion de observadores nuevos camaleones. Hay una interfaz, que es observador, a la que implementan todos los 
	 * camaleones. Gracias a esto podrán suscribirse a la coleccion de objetos de Suelo, ya que es una coleccion a la que pueden entrar solo Observadores.
	 * El camaleon tambien tiene un metodo que es "observarA(Suelo suelo)". 
	 * 
	 * Entonces la secuencia para ser observador es:
	 * 1.-Crear un objeto suelo y un objeto camaleon
	 * 2.-El camaleon debe indicar que quiere observar a ese suelo //cam.observarA(suelo);
	 * 3.-dentro de observarA() del camaleon, se llama al metodo suscribirse del suelo, y eso añadira al camaleon a la coleccion de Observadores que tiene suelo.
	 * 4.-A partir de ahora, cualquier cambio que se porduzca en el color del suelo provocará que cambie el color del camaleon
	 * 
	 * @author Guillem
	 *
	 */

public class Main {

	public static void main(String[] args) {
		Camaleon cam = new Camaleon();
		Suelo suelo = new Suelo();
		cam.observarA(suelo);
		cam.mostrarColor();
		suelo.setColor("azul");
		cam.mostrarColor();
		suelo.setColor("violeta");
		cam.mostrarColor();
		suelo.setColor("verde");
		
		cam.mostrarColor();
	}
	
}
