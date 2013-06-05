package ventanaBotones;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ventanas extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j1;
	private JTabbedPane p;
	private JPanel j2;
	private JLabel l;
	private JTextField t;
	private JLabel l1;
	private JTextField t1;
	private JLabel l2;
	private JTextField t2;
	private JButton b;
	private JLabel l3;
	private JTextField t3;
	private JButton b1;
	private JLabel l4;
	private JLabel t4;
	private JLabel l5;
	private JLabel t5;
	private JLabel l6;
	private JLabel l8;
	private JTable j3;
	public Ventanas(){
		centrar();
		menu();
		paneles();
	}
	public static void main(String[] args) {
		new Ventanas();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=300;
		tlargo=500;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void menu(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	public void paneles(){

		p=new JTabbedPane();
		this.add(p);
		
		j1=new JPanel(new GridLayout(4, 1));
		p.addTab("Insertar", j1);
		
		j2=new JPanel(new GridLayout(5, 2));
		p.addTab("Consultar", j2);
		
		
		// Añadir botones y texto
		
		// Insertar
		
		JPanel j4=new JPanel(new GridLayout(1, 2));
		j1.add(j4);
		
		l=new JLabel("Nombre");
		j4.add(l);
		

		
		t=new JTextField("Introduce un nombre");
		t.setActionCommand("insertar");
		j4.add(t);
		t.addActionListener(this);
		
		
		JPanel j5=new JPanel(new GridLayout(1, 2));
		j1.add(j5);
		
		l1=new JLabel("Apellido");
		j5.add(l1);
		
		t1=new JTextField("Introduce un apellido");
		t1.setActionCommand("insertar");
		j5.add(t1);
		t1.addActionListener(this);
		
		
		JPanel j6=new JPanel(new GridLayout(1, 2));
		j1.add(j6);
		
		l2=new JLabel("DNI");
		j6.add(l2);
		
		t2=new JTextField("Introduce un dni");
		t2.setActionCommand("insertar");
		j6.add(t2);
		t2.addActionListener(this);
		
		JPanel j7=new JPanel(new GridLayout(1, 1));
		j1.add(j7);
		
		b=new JButton("Insertar");
		b.setActionCommand("insertar");
		j7.add(b);
		b.addActionListener(this);
		
		
		
		
		// Consultar
		
		l3=new JLabel("DNI");
		j2.add(l3);
		
		t3=new JTextField("Introduce un dni");
		t3.setActionCommand("consultar");
		j2.add(t3);
		t3.addActionListener(this);
		
		b1=new JButton("Consultar");
		b1.setActionCommand("consultar");
		j2.add(b1);
		b1.addActionListener(this);
		
		l8=new JLabel();
		j2.add(l8);
		
		l4=new JLabel("Nombre");
		j2.add(l4);
		
		t4=new JLabel("");
		j2.add(t4);
		
		l5=new JLabel("Apellido");
		j2.add(l5);
		
		t5=new JLabel("");
		j2.add(t5);
		
		l5=new JLabel("Prueba");
		j2.add(l5);
		
		t5=new JLabel("");
		j2.add(t5);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
