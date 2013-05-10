package u.i;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main10 extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j;
	private JLabel l;
	private JLabel l1;
	private JButton b;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JTextField m;
	private JTextField m1;
	public Main10(){
		centrar();
		menu();
	}
	public static void main(String[] args) {
		new Main10();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=200;
		tlargo=300;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void menu(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Iniciar panel
		j=new JPanel();
		this.add(j);

		
		// Agregar Panel	
			j.setLayout(new GridLayout(4, 1));
			
		l=new JLabel("Pruebas");
		j.add(l);
		l1=new JLabel();
		j.add(l1);
		
		m=new JTextField();
		j.add(m);
		m.getText();
		
		m1=new JTextField();
		j.add(m1);
		m1.getText();
		
		b=new JButton("uno -> dos");
		j.add(b);
		b.setActionCommand("unodos");
		
		b1=new JButton("dos -> uno");
		j.add(b1);
		b1.setActionCommand("dosuno");
		
		b2=new JButton("uno");
		j.add(b2);
		b2.setActionCommand("uno");
		
		b3=new JButton("dos");
		j.add(b3);
		b3.setActionCommand("dos");
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("unodos")){
			l1.setText(m.getText()+m1.getText());
		}
		if(e.getActionCommand().equals("dosuno")){
			l1.setText(m1.getText()+m.getText());
		}
		if(e.getActionCommand().equals("uno")){
			l1.setText(m.getText());
		}
		if(e.getActionCommand().equals("dos")){
			l1.setText(m1.getText());
		}
	}
}
