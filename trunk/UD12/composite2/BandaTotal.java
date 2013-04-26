package composite2;

import java.util.ArrayList;
import java.util.Collection;

public class BandaTotal implements Banda{
	Collection<IMusico> todos=new ArrayList<IMusico>();
	private String nombre="";
	public void setName(String nombre) {
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println(nombre);
		for(IMusico l: todos){
			l.tocar();
		}

	}
	public void add(IMusico m) {
			todos.add(m);
	}

}
