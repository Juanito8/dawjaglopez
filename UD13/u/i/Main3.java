package u.i;

import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main3 extends JFrame{
	private static String m="";
	private static int largo;
	private static int ancho;
	private void inicializar(){
		setLocation(ancho, largo);
		setSize(400, 200);
		setTitle(m);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public Main3(){
		centrar();
		inicializar();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Titulo en la ventana");
		m=scan.nextLine();
		new Main3();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		int tancho=400;
		int tlargo=200;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
}
