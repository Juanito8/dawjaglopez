package adapter2;

public class Gato {
	public String hablar(String m){
		String palabra="";
		switch(m){
		case "saluda":
			palabra="Miauu";
		break;
		case "hola":
			palabra="grgggrrrr";
		break;
		}
		return palabra;
	}
}
