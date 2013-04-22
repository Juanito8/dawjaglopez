package strategy;

public class Persona {
	private String nombre="";
	private ISaludoStrategy s;
	public Persona(String nombres){
		this.nombre=nombres;
		if(s==null){
			s=new SaludoAmableStrategy();
		}
		s.saludar(this);
	}
	public void saludar(){
		s.saludar(this);
	}
	public String getNombre(){
		return this.nombre;
	}
}
