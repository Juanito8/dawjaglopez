package pruebasConcurso;

import java.util.*;

public class BarJavier {
	public static String letra;
	public static Float precio;
	public static boolean jornada = true;
	@SuppressWarnings("rawtypes")
	public static Collection resultado = new ArrayList();
	public static float desayuno = 0;
	public static float comidas = 0;
	public static float meriendas = 0;
	public static float cenas = 0;
	public static float copas = 0;
/**
 * 
 * Metodo para recibir una letra y el precio asociado, comparar la letra con el valor de final de introduccion
 * del dia y recoger los precios de cada categoria y almacenarlos en un array para comparar el precio mayor
 *  y el menor, asociar los precios con las categorias si coinciden los precios añadir la categoria y en caso de que los mayores o menores
 *  son iguales añadirlo, realizar una media de las comidas y de las ventas generales y si las comidas son superiores a las ventas indicarlo con "SI"
 *  en caso contrario con "NO", enviar el resultado a una Coleccion de resultados. Cuando recibe la letra de cierre muestra el contenido de la coleccion.
 *  
 *  
 * @param letra
 * @param precio
 */
	@SuppressWarnings("unchecked")
	public static void dias(String letra, Float precio){
		if(letra.equals("N") && precio == 0.0 || letra.equals("E") && precio == 0.0){
			String dia = "";
			Float[] precios = {desayuno, comidas, meriendas, cenas, copas};
			Arrays.sort(precios);
			
			if(precios[4].equals(precios[3])){
				dia = "EMPATE";
			}else{
				if(precios[4] == desayuno){
					dia = "DESAYUNOS";
				}
				if(precios[4] == comidas){
					dia = "COMIDAS";
				}
				if(precios[4] == meriendas){
					dia = "MERIENDAS";
				}
				if(precios[4] == cenas){
					dia = "CENAS";
				}
				if(precios[4] == copas){
					dia = "COPAS";
				}
			}
			
			if(precios[0].equals(precios[1])){
				dia +="#EMPATE#";
			}else{
				if(precios[0] == desayuno){
					dia += "#DESAYUNOS#";
				}
				if(precios[0] == comidas){
					dia += "#COMIDAS#";
				}
				if(precios[0] == meriendas){
					dia += "#MERIENDAS#";
				}
				if(precios[0] == cenas){
					dia += "#CENAS#";
				}
				if(precios[0] == copas){
					dia += "#COPAS#";
				}
			}
			
			Float mediaComidas = comidas/5;
			Float mediaTotal = (desayuno/5)+(meriendas/5)+(cenas/5)+(copas/5);
			if(mediaComidas > mediaTotal){
				dia += "SI";
			}
			if(mediaComidas < mediaTotal){
				dia += "NO";
			}
			
			resultado.add(dia);

			desayuno = 0;
			comidas = 0;
			meriendas = 0;
			cenas = 0;
			copas = 0;
			//System.out.println(letra+" "+precio);
		}
		if(letra.equals("E") && precio == 0.0){
			jornada = false;
			for(Object i : resultado){
				System.out.println(i);
			}
		}
	}
	
	
	/**
	 * 
	 * Recoge por parametros una letra y un precio y asocia la letra con la categoria.
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		while(jornada){
			letra = scan.next();
			precio = Float.parseFloat(scan.next());
			
			switch(letra){
			case "D":
				desayuno = precio;
			break;
			case "A":
				comidas = precio;
			break;
			case "M":
				meriendas = precio;
			break;
			case "I":
				cenas = precio;
			break;
			case "C":
				copas = precio;
			break;
			}
				
			dias(letra, precio);
			/*
			 * SOLUCION del Programa
			 * ENTRADA
			 * D 2.80 C 48.00 A 8.00 N 0 D 15.33 A 60.00 M 12.00 I 25.00 E 0
			 * SALIDA
			 * COPAS#EMPATE#NO
			 * COMIDAS#COPAS#SI
			 */
		
		}
	}
}
