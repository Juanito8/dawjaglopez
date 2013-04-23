package strategy;


public class Persona {
	private String nombre="";
	private FactoryStrategyPersona n= FactoryStrategyPersona.getFactoryStrategyPersona();
	private CambioCriterio n2=CambioCriterio.getCambioCriterio();
	private ISaludoStrategy s=n.getISaludoStrategy();
	
	public Persona(String nombres){
		this.nombre=nombres;
	}
	public void saludar(){
		s.saludar(this);
	}
	public String getNombre(){
		return this.nombre;
	}
}
