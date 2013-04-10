import java.io.*;
public class ContarAtributos{
	public static void main(String []args){
		FileReader fr=null;
		BufferedReader br=null;
		int acc=0;
		try{
			fr=new FileReader("D:/tmp/UD11/datos.txt");
			br=new BufferedReader(fr);
		
			String linea;
		
			while((linea=br.readLine())!=null){
				acc++;
				System.out.println(linea+" : "+acc);
			}
		System.out.println("Numero de filas en el datos: "+acc);
	
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
		}	
	}
}
