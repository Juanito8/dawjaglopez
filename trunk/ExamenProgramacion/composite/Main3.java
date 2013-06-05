package composite;

public class Main3 {
	public static void main(String[] args) {
		Mochila todo=new Mochila();
		
		Mochila m1=new Mochila();
		Mochila m2=new Mochila();
		Mochila m3=new Mochila();
		Cuaderno c1=new Cuaderno();
		Cuaderno c2=new Cuaderno();
		Cuaderno c3=new Cuaderno();
		
		m1.add(c1);
		m2.add(c2);
		m3.add(c3);
		
		todo.add(m1);
		todo.add(m2);
		todo.add(m3);
		
		todo.sacar();
	}
}
