package ui;

import java.sql.Connection;
import rn.MysqlAPI;
	/**
	 * Clase que por parametros de entrada realiza funciones de la base de datos personas.
	 * 
	 *
	 *
	 * @author Juan Antonio Garcia
	 */
public class TextoUI {
	private static MysqlAPI m;
	public static Connection con = null;
	
	/**
	 * Recibe por parametros de entrada los valores a procesar por la base de datos
	 * 
	 * 
	 * <ul>
	 * <li>Insertar</li>
	 * <li>Borrar</li>
	 * <li>Modificar</li>
	 * <li>Consultar</li>
	 * </ul>
	 */
	public static void main(String[] args){
		//-------------------------------------------------
		m= new MysqlAPI();
		try {
			m.conectar();
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
		//insertar(100,"Manolo",10);
		
		//borrar(100);
		
		//modificar(100,"......");
		
		//modificar(100,23);
		
		//System.out.println(getNom(100));
	
		//System.out.println(MysqlAPI.getEdad(100));
		System.out.println();
		m.consultar();
		m.cerrar();
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
}
