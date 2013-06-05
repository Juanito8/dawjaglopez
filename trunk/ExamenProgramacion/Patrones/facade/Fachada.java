package facade;

public class Fachada {
	Aritmetica aritmetica = new Aritmetica();
	Economicas economicas = new Economicas();
	
	public double calcularIva(int numero) {
		return economicas.calcularIva(numero);
	}
	
	public int subtotal(int producto1, int producto2) {
		return economicas.subtotal(producto1, producto2);
		
	}
	
	public int suma(int a, int b) {
		return aritmetica.suma(a, b);
		
	}
	
	public int resta(int a, int b) {
		return aritmetica.resta(a, b);
	
	}
	
	public int multiplicacion(int a, int b) {
		return aritmetica.multiplicacion(a, b);
	}
	
	public int division(int a, int b) {
		return aritmetica.division(a, b);
	}
	
	
}
