package observer;

import java.util.ArrayList;
import java.util.Collection;

public class Publicidad {
	private Collection<IProcedencia> usuario;
	public Publicidad(){
		usuario=new ArrayList<IProcedencia>();
	}
	public void inscribirse(IProcedencia m){
		usuario.add(m);
	}
	public void lista(){
		for(IProcedencia m : usuario){
			if(m instanceof Español){
				m.saluda();
			}
		}
	}
}
