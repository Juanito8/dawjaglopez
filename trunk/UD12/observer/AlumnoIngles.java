package observer;

public class AlumnoIngles implements IAlumno{
	private String name="";
	
	public void sayName(){
		System.out.println("Hello my name is "+name);
	}
	public AlumnoIngles(String nombre){
		this.name=nombre;
	}
	@Override
	public void nombrate() {
		sayName();
	}
}
