package adapter;

import java.io.BufferedReader;
import java.io.FileReader;

public class IdiomaAdapterFactory {
	private static IdiomaAdapterFactory i; // singleton objeto
	public ITraductor traductor;
	
	public static IdiomaAdapterFactory getIdiomaAdapterFactory(){ // Singleton Direccion 
		if(i==null){
		i=new IdiomaAdapterFactory();
		}
		return i;
	}
	
	private IdiomaAdapterFactory(){ // Singleton Constructor
	}
	
	public ITraductor getITraductor(){
		if(traductor==null){
			FileReader fr = null;
			BufferedReader  br = null;		
			String linea = "";
			
			try {
				fr = new FileReader("UD12/adapter/adaptador.ini");
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
			} 
			catch (Exception e) {
				
			}
			}
		return traductor;
	}
}
