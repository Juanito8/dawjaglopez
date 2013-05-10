package menu;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Main9 extends JFrame implements ActionListener{
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
			ma.setActionCommand("abrir");
			
			JMenuItem ma1=new JMenuItem("Guardar");
			m.add(ma1);
			ma1.setActionCommand("guardar");
			
			JMenu ma2=new JMenu("Guardar como...");
			m.add(ma2);
			JMenuItem ma23=new JMenuItem("txt");
			ma2.add(ma23);
			ma23.setActionCommand("txt");
			JMenuItem ma25=new JMenuItem("pdf");
			ma2.add(ma25);
			ma25.setActionCommand("pdf");
			
			ma.addActionListener(this);
			ma1.addActionListener(this);
			ma23.addActionListener(this);
			ma25.addActionListener(this);
			
			// Submenu Editar
			JMenuItem m11=new JMenuItem("Cortar");
			m1.add(m11);
			m11.setActionCommand("cortar");
			
			JMenuItem m12=new JMenuItem("Copiar");
			m1.add(m12);
			m12.setActionCommand("copiar");
			
			JMenuItem m13=new JMenuItem("Pegar");
			m1.add(m13);
			m13.setActionCommand("pegar");
			
			
			m11.addActionListener(this);
			m12.addActionListener(this);
			m13.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("abrir")){
			System.out.println("Abrir");
		}
		else if(e.getActionCommand().equals("guardar")){
			System.out.println("Guardar");
		}
		else if(e.getActionCommand().equals("txt")){
			System.out.println("txt");
		}
		else if(e.getActionCommand().equals("pdf")){
			System.out.println("pdf");
		}
		else if(e.getActionCommand().equals("cortar")){
			System.out.println("cortar");
		}
		else if(e.getActionCommand().equals("copiar")){
			System.out.println("copiar");
		}
		else if(e.getActionCommand().equals("pegar")){
			System.out.println("pegar");
		}
	}
}
