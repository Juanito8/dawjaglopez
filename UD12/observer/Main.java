package observer;

public class Main {
	public static void main(String[] args) {
		Profesor p=new Profesor();
		AlumnoIngles ai1= new AlumnoIngles("Pet");
		AlumnoIngles ai2= new AlumnoIngles("Mary");
		AlumnoEspanol ae1= new AlumnoEspanol("Pedro");
		AlumnoEspanol ae2= new AlumnoEspanol("Maria");
		
		p.matricula(ai1);
		p.matricula(ai2);
		p.matricula(ae1);
		p.matricula(ae2);
		
		p.pasarLista();
	}
}
