package Patrones.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Carpeta implements FicheroValido {
	Collection <FicheroValido> objetos = new ArrayList<FicheroValido>();
	String queSoy = "una carpeta";
	
	public void queSoy() {
		System.out.println("soy " + queSoy);
		for (FicheroValido f : objetos) {
			f.queSoy();
		}
	}
	
	public void add(FicheroValido fich) {
		objetos.add(fich);
	}

	
}
