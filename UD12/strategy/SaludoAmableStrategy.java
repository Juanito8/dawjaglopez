package strategy;

public class SaludoAmableStrategy implements ISaludoStrategy{
	public void saludar(Persona p){
		System.out.println("Hola buenos dias. Soy "+p.getNombre());
	}
}
