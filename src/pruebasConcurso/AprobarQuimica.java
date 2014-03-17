package pruebasConcurso;

import java.util.Scanner;

public class AprobarQuimica {
	public static void quimica(int num){
		String resultado = "";
		int num2 = num;
		int s = 2;
		int p = 6;
		int d = 10;
		int f = 14;
		String[] subniveles = {"1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", "4d", "5p", "6s", "4f", "5d", "6p", "7s", "5f", "6d", "7p"};
		int vueltas = 0;
		if(num == 0){
			resultado = subniveles[vueltas]+""+num2;
		}
		while(num2 != 0){
			char contenido = subniveles[vueltas].charAt(1);
			if(num2 >= 0 && num2 <= 118){
				if(contenido == 's'){
					if(num2 >= s){
						num2 = num2 - s;
						resultado = resultado+" "+subniveles[vueltas]+""+s;
					}else{
						resultado = resultado+" "+subniveles[vueltas]+""+num2;
						num2 = 0;
					}
				}
				if(contenido == 'p'){
					if(num2 >= p){
						num2 = num2 - p;
						resultado = resultado+" "+subniveles[vueltas]+""+p;
					}else{
						resultado = resultado+" "+subniveles[vueltas]+""+num2;
						num2 = 0;
					}
				}
				if(contenido == 'd'){
					if(num2 >= d){
						num2 = num2 - d;
						resultado = resultado+" "+subniveles[vueltas]+""+d;
					}else{
						resultado = resultado+" "+subniveles[vueltas]+""+num2;
						num2 = 0;
					}
				}
				if(contenido == 'f'){
					if(num2 >= f){
						num2 = num2 - f;
						resultado = resultado+" "+subniveles[vueltas]+""+f;
					}else{
						resultado = resultado+" "+subniveles[vueltas]+""+num2;
						num2 = 0;
					}
				}
			}else{
				num2 = 0;
			}
			vueltas++;
		}
		
		System.out.println(resultado.trim());
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean total = true;
		while(total){
			String elemento = scan.next();
			int num;
			if(elemento.equals("Exit")){
				total = false;
			}else{
				if(elemento.equals("Hidrogeno")){
					System.out.println("1s0");
				}else{
					num = Integer.parseInt(scan.next());
					quimica(num);
				}
			}
			
		}
	}
}