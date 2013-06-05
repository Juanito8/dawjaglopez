package Patrones.facade;

	/**
	 * 
	 * En este programa tenemos un sistema que hemos creado nosotros, que sirve para hacer calculos aritmeticos y
	 * para hacer calculos de indices economicos, por lo que nuestro sistema se compone de las clases Aritmetica y 
	 * Economicas. El caso es que no queremos que el cliente pueda comunicarse directamente con el sistema, por lo
	 * que crearemos una clase intermediaria, que es con la que se comunicará el cliente. Por ejemplo, si el cliente
	 * quiere realizar una "suma" con el metodo sumar, no le dejaremos llamar directamente al metodo de la clase Aritmetica,
	 * sino que tendrá que llamar al metodo "suma" de la fachada. Dentro de la fachada, en el cuerpo del metodo "suma"
	 * llamamos al metodo "sumar" de la clase Aritmetica. Para calcular el iva hacemos lo mismo. El cliente podrá llamar al 
	 * metodo "calcular iva" de la fachada, y el metodo "calcular iva" de la fachada llamara al metodo "calcular iva" de
	 * Economicas.
	 *
	 * 
	 * @author Guillem
	 *
	 */

public class Main {

	public static void main(String[] args) {
		Fachada sistema = new Fachada();
		
		System.out.println(sistema.suma(30, 20));
		System.out.println(sistema.calcularIva(1000));
	}
	
}
