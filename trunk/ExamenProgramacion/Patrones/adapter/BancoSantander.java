package adapter;

public class BancoSantander {
	int cantidad;
	float porcentaje;
	float resultado;
	
	public BancoSantander(int cantidad, float porcentaje) {
		this.cantidad = cantidad;
		this.porcentaje = porcentaje;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public float getPorcentaje() {
		return this.porcentaje;
	}
	
	public void calculandoIva() {
		int numero = getCantidad();
		float porcentaje = getPorcentaje();
		resultado = numero * porcentaje;			
	}
	
	public void mostrar() {
		System.out.println(resultado);
	}
	
	
}
