package strategy;


public class Persona {
	private String nombre="";
	private int edad=0;
	private FactoryStrategyPersona n= FactoryStrategyPersona.getFactoryStrategyPersona();
	private CambioCriterio n2=CambioCriterio.getCambioCriterio();
	private ISaludoStrategy s=n.getISaludoStrategy();
	
	public Persona(String nombres){
		this.nombre=nombres;
	}
	public Persona(String nombres,int edad){
		this.nombre=nombres;
		this.edad=edad;
	}
	public void saludar(){
		s.saludar(this);
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}
}
