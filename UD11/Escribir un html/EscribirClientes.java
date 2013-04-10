import java.io.*;
import java.util.*;
public class EscribirClientes{
	public static void main(String []args){
		FileWriter fw=null;
		PrintWriter pw=null;
		try{
			fw=new FileWriter("D:/tmp/UD11/clientes.html");
			pw=new PrintWriter(fw);
			
			pw.print("<table border=\"1 px\">");
			pw.print("<tr><th>Nombre</th><th>Apellido</th><th>Edad</th></tr>");
			for(int i=0;i<(args.length/3);i++){
				pw.print("<tr>");
				pw.print("<td>");
				pw.print(args[i*3]);
				pw.print("</td>");
				//pw.print(":");
				pw.print("<td>");
				pw.print(args[(i*3)+1]);
				pw.print("</td>");
				//pw.print(":");
				pw.print("<td>");
				pw.print(args[(i*3)+2]);
				pw.print("</td>");
				pw.print("</tr>");
				pw.println();
			}
				pw.print("</table>");
		}
		catch(Exception e){
			System.out.println("Error al abrir el fichero");
		
		}
		finally{
			try{
				fw.close();
			}
			catch(Exception e){
				System.out.println("Error al cerrar el fichero");
			}
		}
	}
}
class Persona{
	private String nombre;
	private String apellido;
	private int edad;
	public Persona(String nombre, String apellido, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
}
