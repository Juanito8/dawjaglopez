package adapter;

public class AdaptadorBancoSantander implements IBanco {
	BancoSantander banco = new BancoSantander(1000, 0.16f);
	
	public void calcularIva() {
		banco.calculandoIva();
		banco.mostrar();
	}

}