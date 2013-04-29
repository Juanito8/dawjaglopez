package u.i;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main3 extends JFrame{
	private static String m="";
	private void inicializar(){
		setLocation(400, 200);
		setSize(400, 200);
		setTitle(m);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public Main3(){
		inicializar();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Titulo en la ventana");
		m=scan.next();
		new Main3();
	}
}
