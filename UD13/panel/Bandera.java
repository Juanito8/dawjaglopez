package panel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Bandera extends JFrame{
	private static int largo;
	private static int ancho;
	private JPanel j;
	private void inicializar(){
		setLocation(ancho, largo);
		setSize(400, 300);
		setTitle("España");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// Iniciar panel
		j=new JPanel();
		this.add(j);
		
	}
	public Bandera(){
		centrar();
		inicializar();
		colorear();
	}
	public static void main(String[] args) {
		new Bandera();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		int tancho=200;
		int tlargo=200;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void colorear(){
		// Agregar Panel	
			j.setLayout(new GridLayout(3, 1));
			
			JPanel j1=new JPanel();
			j1.setBackground(Color.red);
			j.add(j1);
			
			JPanel j2=new JPanel();
			j2.setBackground(Color.yellow);
			j.add(j2);
			
			JPanel j3=new JPanel();
			j3.setBackground(Color.red);
			j.add(j3);
			
	}
}
