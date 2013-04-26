package composite2;

import java.util.ArrayList;
import java.util.Collection;

public class BandaDeMetales implements Banda{
	Collection<IMusico> bandas=new ArrayList<IMusico>();
	private String nombre="";
	public void setName(String nombre) {
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println(nombre);
		for(IMusico l: bandas){
			if(l instanceof Trompetista || l instanceof BandaDeMetales){
				l.tocar();
			}
			//l.tocar();
		}
		System.out.println("***********************");
	}
	public void add(IMusico m) {
			bandas.add(m);
	}
}
