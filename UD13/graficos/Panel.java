package graficos;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{
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
		
		// Iniciar panel de GraficoPaint
		j=new GraficoPaint();
		this.add(j);
		setVisible(true);
		
	}
	public Panel(){
		centrar();
		inicializar();
	}
	public static void main(String[] args) {
		new Panel();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=400;
		tlargo=400;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
}
