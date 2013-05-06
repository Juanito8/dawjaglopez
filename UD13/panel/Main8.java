package panel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main8 extends JFrame{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j;
	private void inicializar(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// Iniciar panel
		j=new JPanel();
		this.add(j);
		
	}
	public Main8(){
		centrar();
		inicializar();
		letras();
	}
	public static void main(String[] args) {
		new Main8();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=200;
		tlargo=200;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void letras(){
		// Agregar Panel	
			j.setLayout(new GridLayout(2, 1));
			
			// Agregar colores
			JPanel j1=new JPanel();
			j1.setBackground(Color.blue);
			j.add(j1);
			
			JPanel j2=new JPanel();
			j2.setBackground(Color.yellow);
			j.add(j2);
			
			// Agregar letras y color
			JLabel l2=new JLabel();
			l2.setText("Hola Mundo");
			l2.setForeground(Color.white);
			j1.add(l2);
			
	}
}
