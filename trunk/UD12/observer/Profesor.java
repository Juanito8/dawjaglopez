package observer;

import java.util.ArrayList;
import java.util.Collection;

public class Profesor {
	private Collection<IAlumno> alumnos;
	public Profesor(){
		alumnos=new ArrayList<IAlumno>();
	}
	
	public void matricula(IAlumno alumno){
		alumnos.add(alumno);
	}
	public void pasarLista(){
		for(IAlumno i:alumnos){
			i.nombrate();
		}
	}
}
