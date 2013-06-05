package Patrones.adapter;

public class AdaptadorBancaja implements IBanco {
	Bancaja banco = new Bancaja(1000);
	
	public void calcularIva() {
		banco.calculoIva();
		banco.mostrar();
	}

}