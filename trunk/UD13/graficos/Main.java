package graficos;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main extends JFrame{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private CirculosMovimientos m;
	private void inicializar(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Iniciar panel de m
		m=new CirculosMovimientos();
		this.add(m);
		setVisible(true);
		
	}
	public Main(){
		centrar();
		inicializar();
		avanzar();
	}
	public static void main(String[] args) {
		new Main();
	}
	public void avanzar(){
		for(int i=0;i<300;i++){
			m.setX(i);
			m.repaint();
			espera();
		}
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=300;
		tlargo=600;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void espera(){
		for(int i=0;i<1000;i++){
			for(int m=0;m<10000;m++){
			}
		}
	}
}
