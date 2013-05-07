package boton;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main3 extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	
	private JPanel p;
	private JLabel mensaje;
	private JButton b;
	private Receptora m;
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
		mensaje=new JLabel("MUNDO");
		p.add(mensaje);
		
		// Creacion de Botones
		b=new JButton("Saludar");
		p.add(b);
		
		// Creacion de receptor 
		m=new Receptora(mensaje); // Pasa la direccion de JLabel para ejecutar su boton
		b.addActionListener(m);
		b.addActionListener(this);
		
		setVisible(true);
		
	}
	public Main3(){
		centrar();
		inicializar();
	}
	public static void main(String[] args) {
		new Main3();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=200;
		tlargo=200;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("CLICK - Main");
	}
}
