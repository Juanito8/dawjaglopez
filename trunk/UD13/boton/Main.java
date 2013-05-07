package boton;

import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel p;
	private JLabel mensaje;
	private JButton b;
	private Receptora r;
	private void inicializar(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Iniciar panel de m
		p=new JPanel();
		p.setLayout(new GridLayout(2, 1));
		this.add(p);

		
		// Crear un JLabel
		mensaje=new JLabel("HOLA MUNDO");
		p.add(mensaje);
		
		// Creacion de Botones
		b=new JButton("Saludar");
		p.add(b);
		
		// Creacion de receptor
		r=new Receptora(mensaje);
		b.addActionListener(r);
		
		setVisible(true);
		
	}
	public Main(){
		centrar();
		inicializar();
	}
	public static void main(String[] args) {
		new Main();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=200;
		tlargo=200;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
}
