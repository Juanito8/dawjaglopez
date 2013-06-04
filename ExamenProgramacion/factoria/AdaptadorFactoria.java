package factoria;

import java.io.BufferedReader;
import java.io.FileReader;

public class AdaptadorFactoria {
	IDomesticar domestico;
	
	public IDomesticar getITDomesticar(){ // Seria  domestico=new (contenido del txt);
		if(domestico==null){
			FileReader fr = null;
			BufferedReader  br = null;		
			String linea = "";
			
			try {
				fr = new FileReader("ExamenProgramacion/factoria/adaptador.txt");
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
				domestico = ((IDomesticar)Class.forName(nombreAdaptador).newInstance());
			} 
			catch (Exception e) {
				
			}
			}
		return domestico;
	}
}
