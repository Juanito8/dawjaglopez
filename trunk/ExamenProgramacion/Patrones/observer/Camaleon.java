package observer;

public class Camaleon implements Observador {
	String color = "verde";
	
	public void observarA(Suelo suelo) {
		suelo.suscribete(this);
	}
	
	public void cambiarColor(String color) {
		this.color = color;
	}
	
	public void mostrarColor() {
		System.out.println(color);
	}
	
}
