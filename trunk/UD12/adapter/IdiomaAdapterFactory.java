package adapter;

import java.io.BufferedReader;
import java.io.FileReader;

public class IdiomaAdapterFactory {
	public static ITraductor b;
	public static ITraductor getITraductor(){
		ITraductor traductor = null;
		if(b==null){
			FileReader fr = null;
			BufferedReader  br = null;		
			String linea = "";
			
			try {
				fr = new FileReader("UD12/adapter/adaptador.txt");
				br = new BufferedReader(fr);
				
				linea = br.readLine();
					
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					fr.close();
				}
				catch (Exception e) {
					System.out.println("Error de cierre");
				}
			}
			
			String nombreAdaptador = linea;
			
			
			try {
				traductor = ((ITraductor)Class.forName(nombreAdaptador).newInstance());
				traductor=b;
			} 
			catch (Exception e) {
				
			}
		}
		else{
		}
		return traductor;
	}
}
