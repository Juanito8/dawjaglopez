package adapter;

public class AdultaToNuevaAdapter implements IPersonaJoven {
	private IPersonaAdulta m;
	
	public AdultaToNuevaAdapter(IPersonaAdulta m){
		this.m=m;
	}
	@Override
	public String getNombre() {
		return m.getNombre();
	}

	@Override
	public void setNombre(String n) {
		m.setNombre(n);
	}

	@Override
	public int getEdad() {
		return m.getEdad();
	}

	@Override
	public void setEdad(int edad) {
		m.setEdad(edad);
	}

}
