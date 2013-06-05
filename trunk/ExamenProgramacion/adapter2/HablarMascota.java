package adapter2;

public class HablarMascota {
	private static IDomesticar m; // elegir el adaptador para cada animal
	public HablarMascota(String mascota){
		switch(mascota){
		case "perro":
			m=new AdaptadorPerro();
		break;
		case "gato":
			m=new AdaptadorGato();
		break;
		}
	}
	
	public String saludar(String n){
		return m.saludar(n);
	}
}
