package menu;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Main9 extends JFrame{
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
	public Main9(){
		centrar();
		inicializar();
		menu();
	}
	public static void main(String[] args) {
		new Main9();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=200;
		tlargo=200;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void menu(){
		// Agregar Panel	
			j.setLayout(new GridLayout(2, 1));
			
			// Agregar menu
			JMenuBar b=new JMenuBar();
			this.setJMenuBar(b);
			
			JMenu m=new JMenu("Archivo");
			JMenu m1=new JMenu("Editar");
			JMenu m3=new JMenu("Ayuda");
			
			b.add(m);
			b.add(m1);
			b.add(m3);
			
			// Submenu Archivo
			JMenuItem ma=new JMenuItem("Abrir");
			m.add(ma);
			JMenuItem ma1=new JMenuItem("Guardar");
			m.add(ma1);		
			
			JMenu ma2=new JMenu("Guardar como...");
			m.add(ma2);
			JMenuItem ma23=new JMenuItem("txt");
			ma2.add(ma23);
			JMenuItem ma25=new JMenuItem("pdf");
			ma2.add(ma25);
			
			// Submenu Editar
			JMenuItem m11=new JMenuItem("Cortar");
			m1.add(m11);
			JMenuItem m12=new JMenuItem("Copiar");
			m1.add(m12);
			JMenuItem m13=new JMenuItem("Pegar");
			m1.add(m13);
			
	}
}
