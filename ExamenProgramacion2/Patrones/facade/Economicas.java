package Patrones.facade;

public class Economicas {

	public double calcularIva(int numero) {
		return numero * 0.16;
	}
	
	public int subtotal(int producto1, int producto2) {
		return producto1 + producto2;
	}
	
}