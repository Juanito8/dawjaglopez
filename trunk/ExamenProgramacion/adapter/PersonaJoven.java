package adapter;

public class PersonaJoven implements IPersonaJoven {
	private String nombre;
	private int edad;
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		this.edad=edad;
	}

}
