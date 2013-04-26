package composite2;

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
		
		//Bandas
		
		BandaSolistas n1=new BandaSolistas();
		n1.setName("Solistas");
		n1.add(p);
		n1.add(g1);
		n1.tocar();
		
		BandaTotal b1=new BandaTotal();
		b1.setName("Bandas");
		b1.add(n1);
		b1.tocar();
		
		BandaDeMetales m1=new BandaDeMetales();
		m1.setName("Trompetas");
		m1.add(p);
		m1.tocar();
		
		// Musicos separados
		festival.add(g);
		festival.add(p);
		
		festival.add(g1);
		festival.add(p1);
		
		
		
		//Banda de bandas
		for(IMusico m: festival){
			m.tocar();
		}
	}
}
