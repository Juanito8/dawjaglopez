package strategy;

import java.io.BufferedReader;
import java.io.FileReader;

public class FactoryStrategyPersona {
	private static FactoryStrategyPersona i; // singleton objeto
	public ISaludoStrategy n;
	
	public static FactoryStrategyPersona getFactoryStrategyPersona(){ // Singleton Direccion 
		if(i==null){
		i=new FactoryStrategyPersona();
		}
		return i;
	}
	
	private FactoryStrategyPersona(){ // Singleton Constructor
	}
	
	public ISaludoStrategy getISaludoStrategy(){
		if(n==null){
			FileReader fr = null;
			BufferedReader  br = null;		
			String linea = "";
			
			try {
				fr = new FileReader("UD12/strategy/adaptador.ini");
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
				n = ((ISaludoStrategy)Class.forName(nombreAdaptador).newInstance());
			} 
			catch (Exception e) {
				
			}
			}
		return n;
	}
}
