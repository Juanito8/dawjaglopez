package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Mochila implements ICuaderno{
	Collection<ICuaderno> mover=new ArrayList<ICuaderno>();
	String mochila="mochila";

	@Override
	public void sacar() {
		System.out.println("Sacar una "+mochila);
		for(ICuaderno n : mover){
			n.sacar();
		}
	}
	
	public void add(ICuaderno m){
		mover.add(m);
	}
	
}
