package estados;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pintado extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j;
	public Pintado(){
		centrar();
		menu();
	}
	public static void main(String[] args) {
		new Pintado();
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
		this.add(j);
		
		

		
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
