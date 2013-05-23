package estados;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.Random;

import javax.swing.JPanel;

public class Grafico extends JPanel{
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int ancho2;
	private int alto2;
	private boolean relleno;
	
	public Grafico(int tancho, int tlargo) {
		ancho2=tancho;
		alto2=tlargo;
		relleno=false;
		generarRectangulo();
	}

	public void paint(Graphics g){
		super.paint(g);
		
		if(relleno){
			g.fillRect(x, y, ancho, alto);
		}
		else{
		g.drawRect(x, y, ancho, alto);
		}
	}
	
	public void generarRectangulo(){
		Random m=new Random();
		ancho=50+m.nextInt(51);
		alto=50+m.nextInt(51);
		x=m.nextInt(ancho2-ancho);
		y=m.nextInt(alto2-alto);
	}

	public boolean estaDentroElClic(int x2, int y2) {
		boolean m=false;
		if(x<x2 && y<y2 && ancho<x2 && alto<y2){
			m=true;
		}
		return m;
	}

	public void setRelleno(boolean b) {
		relleno=b;
	}
}
