package estados;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main13 extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j;
	private JButton b;
	private JTextField m;
	public String palabra;
	public int lugar=1;
	public Main13(){
		centrar();
		menu();
	}
	public static void main(String[] args) {
		new Main13();
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
			j.setLayout(new GridLayout(2, 1));			
		
		m=new JTextField();
		j.add(m);
		m.getText();
		
		
		b=new JButton();
		b.setText("Segunda palabra");
		j.add(b);
		b.setActionCommand("segundo");
		
		
		b.addActionListener(this);

		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(lugar==1 && e.getActionCommand().equals("segundo")){
			palabra=m.getText()+" ";
			b.setText("Concatenar");
			System.out.println("Letra");
			m.setText("");
			lugar++; // Cambia el estado a uno mas
		}
		else if(lugar==2 && e.getActionCommand().equals("segundo")){
			palabra=palabra+m.getText();
			m.setText(palabra);
			b.setText("Resultado");
			b.setEnabled(false);
			System.out.println("Cierre");
			
		}
	}
}
