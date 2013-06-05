package Patrones.strategy;

public class FabricaDeCerveza {
	String tipoDeCerveza = "vacio";
	IFabricacionStrategy estrategia;
	
	
	public FabricaDeCerveza(String tipoCerveza) {
		this.tipoDeCerveza = tipoCerveza;
		queFabricar();
	}
	
	public void setIFabricacionStrategy(IFabricacionStrategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public void queFabricar() {
		switch (tipoDeCerveza) {
		case "rubia": setIFabricacionStrategy(new CervezaRubiaStrategy());
		break;
		case "negra": setIFabricacionStrategy(new CervezaNegraStrategy());
		break;
		case "alta graduacion": setIFabricacionStrategy(new CervezaAltaGraduacionStrategy());
		break;
		}
	}
	
	public void fabricar() {
		estrategia.fabricar();
	}
	
	
}
