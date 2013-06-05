package Patrones.adapter;

import java.util.ArrayList;
import java.util.Collection;

public class CalculadoraIndicesEconomicos {
	IBanco bancos;
	
	public CalculadoraIndicesEconomicos(String banco) {
		switch(banco) {
		case "santander": bancos = new AdaptadorBancoSantander();
		break;
		case "bancaja": bancos = new AdaptadorBancaja();
		break;
		}
	}
	
	public void calcularIva() {
		bancos.calcularIva();
	}	
	
}
