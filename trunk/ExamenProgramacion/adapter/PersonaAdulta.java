package adapter;

public class PersonaAdulta implements IPersonaAdulta {
	private String nombre;
	private int edad;
	private int dni;
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

	@Override
	public int getDni() {
		return dni;
	}

	@Override
	public void setDni(int dni) {
		this.dni=dni;
	}

}
