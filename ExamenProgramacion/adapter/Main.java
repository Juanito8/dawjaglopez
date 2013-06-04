package adapter;

public class Main {
	public static void main(String[] args) {
		PersonaAdulta m=new PersonaAdulta();
		m.setNombre("Manolo");
		m.setEdad(30);
		
		AdultaToNuevaAdapter n=new AdultaToNuevaAdapter(m);
		System.out.println(n.getNombre());
		System.out.println(n.getEdad());
		
		n.setNombre("Mario");
		n.setEdad(20);
		
		System.out.println(n.getNombre());
		System.out.println(n.getEdad());
	}
}
