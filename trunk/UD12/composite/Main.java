package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Main{
	public static Collection<IMusico> festival;	
	public static void main(String[] args) {
		festival=new ArrayList<IMusico>();
		
		Guitarrista g=new Guitarrista();
		Trompetista p=new Trompetista();
		Guitarrista g1=new Guitarrista();
		Trompetista p1=new Trompetista();
		g.setName("Vamos");
		p.setName("Holaaa");
		g1.setName("Vamos 2");
		p1.setName("Holaaa 2");
		
		Banda b=new Banda();
		b.setName("Somos la banda");
		b.add(g);
		b.add(p);
		
		Banda b1=new Banda();
		b1.setName("Somos la banda 1");
		b1.add(g1);
		b1.add(p1);
		
		Banda b2=new Banda();
		b2.setName("Somos la banda de bandas");
		b2.add(b);
		b2.add(b1);
		
		// Musicos separados
		festival.add(g);
		festival.add(p);
		
		festival.add(g1);
		festival.add(p1);
		
		// Banda
		festival.add(b);
		festival.add(b1);
		festival.add(b2);
		
		//Banda de bandas
		for(IMusico m: festival){
			m.tocar();
		}
	}
}
