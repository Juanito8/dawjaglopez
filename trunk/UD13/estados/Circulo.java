package estados;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Circulo extends JPanel implements IFigura{
	private int x;
	private int y;
	private int ancho;
	private int alto;
	
	public Circulo(int ancho, int largo) {
		this.x=ancho;
		this.y=largo;
		generarCirculo();
	}

	public void paint(Graphics g){
		//g.fillRect(x, y, ancho, alto);
		g.drawOval(x-25, y-25, ancho, alto);
	}
	
	public void generarCirculo(){
		this.ancho=50;
		this.alto=50;
		repaint();
	}
	

	@Override
	public void figura() {
		new Circulo(x, y);
	}

	@Override
	public void verFigura() {
		repaint();
	}

}
