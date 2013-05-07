package graficos;

import java.awt.Graphics;

import javax.swing.JPanel;

public class CirculosMovimientos extends JPanel{
	private int x;
	public void paint(Graphics g){
		super.paint(g);
		g.drawOval(x, 100, 100, 100);
	}
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return this.x;
	}
}
