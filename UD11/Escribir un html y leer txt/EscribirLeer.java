import java.io.*;
import java.util.*;
public class EscribirLeer{
	public static void main(String []args){
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		PrintWriter pw=null;
		try{
			fr=new FileReader("D:/tmp/UD11/paginas.txt");
			br=new BufferedReader(fr);
			
			fw=new FileWriter("D:/tmp/UD11/paginas.html");
			pw=new PrintWriter(fw);
			
			String linea;
		
			while((linea=br.readLine())!=null){
				String[] dato=linea.split(";");
				pw.print("<h1>");
				pw.print("<a href=\"");
				String paginas=dato[1];
				pw.print(paginas);
				pw.print("\">");
				String nombre=dato[0];
				pw.print(nombre);
				pw.print("</a>");
				pw.print("</h1>");
			}
			
			
			}
			catch(Exception e){
				System.out.println("Error al abrir el fichero");
		
			}
			finally{
				try{
					fr.close();
					fw.close();
				}
				catch(Exception e){
					System.out.println("Error al cerrar el fichero");
				}
		}	
	}
}
