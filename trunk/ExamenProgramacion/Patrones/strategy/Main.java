package strategy;


	/**
	 * 
	 * tenemos una fabrica de cerveza, y queremos que en funcion de lo que se le indique en el constructor de FabricaDeCerveza
	 * se fabriquen cervezas negras, rubias o de alta graduacion. Por tanto, tenemos tres estrategias, una para crear cerveza rubia, otra
	 * para fabricar cerveza negra, y otra para fabricar cerveza de alta graduacion y cogernos un buen moco e irnos al viña. Lo que hay que hacer es crear una clase
	 * por cada estrategia, y dentro de cada una de las clases haremos un metodo que fabrique la cerveza a su manera. Estas tres clases realmente estan haciendo casi
	 * lo mismo, que es fabricar cerveza, por lo que podemos hacer que implementen una interfaz que tenga un metodo que sea "fabricar()". En cada clase strateg tendremos que 
	 * escribir fabricar() de tal manera que si es CervezaNegraStrategy fabrique cerveza negra, y s es CervezaRubiaStrategy fabrique cerveza rubia. Ahora, la fabrica de cerveza
	 * tiene que tener un atributo que sea un IFabricacionStrategy, y en funcion de lo que se ponga en el constructorde esta clase ("rubia", "negra" o "alta graduacion"), se introducira 
	 * en ese atributo la clase que coincida con la estrategia indicada.
	 * 
	 * @author Guillem
	 *
	 */

public class Main {
	
	public static void main(String[] args) {
		FabricaDeCerveza heineken = new FabricaDeCerveza("alta graduacion");
		heineken.fabricar();
	}
		
}
