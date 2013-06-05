package Patrones.adapter;

public class Bancaja {
	int cantidad;
	
	public Bancaja (int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void calculoIva() {
		cantidad *= 0.16;
	}
	
	public void mostrar() {
		System.out.println(cantidad);
	}
	
}
