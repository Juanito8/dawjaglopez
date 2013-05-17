package estados;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main15 extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j;
	private JButton m;
	public Main15(){
		centrar();
		menu();
	}
	public static void main(String[] args) {
		new Main15();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=500;
		tlargo=500;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void menu(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Iniciar panel
		j=new Grafico();
		
		m=new JButton();
		m.setBounds(201, 301, 199, 49);
		m.setBorderPainted(false);
		m.setBackground(Color.white);
		m.setActionCommand("1");
		this.add(m);
		
		this.add(j);

		m.addActionListener(this);
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=20;i<200;i=i+20){
			m.setBounds(200, 300, i, 50);
			m.setBackground(Color.green);	
		}
		m.setBounds(200, 300, 200, 50);
		m.setBackground(Color.darkGray);
		m.setEnabled(false);
	}
}
