package Patrones.composite;

	/**
	 * Queremos conseguir hacer un sistema de carpetas que pueda componerse tanto de carpetas como de ficheros.
	 * Esto significa que un objeto carpeta puede contener dentro de si mismo tanto ficheros como otras carpetas,
	 * mientras que un fichero no puede contener nada mas que ficheros. La estrategia es que tanto Fichero como 
	 * Carpeta implementan una interfaz comun (FicheroValido es la interfaz en este caso). Además, Carpea tiene una
	 * coleccion de objetos <FicheroValido>, por lo que a la hora de agregar objetos a la coleccion, podra meter cualquiera que
	 * implemente esa interfaz. Como tanto Carpeta como Fichero la implementan, en la coleccion de una carpeta se podrá introducir
	 * tanto una carpeta como un fichero.
	 * 
	 * 
	 * 
	 * @author Guillem
	 *
	 */


public class Main {
	
	public static void main(String[] args) {
		Carpeta carpetaPrincipal = new Carpeta();
		Carpeta carpeta2 = new Carpeta();
		Carpeta carpeta3 = new Carpeta();
		Carpeta carpeta4 = new Carpeta();
		Fichero fichero1 = new Fichero();
		Fichero fichero2 = new Fichero();
		Fichero fichero3 = new Fichero();
		Fichero fichero4 = new Fichero();
		carpeta2.add(fichero1);
		carpeta2.add(fichero2);
		carpeta3.add(fichero3);
		carpeta2.add(carpeta3);
		carpetaPrincipal.add(carpeta2);
		carpeta4.add(fichero4);
		carpetaPrincipal.add(carpeta4);
		
		carpetaPrincipal.queSoy();
		
		
	}
}
