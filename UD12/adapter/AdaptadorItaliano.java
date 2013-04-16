package adapter;

public class AdaptadorItaliano implements ITraductor{
		Traduttore t1=new Traduttore();
		
		public String traducir(String palabraATraducir) {
			String traducida="";
			t1.activare();
			try{
				traducida=t1.tradurre(palabraATraducir);
			}
			catch(WordException e){
				e.printStackTrace();
			}
			return traducida;
		}
}
