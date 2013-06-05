package observer;

import java.util.ArrayList;
import java.util.Collection;

public class Suelo {
	String color = "azul";
	Collection <Observador> meObservan = new ArrayList <Observador>();
		
	public void suscribete(Observador ob) {
		meObservan.add(ob);
	}
	
	public void setColor(String color) {
		this.color = color;
		for (Observador o : meObservan) {
			o.cambiarColor(this.color);
		}
	}
	
}
