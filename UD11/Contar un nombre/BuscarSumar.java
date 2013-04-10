import java.io.*;
import java.util.*;
public class BuscarSumar{
	public static void main(String []args){
		FileReader fr=null;
		BufferedReader br=null;

		try{
			fr=new FileReader("nombres.txt");
			br=new BufferedReader(fr);

			String linea;
		
			int m=0;
			while((linea=br.readLine())!=null){
				String[] dato=linea.split(" ");
				for(int i=0;i<dato.length;i++){
					if(dato[i].equals(args[0])){
						m++;
					}
				}
			}
				System.out.println(args[0]+" el numero que aparece: "+m);
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
