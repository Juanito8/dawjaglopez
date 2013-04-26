package composite2;

import java.util.ArrayList;
import java.util.Collection;

public class BandaSolistas implements Banda{
	Collection<IMusico> solista=new ArrayList<IMusico>();
	private String nombre="";
	public void setName(String nombre) {
		this.nombre=nombre;
	}
	public void tocar() {
		System.out.println(nombre);
		for(IMusico l: solista){
			l.tocar();
		}
		System.out.println("***********************");
	}
	public void add(IMusico m) {
		if(m instanceof Trompetista){
			System.out.println(((Trompetista) m).nombre);
			solista.add(m);
		}
		if(m instanceof Guitarrista){
			System.out.println(((Guitarrista) m).nombre);
			solista.add(m);
		}
	}

}
