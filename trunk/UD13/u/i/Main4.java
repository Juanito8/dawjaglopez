package u.i;

import java.awt.Toolkit;


import javax.swing.JFrame;

public class Main4 extends JFrame{
		private static int largo;
		private static int ancho;
		private void inicializar(){
			setLocation(ancho, largo);
			setSize(200, 200);
			setTitle("Main4");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		public Main4(){
			centrar();
			inicializar();
			movimientos();
		}
		public static void main(String[] args) {
			new Main4();
		}
		public void centrar(){
			int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
			int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
			int tancho=200;
			int tlargo=200;
			largo=vlargo/2 - tlargo/2;
			ancho=vancho/2 - tancho/2;
		}
		public void espera(){
			for(int i=0;i<100000;i++){
				for(int m=0;m<1000;m++){
				}
			}
		}
		public void movimientos(){
			int x=getLocation().x;
			int y=getLocation().y;
			for(int i=0;i<200;i++){
				setLocation(x+i, y);
				espera();
			}
		}
}
