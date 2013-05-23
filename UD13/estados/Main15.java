package estados;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main15 extends JFrame implements MouseListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private Grafico j;
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
		j=new Grafico(tancho, tlargo);
		this.add(j);
		j.addMouseListener(this);
		j.repaint();
		
		setVisible(true);

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		controlarClick(e.getX(),e.getY());
		repaint();
	}
	private void controlarClick(int x, int y) {
		if (j.estaDentroElClic(x,y)) {
			j.setRelleno(true);
		}
		else {
			j.setRelleno(false);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}
