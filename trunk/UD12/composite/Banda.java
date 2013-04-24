package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Banda implements IMusico{
	public String nombre="";
	Collection<IMusico> bandas=new ArrayList<IMusico>();
	public void setName(String nombre) {	
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println(nombre);
		for(IMusico l : bandas){
			l.tocar();
		}
	}
	public void add(IMusico m){
		bandas.add(m);
	}
}
