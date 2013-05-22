package ui;

import java.sql.Connection;

import org.junit.Test;

import rn.MysqlAPI;

public class TestTextoUI {
static Connection con = null;
	
	@Test
	public void main(){
		//-------------------------------------------------
		MysqlAPI m= new MysqlAPI();
		String args[]=new String[16];

		args[0]="c";
		args[1]="235623126";
		args[2]="Pepe";
		args[3]="10";
		args[4]="u";
		args[5]="235623126";
		args[6]="nom";
		args[7]="Maria";
		args[8]="u";
		args[9]="235623126";
		args[10]="edad";
		args[11]="12";
		args[12]="r";
		args[13]="235623126";
		args[14]="d";
		args[15]="235623126";
		
		
		try {
			m.conectar1("test");
			for(int i=0; i<args.length; i++){
				switch(args[i]){
					case "c": m.insertar(Integer.parseInt(args[i+1]), args[i+2], Integer.parseInt(args[i+3]));i=i+3;
					break;
					case "d": m.borrar(Integer.parseInt(args[i+1])); i=i+1;
					break;
					case "u":
						if(args[i+2].equals("nom")){
							m.modificar(Integer.parseInt(args[i+1]),args[i+3]); i=i+3;
						}
						else if(args[i+2].equals("edad")){
							m.modificar(Integer.parseInt(args[i+1]),Integer.parseInt(args[i+3])); i=i+3;
						}
					break;
					case "r": System.out.println("Nombre - "+m.getNom(Integer.parseInt(args[i+1]))); System.out.println("Edad: "+m.getEdad(Integer.parseInt(args[i+1]))); i=i+1;
					break;
				}
			}	
		System.out.println("Dni \tNombre \tEdad");
		System.out.println("---------------------");
		m.consultar();
		m.cerrar();
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
}
