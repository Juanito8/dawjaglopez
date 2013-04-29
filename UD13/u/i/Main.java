package u.i;

import javax.swing.JFrame;

public class Main extends JFrame{
	private void inicializar(){
		setLocation(400, 200);
		setSize(400, 200);
		setTitle("Mi primera Aplicacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public Main(){
		inicializar();
	}
	public static void main(String[] args) {
		new Main();
	}
}
