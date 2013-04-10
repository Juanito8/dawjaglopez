import java.io.*;
import java.util.*;
public class ClientePersonas{
	public static void main(String []args){
		FileReader fr=null;
		BufferedReader br=null;
		Collection<Persona> p=new ArrayList();
		try{
			fr=new FileReader("D:/tmp/UD11/clientes.txt");
			br=new BufferedReader(fr);
			
			String linea;
		
			while((linea=br.readLine())!=null){
				String[] dato=linea.split(":");
				String nombre=dato[0];
				String apellido=dato[1];
				String edad=dato[2];
				p.add(new Persona(nombre,apellido,Integer.parseInt(edad)));
			}
			}
			catch(Exception e){
				System.out.println("Error al abrir el fichero");
		
			}
			finally{
				try{
					fr.close();
				}
				catch(Exception e){
					System.out.println("Error al cerrar el fichero");
				}
			for(Persona c : p ){
				c.saludar();
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
	public void saludar(){
		System.out.println("Hola, soy "+this.nombre+" "+this.apellido+" y soy "+(this.edad<18?"Menor":"Mayor"));
	}
}
