package estados;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main16 extends JFrame implements MouseListener, ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j;
	private JPanel j1;
	private JButton b;
	private JButton b1;
	private JButton b2;
	private JLabel n;
	private JLabel n2;
	private JPanel j2;
	private String ejex;
	private String ejey;
	public Main16(){
		centrar();
		menu();
		paneles();
	}
	public static void main(String[] args) {
		new Main16();
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
		
		j=new JPanel(new BorderLayout());
		this.add(j);
		
		
		j1=new JPanel(new GridLayout());
		j1.setLayout(new GridLayout(6, 1));
		j.add(j1, BorderLayout.EAST);
		
		j2=new JPanel(new GridLayout());
		j2.addMouseListener(this);
		j.add(j2, BorderLayout.CENTER);
		
		b=new JButton("Cuadrado");
		b.addActionListener(this);
		j1.add(b);
		b.setActionCommand("0");
		
		b1=new JButton("Circulo");
		b1.addActionListener(this);
		j1.add(b1);
		b1.setActionCommand("1");
		
		b2=new JButton("Borrar");
		j1.add(b2);
		
		n=new JLabel("x: ");
		j1.add(n);
		
		n2=new JLabel("y: ");
		j1.add(n2);
		
	}
	@Override
	public void mouseClicked(MouseEvent m) {
		n.setText("x: "+Integer.toString(m.getX()));
		n2.setText("y: "+Integer.toString(m.getY()));
	}
	@Override
	public void mouseEntered(MouseEvent m) {
		
	}
	@Override
	public void mouseExited(MouseEvent m) {
		
	}
	@Override
	public void mousePressed(MouseEvent m) {
		
	}
	@Override
	public void mouseReleased(MouseEvent m) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("0")){
			System.out.println("Cuadrado");
		}
		else if(e.getActionCommand().equals("1")){
			System.out.println("Circulo");
		}
	}
}
