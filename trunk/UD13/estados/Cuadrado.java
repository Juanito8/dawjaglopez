package estados;

import java.awt.Graphics;


import javax.swing.JPanel;

public class Cuadrado extends JPanel implements IFigura{
	private int x;
	private int y;
	private int ancho;
	private int alto;
	
	public Cuadrado(int ancho, int largo) {
		this.x=ancho;
		this.y=largo;
	}

	public void paint(Graphics g){
		//g.fillRect(x, y, ancho, alto);
		g.drawRect(x, y, ancho, alto);
	}
	
	public void generarCuadrado(){
		this.ancho=50;
		this.alto=50;

	}

	@Override
	public void figura() {
		generarCuadrado();
	}
	

}
