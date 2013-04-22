package strategy;

public class SaludoCorrectoStrategy implements ISaludoStrategy{
	public void saludar(Persona p){
		System.out.println("Hola soy "+p.getNombre());
	}
}
