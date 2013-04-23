package strategy;


import java.util.Calendar;

public class CambioCriterio {
	private static CambioCriterio i; // singleton objeto
	public ISaludoStrategy n;
	
	public static CambioCriterio getCambioCriterio(){ // Singleton Direccion 
		if(i==null){
		i=new CambioCriterio();
		}
		return i;
	}
	
	private CambioCriterio(){ // Singleton Constructor
	}
	
	public ISaludoStrategy getISaludoStrategy(){	
				int minuto=java.util.Calendar.getInstance().get(Calendar.MINUTE);
				
					if(minuto%2==1){
						n=new SaludoCorrectoStrategy();
					}
					else{
						n= new SaludoAmableStrategy();
					}
				
				
		return n;
	}
}
