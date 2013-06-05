package strategy;

public class RealizarChoco {
	IRealizarStrategy strategy;
	private String nombre;
	public void setIRealizarStrategy(IRealizarStrategy m){
		this.strategy=m;
	}
	
	public RealizarChoco(String n){
		this.nombre=n;
		tipoSabores();
	}
	
	public void tipoSabores(){
		switch(nombre){
		case "negro":
			setIRealizarStrategy(new ChocolateNegroStrategy());
		break;
		case "leche":
			setIRealizarStrategy(new ChocolateConLecheStrategy());
		break;
		case "blanco":
			setIRealizarStrategy(new ChocolateBlancoStrategy());
		break;
		}
	}
	
	public void moldear(){
		strategy.moldear();
	}
}
