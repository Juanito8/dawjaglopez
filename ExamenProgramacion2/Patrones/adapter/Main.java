package Patrones.adapter;

	/**
	 * 
	 * 
	 * Tenemos una calculadora de indices economicos como el IVA que es el sistema que hemos escrito nosotros.
	 * Para que funcione correctamente tiene que usar la funcion "calcular iva" de un sistema externo. Hay dos aplicaciones
	 * que ofrecen este servicio, que son "bancaja" y "banco santander". El caso es que para usar la funcion de calcular iva
	 * no queremos acoplarnos directamente con ninguno de estos sistemas por si mas tarde queremos cambiarlo. Lo que hemos hecho es 
	 * hacer un adaptador para cada una de las clases. Todos los adaptadores tienen que tener un metodo "calcular iva", y dentro del
	 * código de ese metodo escribiremos todo lo necesario para calcularlo (bancaja y banco santander calculan el IVA de forma diferente
	 * por lo que dentro del "calcular iva" del adaptador seguiremos los pasos propios de cada sistema, ya sea bancaja o banco santander.
	 * 
	 * 
	 * 
	 * @author Guillem
	 *
	 */

public class Main {

	 public static void main(String[] args) {
		CalculadoraIndicesEconomicos calc = new CalculadoraIndicesEconomicos("bancaja");
		calc.calcularIva();
		
	}
	
}
