package graficos;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GraficoPaint extends JPanel{
	public void paint(Graphics g){
		g.drawLine(50, 200, 350, 200);
		g.drawLine(200, 50, 200, 350);
		g.drawOval(100, 100, 200, 200);
	}
}
