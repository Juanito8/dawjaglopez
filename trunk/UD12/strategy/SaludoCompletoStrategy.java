package strategy;

public class SaludoCompletoStrategy implements ISaludoStrategy{
	public void saludar(Persona p){
		System.out.println("Hola soy "+p.getNombre()+" y tengo "+p.getEdad());
	}
}
